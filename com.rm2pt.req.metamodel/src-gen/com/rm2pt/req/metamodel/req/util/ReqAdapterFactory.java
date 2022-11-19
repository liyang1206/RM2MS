/**
 */
package com.rm2pt.req.metamodel.req.util;

import com.rm2pt.req.metamodel.req.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.rm2pt.req.metamodel.req.ReqPackage
 * @generated
 */
public class ReqAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReqPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqSwitch<Adapter> modelSwitch = new ReqSwitch<Adapter>() {
		@Override
		public Adapter caseRequirementModel(RequirementModel object) {
			return createRequirementModelAdapter();
		}

		@Override
		public Adapter caseInteraction(Interaction object) {
			return createInteractionAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseCallMessage(CallMessage object) {
			return createCallMessageAdapter();
		}

		@Override
		public Adapter caseReturnMessage(ReturnMessage object) {
			return createReturnMessageAdapter();
		}

		@Override
		public Adapter caseExecution(Execution object) {
			return createExecutionAdapter();
		}

		@Override
		public Adapter caseCombinedFragment(CombinedFragment object) {
			return createCombinedFragmentAdapter();
		}

		@Override
		public Adapter caseOperand(Operand object) {
			return createOperandAdapter();
		}

		@Override
		public Adapter caseAbstractEnd(AbstractEnd object) {
			return createAbstractEndAdapter();
		}

		@Override
		public Adapter caseMixEnd(MixEnd object) {
			return createMixEndAdapter();
		}

		@Override
		public Adapter caseMixOpAndCFEnd(MixOpAndCFEnd object) {
			return createMixOpAndCFEndAdapter();
		}

		@Override
		public Adapter caseMessageEnd(MessageEnd object) {
			return createMessageEndAdapter();
		}

		@Override
		public Adapter caseMultiEnd(MultiEnd object) {
			return createMultiEndAdapter();
		}

		@Override
		public Adapter caseExecutionEnd(ExecutionEnd object) {
			return createExecutionEndAdapter();
		}

		@Override
		public Adapter caseCombinedFragmentEnd(CombinedFragmentEnd object) {
			return createCombinedFragmentEndAdapter();
		}

		@Override
		public Adapter caseOperandEnd(OperandEnd object) {
			return createOperandEndAdapter();
		}

		@Override
		public Adapter caseDomainModel(DomainModel object) {
			return createDomainModelAdapter();
		}

		@Override
		public Adapter caseUseCaseModel(UseCaseModel object) {
			return createUseCaseModelAdapter();
		}

		@Override
		public Adapter caseActor(Actor object) {
			return createActorAdapter();
		}

		@Override
		public Adapter caseUC(UC object) {
			return createUCAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseParticipant(Participant object) {
			return createParticipantAdapter();
		}

		@Override
		public Adapter caseWorkflow(Workflow object) {
			return createWorkflowAdapter();
		}

		@Override
		public Adapter casePartition(Partition object) {
			return createPartitionAdapter();
		}

		@Override
		public Adapter caseWorkflowExp(WorkflowExp object) {
			return createWorkflowExpAdapter();
		}

		@Override
		public Adapter casePartitionAction(PartitionAction object) {
			return createPartitionActionAdapter();
		}

		@Override
		public Adapter caseJoinExp(JoinExp object) {
			return createJoinExpAdapter();
		}

		@Override
		public Adapter caseActivityFinal(ActivityFinal object) {
			return createActivityFinalAdapter();
		}

		@Override
		public Adapter caseInitalNode(InitalNode object) {
			return createInitalNodeAdapter();
		}

		@Override
		public Adapter caseForkNode(ForkNode object) {
			return createForkNodeAdapter();
		}

		@Override
		public Adapter caseJoinNode(JoinNode object) {
			return createJoinNodeAdapter();
		}

		@Override
		public Adapter caseComplexOpeartion(ComplexOpeartion object) {
			return createComplexOpeartionAdapter();
		}

		@Override
		public Adapter caseSimpleOperation(SimpleOperation object) {
			return createSimpleOperationAdapter();
		}

		@Override
		public Adapter caseLoopExp(LoopExp object) {
			return createLoopExpAdapter();
		}

		@Override
		public Adapter caseSwitchExp(SwitchExp object) {
			return createSwitchExpAdapter();
		}

		@Override
		public Adapter caseSwitchCase(SwitchCase object) {
			return createSwitchCaseAdapter();
		}

		@Override
		public Adapter caseSwitchDefault(SwitchDefault object) {
			return createSwitchDefaultAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseTypeCS(TypeCS object) {
			return createTypeCSAdapter();
		}

		@Override
		public Adapter caseInvariance(Invariance object) {
			return createInvarianceAdapter();
		}

		@Override
		public Adapter caseEntityType(EntityType object) {
			return createEntityTypeAdapter();
		}

		@Override
		public Adapter caseEnumEntity(EnumEntity object) {
			return createEnumEntityAdapter();
		}

		@Override
		public Adapter caseEnumItem(EnumItem object) {
			return createEnumItemAdapter();
		}

		@Override
		public Adapter caseContract(Contract object) {
			return createContractAdapter();
		}

		@Override
		public Adapter caseDefinition(Definition object) {
			return createDefinitionAdapter();
		}

		@Override
		public Adapter casePrecondition(Precondition object) {
			return createPreconditionAdapter();
		}

		@Override
		public Adapter casePostcondition(Postcondition object) {
			return createPostconditionAdapter();
		}

		@Override
		public Adapter caseOCLExpressionCS(OCLExpressionCS object) {
			return createOCLExpressionCSAdapter();
		}

		@Override
		public Adapter caseNestedExpCS(NestedExpCS object) {
			return createNestedExpCSAdapter();
		}

		@Override
		public Adapter caseLogicFormulaExpCS(LogicFormulaExpCS object) {
			return createLogicFormulaExpCSAdapter();
		}

		@Override
		public Adapter caseAtomicExpression(AtomicExpression object) {
			return createAtomicExpressionAdapter();
		}

		@Override
		public Adapter caseLeftSubAtomicExpression(LeftSubAtomicExpression object) {
			return createLeftSubAtomicExpressionAdapter();
		}

		@Override
		public Adapter caseRightSubAtomicExpression(RightSubAtomicExpression object) {
			return createRightSubAtomicExpressionAdapter();
		}

		@Override
		public Adapter caseCallExpCS(CallExpCS object) {
			return createCallExpCSAdapter();
		}

		@Override
		public Adapter caseLoopExpCS(LoopExpCS object) {
			return createLoopExpCSAdapter();
		}

		@Override
		public Adapter caseIteratorExpCS(IteratorExpCS object) {
			return createIteratorExpCSAdapter();
		}

		@Override
		public Adapter caseEntityAttributeName(EntityAttributeName object) {
			return createEntityAttributeNameAdapter();
		}

		@Override
		public Adapter caseArgumentsCS(ArgumentsCS object) {
			return createArgumentsCSAdapter();
		}

		@Override
		public Adapter caseFeatureCallExpCS(FeatureCallExpCS object) {
			return createFeatureCallExpCSAdapter();
		}

		@Override
		public Adapter caseStandardNavigationCallExpCS(StandardNavigationCallExpCS object) {
			return createStandardNavigationCallExpCSAdapter();
		}

		@Override
		public Adapter caseStandardOperationExpCS(StandardOperationExpCS object) {
			return createStandardOperationExpCSAdapter();
		}

		@Override
		public Adapter casePredefineOp(PredefineOp object) {
			return createPredefineOpAdapter();
		}

		@Override
		public Adapter caseStandardNoneParameterOperation(StandardNoneParameterOperation object) {
			return createStandardNoneParameterOperationAdapter();
		}

		@Override
		public Adapter caseStandardParameterOperation(StandardParameterOperation object) {
			return createStandardParameterOperationAdapter();
		}

		@Override
		public Adapter caseStandardCollectionOperation(StandardCollectionOperation object) {
			return createStandardCollectionOperationAdapter();
		}

		@Override
		public Adapter caseStandardDateOperation(StandardDateOperation object) {
			return createStandardDateOperationAdapter();
		}

		@Override
		public Adapter caseClassiferCallExpCS(ClassiferCallExpCS object) {
			return createClassiferCallExpCSAdapter();
		}

		@Override
		public Adapter casePropertyCallExpCS(PropertyCallExpCS object) {
			return createPropertyCallExpCSAdapter();
		}

		@Override
		public Adapter caseOperationCallExpCS(OperationCallExpCS object) {
			return createOperationCallExpCSAdapter();
		}

		@Override
		public Adapter caseOperationParameters(OperationParameters object) {
			return createOperationParametersAdapter();
		}

		@Override
		public Adapter caseVariableExpCS(VariableExpCS object) {
			return createVariableExpCSAdapter();
		}

		@Override
		public Adapter caseIfExpCS(IfExpCS object) {
			return createIfExpCSAdapter();
		}

		@Override
		public Adapter caseLetExpCS(LetExpCS object) {
			return createLetExpCSAdapter();
		}

		@Override
		public Adapter caseVariableDeclarationCS(VariableDeclarationCS object) {
			return createVariableDeclarationCSAdapter();
		}

		@Override
		public Adapter caseLiteralExpCS(LiteralExpCS object) {
			return createLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseEnumLiteralExpCS(EnumLiteralExpCS object) {
			return createEnumLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseTupleLiteralExpCS(TupleLiteralExpCS object) {
			return createTupleLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseTupleTypeCS(TupleTypeCS object) {
			return createTupleTypeCSAdapter();
		}

		@Override
		public Adapter caseCollectionTypeCS(CollectionTypeCS object) {
			return createCollectionTypeCSAdapter();
		}

		@Override
		public Adapter caseCollectionLiteralExpCS(CollectionLiteralExpCS object) {
			return createCollectionLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseCollectionLiteralPartCS(CollectionLiteralPartCS object) {
			return createCollectionLiteralPartCSAdapter();
		}

		@Override
		public Adapter caseCollectionRangeCS(CollectionRangeCS object) {
			return createCollectionRangeCSAdapter();
		}

		@Override
		public Adapter caseCollectionItem(CollectionItem object) {
			return createCollectionItemAdapter();
		}

		@Override
		public Adapter casePrimitiveLiteralExpCS(PrimitiveLiteralExpCS object) {
			return createPrimitiveLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseNumberLiteralExpCS(NumberLiteralExpCS object) {
			return createNumberLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseBooleanLiteralExpCS(BooleanLiteralExpCS object) {
			return createBooleanLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseStringLiteralExpCS(StringLiteralExpCS object) {
			return createStringLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseNullLiteralExpCS(NullLiteralExpCS object) {
			return createNullLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseInvalidLiteralExpCS(InvalidLiteralExpCS object) {
			return createInvalidLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseReservedKeywordCS(ReservedKeywordCS object) {
			return createReservedKeywordCSAdapter();
		}

		@Override
		public Adapter caseCollectionTypeIdentifierCS(CollectionTypeIdentifierCS object) {
			return createCollectionTypeIdentifierCSAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeCS(PrimitiveTypeCS object) {
			return createPrimitiveTypeCSAdapter();
		}

		@Override
		public Adapter caseOclTypeCS(OclTypeCS object) {
			return createOclTypeCSAdapter();
		}

		@Override
		public Adapter caseUseCaseContext(UseCaseContext object) {
			return createUseCaseContextAdapter();
		}

		@Override
		public Adapter caseEntityContext(EntityContext object) {
			return createEntityContextAdapter();
		}

		@Override
		public Adapter caseSystemInterface(SystemInterface object) {
			return createSystemInterfaceAdapter();
		}

		@Override
		public Adapter caseReceiveInterface(ReceiveInterface object) {
			return createReceiveInterfaceAdapter();
		}

		@Override
		public Adapter caseProvideInterface(ProvideInterface object) {
			return createProvideInterfaceAdapter();
		}

		@Override
		public Adapter caseUserInterface(UserInterface object) {
			return createUserInterfaceAdapter();
		}

		@Override
		public Adapter caseNF(NF object) {
			return createNFAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.RequirementModel <em>Requirement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.RequirementModel
	 * @generated
	 */
	public Adapter createRequirementModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CallMessage <em>Call Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CallMessage
	 * @generated
	 */
	public Adapter createCallMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ReturnMessage <em>Return Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ReturnMessage
	 * @generated
	 */
	public Adapter createReturnMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CombinedFragment
	 * @generated
	 */
	public Adapter createCombinedFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Operand
	 * @generated
	 */
	public Adapter createOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.AbstractEnd <em>Abstract End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.AbstractEnd
	 * @generated
	 */
	public Adapter createAbstractEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.MixEnd <em>Mix End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.MixEnd
	 * @generated
	 */
	public Adapter createMixEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.MixOpAndCFEnd <em>Mix Op And CF End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.MixOpAndCFEnd
	 * @generated
	 */
	public Adapter createMixOpAndCFEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.MessageEnd
	 * @generated
	 */
	public Adapter createMessageEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.MultiEnd <em>Multi End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.MultiEnd
	 * @generated
	 */
	public Adapter createMultiEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ExecutionEnd <em>Execution End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ExecutionEnd
	 * @generated
	 */
	public Adapter createExecutionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CombinedFragmentEnd <em>Combined Fragment End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CombinedFragmentEnd
	 * @generated
	 */
	public Adapter createCombinedFragmentEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.OperandEnd <em>Operand End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.OperandEnd
	 * @generated
	 */
	public Adapter createOperandEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.UseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.UseCaseModel
	 * @generated
	 */
	public Adapter createUseCaseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.UC <em>UC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.UC
	 * @generated
	 */
	public Adapter createUCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.WorkflowExp <em>Workflow Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.WorkflowExp
	 * @generated
	 */
	public Adapter createWorkflowExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.PartitionAction <em>Partition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.PartitionAction
	 * @generated
	 */
	public Adapter createPartitionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.JoinExp <em>Join Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.JoinExp
	 * @generated
	 */
	public Adapter createJoinExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ActivityFinal <em>Activity Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ActivityFinal
	 * @generated
	 */
	public Adapter createActivityFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.InitalNode <em>Inital Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.InitalNode
	 * @generated
	 */
	public Adapter createInitalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ComplexOpeartion <em>Complex Opeartion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ComplexOpeartion
	 * @generated
	 */
	public Adapter createComplexOpeartionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.SimpleOperation <em>Simple Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.SimpleOperation
	 * @generated
	 */
	public Adapter createSimpleOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.LoopExp
	 * @generated
	 */
	public Adapter createLoopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.SwitchExp <em>Switch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.SwitchExp
	 * @generated
	 */
	public Adapter createSwitchExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.SwitchCase
	 * @generated
	 */
	public Adapter createSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.SwitchDefault <em>Switch Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.SwitchDefault
	 * @generated
	 */
	public Adapter createSwitchDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.TypeCS <em>Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.TypeCS
	 * @generated
	 */
	public Adapter createTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Invariance <em>Invariance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Invariance
	 * @generated
	 */
	public Adapter createInvarianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.EnumEntity <em>Enum Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.EnumEntity
	 * @generated
	 */
	public Adapter createEnumEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.EnumItem <em>Enum Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.EnumItem
	 * @generated
	 */
	public Adapter createEnumItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Precondition
	 * @generated
	 */
	public Adapter createPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.Postcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.Postcondition
	 * @generated
	 */
	public Adapter createPostconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.OCLExpressionCS <em>OCL Expression CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.OCLExpressionCS
	 * @generated
	 */
	public Adapter createOCLExpressionCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.NestedExpCS <em>Nested Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.NestedExpCS
	 * @generated
	 */
	public Adapter createNestedExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.LogicFormulaExpCS <em>Logic Formula Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.LogicFormulaExpCS
	 * @generated
	 */
	public Adapter createLogicFormulaExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.AtomicExpression <em>Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.AtomicExpression
	 * @generated
	 */
	public Adapter createAtomicExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.LeftSubAtomicExpression <em>Left Sub Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.LeftSubAtomicExpression
	 * @generated
	 */
	public Adapter createLeftSubAtomicExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.RightSubAtomicExpression <em>Right Sub Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.RightSubAtomicExpression
	 * @generated
	 */
	public Adapter createRightSubAtomicExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CallExpCS <em>Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CallExpCS
	 * @generated
	 */
	public Adapter createCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.LoopExpCS <em>Loop Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.LoopExpCS
	 * @generated
	 */
	public Adapter createLoopExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.IteratorExpCS <em>Iterator Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.IteratorExpCS
	 * @generated
	 */
	public Adapter createIteratorExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.EntityAttributeName <em>Entity Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.EntityAttributeName
	 * @generated
	 */
	public Adapter createEntityAttributeNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ArgumentsCS <em>Arguments CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ArgumentsCS
	 * @generated
	 */
	public Adapter createArgumentsCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.FeatureCallExpCS <em>Feature Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.FeatureCallExpCS
	 * @generated
	 */
	public Adapter createFeatureCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.StandardNavigationCallExpCS <em>Standard Navigation Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.StandardNavigationCallExpCS
	 * @generated
	 */
	public Adapter createStandardNavigationCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.StandardOperationExpCS <em>Standard Operation Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.StandardOperationExpCS
	 * @generated
	 */
	public Adapter createStandardOperationExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.PredefineOp <em>Predefine Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.PredefineOp
	 * @generated
	 */
	public Adapter createPredefineOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.StandardNoneParameterOperation <em>Standard None Parameter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.StandardNoneParameterOperation
	 * @generated
	 */
	public Adapter createStandardNoneParameterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.StandardParameterOperation <em>Standard Parameter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.StandardParameterOperation
	 * @generated
	 */
	public Adapter createStandardParameterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.StandardCollectionOperation <em>Standard Collection Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.StandardCollectionOperation
	 * @generated
	 */
	public Adapter createStandardCollectionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.StandardDateOperation <em>Standard Date Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.StandardDateOperation
	 * @generated
	 */
	public Adapter createStandardDateOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ClassiferCallExpCS <em>Classifer Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ClassiferCallExpCS
	 * @generated
	 */
	public Adapter createClassiferCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.PropertyCallExpCS <em>Property Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.PropertyCallExpCS
	 * @generated
	 */
	public Adapter createPropertyCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.OperationCallExpCS <em>Operation Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.OperationCallExpCS
	 * @generated
	 */
	public Adapter createOperationCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.OperationParameters <em>Operation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.OperationParameters
	 * @generated
	 */
	public Adapter createOperationParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.VariableExpCS <em>Variable Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.VariableExpCS
	 * @generated
	 */
	public Adapter createVariableExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.IfExpCS <em>If Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.IfExpCS
	 * @generated
	 */
	public Adapter createIfExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.LetExpCS <em>Let Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.LetExpCS
	 * @generated
	 */
	public Adapter createLetExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.VariableDeclarationCS <em>Variable Declaration CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.VariableDeclarationCS
	 * @generated
	 */
	public Adapter createVariableDeclarationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.LiteralExpCS <em>Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.LiteralExpCS
	 * @generated
	 */
	public Adapter createLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.EnumLiteralExpCS <em>Enum Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.EnumLiteralExpCS
	 * @generated
	 */
	public Adapter createEnumLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.TupleLiteralExpCS <em>Tuple Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.TupleLiteralExpCS
	 * @generated
	 */
	public Adapter createTupleLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.TupleTypeCS <em>Tuple Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.TupleTypeCS
	 * @generated
	 */
	public Adapter createTupleTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CollectionTypeCS <em>Collection Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CollectionTypeCS
	 * @generated
	 */
	public Adapter createCollectionTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CollectionLiteralExpCS <em>Collection Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CollectionLiteralExpCS
	 * @generated
	 */
	public Adapter createCollectionLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CollectionLiteralPartCS <em>Collection Literal Part CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CollectionLiteralPartCS
	 * @generated
	 */
	public Adapter createCollectionLiteralPartCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CollectionRangeCS <em>Collection Range CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CollectionRangeCS
	 * @generated
	 */
	public Adapter createCollectionRangeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CollectionItem
	 * @generated
	 */
	public Adapter createCollectionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.PrimitiveLiteralExpCS <em>Primitive Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.PrimitiveLiteralExpCS
	 * @generated
	 */
	public Adapter createPrimitiveLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.NumberLiteralExpCS <em>Number Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.NumberLiteralExpCS
	 * @generated
	 */
	public Adapter createNumberLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.BooleanLiteralExpCS <em>Boolean Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.BooleanLiteralExpCS
	 * @generated
	 */
	public Adapter createBooleanLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.StringLiteralExpCS <em>String Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.StringLiteralExpCS
	 * @generated
	 */
	public Adapter createStringLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.NullLiteralExpCS <em>Null Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.NullLiteralExpCS
	 * @generated
	 */
	public Adapter createNullLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.InvalidLiteralExpCS <em>Invalid Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.InvalidLiteralExpCS
	 * @generated
	 */
	public Adapter createInvalidLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ReservedKeywordCS <em>Reserved Keyword CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ReservedKeywordCS
	 * @generated
	 */
	public Adapter createReservedKeywordCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.CollectionTypeIdentifierCS <em>Collection Type Identifier CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.CollectionTypeIdentifierCS
	 * @generated
	 */
	public Adapter createCollectionTypeIdentifierCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.PrimitiveTypeCS <em>Primitive Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.PrimitiveTypeCS
	 * @generated
	 */
	public Adapter createPrimitiveTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.OclTypeCS <em>Ocl Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.OclTypeCS
	 * @generated
	 */
	public Adapter createOclTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.UseCaseContext <em>Use Case Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.UseCaseContext
	 * @generated
	 */
	public Adapter createUseCaseContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.EntityContext <em>Entity Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.EntityContext
	 * @generated
	 */
	public Adapter createEntityContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.SystemInterface <em>System Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.SystemInterface
	 * @generated
	 */
	public Adapter createSystemInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ReceiveInterface <em>Receive Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ReceiveInterface
	 * @generated
	 */
	public Adapter createReceiveInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.ProvideInterface <em>Provide Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.ProvideInterface
	 * @generated
	 */
	public Adapter createProvideInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.UserInterface
	 * @generated
	 */
	public Adapter createUserInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.req.metamodel.req.NF <em>NF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.req.metamodel.req.NF
	 * @generated
	 */
	public Adapter createNFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ReqAdapterFactory
