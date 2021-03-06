/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression;
import org.eclipse.b3.backend.evaluator.b3backend.util.B3backendValidator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSwitch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BSwitchExpressionImpl#getSwitchExpression <em>Switch Expression</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BSwitchExpressionImpl#getCaseList <em>Case List</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BSwitchExpressionImpl extends BExpressionImpl implements BSwitchExpression {
	/**
	 * The cached value of the '{@link #getSwitchExpression() <em>Switch Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSwitchExpression()
	 * @generated
	 * @ordered
	 */
	protected BExpression switchExpression;

	/**
	 * The cached value of the '{@link #getCaseList() <em>Case List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCaseList()
	 * @generated
	 * @ordered
	 */
	protected EList<BCase> caseList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BSwitchExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSwitchExpression(BExpression newSwitchExpression, NotificationChain msgs) {
		BExpression oldSwitchExpression = switchExpression;
		switchExpression = newSwitchExpression;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION, oldSwitchExpression,
				newSwitchExpression);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				return getSwitchExpression();
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				return getCaseList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				return basicSetSwitchExpression(null, msgs);
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				return ((InternalEList<?>) getCaseList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				return switchExpression != null;
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				return caseList != null && !caseList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				setSwitchExpression((BExpression) newValue);
				return;
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				getCaseList().clear();
				getCaseList().addAll((Collection<? extends BCase>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				setSwitchExpression((BExpression) null);
				return;
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				getCaseList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BCase> getCaseList() {
		if(caseList == null) {
			caseList = new EObjectContainmentEList<BCase>(
				BCase.class, this, B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST);
		}
		return caseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getSwitchExpression() {
		return switchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasUnreachableCase(DiagnosticChain chain, Map<Object, Object> map) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		// BExpression expr = null;
		EList<BCase> cl = getCaseList();
		int offendingCaseIndex = -1;
		boolean hasUnreachableCaseExpr = false;
		for(BCase bcase : cl) {
			offendingCaseIndex++;
			// no case exprs == default case
			if(bcase.getConditionExpr().size() == 0)
				break;
			int exprCounter = 0;
			int limit = bcase.getConditionExpr().size();
			boolean matchesAny = false;
			for(BExpression expr : bcase.getConditionExpr()) {
				exprCounter++;
				if(expr instanceof BLiteralAny) {
					matchesAny = true;
					if(exprCounter < limit) {
						hasUnreachableCaseExpr = true;
						break;
					}
				}
			}
			if(matchesAny)
				break;
		}
		// counter is now index in case list of default or Any case
		// if hasUnreachableCaseExpr then that caselist should be marked, even if there are no other cases
		// after it. But is not required if there are others - as the error should be clear anyway.
		boolean reachedTheEnd = offendingCaseIndex == cl.size() - 1;
		if(hasUnreachableCaseExpr && reachedTheEnd) {
			// add an 'offender' strike for causing case
			BCase bcase = cl.get(offendingCaseIndex);
			chain.add(new BasicDiagnostic(
				Diagnostic.ERROR, B3backendValidator.DIAGNOSTIC_SOURCE,
				B3backendValidator.BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE_EXPR__OFFENDER,
				EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] {
						"hasUnreachableCase", EObjectValidator.getObjectLabel(bcase, map) }), new Object[] {
						bcase, B3backendPackage.BCASE__CONDITION_EXPR }));
			return false;

		}
		// if there are additional cases after this, they are unreachable
		if(!reachedTheEnd) {
			if(chain != null) {
				// add an 'unreachable' for each unreachable case
				for(int at = offendingCaseIndex + 1; at < cl.size(); at++) {
					BCase bcase = cl.get(at);
					chain.add(new BasicDiagnostic(
						Diagnostic.ERROR, B3backendValidator.DIAGNOSTIC_SOURCE,
						B3backendValidator.BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE, EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] { "hasUnreachableCase", EObjectValidator.getObjectLabel(bcase, map) }),
						new Object[] { bcase, B3backendPackage.BCASE__THEN_EXPR }));
				}
				// add an 'offender' strike for causing case
				BCase bcase = cl.get(offendingCaseIndex);
				chain.add(new BasicDiagnostic(
					Diagnostic.ERROR, B3backendValidator.DIAGNOSTIC_SOURCE,
					B3backendValidator.BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE__OFFENDER,
					EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] {
							"hasUnreachableCase", EObjectValidator.getObjectLabel(bcase, map) }), new Object[] {
							bcase, B3backendPackage.BCASE__THEN_EXPR }));

			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSwitchExpression(BExpression newSwitchExpression) {
		if(newSwitchExpression != switchExpression) {
			NotificationChain msgs = null;
			if(switchExpression != null)
				msgs = ((InternalEObject) switchExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION, null, msgs);
			if(newSwitchExpression != null)
				msgs = ((InternalEObject) newSwitchExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION, null, msgs);
			msgs = basicSetSwitchExpression(newSwitchExpression, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION, newSwitchExpression,
				newSwitchExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BSWITCH_EXPRESSION;
	}
} // BSwitchExpressionImpl
