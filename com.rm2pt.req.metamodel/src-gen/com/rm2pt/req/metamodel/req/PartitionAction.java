/**
 */
package com.rm2pt.req.metamodel.req;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.PartitionAction#getPatition <em>Patition</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.PartitionAction#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getPartitionAction()
 * @model
 * @generated
 */
public interface PartitionAction extends WorkflowExp {
	/**
	 * Returns the value of the '<em><b>Patition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patition</em>' reference.
	 * @see #setPatition(Participant)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getPartitionAction_Patition()
	 * @model
	 * @generated
	 */
	Participant getPatition();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.PartitionAction#getPatition <em>Patition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patition</em>' reference.
	 * @see #getPatition()
	 * @generated
	 */
	void setPatition(Participant value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(JoinExp)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getPartitionAction_Action()
	 * @model
	 * @generated
	 */
	JoinExp getAction();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.PartitionAction#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(JoinExp value);

} // PartitionAction
