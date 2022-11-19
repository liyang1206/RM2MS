/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.OperationParameters#getObject <em>Object</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.OperationParameters#getObjectproperty <em>Objectproperty</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.OperationParameters#getString <em>String</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getOperationParameters()
 * @model
 * @generated
 */
public interface OperationParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getOperationParameters_Object()
	 * @model
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.OperationParameters#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Objectproperty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectproperty</em>' containment reference.
	 * @see #setObjectproperty(PropertyCallExpCS)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getOperationParameters_Objectproperty()
	 * @model containment="true"
	 * @generated
	 */
	PropertyCallExpCS getObjectproperty();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.OperationParameters#getObjectproperty <em>Objectproperty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectproperty</em>' containment reference.
	 * @see #getObjectproperty()
	 * @generated
	 */
	void setObjectproperty(PropertyCallExpCS value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getOperationParameters_String()
	 * @model
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.OperationParameters#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

} // OperationParameters
