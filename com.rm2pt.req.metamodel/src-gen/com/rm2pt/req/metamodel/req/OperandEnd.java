/**
 */
package com.rm2pt.req.metamodel.req;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.OperandEnd#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getOperandEnd()
 * @model
 * @generated
 */
public interface OperandEnd extends MixOpAndCFEnd {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Operand)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getOperandEnd_Owner()
	 * @model
	 * @generated
	 */
	Operand getOwner();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.OperandEnd#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Operand value);

} // OperandEnd
