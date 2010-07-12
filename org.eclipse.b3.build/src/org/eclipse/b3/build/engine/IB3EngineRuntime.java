/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.engine;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

/**
 * The B3Engine as seen from the Java Runtime side.
 * 
 */
public interface IB3EngineRuntime {
	/**
	 * Calls a function using the b3 calling convention.
	 * 
	 * @exception The
	 *                receiver of a CoreException should check if the status.matches(IStatus.CANCEL) and to detect cancellation.
	 * 
	 * @param name
	 * @param parameters
	 * @param types
	 * @return
	 * @throws CoreException
	 */
	public Object callFunction(final String name, final Object[] parameters, final Type[] types) throws CoreException;

	/**
	 * Defines a BeeModel in the engine for evaluation.
	 * 
	 * @throws B3EngineException
	 */
	void defineBeeModel(BeeModel state) throws B3EngineException;

	/**
	 * Run the runnable in the engine with a Null progress monitor.
	 * A result may be passed back by using an IStatusResult.
	 * 
	 * @param runnable
	 * @return
	 */
	IStatus run(IB3Runnable runnable);

	/**
	 * Run the runnable in the engine with given progress monitor.
	 * A result may be passed back by using an IStatusResult.
	 * 
	 * @param runnable
	 * @return
	 */
	IStatus run(IB3Runnable runnable, IProgressMonitor monitor);

}