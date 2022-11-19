/**
 */
package com.rm2pt.req.metamodel.req;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.NestedExpCS#getNestedExpression <em>Nested Expression</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getNestedExpCS()
 * @model
 * @generated
 */
public interface NestedExpCS extends OCLExpressionCS {
	/**
	 * Returns the value of the '<em><b>Nested Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Expression</em>' containment reference.
	 * @see #setNestedExpression(OCLExpressionCS)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getNestedExpCS_NestedExpression()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getNestedExpression();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.NestedExpCS#getNestedExpression <em>Nested Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Expression</em>' containment reference.
	 * @see #getNestedExpression()
	 * @generated
	 */
	void setNestedExpression(OCLExpressionCS value);

} // NestedExpCS
