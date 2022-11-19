/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqFactoryImpl extends EFactoryImpl implements ReqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReqFactory init() {
		try {
			ReqFactory theReqFactory = (ReqFactory) EPackage.Registry.INSTANCE.getEFactory(ReqPackage.eNS_URI);
			if (theReqFactory != null) {
				return theReqFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ReqPackage.REQUIREMENT_MODEL:
			return createRequirementModel();
		case ReqPackage.INTERACTION:
			return createInteraction();
		case ReqPackage.MESSAGE:
			return createMessage();
		case ReqPackage.CALL_MESSAGE:
			return createCallMessage();
		case ReqPackage.RETURN_MESSAGE:
			return createReturnMessage();
		case ReqPackage.EXECUTION:
			return createExecution();
		case ReqPackage.COMBINED_FRAGMENT:
			return createCombinedFragment();
		case ReqPackage.OPERAND:
			return createOperand();
		case ReqPackage.ABSTRACT_END:
			return createAbstractEnd();
		case ReqPackage.MIX_END:
			return createMixEnd();
		case ReqPackage.MIX_OP_AND_CF_END:
			return createMixOpAndCFEnd();
		case ReqPackage.MESSAGE_END:
			return createMessageEnd();
		case ReqPackage.MULTI_END:
			return createMultiEnd();
		case ReqPackage.EXECUTION_END:
			return createExecutionEnd();
		case ReqPackage.COMBINED_FRAGMENT_END:
			return createCombinedFragmentEnd();
		case ReqPackage.OPERAND_END:
			return createOperandEnd();
		case ReqPackage.DOMAIN_MODEL:
			return createDomainModel();
		case ReqPackage.USE_CASE_MODEL:
			return createUseCaseModel();
		case ReqPackage.ACTOR:
			return createActor();
		case ReqPackage.UC:
			return createUC();
		case ReqPackage.SERVICE:
			return createService();
		case ReqPackage.PARTICIPANT:
			return createParticipant();
		case ReqPackage.WORKFLOW:
			return createWorkflow();
		case ReqPackage.PARTITION:
			return createPartition();
		case ReqPackage.WORKFLOW_EXP:
			return createWorkflowExp();
		case ReqPackage.PARTITION_ACTION:
			return createPartitionAction();
		case ReqPackage.JOIN_EXP:
			return createJoinExp();
		case ReqPackage.ACTIVITY_FINAL:
			return createActivityFinal();
		case ReqPackage.INITAL_NODE:
			return createInitalNode();
		case ReqPackage.FORK_NODE:
			return createForkNode();
		case ReqPackage.JOIN_NODE:
			return createJoinNode();
		case ReqPackage.COMPLEX_OPEARTION:
			return createComplexOpeartion();
		case ReqPackage.SIMPLE_OPERATION:
			return createSimpleOperation();
		case ReqPackage.LOOP_EXP:
			return createLoopExp();
		case ReqPackage.SWITCH_EXP:
			return createSwitchExp();
		case ReqPackage.SWITCH_CASE:
			return createSwitchCase();
		case ReqPackage.SWITCH_DEFAULT:
			return createSwitchDefault();
		case ReqPackage.OPERATION:
			return createOperation();
		case ReqPackage.PARAMETER:
			return createParameter();
		case ReqPackage.ENTITY:
			return createEntity();
		case ReqPackage.ATTRIBUTE:
			return createAttribute();
		case ReqPackage.REFERENCE:
			return createReference();
		case ReqPackage.TYPE_CS:
			return createTypeCS();
		case ReqPackage.INVARIANCE:
			return createInvariance();
		case ReqPackage.ENTITY_TYPE:
			return createEntityType();
		case ReqPackage.ENUM_ENTITY:
			return createEnumEntity();
		case ReqPackage.ENUM_ITEM:
			return createEnumItem();
		case ReqPackage.CONTRACT:
			return createContract();
		case ReqPackage.DEFINITION:
			return createDefinition();
		case ReqPackage.PRECONDITION:
			return createPrecondition();
		case ReqPackage.POSTCONDITION:
			return createPostcondition();
		case ReqPackage.OCL_EXPRESSION_CS:
			return createOCLExpressionCS();
		case ReqPackage.NESTED_EXP_CS:
			return createNestedExpCS();
		case ReqPackage.LOGIC_FORMULA_EXP_CS:
			return createLogicFormulaExpCS();
		case ReqPackage.ATOMIC_EXPRESSION:
			return createAtomicExpression();
		case ReqPackage.LEFT_SUB_ATOMIC_EXPRESSION:
			return createLeftSubAtomicExpression();
		case ReqPackage.RIGHT_SUB_ATOMIC_EXPRESSION:
			return createRightSubAtomicExpression();
		case ReqPackage.CALL_EXP_CS:
			return createCallExpCS();
		case ReqPackage.LOOP_EXP_CS:
			return createLoopExpCS();
		case ReqPackage.ITERATOR_EXP_CS:
			return createIteratorExpCS();
		case ReqPackage.ENTITY_ATTRIBUTE_NAME:
			return createEntityAttributeName();
		case ReqPackage.ARGUMENTS_CS:
			return createArgumentsCS();
		case ReqPackage.FEATURE_CALL_EXP_CS:
			return createFeatureCallExpCS();
		case ReqPackage.STANDARD_NAVIGATION_CALL_EXP_CS:
			return createStandardNavigationCallExpCS();
		case ReqPackage.STANDARD_OPERATION_EXP_CS:
			return createStandardOperationExpCS();
		case ReqPackage.PREDEFINE_OP:
			return createPredefineOp();
		case ReqPackage.STANDARD_NONE_PARAMETER_OPERATION:
			return createStandardNoneParameterOperation();
		case ReqPackage.STANDARD_PARAMETER_OPERATION:
			return createStandardParameterOperation();
		case ReqPackage.STANDARD_COLLECTION_OPERATION:
			return createStandardCollectionOperation();
		case ReqPackage.STANDARD_DATE_OPERATION:
			return createStandardDateOperation();
		case ReqPackage.CLASSIFER_CALL_EXP_CS:
			return createClassiferCallExpCS();
		case ReqPackage.PROPERTY_CALL_EXP_CS:
			return createPropertyCallExpCS();
		case ReqPackage.OPERATION_CALL_EXP_CS:
			return createOperationCallExpCS();
		case ReqPackage.OPERATION_PARAMETERS:
			return createOperationParameters();
		case ReqPackage.VARIABLE_EXP_CS:
			return createVariableExpCS();
		case ReqPackage.IF_EXP_CS:
			return createIfExpCS();
		case ReqPackage.LET_EXP_CS:
			return createLetExpCS();
		case ReqPackage.VARIABLE_DECLARATION_CS:
			return createVariableDeclarationCS();
		case ReqPackage.LITERAL_EXP_CS:
			return createLiteralExpCS();
		case ReqPackage.ENUM_LITERAL_EXP_CS:
			return createEnumLiteralExpCS();
		case ReqPackage.TUPLE_LITERAL_EXP_CS:
			return createTupleLiteralExpCS();
		case ReqPackage.TUPLE_TYPE_CS:
			return createTupleTypeCS();
		case ReqPackage.COLLECTION_TYPE_CS:
			return createCollectionTypeCS();
		case ReqPackage.COLLECTION_LITERAL_EXP_CS:
			return createCollectionLiteralExpCS();
		case ReqPackage.COLLECTION_LITERAL_PART_CS:
			return createCollectionLiteralPartCS();
		case ReqPackage.COLLECTION_RANGE_CS:
			return createCollectionRangeCS();
		case ReqPackage.COLLECTION_ITEM:
			return createCollectionItem();
		case ReqPackage.PRIMITIVE_LITERAL_EXP_CS:
			return createPrimitiveLiteralExpCS();
		case ReqPackage.NUMBER_LITERAL_EXP_CS:
			return createNumberLiteralExpCS();
		case ReqPackage.BOOLEAN_LITERAL_EXP_CS:
			return createBooleanLiteralExpCS();
		case ReqPackage.STRING_LITERAL_EXP_CS:
			return createStringLiteralExpCS();
		case ReqPackage.NULL_LITERAL_EXP_CS:
			return createNullLiteralExpCS();
		case ReqPackage.INVALID_LITERAL_EXP_CS:
			return createInvalidLiteralExpCS();
		case ReqPackage.RESERVED_KEYWORD_CS:
			return createReservedKeywordCS();
		case ReqPackage.COLLECTION_TYPE_IDENTIFIER_CS:
			return createCollectionTypeIdentifierCS();
		case ReqPackage.PRIMITIVE_TYPE_CS:
			return createPrimitiveTypeCS();
		case ReqPackage.OCL_TYPE_CS:
			return createOclTypeCS();
		case ReqPackage.USE_CASE_CONTEXT:
			return createUseCaseContext();
		case ReqPackage.ENTITY_CONTEXT:
			return createEntityContext();
		case ReqPackage.SYSTEM_INTERFACE:
			return createSystemInterface();
		case ReqPackage.RECEIVE_INTERFACE:
			return createReceiveInterface();
		case ReqPackage.PROVIDE_INTERFACE:
			return createProvideInterface();
		case ReqPackage.USER_INTERFACE:
			return createUserInterface();
		case ReqPackage.NF:
			return createNF();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementModel createRequirementModel() {
		RequirementModelImpl requirementModel = new RequirementModelImpl();
		return requirementModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallMessage createCallMessage() {
		CallMessageImpl callMessage = new CallMessageImpl();
		return callMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnMessage createReturnMessage() {
		ReturnMessageImpl returnMessage = new ReturnMessageImpl();
		return returnMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution createExecution() {
		ExecutionImpl execution = new ExecutionImpl();
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment createCombinedFragment() {
		CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
		return combinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand createOperand() {
		OperandImpl operand = new OperandImpl();
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEnd createAbstractEnd() {
		AbstractEndImpl abstractEnd = new AbstractEndImpl();
		return abstractEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixEnd createMixEnd() {
		MixEndImpl mixEnd = new MixEndImpl();
		return mixEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixOpAndCFEnd createMixOpAndCFEnd() {
		MixOpAndCFEndImpl mixOpAndCFEnd = new MixOpAndCFEndImpl();
		return mixOpAndCFEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd createMessageEnd() {
		MessageEndImpl messageEnd = new MessageEndImpl();
		return messageEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiEnd createMultiEnd() {
		MultiEndImpl multiEnd = new MultiEndImpl();
		return multiEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnd createExecutionEnd() {
		ExecutionEndImpl executionEnd = new ExecutionEndImpl();
		return executionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragmentEnd createCombinedFragmentEnd() {
		CombinedFragmentEndImpl combinedFragmentEnd = new CombinedFragmentEndImpl();
		return combinedFragmentEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandEnd createOperandEnd() {
		OperandEndImpl operandEnd = new OperandEndImpl();
		return operandEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseModel createUseCaseModel() {
		UseCaseModelImpl useCaseModel = new UseCaseModelImpl();
		return useCaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UC createUC() {
		UCImpl uc = new UCImpl();
		return uc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowExp createWorkflowExp() {
		WorkflowExpImpl workflowExp = new WorkflowExpImpl();
		return workflowExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionAction createPartitionAction() {
		PartitionActionImpl partitionAction = new PartitionActionImpl();
		return partitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinExp createJoinExp() {
		JoinExpImpl joinExp = new JoinExpImpl();
		return joinExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinal createActivityFinal() {
		ActivityFinalImpl activityFinal = new ActivityFinalImpl();
		return activityFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitalNode createInitalNode() {
		InitalNodeImpl initalNode = new InitalNodeImpl();
		return initalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexOpeartion createComplexOpeartion() {
		ComplexOpeartionImpl complexOpeartion = new ComplexOpeartionImpl();
		return complexOpeartion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOperation createSimpleOperation() {
		SimpleOperationImpl simpleOperation = new SimpleOperationImpl();
		return simpleOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopExp createLoopExp() {
		LoopExpImpl loopExp = new LoopExpImpl();
		return loopExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchExp createSwitchExp() {
		SwitchExpImpl switchExp = new SwitchExpImpl();
		return switchExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchCase createSwitchCase() {
		SwitchCaseImpl switchCase = new SwitchCaseImpl();
		return switchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchDefault createSwitchDefault() {
		SwitchDefaultImpl switchDefault = new SwitchDefaultImpl();
		return switchDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCS createTypeCS() {
		TypeCSImpl typeCS = new TypeCSImpl();
		return typeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariance createInvariance() {
		InvarianceImpl invariance = new InvarianceImpl();
		return invariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityType() {
		EntityTypeImpl entityType = new EntityTypeImpl();
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumEntity createEnumEntity() {
		EnumEntityImpl enumEntity = new EnumEntityImpl();
		return enumEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumItem createEnumItem() {
		EnumItemImpl enumItem = new EnumItemImpl();
		return enumItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postcondition createPostcondition() {
		PostconditionImpl postcondition = new PostconditionImpl();
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpressionCS createOCLExpressionCS() {
		OCLExpressionCSImpl oclExpressionCS = new OCLExpressionCSImpl();
		return oclExpressionCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedExpCS createNestedExpCS() {
		NestedExpCSImpl nestedExpCS = new NestedExpCSImpl();
		return nestedExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicFormulaExpCS createLogicFormulaExpCS() {
		LogicFormulaExpCSImpl logicFormulaExpCS = new LogicFormulaExpCSImpl();
		return logicFormulaExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicExpression createAtomicExpression() {
		AtomicExpressionImpl atomicExpression = new AtomicExpressionImpl();
		return atomicExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftSubAtomicExpression createLeftSubAtomicExpression() {
		LeftSubAtomicExpressionImpl leftSubAtomicExpression = new LeftSubAtomicExpressionImpl();
		return leftSubAtomicExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightSubAtomicExpression createRightSubAtomicExpression() {
		RightSubAtomicExpressionImpl rightSubAtomicExpression = new RightSubAtomicExpressionImpl();
		return rightSubAtomicExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallExpCS createCallExpCS() {
		CallExpCSImpl callExpCS = new CallExpCSImpl();
		return callExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopExpCS createLoopExpCS() {
		LoopExpCSImpl loopExpCS = new LoopExpCSImpl();
		return loopExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorExpCS createIteratorExpCS() {
		IteratorExpCSImpl iteratorExpCS = new IteratorExpCSImpl();
		return iteratorExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAttributeName createEntityAttributeName() {
		EntityAttributeNameImpl entityAttributeName = new EntityAttributeNameImpl();
		return entityAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentsCS createArgumentsCS() {
		ArgumentsCSImpl argumentsCS = new ArgumentsCSImpl();
		return argumentsCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCallExpCS createFeatureCallExpCS() {
		FeatureCallExpCSImpl featureCallExpCS = new FeatureCallExpCSImpl();
		return featureCallExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardNavigationCallExpCS createStandardNavigationCallExpCS() {
		StandardNavigationCallExpCSImpl standardNavigationCallExpCS = new StandardNavigationCallExpCSImpl();
		return standardNavigationCallExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardOperationExpCS createStandardOperationExpCS() {
		StandardOperationExpCSImpl standardOperationExpCS = new StandardOperationExpCSImpl();
		return standardOperationExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefineOp createPredefineOp() {
		PredefineOpImpl predefineOp = new PredefineOpImpl();
		return predefineOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardNoneParameterOperation createStandardNoneParameterOperation() {
		StandardNoneParameterOperationImpl standardNoneParameterOperation = new StandardNoneParameterOperationImpl();
		return standardNoneParameterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardParameterOperation createStandardParameterOperation() {
		StandardParameterOperationImpl standardParameterOperation = new StandardParameterOperationImpl();
		return standardParameterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardCollectionOperation createStandardCollectionOperation() {
		StandardCollectionOperationImpl standardCollectionOperation = new StandardCollectionOperationImpl();
		return standardCollectionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDateOperation createStandardDateOperation() {
		StandardDateOperationImpl standardDateOperation = new StandardDateOperationImpl();
		return standardDateOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassiferCallExpCS createClassiferCallExpCS() {
		ClassiferCallExpCSImpl classiferCallExpCS = new ClassiferCallExpCSImpl();
		return classiferCallExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExpCS createPropertyCallExpCS() {
		PropertyCallExpCSImpl propertyCallExpCS = new PropertyCallExpCSImpl();
		return propertyCallExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallExpCS createOperationCallExpCS() {
		OperationCallExpCSImpl operationCallExpCS = new OperationCallExpCSImpl();
		return operationCallExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameters createOperationParameters() {
		OperationParametersImpl operationParameters = new OperationParametersImpl();
		return operationParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExpCS createVariableExpCS() {
		VariableExpCSImpl variableExpCS = new VariableExpCSImpl();
		return variableExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExpCS createIfExpCS() {
		IfExpCSImpl ifExpCS = new IfExpCSImpl();
		return ifExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExpCS createLetExpCS() {
		LetExpCSImpl letExpCS = new LetExpCSImpl();
		return letExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationCS createVariableDeclarationCS() {
		VariableDeclarationCSImpl variableDeclarationCS = new VariableDeclarationCSImpl();
		return variableDeclarationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralExpCS createLiteralExpCS() {
		LiteralExpCSImpl literalExpCS = new LiteralExpCSImpl();
		return literalExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralExpCS createEnumLiteralExpCS() {
		EnumLiteralExpCSImpl enumLiteralExpCS = new EnumLiteralExpCSImpl();
		return enumLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleLiteralExpCS createTupleLiteralExpCS() {
		TupleLiteralExpCSImpl tupleLiteralExpCS = new TupleLiteralExpCSImpl();
		return tupleLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleTypeCS createTupleTypeCS() {
		TupleTypeCSImpl tupleTypeCS = new TupleTypeCSImpl();
		return tupleTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTypeCS createCollectionTypeCS() {
		CollectionTypeCSImpl collectionTypeCS = new CollectionTypeCSImpl();
		return collectionTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionLiteralExpCS createCollectionLiteralExpCS() {
		CollectionLiteralExpCSImpl collectionLiteralExpCS = new CollectionLiteralExpCSImpl();
		return collectionLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionLiteralPartCS createCollectionLiteralPartCS() {
		CollectionLiteralPartCSImpl collectionLiteralPartCS = new CollectionLiteralPartCSImpl();
		return collectionLiteralPartCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionRangeCS createCollectionRangeCS() {
		CollectionRangeCSImpl collectionRangeCS = new CollectionRangeCSImpl();
		return collectionRangeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionItem createCollectionItem() {
		CollectionItemImpl collectionItem = new CollectionItemImpl();
		return collectionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveLiteralExpCS createPrimitiveLiteralExpCS() {
		PrimitiveLiteralExpCSImpl primitiveLiteralExpCS = new PrimitiveLiteralExpCSImpl();
		return primitiveLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLiteralExpCS createNumberLiteralExpCS() {
		NumberLiteralExpCSImpl numberLiteralExpCS = new NumberLiteralExpCSImpl();
		return numberLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteralExpCS createBooleanLiteralExpCS() {
		BooleanLiteralExpCSImpl booleanLiteralExpCS = new BooleanLiteralExpCSImpl();
		return booleanLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteralExpCS createStringLiteralExpCS() {
		StringLiteralExpCSImpl stringLiteralExpCS = new StringLiteralExpCSImpl();
		return stringLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteralExpCS createNullLiteralExpCS() {
		NullLiteralExpCSImpl nullLiteralExpCS = new NullLiteralExpCSImpl();
		return nullLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidLiteralExpCS createInvalidLiteralExpCS() {
		InvalidLiteralExpCSImpl invalidLiteralExpCS = new InvalidLiteralExpCSImpl();
		return invalidLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservedKeywordCS createReservedKeywordCS() {
		ReservedKeywordCSImpl reservedKeywordCS = new ReservedKeywordCSImpl();
		return reservedKeywordCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTypeIdentifierCS createCollectionTypeIdentifierCS() {
		CollectionTypeIdentifierCSImpl collectionTypeIdentifierCS = new CollectionTypeIdentifierCSImpl();
		return collectionTypeIdentifierCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeCS createPrimitiveTypeCS() {
		PrimitiveTypeCSImpl primitiveTypeCS = new PrimitiveTypeCSImpl();
		return primitiveTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclTypeCS createOclTypeCS() {
		OclTypeCSImpl oclTypeCS = new OclTypeCSImpl();
		return oclTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseContext createUseCaseContext() {
		UseCaseContextImpl useCaseContext = new UseCaseContextImpl();
		return useCaseContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityContext createEntityContext() {
		EntityContextImpl entityContext = new EntityContextImpl();
		return entityContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInterface createSystemInterface() {
		SystemInterfaceImpl systemInterface = new SystemInterfaceImpl();
		return systemInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveInterface createReceiveInterface() {
		ReceiveInterfaceImpl receiveInterface = new ReceiveInterfaceImpl();
		return receiveInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvideInterface createProvideInterface() {
		ProvideInterfaceImpl provideInterface = new ProvideInterfaceImpl();
		return provideInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterface createUserInterface() {
		UserInterfaceImpl userInterface = new UserInterfaceImpl();
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NF createNF() {
		NFImpl nf = new NFImpl();
		return nf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqPackage getReqPackage() {
		return (ReqPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReqPackage getPackage() {
		return ReqPackage.eINSTANCE;
	}

} //ReqFactoryImpl
