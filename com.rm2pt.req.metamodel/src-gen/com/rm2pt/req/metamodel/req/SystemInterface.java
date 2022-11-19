/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.SystemInterface#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.SystemInterface#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.SystemInterface#getReference <em>Reference</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.SystemInterface#getEntitycontext <em>Entitycontext</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getSystemInterface()
 * @model
 * @generated
 */
public interface SystemInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getSystemInterface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.SystemInterface#getName <em>Name</em>}' attribute.
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
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getSystemInterface_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.SystemInterface#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Reference)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getSystemInterface_Reference()
	 * @model
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.SystemInterface#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Entitycontext</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.rm2pt.req.metamodel.req.EntityContext#getSysteminterface <em>Systeminterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entitycontext</em>' reference.
	 * @see #setEntitycontext(EntityContext)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getSystemInterface_Entitycontext()
	 * @see com.rm2pt.req.metamodel.req.EntityContext#getSysteminterface
	 * @model opposite="systeminterface"
	 * @generated
	 */
	EntityContext getEntitycontext();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.SystemInterface#getEntitycontext <em>Entitycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entitycontext</em>' reference.
	 * @see #getEntitycontext()
	 * @generated
	 */
	void setEntitycontext(EntityContext value);

} // SystemInterface
