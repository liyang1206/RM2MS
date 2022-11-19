/**
 */
package com.rm2pt.req.metamodel.req.provider;

import com.rm2pt.req.metamodel.req.ReqFactory;
import com.rm2pt.req.metamodel.req.ReqPackage;
import com.rm2pt.req.metamodel.req.VariableDeclarationCS;

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
 * This is the item provider adapter for a {@link com.rm2pt.req.metamodel.req.VariableDeclarationCS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableDeclarationCSItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationCSItemProvider(AdapterFactory adapterFactory) {
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
						getResourceLocator(), getString("_UI_VariableDeclarationCS_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclarationCS_name_feature",
								"_UI_VariableDeclarationCS_type"),
						ReqPackage.Literals.VARIABLE_DECLARATION_CS__NAME, true, false, false,
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
			childrenFeatures.add(ReqPackage.Literals.VARIABLE_DECLARATION_CS__TYPE);
			childrenFeatures.add(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION);
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
	 * This returns VariableDeclarationCS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableDeclarationCS"));
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
		String label = ((VariableDeclarationCS) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_VariableDeclarationCS_type")
				: getString("_UI_VariableDeclarationCS_type") + " " + label;
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

		switch (notification.getFeatureID(VariableDeclarationCS.class)) {
		case ReqPackage.VARIABLE_DECLARATION_CS__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ReqPackage.VARIABLE_DECLARATION_CS__TYPE:
		case ReqPackage.VARIABLE_DECLARATION_CS__INIT_EXPRESSION:
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

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__TYPE,
				ReqFactory.eINSTANCE.createTypeCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__TYPE,
				ReqFactory.eINSTANCE.createEntityType()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__TYPE,
				ReqFactory.eINSTANCE.createEnumEntity()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__TYPE,
				ReqFactory.eINSTANCE.createCollectionTypeCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__TYPE,
				ReqFactory.eINSTANCE.createPrimitiveTypeCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createOCLExpressionCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createNestedExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createLogicFormulaExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createIfExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createLetExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createEnumLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createTupleLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createCollectionLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.VARIABLE_DECLARATION_CS__INIT_EXPRESSION,
				ReqFactory.eINSTANCE.createInvalidLiteralExpCS()));
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
