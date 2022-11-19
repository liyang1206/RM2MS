/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.OperationCallExpCS#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.OperationCallExpCS#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getOperationCallExpCS()
 * @model
 * @generated
 */
public interface OperationCallExpCS extends FeatureCallExpCS {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getOperationCallExpCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.OperationCallExpCS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.OperationParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getOperationCallExpCS_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationParameters> getParameters();

} // OperationCallExpCS
