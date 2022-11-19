/**
 */
package com.rm2pt.req.metamodel.req;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.JoinNode#getEndlinks <em>Endlinks</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.req.metamodel.req.ReqPackage#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode extends WorkflowExp {
	/**
	 * Returns the value of the '<em><b>Endlinks</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.req.metamodel.req.JoinExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endlinks</em>' reference list.
	 * @see com.rm2pt.req.metamodel.req.ReqPackage#getJoinNode_Endlinks()
	 * @model
	 * @generated
	 */
	EList<JoinExp> getEndlinks();

} // JoinNode
