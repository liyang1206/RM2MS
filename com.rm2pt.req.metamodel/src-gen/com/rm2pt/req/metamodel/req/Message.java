/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.Message#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Message#getSendingEnd <em>Sending End</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.Message#getReceivingEnd <em>Receiving End</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getMessage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sending End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending End</em>' reference.
	 * @see #setSendingEnd(MixEnd)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getMessage_SendingEnd()
	 * @model
	 * @generated
	 */
	MixEnd getSendingEnd();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Message#getSendingEnd <em>Sending End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending End</em>' reference.
	 * @see #getSendingEnd()
	 * @generated
	 */
	void setSendingEnd(MixEnd value);

	/**
	 * Returns the value of the '<em><b>Receiving End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving End</em>' reference.
	 * @see #setReceivingEnd(MixEnd)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getMessage_ReceivingEnd()
	 * @model
	 * @generated
	 */
	MixEnd getReceivingEnd();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.Message#getReceivingEnd <em>Receiving End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving End</em>' reference.
	 * @see #getReceivingEnd()
	 * @generated
	 */
	void setReceivingEnd(MixEnd value);

} // Message
