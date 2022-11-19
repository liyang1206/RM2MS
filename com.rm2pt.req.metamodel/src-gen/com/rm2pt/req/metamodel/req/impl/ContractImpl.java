/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.Contract;
import com.rm2pt.req.metamodel.req.Definition;
import com.rm2pt.req.metamodel.req.Entity;
import com.rm2pt.req.metamodel.req.Operation;
import com.rm2pt.req.metamodel.req.Postcondition;
import com.rm2pt.req.metamodel.req.Precondition;
import com.rm2pt.req.metamodel.req.ReqPackage;
import com.rm2pt.req.metamodel.req.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.ContractImpl#getService <em>Service</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.ContractImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.ContractImpl#getDef <em>Def</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.ContractImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.ContractImpl#getPost <em>Post</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.ContractImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends MinimalEObjectImpl.Container implements Contract {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected Operation op;

	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected Definition def;

	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected Precondition pre;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected Postcondition post;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject) service;
			service = (Service) eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.CONTRACT__SERVICE, oldService,
							service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(Operation newOp, NotificationChain msgs) {
		Operation oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__OP,
					oldOp, newOp);
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
	public void setOp(Operation newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject) op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqPackage.CONTRACT__OP,
						null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject) newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqPackage.CONTRACT__OP,
						null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition getDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDef(Definition newDef, NotificationChain msgs) {
		Definition oldDef = def;
		def = newDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__DEF,
					oldDef, newDef);
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
	public void setDef(Definition newDef) {
		if (newDef != def) {
			NotificationChain msgs = null;
			if (def != null)
				msgs = ((InternalEObject) def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqPackage.CONTRACT__DEF,
						null, msgs);
			if (newDef != null)
				msgs = ((InternalEObject) newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqPackage.CONTRACT__DEF,
						null, msgs);
			msgs = basicSetDef(newDef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__DEF, newDef, newDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition getPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPre(Precondition newPre, NotificationChain msgs) {
		Precondition oldPre = pre;
		pre = newPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__PRE,
					oldPre, newPre);
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
	public void setPre(Precondition newPre) {
		if (newPre != pre) {
			NotificationChain msgs = null;
			if (pre != null)
				msgs = ((InternalEObject) pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqPackage.CONTRACT__PRE,
						null, msgs);
			if (newPre != null)
				msgs = ((InternalEObject) newPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqPackage.CONTRACT__PRE,
						null, msgs);
			msgs = basicSetPre(newPre, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__PRE, newPre, newPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postcondition getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(Postcondition newPost, NotificationChain msgs) {
		Postcondition oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__POST,
					oldPost, newPost);
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
	public void setPost(Postcondition newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject) post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqPackage.CONTRACT__POST,
						null, msgs);
			if (newPost != null)
				msgs = ((InternalEObject) newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqPackage.CONTRACT__POST,
						null, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject) entity;
			entity = (Entity) eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.CONTRACT__ENTITY, oldEntity,
							entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.CONTRACT__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.CONTRACT__OP:
			return basicSetOp(null, msgs);
		case ReqPackage.CONTRACT__DEF:
			return basicSetDef(null, msgs);
		case ReqPackage.CONTRACT__PRE:
			return basicSetPre(null, msgs);
		case ReqPackage.CONTRACT__POST:
			return basicSetPost(null, msgs);
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
		case ReqPackage.CONTRACT__SERVICE:
			if (resolve)
				return getService();
			return basicGetService();
		case ReqPackage.CONTRACT__OP:
			return getOp();
		case ReqPackage.CONTRACT__DEF:
			return getDef();
		case ReqPackage.CONTRACT__PRE:
			return getPre();
		case ReqPackage.CONTRACT__POST:
			return getPost();
		case ReqPackage.CONTRACT__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
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
		case ReqPackage.CONTRACT__SERVICE:
			setService((Service) newValue);
			return;
		case ReqPackage.CONTRACT__OP:
			setOp((Operation) newValue);
			return;
		case ReqPackage.CONTRACT__DEF:
			setDef((Definition) newValue);
			return;
		case ReqPackage.CONTRACT__PRE:
			setPre((Precondition) newValue);
			return;
		case ReqPackage.CONTRACT__POST:
			setPost((Postcondition) newValue);
			return;
		case ReqPackage.CONTRACT__ENTITY:
			setEntity((Entity) newValue);
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
		case ReqPackage.CONTRACT__SERVICE:
			setService((Service) null);
			return;
		case ReqPackage.CONTRACT__OP:
			setOp((Operation) null);
			return;
		case ReqPackage.CONTRACT__DEF:
			setDef((Definition) null);
			return;
		case ReqPackage.CONTRACT__PRE:
			setPre((Precondition) null);
			return;
		case ReqPackage.CONTRACT__POST:
			setPost((Postcondition) null);
			return;
		case ReqPackage.CONTRACT__ENTITY:
			setEntity((Entity) null);
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
		case ReqPackage.CONTRACT__SERVICE:
			return service != null;
		case ReqPackage.CONTRACT__OP:
			return op != null;
		case ReqPackage.CONTRACT__DEF:
			return def != null;
		case ReqPackage.CONTRACT__PRE:
			return pre != null;
		case ReqPackage.CONTRACT__POST:
			return post != null;
		case ReqPackage.CONTRACT__ENTITY:
			return entity != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
