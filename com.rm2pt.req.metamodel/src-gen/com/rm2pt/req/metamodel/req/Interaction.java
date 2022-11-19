/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.Interaction#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Interaction#getParticipants <em>Participants</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Interaction#getMessages <em>Messages</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Interaction#getExecutions <em>Executions</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Interaction#getCombinedFragments <em>Combined Fragments</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Interaction#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getInteraction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Interaction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getInteraction_Participants()
	 * @model
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getInteraction_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Execution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executions</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getInteraction_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Execution> getExecutions();

	/**
	 * Returns the value of the '<em><b>Combined Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.CombinedFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Fragments</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getInteraction_CombinedFragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<CombinedFragment> getCombinedFragments();

	/**
	 * Returns the value of the '<em><b>Ends</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.AbstractEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getInteraction_Ends()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEnd> getEnds();

} // Interaction
