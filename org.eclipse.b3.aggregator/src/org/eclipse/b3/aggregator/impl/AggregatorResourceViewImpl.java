/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.impl;

import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.AggregatorResourceView;
import org.eclipse.b3.aggregator.CompositeChild;
import org.eclipse.b3.aggregator.util.AggregatorResource;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregatorViewImpl_bak#getAggregator <em>Aggregator</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregatorViewImpl_bak#getAggregations <em>Aggregations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated NOT
 */
public class AggregatorResourceViewImpl extends MinimalEObjectImpl.Container implements AggregatorResourceView {

	/**
	 * An adapter we register with the {@link Aggregator} instance contained within the {@link AggregatorResource} we are a view of in order to
	 * receive (and forward) notifications of changes to its <em>compositeChildren</em> feature.
	 * Before we forward the notifications we modify them such that they appear to be result of manipulation with the <em>compositeChildren</em> feature
	 * of <code>this</code> object.
	 */
	protected Adapter notificationForwardingAdapter = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification notification) {
			if(notification.getFeature() == AggregatorPackage.Literals.AGGREGATOR__COMPOSITE_CHILDREN) {
				eNotify(new NotificationImpl(
					notification.getEventType(), notification.getOldValue(), notification.getNewValue(),
					notification.getPosition(), notification.wasSet()) {

					@Override
					public Object getFeature() {
						return AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__COMPOSITE_CHILDREN;
					}

					@Override
					public int getFeatureID(Class<?> expectedClass) {
						return AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__COMPOSITE_CHILDREN;
					}

					@Override
					public Object getNotifier() {
						return AggregatorResourceViewImpl.this;
					}

				});
			}
		}

	};

	protected AggregatorResource aggregatorResource;

	/**
	 * The cached value of the '{@link #getAggregator() <em>Aggregator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAggregator()
	 * @generated NOT
	 * @ordered
	 */
	protected AggregatorImpl aggregator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public AggregatorResourceViewImpl(AggregatorResource aggregatorResource) {
		this.aggregatorResource = aggregatorResource;
		this.aggregator = (AggregatorImpl) aggregatorResource.getAggregator();
		aggregator.eAdapters().add(notificationForwardingAdapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetAggregator(Aggregator newAggregator, NotificationChain msgs) {
		Aggregator oldAggregator = aggregator;
		aggregator = (AggregatorImpl) newAggregator;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR, oldAggregator,
				newAggregator);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void dispose() {
		aggregator.eAdapters().remove(notificationForwardingAdapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR:
				return getAggregator();
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__COMPOSITE_CHILDREN:
				return getCompositeChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR:
				return basicSetAggregator(null, msgs);
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__COMPOSITE_CHILDREN:
				return aggregator.eInverseRemove(otherEnd, AggregatorPackage.AGGREGATOR__COMPOSITE_CHILDREN, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR:
				return aggregator != null;
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__COMPOSITE_CHILDREN:
				return getCompositeChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__COMPOSITE_CHILDREN:
				aggregator.eSet(AggregatorPackage.AGGREGATOR__COMPOSITE_CHILDREN, newValue);
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
	protected EClass eStaticClass() {
		return AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW;
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
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__COMPOSITE_CHILDREN:
				getCompositeChildren().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Aggregator getAggregator() {
		return aggregator;
	}

	/**
	 * @return the aggregatorResource
	 */
	public AggregatorResource getAggregatorResource() {
		return aggregatorResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<CompositeChild> getCompositeChildren() {
		return aggregator.getCompositeChildren();
	}

} // AggregatorViewImpl