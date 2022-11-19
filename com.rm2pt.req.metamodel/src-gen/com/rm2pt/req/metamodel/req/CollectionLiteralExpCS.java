/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Literal Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.CollectionLiteralExpCS#getKind <em>Kind</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.CollectionLiteralExpCS#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getCollectionLiteralExpCS()
 * @model
 * @generated
 */
public interface CollectionLiteralExpCS extends LiteralExpCS {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(CollectionTypeIdentifierCS)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getCollectionLiteralExpCS_Kind()
	 * @model containment="true"
	 * @generated
	 */
	CollectionTypeIdentifierCS getKind();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.CollectionLiteralExpCS#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CollectionTypeIdentifierCS value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.CollectionLiteralPartCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getCollectionLiteralExpCS_Part()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectionLiteralPartCS> getPart();

} // CollectionLiteralExpCS
