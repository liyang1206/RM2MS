/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provide Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.ProvideInterface#getReceiveinterface <em>Receiveinterface</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getProvideInterface()
 * @model
 * @generated
 */
public interface ProvideInterface extends SystemInterface {
	/**
	 * Returns the value of the '<em><b>Receiveinterface</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.ReceiveInterface}.
	 * It is bidirectional and its opposite is '{@link com.rm2pt.req.metamodel.req.ReceiveInterface#getProvideinterface <em>Provideinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiveinterface</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getProvideInterface_Receiveinterface()
	 * @see com.rm2pt.req.metamodel.req.ReceiveInterface#getProvideinterface
	 * @model opposite="provideinterface"
	 * @generated
	 */
	EList<ReceiveInterface> getReceiveinterface();

} // ProvideInterface
