/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.Participant;
import com.rm2pt.req.metamodel.req.Partition;
import com.rm2pt.req.metamodel.req.ReqPackage;
import com.rm2pt.req.metamodel.req.WorkflowExp;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.PartitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.PartitionImpl#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionImpl extends MinimalEObjectImpl.Container implements Partition {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Participant name;

	/**
	 * The cached value of the '{@link #getExps() <em>Exps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExps()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowExp> exps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject) name;
			name = (Participant) eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.PARTITION__NAME, oldName,
							name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Participant newName) {
		Participant oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.PARTITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowExp> getExps() {
		if (exps == null) {
			exps = new EObjectContainmentEList<WorkflowExp>(WorkflowExp.class, this, ReqPackage.PARTITION__EXPS);
		}
		return exps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.PARTITION__EXPS:
			return ((InternalEList<?>) getExps()).basicRemove(otherEnd, msgs);
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
		case ReqPackage.PARTITION__NAME:
			if (resolve)
				return getName();
			return basicGetName();
		case ReqPackage.PARTITION__EXPS:
			return getExps();
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
		case ReqPackage.PARTITION__NAME:
			setName((Participant) newValue);
			return;
		case ReqPackage.PARTITION__EXPS:
			getExps().clear();
			getExps().addAll((Collection<? extends WorkflowExp>) newValue);
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
		case ReqPackage.PARTITION__NAME:
			setName((Participant) null);
			return;
		case ReqPackage.PARTITION__EXPS:
			getExps().clear();
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
		case ReqPackage.PARTITION__NAME:
			return name != null;
		case ReqPackage.PARTITION__EXPS:
			return exps != null && !exps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PartitionImpl
