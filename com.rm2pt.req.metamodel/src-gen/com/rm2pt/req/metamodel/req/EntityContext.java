/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.EntityContext#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.EntityContext#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.EntityContext#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.EntityContext#getUserinterface <em>Userinterface</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.EntityContext#getSysteminterface <em>Systeminterface</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.EntityContext#getUsecasecontext <em>Usecasecontext</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntityContext()
 * @model
 * @generated
 */
public interface EntityContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntityContext_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.EntityContext#getName <em>Name</em>}' attribute.
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
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntityContext_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.EntityContext#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntityContext_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Userinterface</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.UserInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userinterface</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntityContext_Userinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserInterface> getUserinterface();

	/**
	 * Returns the value of the '<em><b>Systeminterface</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.SystemInterface}.
	 * It is bidirectional and its opposite is '{@link com.rm2pt.req.metamodel.req.SystemInterface#getEntitycontext <em>Entitycontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systeminterface</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntityContext_Systeminterface()
	 * @see com.rm2pt.req.metamodel.req.SystemInterface#getEntitycontext
	 * @model opposite="entitycontext"
	 * @generated
	 */
	EList<SystemInterface> getSysteminterface();

	/**
	 * Returns the value of the '<em><b>Usecasecontext</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.rm2pt.req.metamodel.req.UseCaseContext#getEntitycontext <em>Entitycontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecasecontext</em>' reference.
	 * @see #setUsecasecontext(UseCaseContext)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getEntityContext_Usecasecontext()
	 * @see com.rm2pt.req.metamodel.req.UseCaseContext#getEntitycontext
	 * @model opposite="entitycontext"
	 * @generated
	 */
	UseCaseContext getUsecasecontext();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.EntityContext#getUsecasecontext <em>Usecasecontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usecasecontext</em>' reference.
	 * @see #getUsecasecontext()
	 * @generated
	 */
	void setUsecasecontext(UseCaseContext value);

} // EntityContext
