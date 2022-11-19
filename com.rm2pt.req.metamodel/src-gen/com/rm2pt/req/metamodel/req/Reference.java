/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.Reference#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Reference#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Reference#isIsmultiple <em>Ismultiple</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Reference#isIsReverseAssoication <em>Is Reverse Assoication</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Reference#isIsAggregation <em>Is Aggregation</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Reference#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Reference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Reference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReference_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Reference#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Ismultiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ismultiple</em>' attribute.
	 * @see #setIsmultiple(boolean)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReference_Ismultiple()
	 * @model
	 * @generated
	 */
	boolean isIsmultiple();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Reference#isIsmultiple <em>Ismultiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ismultiple</em>' attribute.
	 * @see #isIsmultiple()
	 * @generated
	 */
	void setIsmultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Reverse Assoication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reverse Assoication</em>' attribute.
	 * @see #setIsReverseAssoication(boolean)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReference_IsReverseAssoication()
	 * @model
	 * @generated
	 */
	boolean isIsReverseAssoication();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Reference#isIsReverseAssoication <em>Is Reverse Assoication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reverse Assoication</em>' attribute.
	 * @see #isIsReverseAssoication()
	 * @generated
	 */
	void setIsReverseAssoication(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Aggregation</em>' attribute.
	 * @see #setIsAggregation(boolean)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReference_IsAggregation()
	 * @model
	 * @generated
	 */
	boolean isIsAggregation();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Reference#isIsAggregation <em>Is Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Aggregation</em>' attribute.
	 * @see #isIsAggregation()
	 * @generated
	 */
	void setIsAggregation(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composition</em>' attribute.
	 * @see #setIsComposition(boolean)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReference_IsComposition()
	 * @model
	 * @generated
	 */
	boolean isIsComposition();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Reference#isIsComposition <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composition</em>' attribute.
	 * @see #isIsComposition()
	 * @generated
	 */
	void setIsComposition(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReference_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Reference#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Reference
