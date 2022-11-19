/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.DomainModel#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.DomainModel#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.DomainModel#getEntitycontext <em>Entitycontext</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.DomainModel#getSysteminterface <em>Systeminterface</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getDomainModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.DomainModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getDomainModel_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.DomainModel#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Entitycontext</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.EntityContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entitycontext</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getDomainModel_Entitycontext()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityContext> getEntitycontext();

	/**
	 * Returns the value of the '<em><b>Systeminterface</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.SystemInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systeminterface</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getDomainModel_Systeminterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemInterface> getSysteminterface();

} // DomainModel
