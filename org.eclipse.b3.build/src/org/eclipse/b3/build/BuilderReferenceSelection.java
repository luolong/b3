/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Reference Selection</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.BuilderReferenceSelection#getRequiredPredicate <em>Required Predicate</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderReferenceSelection()
 * @model
 * @generated
 */
public interface BuilderReferenceSelection extends BuildCallMultiple {
	/**
	 * Returns the value of the '<em><b>Required Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Predicate</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Required Predicate</em>' containment reference.
	 * @see #setRequiredPredicate(CapabilityPredicate)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderReferenceSelection_RequiredPredicate()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityPredicate getRequiredPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderReferenceSelection#getRequiredPredicate <em>Required Predicate</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Required Predicate</em>' containment reference.
	 * @see #getRequiredPredicate()
	 * @generated
	 */
	void setRequiredPredicate(CapabilityPredicate value);

} // BuilderReferenceSelection
