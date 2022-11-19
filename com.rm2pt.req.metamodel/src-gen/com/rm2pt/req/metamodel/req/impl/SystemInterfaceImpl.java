/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.EntityContext;
import com.rm2pt.req.metamodel.req.Reference;
import com.rm2pt.req.metamodel.req.ReqPackage;
import com.rm2pt.req.metamodel.req.SystemInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.SystemInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.SystemInterfaceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.SystemInterfaceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.SystemInterfaceImpl#getEntitycontext <em>Entitycontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemInterfaceImpl extends MinimalEObjectImpl.Container implements SystemInterface {
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
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getEntitycontext() <em>Entitycontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitycontext()
	 * @generated
	 * @ordered
	 */
	protected EntityContext entitycontext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.SYSTEM_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.SYSTEM_INTERFACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.SYSTEM_INTERFACE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject) reference;
			reference = (Reference) eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.SYSTEM_INTERFACE__REFERENCE,
							oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.SYSTEM_INTERFACE__REFERENCE, oldReference,
					reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityContext getEntitycontext() {
		if (entitycontext != null && entitycontext.eIsProxy()) {
			InternalEObject oldEntitycontext = (InternalEObject) entitycontext;
			entitycontext = (EntityContext) eResolveProxy(oldEntitycontext);
			if (entitycontext != oldEntitycontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT, oldEntitycontext, entitycontext));
			}
		}
		return entitycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityContext basicGetEntitycontext() {
		return entitycontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntitycontext(EntityContext newEntitycontext, NotificationChain msgs) {
		EntityContext oldEntitycontext = entitycontext;
		entitycontext = newEntitycontext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT, oldEntitycontext, newEntitycontext);
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
	public void setEntitycontext(EntityContext newEntitycontext) {
		if (newEntitycontext != entitycontext) {
			NotificationChain msgs = null;
			if (entitycontext != null)
				msgs = ((InternalEObject) entitycontext).eInverseRemove(this,
						ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE, EntityContext.class, msgs);
			if (newEntitycontext != null)
				msgs = ((InternalEObject) newEntitycontext).eInverseAdd(this,
						ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE, EntityContext.class, msgs);
			msgs = basicSetEntitycontext(newEntitycontext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT,
					newEntitycontext, newEntitycontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT:
			if (entitycontext != null)
				msgs = ((InternalEObject) entitycontext).eInverseRemove(this,
						ReqPackage.ENTITY_CONTEXT__SYSTEMINTERFACE, EntityContext.class, msgs);
			return basicSetEntitycontext((EntityContext) otherEnd, msgs);
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
		case ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT:
			return basicSetEntitycontext(null, msgs);
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
		case ReqPackage.SYSTEM_INTERFACE__NAME:
			return getName();
		case ReqPackage.SYSTEM_INTERFACE__LABEL:
			return getLabel();
		case ReqPackage.SYSTEM_INTERFACE__REFERENCE:
			if (resolve)
				return getReference();
			return basicGetReference();
		case ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT:
			if (resolve)
				return getEntitycontext();
			return basicGetEntitycontext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReqPackage.SYSTEM_INTERFACE__NAME:
			setName((String) newValue);
			return;
		case ReqPackage.SYSTEM_INTERFACE__LABEL:
			setLabel((String) newValue);
			return;
		case ReqPackage.SYSTEM_INTERFACE__REFERENCE:
			setReference((Reference) newValue);
			return;
		case ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT:
			setEntitycontext((EntityContext) newValue);
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
		case ReqPackage.SYSTEM_INTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ReqPackage.SYSTEM_INTERFACE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case ReqPackage.SYSTEM_INTERFACE__REFERENCE:
			setReference((Reference) null);
			return;
		case ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT:
			setEntitycontext((EntityContext) null);
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
		case ReqPackage.SYSTEM_INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ReqPackage.SYSTEM_INTERFACE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case ReqPackage.SYSTEM_INTERFACE__REFERENCE:
			return reference != null;
		case ReqPackage.SYSTEM_INTERFACE__ENTITYCONTEXT:
			return entitycontext != null;
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

} //SystemInterfaceImpl
