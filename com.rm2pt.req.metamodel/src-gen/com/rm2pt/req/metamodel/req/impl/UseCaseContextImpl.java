/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.EntityContext;
import com.rm2pt.req.metamodel.req.NF;
import com.rm2pt.req.metamodel.req.ReqPackage;
import com.rm2pt.req.metamodel.req.UC;
import com.rm2pt.req.metamodel.req.UseCaseContext;

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
 * An implementation of the model object '<em><b>Use Case Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseContextImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseContextImpl#getUc <em>Uc</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseContextImpl#getEntitycontext <em>Entitycontext</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseContextImpl#getNf <em>Nf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseContextImpl extends MinimalEObjectImpl.Container implements UseCaseContext {
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
	 * The cached value of the '{@link #getUc() <em>Uc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUc()
	 * @generated
	 * @ordered
	 */
	protected EList<UC> uc;

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
	 * The cached value of the '{@link #getNf() <em>Nf</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNf()
	 * @generated
	 * @ordered
	 */
	protected EList<NF> nf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.USE_CASE_CONTEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.USE_CASE_CONTEXT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.USE_CASE_CONTEXT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UC> getUc() {
		if (uc == null) {
			uc = new EObjectContainmentEList<UC>(UC.class, this, ReqPackage.USE_CASE_CONTEXT__UC);
		}
		return uc;
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
							ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT, oldEntitycontext, entitycontext));
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
					ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT, oldEntitycontext, newEntitycontext);
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
				msgs = ((InternalEObject) entitycontext).eInverseRemove(this, ReqPackage.ENTITY_CONTEXT__USECASECONTEXT,
						EntityContext.class, msgs);
			if (newEntitycontext != null)
				msgs = ((InternalEObject) newEntitycontext).eInverseAdd(this, ReqPackage.ENTITY_CONTEXT__USECASECONTEXT,
						EntityContext.class, msgs);
			msgs = basicSetEntitycontext(newEntitycontext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT,
					newEntitycontext, newEntitycontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NF> getNf() {
		if (nf == null) {
			nf = new EObjectContainmentEList<NF>(NF.class, this, ReqPackage.USE_CASE_CONTEXT__NF);
		}
		return nf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT:
			if (entitycontext != null)
				msgs = ((InternalEObject) entitycontext).eInverseRemove(this, ReqPackage.ENTITY_CONTEXT__USECASECONTEXT,
						EntityContext.class, msgs);
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
		case ReqPackage.USE_CASE_CONTEXT__UC:
			return ((InternalEList<?>) getUc()).basicRemove(otherEnd, msgs);
		case ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT:
			return basicSetEntitycontext(null, msgs);
		case ReqPackage.USE_CASE_CONTEXT__NF:
			return ((InternalEList<?>) getNf()).basicRemove(otherEnd, msgs);
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
		case ReqPackage.USE_CASE_CONTEXT__NAME:
			return getName();
		case ReqPackage.USE_CASE_CONTEXT__LABEL:
			return getLabel();
		case ReqPackage.USE_CASE_CONTEXT__UC:
			return getUc();
		case ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT:
			if (resolve)
				return getEntitycontext();
			return basicGetEntitycontext();
		case ReqPackage.USE_CASE_CONTEXT__NF:
			return getNf();
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
		case ReqPackage.USE_CASE_CONTEXT__NAME:
			setName((String) newValue);
			return;
		case ReqPackage.USE_CASE_CONTEXT__LABEL:
			setLabel((String) newValue);
			return;
		case ReqPackage.USE_CASE_CONTEXT__UC:
			getUc().clear();
			getUc().addAll((Collection<? extends UC>) newValue);
			return;
		case ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT:
			setEntitycontext((EntityContext) newValue);
			return;
		case ReqPackage.USE_CASE_CONTEXT__NF:
			getNf().clear();
			getNf().addAll((Collection<? extends NF>) newValue);
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
		case ReqPackage.USE_CASE_CONTEXT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ReqPackage.USE_CASE_CONTEXT__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case ReqPackage.USE_CASE_CONTEXT__UC:
			getUc().clear();
			return;
		case ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT:
			setEntitycontext((EntityContext) null);
			return;
		case ReqPackage.USE_CASE_CONTEXT__NF:
			getNf().clear();
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
		case ReqPackage.USE_CASE_CONTEXT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ReqPackage.USE_CASE_CONTEXT__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case ReqPackage.USE_CASE_CONTEXT__UC:
			return uc != null && !uc.isEmpty();
		case ReqPackage.USE_CASE_CONTEXT__ENTITYCONTEXT:
			return entitycontext != null;
		case ReqPackage.USE_CASE_CONTEXT__NF:
			return nf != null && !nf.isEmpty();
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

} //UseCaseContextImpl
