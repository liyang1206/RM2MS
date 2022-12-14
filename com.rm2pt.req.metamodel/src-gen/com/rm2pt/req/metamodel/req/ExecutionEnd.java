/**
 */
package com.rm2pt.req.metamodel.req;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.ExecutionEnd#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getExecutionEnd()
 * @model
 * @generated
 */
public interface ExecutionEnd extends MixEnd {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' reference.
	 * @see #setExecution(Execution)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getExecutionEnd_Execution()
	 * @model
	 * @generated
	 */
	Execution getExecution();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.ExecutionEnd#getExecution <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(Execution value);

} // ExecutionEnd
