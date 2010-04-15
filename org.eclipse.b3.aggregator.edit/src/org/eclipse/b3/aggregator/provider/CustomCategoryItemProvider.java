/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.CustomCategory;
import org.eclipse.b3.aggregator.util.AddIUsToCustomCategoryCommand;
import org.eclipse.b3.aggregator.util.ItemSorter;
import org.eclipse.b3.aggregator.util.ItemSorter.ItemGroup;
import org.eclipse.b3.aggregator.util.ItemUtils;
import org.eclipse.b3.p2.InstallableUnit;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;

/**
 * This is the item provider adapter for a {@link org.eclipse.b3.aggregator.CustomCategory} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CustomCategoryItemProvider extends AggregatorItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider

{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CustomCategoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if(childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AggregatorPackage.Literals.CUSTOM_CATEGORY__FEATURES);
		}
		return childrenFeatures;
	}

	/**
	 * This returns CustomCategory.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CustomCategory"));
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if(itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdentifierPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addFeaturesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AggregatorEditPlugin.INSTANCE;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CustomCategory) object).getIdentifier();
		return label == null || label.length() == 0
				? getString("_UI_CustomCategory_type")
				: getString("_UI_CustomCategory_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch(notification.getFeatureID(CustomCategory.class)) {
		case AggregatorPackage.CUSTOM_CATEGORY__IDENTIFIER:
		case AggregatorPackage.CUSTOM_CATEGORY__LABEL:
		case AggregatorPackage.CUSTOM_CATEGORY__DESCRIPTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AggregatorPackage.CUSTOM_CATEGORY__FEATURES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomCategory_description_feature"), getString("_UI_PropertyDescriptor_description",
						"_UI_CustomCategory_description_feature", "_UI_CustomCategory_type"),
				AggregatorPackage.Literals.CUSTOM_CATEGORY__DESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomCategory_features_feature"), getString("_UI_PropertyDescriptor_description",
						"_UI_CustomCategory_features_feature", "_UI_CustomCategory_type"),
				AggregatorPackage.Literals.CUSTOM_CATEGORY__FEATURES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomCategory_identifier_feature"), getString("_UI_PropertyDescriptor_description",
						"_UI_CustomCategory_identifier_feature", "_UI_CustomCategory_type"),
				AggregatorPackage.Literals.CUSTOM_CATEGORY__IDENTIFIER, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomCategory_label_feature"), getString("_UI_PropertyDescriptor_description",
						"_UI_CustomCategory_label_feature", "_UI_CustomCategory_type"),
				AggregatorPackage.Literals.CUSTOM_CATEGORY__LABEL, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Supports DnD from Features to CustomCategory
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		Command command = createAddIUsToCustomCategoryCommand(owner, collection);

		if(command != null)
			if(command.canExecute())
				return command;
			else
				return UnexecutableCommand.INSTANCE;

		return super.createDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}

	/**
	 * Supports copy&paste from IUs to CustomCategory
	 */
	@Override
	protected Command factorAddCommand(EditingDomain domain, CommandParameter commandParameter) {
		Command command = createAddIUsToCustomCategoryCommand(commandParameter.getOwner(),
				commandParameter.getCollection());

		if(command != null)
			return command;

		return super.factorAddCommand(domain, commandParameter);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * Force the children (features) to be wrapped so that changes to the children are propagated to the custom category
	 * (as a non-containing parent)
	 */
	@Override
	protected boolean isWrappingNeeded(Object object) {
		return true;
	}

	@SuppressWarnings("unchecked")
	private Command createAddIUsToCustomCategoryCommand(Object owner, Collection<?> collection) {
		ItemSorter itemSorter = new ItemSorter(collection);

		if(itemSorter.getTotalItemCount() > 0
				&& (itemSorter.getTotalItemCount() == itemSorter.getGroupItems(ItemGroup.FEATURE).size() || (itemSorter.getTotalItemCount() == itemSorter.getGroupItems(
						ItemGroup.FEATURE_STRUCTURED).size()))) {
			List<IInstallableUnit> features = new ArrayList<IInstallableUnit>();
			features.addAll((List<InstallableUnit>) itemSorter.getGroupItems(ItemGroup.FEATURE));
			features.addAll(ItemUtils.getIUs((List<org.eclipse.b3.aggregator.p2view.Feature>) itemSorter.getGroupItems(ItemGroup.FEATURE_STRUCTURED)));

			return new AddIUsToCustomCategoryCommand((CustomCategory) owner, features);
		}

		return null;
	}

}
