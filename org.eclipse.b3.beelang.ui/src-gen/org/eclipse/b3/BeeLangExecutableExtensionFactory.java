
/*
 * generated by Xtext
 */
 
package org.eclipse.b3;

import org.eclipse.xtext.ui.core.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class BeeLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.eclipse.b3.internal.BeeLangActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.eclipse.b3.internal.BeeLangActivator.getInstance().getInjector("org.eclipse.b3.BeeLang");
	}
	
}
