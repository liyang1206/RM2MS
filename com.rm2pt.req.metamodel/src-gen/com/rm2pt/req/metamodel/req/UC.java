/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.UC#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UC#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UC#getUCRelation <em>UC Relation</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UC#getRelateduc <em>Relateduc</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UC#getSsd <em>Ssd</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UC#getService <em>Service</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UC#getDescription <em>Description</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.UC#getNf <em>Nf</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUC()
 * @model
 * @generated
 */
public interface UC extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUC_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.UC#getName <em>Name</em>}' attribute.
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
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUC_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.UC#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>UC Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UC Relation</em>' attribute.
	 * @see #setUCRelation(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUC_UCRelation()
	 * @model
	 * @generated
	 */
	String getUCRelation();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.UC#getUCRelation <em>UC Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UC Relation</em>' attribute.
	 * @see #getUCRelation()
	 * @generated
	 */
	void setUCRelation(String value);

	/**
	 * Returns the value of the '<em><b>Relateduc</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.UC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relateduc</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUC_Relateduc()
	 * @model
	 * @generated
	 */
	EList<UC> getRelateduc();

	/**
	 * Returns the value of the '<em><b>Ssd</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssd</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUC_Ssd()
	 * @model
	 * @generated
	 */
	EList<Interaction> getSsd();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUC_Service()
	 * @model
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUC_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.UC#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Nf</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.NF}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nf</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getUC_Nf()
	 * @model upper="2"
	 * @generated
	 */
	EList<NF> getNf();

} // UC
