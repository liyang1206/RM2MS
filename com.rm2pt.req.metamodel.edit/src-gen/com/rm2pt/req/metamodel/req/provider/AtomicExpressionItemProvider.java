/**
 */
package com.rm2pt.req.metamodel.req.provider;

import com.rm2pt.req.metamodel.req.AtomicExpression;
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
 * This is the item provider adapter for a {@link com.rm2pt.req.metamodel.req.AtomicExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicExpressionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addInfixopPropertyDescriptor(object);
			addOpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Infixop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfixopPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AtomicExpression_infixop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AtomicExpression_infixop_feature",
								"_UI_AtomicExpression_type"),
						ReqPackage.Literals.ATOMIC_EXPRESSION__INFIXOP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AtomicExpression_op_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AtomicExpression_op_feature",
								"_UI_AtomicExpression_type"),
						ReqPackage.Literals.ATOMIC_EXPRESSION__OP, true, false, false,
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
			childrenFeatures.add(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE);
			childrenFeatures.add(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE);
			childrenFeatures.add(ReqPackage.Literals.ATOMIC_EXPRESSION__NUM);
			childrenFeatures.add(ReqPackage.Literals.ATOMIC_EXPRESSION__EXP);
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
	 * This returns AtomicExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AtomicExpression"));
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
		String label = ((AtomicExpression) object).getInfixop();
		return label == null || label.length() == 0 ? getString("_UI_AtomicExpression_type")
				: getString("_UI_AtomicExpression_type") + " " + label;
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

		switch (notification.getFeatureID(AtomicExpression.class)) {
		case ReqPackage.ATOMIC_EXPRESSION__INFIXOP:
		case ReqPackage.ATOMIC_EXPRESSION__OP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ReqPackage.ATOMIC_EXPRESSION__LEFTSIDE:
		case ReqPackage.ATOMIC_EXPRESSION__RIGHTSIDE:
		case ReqPackage.ATOMIC_EXPRESSION__NUM:
		case ReqPackage.ATOMIC_EXPRESSION__EXP:
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

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createLeftSubAtomicExpression()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createLoopExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createIteratorExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createFeatureCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createStandardNavigationCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createStandardOperationExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createClassiferCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createPropertyCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createOperationCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				ReqFactory.eINSTANCE.createVariableExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createRightSubAtomicExpression()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createLoopExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createIteratorExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createFeatureCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createStandardNavigationCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createStandardOperationExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createClassiferCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createPropertyCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createOperationCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createVariableExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createEnumLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createTupleLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createCollectionLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				ReqFactory.eINSTANCE.createInvalidLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__NUM,
				ReqFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__NUM,
				ReqFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__NUM,
				ReqFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__NUM,
				ReqFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__NUM,
				ReqFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__NUM,
				ReqFactory.eINSTANCE.createInvalidLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.ATOMIC_EXPRESSION__EXP,
				ReqFactory.eINSTANCE.createAtomicExpression()));
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

		boolean qualify = childFeature == ReqPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE
				|| childFeature == ReqPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE
				|| childFeature == ReqPackage.Literals.ATOMIC_EXPRESSION__NUM;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
