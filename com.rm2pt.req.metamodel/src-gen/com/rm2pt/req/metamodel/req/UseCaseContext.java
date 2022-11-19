/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseContext#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseContext#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseContext#getUc <em>Uc</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseContext#getEntitycontext <em>Entitycontext</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseContext#getNf <em>Nf</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseContext()
 * @model
 * @generated
 */
public interface UseCaseContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseContext_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.UseCaseContext#getName <em>Name</em>}' attribute.
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
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseContext_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.UseCaseContext#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Uc</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.UC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uc</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseContext_Uc()
	 * @model containment="true"
	 * @generated
	 */
	EList<UC> getUc();

	/**
	 * Returns the value of the '<em><b>Entitycontext</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.rm2pt.req.metamodel.req.EntityContext#getUsecasecontext <em>Usecasecontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entitycontext</em>' reference.
	 * @see #setEntitycontext(EntityContext)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseContext_Entitycontext()
	 * @see com.rm2pt.req.metamodel.req.EntityContext#getUsecasecontext
	 * @model opposite="usecasecontext"
	 * @generated
	 */
	EntityContext getEntitycontext();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.UseCaseContext#getEntitycontext <em>Entitycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entitycontext</em>' reference.
	 * @see #getEntitycontext()
	 * @generated
	 */
	void setEntitycontext(EntityContext value);

	/**
	 * Returns the value of the '<em><b>Nf</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.NF}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nf</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseContext_Nf()
	 * @model containment="true"
	 * @generated
	 */
	EList<NF> getNf();

} // UseCaseContext
