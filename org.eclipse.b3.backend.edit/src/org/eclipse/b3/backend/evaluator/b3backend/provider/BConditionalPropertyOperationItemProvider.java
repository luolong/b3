/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BConditionalPropertyOperationItemProvider
	extends BPropertyOperationItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BConditionalPropertyOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR);
			childrenFeatures.add(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__BODY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BConditionalPropertyOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BConditionalPropertyOperation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BConditionalPropertyOperation_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BConditionalPropertyOperation.class)) {
			case B3backendPackage.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR:
			case B3backendPackage.BCONDITIONAL_PROPERTY_OPERATION__BODY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBTryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBChainedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBUnaryOpExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBUnaryPostOpExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBBinaryOpExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBCachedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBLiteralListExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBLiteralMapExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBFeatureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBAtExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBLiteralAny()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBCreateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBUnaryPreOpExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBFunction()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createB3Function()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBJavaFunction()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBDefValue()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBRegularExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBLiteralType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBDefProperty()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBPropertySet()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBDefaultPropertySet()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBPropertyDefinitionOperation()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBConditionalPropertyOperation()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBPropertySetOperation()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBConcern()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBWithExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBFunctionWrapper()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBFunctionNamePredicate()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBFunctionConcernContext()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR,
				 B3backendFactory.eINSTANCE.createBProceedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__BODY,
				 B3backendFactory.eINSTANCE.createBPropertyDefinitionOperation()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__BODY,
				 B3backendFactory.eINSTANCE.createBConditionalPropertyOperation()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__BODY,
				 B3backendFactory.eINSTANCE.createBPropertySetOperation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR ||
			childFeature == B3backendPackage.Literals.BCONDITIONAL_PROPERTY_OPERATION__BODY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
