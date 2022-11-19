/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseModel#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseModel#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseModel#getActor <em>Actor</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseModel#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseModel#getService <em>Service</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseModel#getContract <em>Contract</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UseCaseModel#getUsecasecontext <em>Usecasecontext</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseModel()
 * @model
 * @generated
 */
public interface UseCaseModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.UseCaseModel#getName <em>Name</em>}' attribute.
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
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseModel_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.UseCaseModel#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseModel_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseModel_Interaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getInteraction();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseModel_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseModel_Contract()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contract> getContract();

	/**
	 * Returns the value of the '<em><b>Usecasecontext</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.UseCaseContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecasecontext</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUseCaseModel_Usecasecontext()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCaseContext> getUsecasecontext();

} // UseCaseModel
