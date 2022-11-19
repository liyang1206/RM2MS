/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.Attribute;
import com.rm2pt.req.metamodel.req.Entity;
import com.rm2pt.req.metamodel.req.Invariance;
import com.rm2pt.req.metamodel.req.Reference;
import com.rm2pt.req.metamodel.req.ReqPackage;

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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityImpl#isIsCRUD <em>Is CRUD</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityImpl#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.EntityImpl#getInvariance <em>Invariance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The default value of the '{@link #isIsCRUD() <em>Is CRUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCRUD()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CRUD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCRUD() <em>Is CRUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCRUD()
	 * @generated
	 * @ordered
	 */
	protected boolean isCRUD = IS_CRUD_EDEFAULT;

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
	 * The cached value of the '{@link #getSuperEntity() <em>Super Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity superEntity;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * The cached value of the '{@link #getInvariance() <em>Invariance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariance()
	 * @generated
	 * @ordered
	 */
	protected EList<Invariance> invariance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCRUD() {
		return isCRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCRUD(boolean newIsCRUD) {
		boolean oldIsCRUD = isCRUD;
		isCRUD = newIsCRUD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.ENTITY__IS_CRUD, oldIsCRUD, isCRUD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSuperEntity() {
		if (superEntity != null && superEntity.eIsProxy()) {
			InternalEObject oldSuperEntity = (InternalEObject) superEntity;
			superEntity = (Entity) eResolveProxy(oldSuperEntity);
			if (superEntity != oldSuperEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.ENTITY__SUPER_ENTITY,
							oldSuperEntity, superEntity));
			}
		}
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSuperEntity() {
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperEntity(Entity newSuperEntity) {
		Entity oldSuperEntity = superEntity;
		superEntity = newSuperEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.ENTITY__SUPER_ENTITY, oldSuperEntity,
					superEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.ENTITY__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ReqPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this, ReqPackage.ENTITY__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invariance> getInvariance() {
		if (invariance == null) {
			invariance = new EObjectContainmentEList<Invariance>(Invariance.class, this, ReqPackage.ENTITY__INVARIANCE);
		}
		return invariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.ENTITY__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		case ReqPackage.ENTITY__REFERENCE:
			return ((InternalEList<?>) getReference()).basicRemove(otherEnd, msgs);
		case ReqPackage.ENTITY__INVARIANCE:
			return ((InternalEList<?>) getInvariance()).basicRemove(otherEnd, msgs);
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
		case ReqPackage.ENTITY__IS_CRUD:
			return isIsCRUD();
		case ReqPackage.ENTITY__NAME:
			return getName();
		case ReqPackage.ENTITY__SUPER_ENTITY:
			if (resolve)
				return getSuperEntity();
			return basicGetSuperEntity();
		case ReqPackage.ENTITY__DESCRIPTION:
			return getDescription();
		case ReqPackage.ENTITY__ATTRIBUTES:
			return getAttributes();
		case ReqPackage.ENTITY__REFERENCE:
			return getReference();
		case ReqPackage.ENTITY__INVARIANCE:
			return getInvariance();
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
		case ReqPackage.ENTITY__IS_CRUD:
			setIsCRUD((Boolean) newValue);
			return;
		case ReqPackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case ReqPackage.ENTITY__SUPER_ENTITY:
			setSuperEntity((Entity) newValue);
			return;
		case ReqPackage.ENTITY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ReqPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case ReqPackage.ENTITY__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
			return;
		case ReqPackage.ENTITY__INVARIANCE:
			getInvariance().clear();
			getInvariance().addAll((Collection<? extends Invariance>) newValue);
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
		case ReqPackage.ENTITY__IS_CRUD:
			setIsCRUD(IS_CRUD_EDEFAULT);
			return;
		case ReqPackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ReqPackage.ENTITY__SUPER_ENTITY:
			setSuperEntity((Entity) null);
			return;
		case ReqPackage.ENTITY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ReqPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			return;
		case ReqPackage.ENTITY__REFERENCE:
			getReference().clear();
			return;
		case ReqPackage.ENTITY__INVARIANCE:
			getInvariance().clear();
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
		case ReqPackage.ENTITY__IS_CRUD:
			return isCRUD != IS_CRUD_EDEFAULT;
		case ReqPackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ReqPackage.ENTITY__SUPER_ENTITY:
			return superEntity != null;
		case ReqPackage.ENTITY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ReqPackage.ENTITY__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case ReqPackage.ENTITY__REFERENCE:
			return reference != null && !reference.isEmpty();
		case ReqPackage.ENTITY__INVARIANCE:
			return invariance != null && !invariance.isEmpty();
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
		result.append(" (isCRUD: ");
		result.append(isCRUD);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
