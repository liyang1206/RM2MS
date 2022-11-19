/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.Entity;
import com.rm2pt.req.metamodel.req.EntityContext;
import com.rm2pt.req.metamodel.req.ReqPackage;
import com.rm2pt.req.metamodel.req.SystemInterface;
import com.rm2pt.req.metamodel.req.UseCaseContext;
import com.rm2pt.req.metamodel.req.UserInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityContextImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityContextImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityContextImpl#getUserinterface <em>Userinterface</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityContextImpl#getSysteminterface <em>Systeminterface</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityContextImpl#getUsecasecontext <em>Usecasecontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityContextImpl extends MinimalEObjectImpl.Container implements EntityContext {
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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getUserinterface() <em>Userinterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<UserInterface> userinterface;

	/**
	 * The cached value of the '{@link #getSysteminterface() <em>Systeminterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysteminterface()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemInterface> systeminterface;

	/**
	 * The cached value of the '{@link #getUsecasecontext() <em>Usecasecontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsecasecontext()
	 * @generated
	 * @ordered
	 */
	protected UseCaseContext usecasecontext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.ENTITY_CONTEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.ENTITY_CONTEXT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.ENTITY_CONTEXT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, ReqPackage.ENTITY_CONTEXT__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserInterface> getUserinterface() {
		if (userinterface == null) {
			userinterface = new EObjectContainmentEList<UserInterface>(UserInterface.class, this,
					ReqPackage.ENTITY_CONTEXT__USERINTERFACE);
		}
		return userinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemInterface> getSysteminterface() {
		if (systeminterface == null) {
			systeminterface = new EObjectWithInverseResolvingEList<SystemInterface>(SystemInterface.class, this,
					ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE, ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT);
		}
		return systeminterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseContext getUsecasecontext() {
		if (usecasecontext != null && usecasecontext.eIsProxy()) {
			InternalEObject oldUsecasecontext = (InternalEObject) usecasecontext;
			usecasecontext = (UseCaseContext) eResolveProxy(oldUsecasecontext);
			if (usecasecontext != oldUsecasecontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.ENTITY_CONTEXT__USECASECONTEXT,
							oldUsecasecontext, usecasecontext));
			}
		}
		return usecasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseContext basicGetUsecasecontext() {
		return usecasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsecasecontext(UseCaseContext newUsecasecontext, NotificationChain msgs) {
		UseCaseContext oldUsecasecontext = usecasecontext;
		usecasecontext = newUsecasecontext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ReqPackage.ENTITY_CONTEXT__USECASECONTEXT, oldUsecasecontext, newUsecasecontext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsecasecontext(UseCaseContext newUsecasecontext) {
		if (newUsecasecontext != usecasecontext) {
			NotificationChain msgs = null;
			if (usecasecontext != null)
				msgs = ((InternalEObject) usecasecontext).eInverseRemove(this,
						ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT, UseCaseContext.class, msgs);
			if (newUsecasecontext != null)
				msgs = ((InternalEObject) newUsecasecontext).eInverseAdd(this,
						ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT, UseCaseContext.class, msgs);
			msgs = basicSetUsecasecontext(newUsecasecontext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.ENTITY_CONTEXT__USECASECONTEXT,
					newUsecasecontext, newUsecasecontext));
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
		case ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSysteminterface()).basicAdd(otherEnd, msgs);
		case ReqPackage.ENTITY_CONTEXT__USECASECONTEXT:
			if (usecasecontext != null)
				msgs = ((InternalEObject) usecasecontext).eInverseRemove(this,
						ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT, UseCaseContext.class, msgs);
			return basicSetUsecasecontext((UseCaseContext) otherEnd, msgs);
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
		case ReqPackage.ENTITY_CONTEXT__ENTITY:
			return ((InternalEList<?>) getEntity()).basicRemove(otherEnd, msgs);
		case ReqPackage.ENTITY_CONTEXT__USERINTERFACE:
			return ((InternalEList<?>) getUserinterface()).basicRemove(otherEnd, msgs);
		case ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE:
			return ((InternalEList<?>) getSysteminterface()).basicRemove(otherEnd, msgs);
		case ReqPackage.ENTITY_CONTEXT__USECASECONTEXT:
			return basicSetUsecasecontext(null, msgs);
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
		case ReqPackage.ENTITY_CONTEXT__NAME:
			return getName();
		case ReqPackage.ENTITY_CONTEXT__LABEL:
			return getLabel();
		case ReqPackage.ENTITY_CONTEXT__ENTITY:
			return getEntity();
		case ReqPackage.ENTITY_CONTEXT__USERINTERFACE:
			return getUserinterface();
		case ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE:
			return getSysteminterface();
		case ReqPackage.ENTITY_CONTEXT__USECASECONTEXT:
			if (resolve)
				return getUsecasecontext();
			return basicGetUsecasecontext();
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
		case ReqPackage.ENTITY_CONTEXT__NAME:
			setName((String) newValue);
			return;
		case ReqPackage.ENTITY_CONTEXT__LABEL:
			setLabel((String) newValue);
			return;
		case ReqPackage.ENTITY_CONTEXT__ENTITY:
			getEntity().clear();
			getEntity().addAll((Collection<? extends Entity>) newValue);
			return;
		case ReqPackage.ENTITY_CONTEXT__USERINTERFACE:
			getUserinterface().clear();
			getUserinterface().addAll((Collection<? extends UserInterface>) newValue);
			return;
		case ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE:
			getSysteminterface().clear();
			getSysteminterface().addAll((Collection<? extends SystemInterface>) newValue);
			return;
		case ReqPackage.ENTITY_CONTEXT__USECASECONTEXT:
			setUsecasecontext((UseCaseContext) newValue);
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
		case ReqPackage.ENTITY_CONTEXT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ReqPackage.ENTITY_CONTEXT__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case ReqPackage.ENTITY_CONTEXT__ENTITY:
			getEntity().clear();
			return;
		case ReqPackage.ENTITY_CONTEXT__USERINTERFACE:
			getUserinterface().clear();
			return;
		case ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE:
			getSysteminterface().clear();
			return;
		case ReqPackage.ENTITY_CONTEXT__USECASECONTEXT:
			setUsecasecontext((UseCaseContext) null);
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
		case ReqPackage.ENTITY_CONTEXT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ReqPackage.ENTITY_CONTEXT__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case ReqPackage.ENTITY_CONTEXT__ENTITY:
			return entity != null && !entity.isEmpty();
		case ReqPackage.ENTITY_CONTEXT__USERINTERFACE:
			return userinterface != null && !userinterface.isEmpty();
		case ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE:
			return systeminterface != null && !systeminterface.isEmpty();
		case ReqPackage.ENTITY_CONTEXT__USECASECONTEXT:
			return usecasecontext != null;
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

} //EntityContextImpl
