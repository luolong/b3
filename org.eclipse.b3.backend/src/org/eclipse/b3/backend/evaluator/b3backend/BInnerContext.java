/**
 * Copyright (c) 2009-2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BInner Context</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BInnerContext#getOuterContext <em>Outer Context</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBInnerContext()
 * @model
 * @generated
 */
public interface BInnerContext extends BExecutionContext {
	/**
	 * Returns the value of the '<em><b>Outer Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Context</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Outer Context</em>' reference.
	 * @see #setOuterContext(BExecutionContext)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBInnerContext_OuterContext()
	 * @model required="true"
	 * @generated
	 */
	BExecutionContext getOuterContext();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BInnerContext#getOuterContext <em>Outer Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Outer Context</em>' reference.
	 * @see #getOuterContext()
	 * @generated
	 */
	void setOuterContext(BExecutionContext value);

} // BInnerContext
