/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.IteratorExpCS#getObjectCall <em>Object Call</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.IteratorExpCS#getSimpleCall <em>Simple Call</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.IteratorExpCS#getIterator <em>Iterator</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.IteratorExpCS#getVaribles <em>Varibles</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.IteratorExpCS#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getIteratorExpCS()
 * @model
 * @generated
 */
public interface IteratorExpCS extends LoopExpCS {
	/**
	 * Returns the value of the '<em><b>Object Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Call</em>' containment reference.
	 * @see #setObjectCall(FeatureCallExpCS)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getIteratorExpCS_ObjectCall()
	 * @model containment="true"
	 * @generated
	 */
	FeatureCallExpCS getObjectCall();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.IteratorExpCS#getObjectCall <em>Object Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Call</em>' containment reference.
	 * @see #getObjectCall()
	 * @generated
	 */
	void setObjectCall(FeatureCallExpCS value);

	/**
	 * Returns the value of the '<em><b>Simple Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Call</em>' attribute.
	 * @see #setSimpleCall(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getIteratorExpCS_SimpleCall()
	 * @model
	 * @generated
	 */
	String getSimpleCall();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.IteratorExpCS#getSimpleCall <em>Simple Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Call</em>' attribute.
	 * @see #getSimpleCall()
	 * @generated
	 */
	void setSimpleCall(String value);

	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' attribute.
	 * @see #setIterator(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getIteratorExpCS_Iterator()
	 * @model
	 * @generated
	 */
	String getIterator();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.IteratorExpCS#getIterator <em>Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' attribute.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(String value);

	/**
	 * Returns the value of the '<em><b>Varibles</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.VariableDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varibles</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getIteratorExpCS_Varibles()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclarationCS> getVaribles();

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(OCLExpressionCS)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getIteratorExpCS_Exp()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getExp();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.IteratorExpCS#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(OCLExpressionCS value);

} // IteratorExpCS
