/**
 */
package com.rm2pt.req.metamodel.req.provider;

import com.rm2pt.req.metamodel.req.ReqFactory;
import com.rm2pt.req.metamodel.req.ReqPackage;
import com.rm2pt.req.metamodel.req.StandardOperationExpCS;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.rm2pt.req.metamodel.req.StandardOperationExpCS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardOperationExpCSItemProvider extends FeatureCallExpCSItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardOperationExpCSItemProvider(AdapterFactory adapterFactory) {
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

			addPremarkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Premark feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPremarkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StandardOperationExpCS_premark_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StandardOperationExpCS_premark_feature",
						"_UI_StandardOperationExpCS_type"),
				ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__PREMARK, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__OBJECT);
			childrenFeatures.add(ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__PROPERTY);
			childrenFeatures.add(ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP);
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
	 * This returns StandardOperationExpCS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StandardOperationExpCS"));
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
		String label = ((StandardOperationExpCS) object).getPremark();
		return label == null || label.length() == 0 ? getString("_UI_StandardOperationExpCS_type")
				: getString("_UI_StandardOperationExpCS_type") + " " + label;
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

		switch (notification.getFeatureID(StandardOperationExpCS.class)) {
		case ReqPackage.STANDARD_OPERATION_EXP_CS__PREMARK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ReqPackage.STANDARD_OPERATION_EXP_CS__OBJECT:
		case ReqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY:
		case ReqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP:
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

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__OBJECT,
				ReqFactory.eINSTANCE.createVariableExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__PROPERTY,
				ReqFactory.eINSTANCE.createVariableExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP,
				ReqFactory.eINSTANCE.createPredefineOp()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP,
				ReqFactory.eINSTANCE.createStandardNoneParameterOperation()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP,
				ReqFactory.eINSTANCE.createStandardParameterOperation()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP,
				ReqFactory.eINSTANCE.createStandardDateOperation()));
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

		boolean qualify = childFeature == ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__OBJECT
				|| childFeature == ReqPackage.Literals.STANDARD_OPERATION_EXP_CS__PROPERTY;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
