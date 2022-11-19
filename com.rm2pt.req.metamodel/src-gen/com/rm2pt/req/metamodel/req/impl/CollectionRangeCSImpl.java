/**
 */
package com.rm2pt.req.metamodel.req.impl;

import com.rm2pt.req.metamodel.req.CollectionRangeCS;
import com.rm2pt.req.metamodel.req.OCLExpressionCS;
import com.rm2pt.req.metamodel.req.ReqPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Range CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.CollectionRangeCSImpl#getFirst <em>First</em>}</li>
 *   <li>{@link com.rm2pt.req.metamodel.req.impl.CollectionRangeCSImpl#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionRangeCSImpl extends CollectionLiteralPartCSImpl implements CollectionRangeCS {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected OCLExpressionCS first;

	/**
	 * The cached value of the '{@link #getLast() <em>Last</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected OCLExpressionCS last;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionRangeCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.COLLECTION_RANGE_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpressionCS getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(OCLExpressionCS newFirst, NotificationChain msgs) {
		OCLExpressionCS oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ReqPackage.COLLECTION_RANGE_CS__FIRST, oldFirst, newFirst);
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
	public void setFirst(OCLExpressionCS newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject) first).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ReqPackage.COLLECTION_RANGE_CS__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject) newFirst).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ReqPackage.COLLECTION_RANGE_CS__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.COLLECTION_RANGE_CS__FIRST, newFirst,
					newFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpressionCS getLast() {
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLast(OCLExpressionCS newLast, NotificationChain msgs) {
		OCLExpressionCS oldLast = last;
		last = newLast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ReqPackage.COLLECTION_RANGE_CS__LAST, oldLast, newLast);
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
	public void setLast(OCLExpressionCS newLast) {
		if (newLast != last) {
			NotificationChain msgs = null;
			if (last != null)
				msgs = ((InternalEObject) last).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ReqPackage.COLLECTION_RANGE_CS__LAST, null, msgs);
			if (newLast != null)
				msgs = ((InternalEObject) newLast).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ReqPackage.COLLECTION_RANGE_CS__LAST, null, msgs);
			msgs = basicSetLast(newLast, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.COLLECTION_RANGE_CS__LAST, newLast,
					newLast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReqPackage.COLLECTION_RANGE_CS__FIRST:
			return basicSetFirst(null, msgs);
		case ReqPackage.COLLECTION_RANGE_CS__LAST:
			return basicSetLast(null, msgs);
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
		case ReqPackage.COLLECTION_RANGE_CS__FIRST:
			return getFirst();
		case ReqPackage.COLLECTION_RANGE_CS__LAST:
			return getLast();
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
		case ReqPackage.COLLECTION_RANGE_CS__FIRST:
			setFirst((OCLExpressionCS) newValue);
			return;
		case ReqPackage.COLLECTION_RANGE_CS__LAST:
			setLast((OCLExpressionCS) newValue);
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
		case ReqPackage.COLLECTION_RANGE_CS__FIRST:
			setFirst((OCLExpressionCS) null);
			return;
		case ReqPackage.COLLECTION_RANGE_CS__LAST:
			setLast((OCLExpressionCS) null);
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
		case ReqPackage.COLLECTION_RANGE_CS__FIRST:
			return first != null;
		case ReqPackage.COLLECTION_RANGE_CS__LAST:
			return last != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionRangeCSImpl
