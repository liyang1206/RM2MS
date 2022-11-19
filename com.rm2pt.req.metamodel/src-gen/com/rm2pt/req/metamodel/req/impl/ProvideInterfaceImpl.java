/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.ProvideInterface;
import com.rm2pt.req.metamodel.req.ReceiveInterface;
import com.rm2pt.req.metamodel.req.ReqPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provide Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.ProvideInterfaceImpl#getReceiveinterface <em>Receiveinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvideInterfaceImpl extends SystemInterfaceImpl implements ProvideInterface {
	/**
	 * The cached value of the '{@link #getReceiveinterface() <em>Receiveinterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiveInterface> receiveinterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvideInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.PROVIDE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReceiveInterface> getReceiveinterface() {
		if (receiveinterface == null) {
			receiveinterface = new EObjectWithInverseResolvingEList.ManyInverse<ReceiveInterface>(
					ReceiveInterface.class, this, ReqPackage.PROVIDE_INTERFACE__RECEIVEINTERFACE,
					ReqPackage.RECEIVE_INTERFACE__PROVIDEINTERFACE);
		}
		return receiveinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.PROVIDE_INTERFACE__RECEIVEINTERFACE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceiveinterface()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.PROVIDE_INTERFACE__RECEIVEINTERFACE:
			return ((InternalEList<?>) getReceiveinterface()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReqPackage.PROVIDE_INTERFACE__RECEIVEINTERFACE:
			return getReceiveinterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReqPackage.PROVIDE_INTERFACE__RECEIVEINTERFACE:
			getReceiveinterface().clear();
			getReceiveinterface().addAll((Collection<? extends ReceiveInterface>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ReqPackage.PROVIDE_INTERFACE__RECEIVEINTERFACE:
			getReceiveinterface().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ReqPackage.PROVIDE_INTERFACE__RECEIVEINTERFACE:
			return receiveinterface != null && !receiveinterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvideInterfaceImpl
