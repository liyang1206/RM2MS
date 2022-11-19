/**
 */
package com.rm2pt.req.metamodel.req.provider;

import com.rm2pt.req.metamodel.req.Interaction;
import com.rm2pt.req.metamodel.req.ReqFactory;
import com.rm2pt.req.metamodel.req.ReqPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.rm2pt.req.metamodel.req.Interaction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addParticipantsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Interaction_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Interaction_name_feature",
								"_UI_Interaction_type"),
						ReqPackage.Literals.INTERACTION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Participants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticipantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Interaction_participants_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Interaction_participants_feature",
								"_UI_Interaction_type"),
						ReqPackage.Literals.INTERACTION__PARTICIPANTS, true, false, true, null, null, null));
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
			childrenFeatures.add(ReqPackage.Literals.INTERACTION__MESSAGES);
			childrenFeatures.add(ReqPackage.Literals.INTERACTION__EXECUTIONS);
			childrenFeatures.add(ReqPackage.Literals.INTERACTION__COMBINED_FRAGMENTS);
			childrenFeatures.add(ReqPackage.Literals.INTERACTION__ENDS);
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
	 * This returns Interaction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interaction"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Interaction) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Interaction_type")
				: getString("_UI_Interaction_type") + " " + label;
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

		switch (notification.getFeatureID(Interaction.class)) {
		case ReqPackage.INTERACTION__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ReqPackage.INTERACTION__MESSAGES:
		case ReqPackage.INTERACTION__EXECUTIONS:
		case ReqPackage.INTERACTION__COMBINED_FRAGMENTS:
		case ReqPackage.INTERACTION__ENDS:
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

		newChildDescriptors.add(
				createChildParameter(ReqPackage.Literals.INTERACTION__MESSAGES, ReqFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.INTERACTION__MESSAGES,
				ReqFactory.eINSTANCE.createCallMessage()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.INTERACTION__MESSAGES,
				ReqFactory.eINSTANCE.createReturnMessage()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.INTERACTION__EXECUTIONS,
				ReqFactory.eINSTANCE.createExecution()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.INTERACTION__COMBINED_FRAGMENTS,
				ReqFactory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add(
				createChildParameter(ReqPackage.Literals.INTERACTION__ENDS, ReqFactory.eINSTANCE.createAbstractEnd()));

		newChildDescriptors
				.add(createChildParameter(ReqPackage.Literals.INTERACTION__ENDS, ReqFactory.eINSTANCE.createMixEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.INTERACTION__ENDS,
				ReqFactory.eINSTANCE.createMixOpAndCFEnd()));

		newChildDescriptors.add(
				createChildParameter(ReqPackage.Literals.INTERACTION__ENDS, ReqFactory.eINSTANCE.createMessageEnd()));

		newChildDescriptors.add(
				createChildParameter(ReqPackage.Literals.INTERACTION__ENDS, ReqFactory.eINSTANCE.createExecutionEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.INTERACTION__ENDS,
				ReqFactory.eINSTANCE.createCombinedFragmentEnd()));

		newChildDescriptors.add(
				createChildParameter(ReqPackage.Literals.INTERACTION__ENDS, ReqFactory.eINSTANCE.createOperandEnd()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ReqEditPlugin.INSTANCE;
	}

}
