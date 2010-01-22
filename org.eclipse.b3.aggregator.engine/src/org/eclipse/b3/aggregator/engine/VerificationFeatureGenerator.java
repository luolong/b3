package org.eclipse.b3.aggregator.engine;

import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.aggregator.util.LogUtils;
import org.eclipse.b3.aggregator.util.MonitorUtils;
import org.eclipse.b3.aggregator.util.TimeUtils;
import org.eclipse.b3.util.B3Util;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.equinox.internal.p2.core.helpers.FileUtils;
import org.eclipse.equinox.internal.provisional.p2.metadata.repository.IMetadataRepository;
import org.eclipse.equinox.internal.provisional.p2.metadata.repository.IMetadataRepositoryManager;
import org.eclipse.equinox.p2.publisher.IPublisherAction;
import org.eclipse.equinox.p2.publisher.Publisher;
import org.eclipse.equinox.p2.publisher.PublisherInfo;

public class VerificationFeatureGenerator extends BuilderPhase {
	public VerificationFeatureGenerator(Builder builder) {
		super(builder);
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		long start = TimeUtils.getNow();
		MonitorUtils.begin(monitor, "Verifying Features", 100);
		String info = "Starting generation of verification feature";
		LogUtils.info(info);
		MonitorUtils.subTask(monitor, info);

		String name = getBuilder().getAggregator().getLabel() + " Verification Feature";
		File globalLocation = new File(getBuilder().getBuildRoot(), Builder.REPO_FOLDER_INTERIM);
		File location = new File(globalLocation, Builder.REPO_FOLDER_VERIFICATION);
		FileUtils.deleteAll(location);

		Map<String, String> properties = new HashMap<String, String>();
		URI locationURI = Builder.createURI(location);
		B3Util b3util = B3Util.getPlugin();

		IMetadataRepositoryManager mdrMgr = b3util.getService(IMetadataRepositoryManager.class);

		try {
			mdrMgr.removeRepository(locationURI);
			IMetadataRepository mdr = mdrMgr.createRepository(locationURI, name, Builder.SIMPLE_METADATA_TYPE,
					properties);

			PublisherInfo pubInfo = new PublisherInfo();
			pubInfo.setMetadataRepository(mdr);
			Publisher publisher = new Publisher(pubInfo);
			IStatus result = publisher.publish(createActions(mdr), MonitorUtils.subMonitor(monitor, 90));
			if(result.getSeverity() == IStatus.ERROR)
				throw new CoreException(result);

			getBuilder().getSourceComposite().addChild(mdr.getLocation());
		}
		finally {
			b3util.ungetService(mdrMgr);
			MonitorUtils.done(monitor);
		}
		LogUtils.info("Done. Took %s", TimeUtils.getFormattedDuration(start)); //$NON-NLS-1$
	}

	private IPublisherAction[] createActions(IMetadataRepository mdr) {
		return new IPublisherAction[] { new VerificationFeatureAction(getBuilder(), mdr) };
	}
}