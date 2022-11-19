/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.LetExpCS#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.LetExpCS#getInExpression <em>In Expression</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getLetExpCS()
 * @model
 * @generated
 */
public interface LetExpCS extends OCLExpressionCS {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.VariableDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getLetExpCS_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclarationCS> getVariable();

	/**
	 * Returns the value of the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Expression</em>' containment reference.
	 * @see #setInExpression(OCLExpressionCS)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getLetExpCS_InExpression()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getInExpression();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.LetExpCS#getInExpression <em>In Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Expression</em>' containment reference.
	 * @see #getInExpression()
	 * @generated
	 */
	void setInExpression(OCLExpressionCS value);

} // LetExpCS
