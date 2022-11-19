/**
 */
package com.rm2pt.req.metamodel.req;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.ReturnMessage#getInvocationMessage <em>Invocation Message</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReturnMessage()
 * @model
 * @generated
 */
public interface ReturnMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Invocation Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation Message</em>' reference.
	 * @see #setInvocationMessage(Message)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReturnMessage_InvocationMessage()
	 * @model
	 * @generated
	 */
	Message getInvocationMessage();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.ReturnMessage#getInvocationMessage <em>Invocation Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation Message</em>' reference.
	 * @see #getInvocationMessage()
	 * @generated
	 */
	void setInvocationMessage(Message value);

} // ReturnMessage
