/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.Partition#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Partition#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getPartition()
 * @model
 * @generated
 */
public interface Partition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Participant)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getPartition_Name()
	 * @model
	 * @generated
	 */
	Participant getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Partition#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Participant value);

	/**
	 * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.WorkflowExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exps</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getPartition_Exps()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowExp> getExps();

} // Partition
