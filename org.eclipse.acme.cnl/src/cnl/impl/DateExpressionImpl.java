/**
 */
package cnl.impl;

import cnl.BaseExpression;
import cnl.CnlPackage;
import cnl.DateExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cnl.impl.DateExpressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link cnl.impl.DateExpressionImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateExpressionImpl extends ExpressionImpl implements DateExpression {
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected BaseExpression lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected BaseExpression rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CnlPackage.Literals.DATE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseExpression getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(BaseExpression newLhs, NotificationChain msgs) {
		BaseExpression oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CnlPackage.DATE_EXPRESSION__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLhs(BaseExpression newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CnlPackage.DATE_EXPRESSION__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CnlPackage.DATE_EXPRESSION__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CnlPackage.DATE_EXPRESSION__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseExpression getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(BaseExpression newRhs, NotificationChain msgs) {
		BaseExpression oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CnlPackage.DATE_EXPRESSION__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRhs(BaseExpression newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CnlPackage.DATE_EXPRESSION__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CnlPackage.DATE_EXPRESSION__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CnlPackage.DATE_EXPRESSION__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CnlPackage.DATE_EXPRESSION__LHS:
				return basicSetLhs(null, msgs);
			case CnlPackage.DATE_EXPRESSION__RHS:
				return basicSetRhs(null, msgs);
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
			case CnlPackage.DATE_EXPRESSION__LHS:
				return getLhs();
			case CnlPackage.DATE_EXPRESSION__RHS:
				return getRhs();
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
			case CnlPackage.DATE_EXPRESSION__LHS:
				setLhs((BaseExpression)newValue);
				return;
			case CnlPackage.DATE_EXPRESSION__RHS:
				setRhs((BaseExpression)newValue);
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
			case CnlPackage.DATE_EXPRESSION__LHS:
				setLhs((BaseExpression)null);
				return;
			case CnlPackage.DATE_EXPRESSION__RHS:
				setRhs((BaseExpression)null);
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
			case CnlPackage.DATE_EXPRESSION__LHS:
				return lhs != null;
			case CnlPackage.DATE_EXPRESSION__RHS:
				return rhs != null;
		}
		return super.eIsSet(featureID);
	}

} //DateExpressionImpl
