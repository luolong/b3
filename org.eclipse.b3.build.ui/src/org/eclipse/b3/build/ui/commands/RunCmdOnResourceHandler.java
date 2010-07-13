/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 * 
 * Cloudsmith Inc. API and initial contribution.
 */
package org.eclipse.b3.build.ui.commands;

import org.eclipse.b3.beelang.ui.xtext.linked.ExtLinkedXtextEditor;
import org.eclipse.b3.build.core.B3BuildEngine;
import org.eclipse.b3.build.core.B3BuildErrorCodes;
import org.eclipse.b3.build.ui.Activator;
import org.eclipse.b3.build.ui.core.B3BuildUIErrorCodes;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Loads the BeeModel associated with the current editor (if it is an XtextEditor and
 * has b3 content - i.e. a BeeModel) into a b3 engine
 * afer having loaded a b3 Cmd (a b3 file with a _main(List) function)).
 * The _main() function is called, and defines what to do next.
 * The Event context should contain the parameter "cmdPath", with a fake URI b3:/pluginId/path.b3 to
 * mean first found of resource:/pluginId/path.b3, and plugin:/pluginId/path.b3 - or be a URI that can
 * be loaded as an Xtext Resource.
 */
public class RunCmdOnResourceHandler extends AbstractHandlerWithB3Console {

	@Override
	public Object executeWithConsole(ExecutionEvent event) throws ExecutionException {
		b3out.println("b3: Running function main()...");

		EvaluationContext ctx = (EvaluationContext) event.getApplicationContext();

		Object editor = ctx.getVariable("activeEditor");
		if(editor == null || !(editor instanceof ExtLinkedXtextEditor)) {
			b3err.println("Handler invoked on wrong type of editor: RunMainFunctionInActiveEditorHandler");
			return null;
		}
		final Object cmdPath = event.getParameter("org.eclipse.b3.ui.run.b3cmd.pathParameter");
		if(cmdPath == null) {
			b3err.println("Bad configuration - org.eclipse.b3.ui.run.b3cmd.pathParameter not specified.");
			return null;
		}

		ExtLinkedXtextEditor b3Editor = (ExtLinkedXtextEditor) editor;
		IXtextDocument xtextDocument = XtextDocumentUtil.get(b3Editor);
		if(xtextDocument == null) {
			b3err.println("No b3 document found in current editor.");
			return null;
		}
		IStatus result = xtextDocument.readOnly(new IUnitOfWork<IStatus, XtextResource>() {
			// @Override
			public IStatus exec(XtextResource state) throws Exception {
				// 1. if the path starts with b3: it means try workspace, then plugin schemes
				// 2. Else, the path should be a URI and only one attempt is made
				// 3. If the result in any case is a bad URI, the conig is bad
				String cmdURI = (String) cmdPath;
				URI uris[] = null;
				try {
					if(cmdURI.startsWith("b3:")) {
						String pathPart = cmdURI.substring(3);
						uris = new URI[2];
						uris[0] = URI.createPlatformResourceURI(pathPart, true);
						uris[1] = URI.createPlatformPluginURI(pathPart, true);
					}
					else {
						uris = new URI[1];
						uris[0] = URI.createURI(cmdURI);
					}
				}
				catch(IllegalArgumentException e) {
					return new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, B3BuildUIErrorCodes.BAD_UI_CONFIGURATION,
						"Faulty cmd URI in UI configuration", e);
				}

				for(int i = 0; i < uris.length; i++) {
					URI uri = uris[i];
					// Try different URIs - the first to succeed is used
					IStatus result = new B3BuildEngine().run(new RunCmdOnResourceOperation(uri, state));
					if(result.isOK())
						return result;
					if(result.getCode() != B3BuildErrorCodes.COULD_NOT_LOAD_RESOURCE)
						return result;
				}
				return new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, B3BuildUIErrorCodes.BAD_UI_CONFIGURATION,
					"Bad menu/command configuration - could not find cmd: " + cmdURI, null);
			}
		});
		RunCmdOnResourceHandler.this.printResult(result, true);

		return null; // dictated by Handler API
	}
}
