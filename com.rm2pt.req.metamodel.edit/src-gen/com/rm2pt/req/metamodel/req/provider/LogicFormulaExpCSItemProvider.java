/**
 */
package com.rm2pt.req.metamodel.req.provider;

import com.rm2pt.req.metamodel.req.LogicFormulaExpCS;
import com.rm2pt.req.metamodel.req.ReqFactory;
import com.rm2pt.req.metamodel.req.ReqPackage;

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
 * This is the item provider adapter for a {@link com.rm2pt.req.metamodel.req.LogicFormulaExpCS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicFormulaExpCSItemProvider extends OCLExpressionCSItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicFormulaExpCSItemProvider(AdapterFactory adapterFactory) {
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

			addConnectorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LogicFormulaExpCS_connector_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LogicFormulaExpCS_connector_feature",
								"_UI_LogicFormulaExpCS_type"),
						ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__CONNECTOR, true, false, false,
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
			childrenFeatures.add(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP);
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
	 * This returns LogicFormulaExpCS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicFormulaExpCS"));
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
		return getString("_UI_LogicFormulaExpCS_type");
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

		switch (notification.getFeatureID(LogicFormulaExpCS.class)) {
		case ReqPackage.LOGIC_FORMULA_EXP_CS__CONNECTOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ReqPackage.LOGIC_FORMULA_EXP_CS__ATOMICEXP:
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

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createRequirementModel()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCallMessage()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createReturnMessage()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createMultiEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createExecution()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createOperand()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createAbstractEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createMixEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createMixOpAndCFEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createMessageEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createExecutionEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCombinedFragmentEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createOperandEnd()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createUseCaseModel()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createUC()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createService()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createWorkflow()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createWorkflowExp()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createPartitionAction()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createJoinExp()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createActivityFinal()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createInitalNode()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createComplexOpeartion()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createSimpleOperation()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createLoopExp()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createSwitchExp()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createSwitchCase()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createSwitchDefault()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createReference()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createTypeCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createInvariance()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createEntityType()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createEnumEntity()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createEnumItem()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createContract()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createPrecondition()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createPostcondition()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createOCLExpressionCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createNestedExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createLogicFormulaExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createAtomicExpression()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createLeftSubAtomicExpression()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createRightSubAtomicExpression()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createLoopExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createIteratorExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createEntityAttributeName()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createArgumentsCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createFeatureCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createStandardNavigationCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createStandardOperationExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createPredefineOp()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createStandardNoneParameterOperation()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createStandardParameterOperation()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createStandardCollectionOperation()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createStandardDateOperation()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createClassiferCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createPropertyCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createOperationCallExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createOperationParameters()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createVariableExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createIfExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createLetExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createVariableDeclarationCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createEnumLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createTupleLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createTupleTypeCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCollectionTypeCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCollectionLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCollectionLiteralPartCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCollectionRangeCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCollectionItem()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createInvalidLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createReservedKeywordCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createCollectionTypeIdentifierCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createPrimitiveTypeCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createOclTypeCS()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createUseCaseContext()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createEntityContext()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createSystemInterface()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createReceiveInterface()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createProvideInterface()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createUserInterface()));

		newChildDescriptors.add(createChildParameter(ReqPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				ReqFactory.eINSTANCE.createNF()));
	}

}
