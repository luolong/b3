package org.eclipse.b3.aggregator.engine;

import static java.lang.String.format;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.ValidationSet;
import org.eclipse.b3.aggregator.util.ResourceUtils;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.b3.util.ExceptionUtils;
import org.eclipse.b3.util.LogUtils;
import org.eclipse.b3.util.MonitorUtils;
import org.eclipse.b3.util.TimeUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.repository.IRepository;
import org.eclipse.equinox.p2.repository.IRepositoryReference;
import org.eclipse.equinox.p2.repository.IRunnableWithProgress;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;

public class MetadataMirrorGenerator extends BuilderPhase {
	private ValidationSet validationSet;

	public MetadataMirrorGenerator(Builder builder, ValidationSet validationSet) {
		super(builder);
		this.validationSet = validationSet;
	}

	private void mirror(List<IInstallableUnit> iusToMirror, MetadataRepository source, final IMetadataRepository dest)
			throws CoreException {
		dest.addInstallableUnits(iusToMirror);
		Builder builder = getBuilder();
		if(source == null || !builder.isMirrorReferences())
			return;

		List<IRepositoryReference> refs = new ArrayList<IRepositoryReference>();
		for(IRepositoryReference ref : source.getReferences()) {
			URI location = ref.getLocation();
			String refKey = location.toString();
			String refType = ref.getType() == IRepository.TYPE_METADATA
					? "meta-data"
					: "artifacts";
			if(!builder.isMatchedReference(refKey)) {
				LogUtils.debug("- %s reference %s was ruled out by inclusion/exclusion patterns", refType, refKey);
				continue;
			}

			if(refKey.endsWith("/site.xml"))
				location = URI.create(refKey.substring(0, refKey.length() - 8));

			LogUtils.debug("- mirroring %s reference %s", refType, refKey);

			refs.add(new org.eclipse.equinox.p2.repository.spi.RepositoryReference(
				location, ref.getNickname(), ref.getType(), 0));
		}
		dest.addReferences(refs);
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		Builder builder = getBuilder();
		final Set<IInstallableUnit> unitsToAggregate = builder.getUnitsToAggregate(validationSet);
		if(unitsToAggregate.isEmpty()) {
			MonitorUtils.complete(monitor);
			return;
		}

		String taskLabel = Builder.getValidationSetLabel(validationSet);
		LogUtils.info("Starting mirroring of meta-data for validationSet: " + taskLabel);
		long start = TimeUtils.getNow();

		SubMonitor subMon = SubMonitor.convert(monitor, 1000);
		boolean artifactErrors = false;
		try {
			subMon.setTaskName("Mirroring meta-data for validationSet: " + taskLabel + "...");
			MonitorUtils.subTask(subMon, "Initializing");

			MonitorUtils.worked(subMon, 5);
			final IMetadataRepository targetMdr = builder.getAggregationMetadataRepository();
			MonitorUtils.worked(subMon, 10);

			IStatus status = targetMdr.executeBatch(new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, OperationCanceledException {
					SubMonitor subMon = SubMonitor.convert(monitor);
					try {
						List<Contribution> contribs = validationSet.getAllContributions();

						MonitorUtils.begin(subMon, contribs.size() * 100 + 20);

						for(Contribution contrib : contribs) {
							SubMonitor contribMonitor = subMon.newChild(100);
							List<MappedRepository> repos = contrib.getRepositories(true);
							MonitorUtils.begin(contribMonitor, repos.size() * 100);

							for(MappedRepository repo : repos) {
								MetadataRepository mdr = ResourceUtils.getMetadataRepository(repo);
								ArrayList<IInstallableUnit> iusToMirror = null;
								for(IInstallableUnit iu : mdr.getInstallableUnits()) {
									if(!unitsToAggregate.contains(iu))
										continue;

									if(iusToMirror == null)
										iusToMirror = new ArrayList<IInstallableUnit>();
									iusToMirror.add(iu);
								}

								if(iusToMirror != null) {
									String msg = format(
										"Mirroring meta-data consisting of %d units from %s", iusToMirror.size(),
										mdr.getLocation());
									LogUtils.info(msg);
									mirror(iusToMirror, mdr, targetMdr);
								}
								MonitorUtils.worked(contribMonitor, 100);
							}
							MonitorUtils.done(contribMonitor);
						}
					}
					catch(CoreException e) {
						throw new InvocationTargetException(e);
					}
					finally {
						MonitorUtils.done(monitor);
					}
				}
			}, subMon.newChild(900, SubMonitor.SUPPRESS_BEGINTASK | SubMonitor.SUPPRESS_SETTASKNAME));

			if(status.getSeverity() == IStatus.CANCEL)
				throw new OperationCanceledException();

			if(status.getSeverity() == IStatus.ERROR) {
				Throwable t = status.getException();
				if(t instanceof InvocationTargetException)
					t = ((InvocationTargetException) t).getTargetException();
				if(t instanceof CoreException)
					throw (CoreException) t;
				if(t instanceof RuntimeException)
					throw (RuntimeException) t;
				throw new RuntimeException(t);
			}
		}
		finally {
			MonitorUtils.done(monitor);
		}
		LogUtils.info("Done. Took %s", TimeUtils.getFormattedDuration(start)); //$NON-NLS-1$
		if(artifactErrors)
			throw ExceptionUtils.fromMessage("Not all artifacts could be mirrored, see log for details");
	}
}
