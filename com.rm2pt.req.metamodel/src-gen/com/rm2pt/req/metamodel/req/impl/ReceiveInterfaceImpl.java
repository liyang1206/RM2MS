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
 * An implementation of the model object '<em><b>Receive Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.ReceiveInterfaceImpl#getProvideinterface <em>Provideinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiveInterfaceImpl extends SystemInterfaceImpl implements ReceiveInterface {
	/**
	 * The cached value of the '{@link #getProvideinterface() <em>Provideinterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvideinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvideInterface> provideinterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.RECEIVE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvideInterface> getProvideinterface() {
		if (provideinterface == null) {
			provideinterface = new EObjectWithInverseResolvingEList.ManyInverse<ProvideInterface>(
					ProvideInterface.class, this, ReqPackage.RECEIVE_INTERFACE__PROVIDEINTERFACE,
					ReqPackage.PROVIDE_INTERFACE__RECEIVEINTERFACE);
		}
		return provideinterface;
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
		case ReqPackage.RECEIVE_INTERFACE__PROVIDEINTERFACE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvideinterface()).basicAdd(otherEnd, msgs);
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
		case ReqPackage.RECEIVE_INTERFACE__PROVIDEINTERFACE:
			return ((InternalEList<?>) getProvideinterface()).basicRemove(otherEnd, msgs);
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
		case ReqPackage.RECEIVE_INTERFACE__PROVIDEINTERFACE:
			return getProvideinterface();
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
		case ReqPackage.RECEIVE_INTERFACE__PROVIDEINTERFACE:
			getProvideinterface().clear();
			getProvideinterface().addAll((Collection<? extends ProvideInterface>) newValue);
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
		case ReqPackage.RECEIVE_INTERFACE__PROVIDEINTERFACE:
			getProvideinterface().clear();
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
		case ReqPackage.RECEIVE_INTERFACE__PROVIDEINTERFACE:
			return provideinterface != null && !provideinterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReceiveInterfaceImpl
