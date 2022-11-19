/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.Actor;
import com.rm2pt.req.metamodel.req.Contract;
import com.rm2pt.req.metamodel.req.Interaction;
import com.rm2pt.req.metamodel.req.ReqPackage;
import com.rm2pt.req.metamodel.req.Service;
import com.rm2pt.req.metamodel.req.UseCaseContext;
import com.rm2pt.req.metamodel.req.UseCaseModel;

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
 * An implementation of the model object '<em><b>Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseModelImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseModelImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseModelImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseModelImpl#getService <em>Service</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseModelImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.UseCaseModelImpl#getUsecasecontext <em>Usecasecontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseModelImpl extends MinimalEObjectImpl.Container implements UseCaseModel {
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
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> interaction;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contract;

	/**
	 * The cached value of the '{@link #getUsecasecontext() <em>Usecasecontext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsecasecontext()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCaseContext> usecasecontext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.USE_CASE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.USE_CASE_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.USE_CASE_MODEL__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<Actor>(Actor.class, this, ReqPackage.USE_CASE_MODEL__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interaction> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<Interaction>(Interaction.class, this,
					ReqPackage.USE_CASE_MODEL__INTERACTION);
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, ReqPackage.USE_CASE_MODEL__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getContract() {
		if (contract == null) {
			contract = new EObjectContainmentEList<Contract>(Contract.class, this, ReqPackage.USE_CASE_MODEL__CONTRACT);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCaseContext> getUsecasecontext() {
		if (usecasecontext == null) {
			usecasecontext = new EObjectContainmentEList<UseCaseContext>(UseCaseContext.class, this,
					ReqPackage.USE_CASE_MODEL__USECASECONTEXT);
		}
		return usecasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.USE_CASE_MODEL__ACTOR:
			return ((InternalEList<?>) getActor()).basicRemove(otherEnd, msgs);
		case ReqPackage.USE_CASE_MODEL__INTERACTION:
			return ((InternalEList<?>) getInteraction()).basicRemove(otherEnd, msgs);
		case ReqPackage.USE_CASE_MODEL__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
		case ReqPackage.USE_CASE_MODEL__CONTRACT:
			return ((InternalEList<?>) getContract()).basicRemove(otherEnd, msgs);
		case ReqPackage.USE_CASE_MODEL__USECASECONTEXT:
			return ((InternalEList<?>) getUsecasecontext()).basicRemove(otherEnd, msgs);
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
		case ReqPackage.USE_CASE_MODEL__NAME:
			return getName();
		case ReqPackage.USE_CASE_MODEL__LABEL:
			return getLabel();
		case ReqPackage.USE_CASE_MODEL__ACTOR:
			return getActor();
		case ReqPackage.USE_CASE_MODEL__INTERACTION:
			return getInteraction();
		case ReqPackage.USE_CASE_MODEL__SERVICE:
			return getService();
		case ReqPackage.USE_CASE_MODEL__CONTRACT:
			return getContract();
		case ReqPackage.USE_CASE_MODEL__USECASECONTEXT:
			return getUsecasecontext();
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
		case ReqPackage.USE_CASE_MODEL__NAME:
			setName((String) newValue);
			return;
		case ReqPackage.USE_CASE_MODEL__LABEL:
			setLabel((String) newValue);
			return;
		case ReqPackage.USE_CASE_MODEL__ACTOR:
			getActor().clear();
			getActor().addAll((Collection<? extends Actor>) newValue);
			return;
		case ReqPackage.USE_CASE_MODEL__INTERACTION:
			getInteraction().clear();
			getInteraction().addAll((Collection<? extends Interaction>) newValue);
			return;
		case ReqPackage.USE_CASE_MODEL__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
			return;
		case ReqPackage.USE_CASE_MODEL__CONTRACT:
			getContract().clear();
			getContract().addAll((Collection<? extends Contract>) newValue);
			return;
		case ReqPackage.USE_CASE_MODEL__USECASECONTEXT:
			getUsecasecontext().clear();
			getUsecasecontext().addAll((Collection<? extends UseCaseContext>) newValue);
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
		case ReqPackage.USE_CASE_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ReqPackage.USE_CASE_MODEL__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case ReqPackage.USE_CASE_MODEL__ACTOR:
			getActor().clear();
			return;
		case ReqPackage.USE_CASE_MODEL__INTERACTION:
			getInteraction().clear();
			return;
		case ReqPackage.USE_CASE_MODEL__SERVICE:
			getService().clear();
			return;
		case ReqPackage.USE_CASE_MODEL__CONTRACT:
			getContract().clear();
			return;
		case ReqPackage.USE_CASE_MODEL__USECASECONTEXT:
			getUsecasecontext().clear();
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
		case ReqPackage.USE_CASE_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ReqPackage.USE_CASE_MODEL__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case ReqPackage.USE_CASE_MODEL__ACTOR:
			return actor != null && !actor.isEmpty();
		case ReqPackage.USE_CASE_MODEL__INTERACTION:
			return interaction != null && !interaction.isEmpty();
		case ReqPackage.USE_CASE_MODEL__SERVICE:
			return service != null && !service.isEmpty();
		case ReqPackage.USE_CASE_MODEL__CONTRACT:
			return contract != null && !contract.isEmpty();
		case ReqPackage.USE_CASE_MODEL__USECASECONTEXT:
			return usecasecontext != null && !usecasecontext.isEmpty();
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

} //UseCaseModelImpl
