/*
 * generated by Xtext
 */
package org.eclipse.b3.outline;

import org.eclipse.xtext.ui.common.editor.outline.actions.DefaultContentOutlineNodeAdapterFactory;
import org.eclipse.b3.build.build.BeeModel;

public class BeeLangOutlineNodeAdapterFactory extends DefaultContentOutlineNodeAdapterFactory {

	@SuppressWarnings("rawtypes")
	private static final Class[] types = { BeeModel.class };

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList() {
		return types;
	}

}
