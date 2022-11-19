/**
 */
package com.rm2pt.req.metamodel.req;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.SimpleOperation#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getSimpleOperation()
 * @model
 * @generated
 */
public interface SimpleOperation extends WorkflowExp {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Operation)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getSimpleOperation_Ref()
	 * @model
	 * @generated
	 */
	Operation getRef();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.SimpleOperation#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Operation value);

} // SimpleOperation
