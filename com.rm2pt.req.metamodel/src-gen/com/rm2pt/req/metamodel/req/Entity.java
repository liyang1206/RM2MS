/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.Entity#isIsCRUD <em>Is CRUD</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Entity#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Entity#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Entity#getDescription <em>Description</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Entity#getReference <em>Reference</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Entity#getInvariance <em>Invariance</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Is CRUD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is CRUD</em>' attribute.
	 * @see #setIsCRUD(boolean)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntity_IsCRUD()
	 * @model
	 * @generated
	 */
	boolean isIsCRUD();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Entity#isIsCRUD <em>Is CRUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is CRUD</em>' attribute.
	 * @see #isIsCRUD()
	 * @generated
	 */
	void setIsCRUD(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Super Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Entity</em>' reference.
	 * @see #setSuperEntity(Entity)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntity_SuperEntity()
	 * @model
	 * @generated
	 */
	Entity getSuperEntity();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Entity#getSuperEntity <em>Super Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Entity</em>' reference.
	 * @see #getSuperEntity()
	 * @generated
	 */
	void setSuperEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Entity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntity_Reference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Invariance</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Invariance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariance</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntity_Invariance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Invariance> getInvariance();

} // Entity
