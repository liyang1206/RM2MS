/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.ReceiveInterface#getProvideinterface <em>Provideinterface</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReceiveInterface()
 * @model
 * @generated
 */
public interface ReceiveInterface extends SystemInterface {
	/**
	 * Returns the value of the '<em><b>Provideinterface</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.ProvideInterface}.
	 * It is bidirectional and its opposite is '{@link com.rm2pt.req.metamodel.req.ProvideInterface#getReceiveinterface <em>Receiveinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provideinterface</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getReceiveInterface_Provideinterface()
	 * @see com.rm2pt.req.metamodel.req.ProvideInterface#getReceiveinterface
	 * @model opposite="receiveinterface"
	 * @generated
	 */
	EList<ProvideInterface> getProvideinterface();

} // ReceiveInterface
