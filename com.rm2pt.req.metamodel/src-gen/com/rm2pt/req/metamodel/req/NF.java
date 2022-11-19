/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.NF#getCategory <em>Category</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.NF#getDescription <em>Description</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.NF#getLevel <em>Level</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.NF#getStakeholder <em>Stakeholder</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getNF()
 * @model
 * @generated
 */
public interface NF extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getNF_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.NF#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getNF_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.NF#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getNF_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.NF#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Stakeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholder</em>' attribute.
	 * @see #setStakeholder(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getNF_Stakeholder()
	 * @model
	 * @generated
	 */
	String getStakeholder();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.NF#getStakeholder <em>Stakeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stakeholder</em>' attribute.
	 * @see #getStakeholder()
	 * @generated
	 */
	void setStakeholder(String value);

} // NF
