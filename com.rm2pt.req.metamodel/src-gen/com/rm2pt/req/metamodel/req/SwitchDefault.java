/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.SwitchDefault#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getSwitchDefault()
 * @model
 * @generated
 */
public interface SwitchDefault extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(SimpleOperation)
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getSwitchDefault_Op()
	 * @model containment="true"
	 * @generated
	 */
	SimpleOperation getOp();

	/**
	 * Sets the value of the '{@link com.rm2pt.req.metamodel.req.SwitchDefault#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(SimpleOperation value);

} // SwitchDefault
