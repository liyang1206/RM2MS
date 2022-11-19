/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.CombinedFragment;
import com.rm2pt.req.metamodel.req.CombinedFragmentEnd;
import com.rm2pt.req.metamodel.req.Operand;
import com.rm2pt.req.metamodel.req.Participant;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.CombinedFragmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.CombinedFragmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.CombinedFragmentImpl#getCoveredParticipants <em>Covered Participants</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.CombinedFragmentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.CombinedFragmentImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.CombinedFragmentImpl#getOwnedOperands <em>Owned Operands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedFragmentImpl extends MinimalEObjectImpl.Container implements CombinedFragment {
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
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoveredParticipants() <em>Covered Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> coveredParticipants;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected CombinedFragmentEnd start;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected CombinedFragmentEnd finish;

	/**
	 * The cached value of the '{@link #getOwnedOperands() <em>Owned Operands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<Operand> ownedOperands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.COMBINED_FRAGMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.COMBINED_FRAGMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.COMBINED_FRAGMENT__OPERATOR, oldOperator,
					operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getCoveredParticipants() {
		if (coveredParticipants == null) {
			coveredParticipants = new EObjectResolvingEList<Participant>(Participant.class, this,
					ReqPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS);
		}
		return coveredParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragmentEnd getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject) start;
			start = (CombinedFragmentEnd) eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.COMBINED_FRAGMENT__START,
							oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragmentEnd basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(CombinedFragmentEnd newStart) {
		CombinedFragmentEnd oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.COMBINED_FRAGMENT__START, oldStart,
					start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragmentEnd getFinish() {
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject) finish;
			finish = (CombinedFragmentEnd) eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.COMBINED_FRAGMENT__FINISH,
							oldFinish, finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragmentEnd basicGetFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(CombinedFragmentEnd newFinish) {
		CombinedFragmentEnd oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.COMBINED_FRAGMENT__FINISH, oldFinish,
					finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operand> getOwnedOperands() {
		if (ownedOperands == null) {
			ownedOperands = new EObjectContainmentEList<Operand>(Operand.class, this,
					ReqPackage.COMBINED_FRAGMENT__OWNED_OPERANDS);
		}
		return ownedOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
			return ((InternalEList<?>) getOwnedOperands()).basicRemove(otherEnd, msgs);
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
		case ReqPackage.COMBINED_FRAGMENT__NAME:
			return getName();
		case ReqPackage.COMBINED_FRAGMENT__OPERATOR:
			return getOperator();
		case ReqPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
			return getCoveredParticipants();
		case ReqPackage.COMBINED_FRAGMENT__START:
			if (resolve)
				return getStart();
			return basicGetStart();
		case ReqPackage.COMBINED_FRAGMENT__FINISH:
			if (resolve)
				return getFinish();
			return basicGetFinish();
		case ReqPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
			return getOwnedOperands();
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
		case ReqPackage.COMBINED_FRAGMENT__NAME:
			setName((String) newValue);
			return;
		case ReqPackage.COMBINED_FRAGMENT__OPERATOR:
			setOperator((String) newValue);
			return;
		case ReqPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
			getCoveredParticipants().clear();
			getCoveredParticipants().addAll((Collection<? extends Participant>) newValue);
			return;
		case ReqPackage.COMBINED_FRAGMENT__START:
			setStart((CombinedFragmentEnd) newValue);
			return;
		case ReqPackage.COMBINED_FRAGMENT__FINISH:
			setFinish((CombinedFragmentEnd) newValue);
			return;
		case ReqPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
			getOwnedOperands().clear();
			getOwnedOperands().addAll((Collection<? extends Operand>) newValue);
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
		case ReqPackage.COMBINED_FRAGMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ReqPackage.COMBINED_FRAGMENT__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case ReqPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
			getCoveredParticipants().clear();
			return;
		case ReqPackage.COMBINED_FRAGMENT__START:
			setStart((CombinedFragmentEnd) null);
			return;
		case ReqPackage.COMBINED_FRAGMENT__FINISH:
			setFinish((CombinedFragmentEnd) null);
			return;
		case ReqPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
			getOwnedOperands().clear();
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
		case ReqPackage.COMBINED_FRAGMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ReqPackage.COMBINED_FRAGMENT__OPERATOR:
			return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
		case ReqPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
			return coveredParticipants != null && !coveredParticipants.isEmpty();
		case ReqPackage.COMBINED_FRAGMENT__START:
			return start != null;
		case ReqPackage.COMBINED_FRAGMENT__FINISH:
			return finish != null;
		case ReqPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
			return ownedOperands != null && !ownedOperands.isEmpty();
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
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //CombinedFragmentImpl
