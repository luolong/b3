package org.eclipse.b3.backend.core.internal;

import org.eclipse.b3.backend.core.B3Debug;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class B3BackendActivator extends Plugin {

	public static B3BackendActivator instance;

	public static final String EXTENSION__RUNTIME_MODULE = "org.eclipse.b3.backend.B3RuntimeModule";

	public static final String PLUGIN_ID = "org.eclipse.b3.backend";

	public B3BackendActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		// Get debug options
		B3Debug.configure();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		super.stop(context);
	}
}
