/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.Service#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Service#getTemp_property <em>Temp property</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Service#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Service#getInvariance <em>Invariance</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Participant {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getService_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Temp property</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp property</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getService_Temp_property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getTemp_property();

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Workflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getService_Workflow()
	 * @model
	 * @generated
	 */
	EList<Workflow> getWorkflow();

	/**
	 * Returns the value of the '<em><b>Invariance</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Invariance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariance</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getService_Invariance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Invariance> getInvariance();

} // Service
