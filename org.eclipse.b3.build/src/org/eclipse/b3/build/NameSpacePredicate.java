/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Space Predicate</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.NameSpacePredicate#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getNameSpacePredicate()
 * @model
 * @generated
 */
public interface NameSpacePredicate extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name Space</em>' attribute.
	 * @see #setNameSpace(String)
	 * @see org.eclipse.b3.build.B3BuildPackage#getNameSpacePredicate_NameSpace()
	 * @model
	 * @generated
	 */
	String getNameSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.NameSpacePredicate#getNameSpace <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

} // NameSpacePredicate
