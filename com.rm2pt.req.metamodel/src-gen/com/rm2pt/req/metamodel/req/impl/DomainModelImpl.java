/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.DomainModel;
import com.rm2pt.req.metamodel.req.EntityContext;
import com.rm2pt.req.metamodel.req.ReqPackage;
import com.rm2pt.req.metamodel.req.SystemInterface;

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
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.DomainModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.DomainModelImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.DomainModelImpl#getEntitycontext <em>Entitycontext</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.DomainModelImpl#getSysteminterface <em>Systeminterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainModelImpl extends MinimalEObjectImpl.Container implements DomainModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntitycontext() <em>Entitycontext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitycontext()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityContext> entitycontext;

	/**
	 * The cached value of the '{@link #getSysteminterface() <em>Systeminterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysteminterface()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemInterface> systeminterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.DOMAIN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.DOMAIN_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.DOMAIN_MODEL__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityContext> getEntitycontext() {
		if (entitycontext == null) {
			entitycontext = new EObjectContainmentEList<EntityContext>(EntityContext.class, this,
					ReqPackage.DOMAIN_MODEL__ENTITYCONTEXT);
		}
		return entitycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemInterface> getSysteminterface() {
		if (systeminterface == null) {
			systeminterface = new EObjectContainmentEList<SystemInterface>(SystemInterface.class, this,
					ReqPackage.DOMAIN_MODEL__SYSTEMINTERFACE);
		}
		return systeminterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.DOMAIN_MODEL__ENTITYCONTEXT:
			return ((InternalEList<?>) getEntitycontext()).basicRemove(otherEnd, msgs);
		case ReqPackage.DOMAIN_MODEL__SYSTEMINTERFACE:
			return ((InternalEList<?>) getSysteminterface()).basicRemove(otherEnd, msgs);
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
		case ReqPackage.DOMAIN_MODEL__NAME:
			return getName();
		case ReqPackage.DOMAIN_MODEL__LABEL:
			return getLabel();
		case ReqPackage.DOMAIN_MODEL__ENTITYCONTEXT:
			return getEntitycontext();
		case ReqPackage.DOMAIN_MODEL__SYSTEMINTERFACE:
			return getSysteminterface();
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
		case ReqPackage.DOMAIN_MODEL__NAME:
			setName((String) newValue);
			return;
		case ReqPackage.DOMAIN_MODEL__LABEL:
			setLabel((String) newValue);
			return;
		case ReqPackage.DOMAIN_MODEL__ENTITYCONTEXT:
			getEntitycontext().clear();
			getEntitycontext().addAll((Collection<? extends EntityContext>) newValue);
			return;
		case ReqPackage.DOMAIN_MODEL__SYSTEMINTERFACE:
			getSysteminterface().clear();
			getSysteminterface().addAll((Collection<? extends SystemInterface>) newValue);
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
		case ReqPackage.DOMAIN_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ReqPackage.DOMAIN_MODEL__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case ReqPackage.DOMAIN_MODEL__ENTITYCONTEXT:
			getEntitycontext().clear();
			return;
		case ReqPackage.DOMAIN_MODEL__SYSTEMINTERFACE:
			getSysteminterface().clear();
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
		case ReqPackage.DOMAIN_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ReqPackage.DOMAIN_MODEL__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case ReqPackage.DOMAIN_MODEL__ENTITYCONTEXT:
			return entitycontext != null && !entitycontext.isEmpty();
		case ReqPackage.DOMAIN_MODEL__SYSTEMINTERFACE:
			return systeminterface != null && !systeminterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //DomainModelImpl
