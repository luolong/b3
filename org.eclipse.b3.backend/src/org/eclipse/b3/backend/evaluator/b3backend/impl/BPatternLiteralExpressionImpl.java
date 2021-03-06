/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.CharSequence;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BPatternLiteralExpression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPattern Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BPatternLiteralExpressionImpl extends BExpressionImpl implements BPatternLiteralExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BPatternLiteralExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean matches(CharSequence candidate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BPATTERN_LITERAL_EXPRESSION;
	}

} // BPatternLiteralExpressionImpl
