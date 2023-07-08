/**
 */
package cnl.impl;

import cnl.CNLRule;
import cnl.CnlPackage;
import cnl.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CNL Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cnl.impl.CNLRuleImpl#getAstRoot <em>Ast Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CNLRuleImpl extends RuleImpl implements CNLRule {
	/**
	 * The cached value of the '{@link #getAstRoot() <em>Ast Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAstRoot()
	 * @generated
	 * @ordered
	 */
	protected Expression astRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CNLRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CnlPackage.Literals.CNL_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getAstRoot() {
		return astRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAstRoot(Expression newAstRoot, NotificationChain msgs) {
		Expression oldAstRoot = astRoot;
		astRoot = newAstRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CnlPackage.CNL_RULE__AST_ROOT, oldAstRoot, newAstRoot);
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
	public void setAstRoot(Expression newAstRoot) {
		if (newAstRoot != astRoot) {
			NotificationChain msgs = null;
			if (astRoot != null)
				msgs = ((InternalEObject)astRoot).eInverseRemove(this, CnlPackage.EXPRESSION__RULE, Expression.class, msgs);
			if (newAstRoot != null)
				msgs = ((InternalEObject)newAstRoot).eInverseAdd(this, CnlPackage.EXPRESSION__RULE, Expression.class, msgs);
			msgs = basicSetAstRoot(newAstRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CnlPackage.CNL_RULE__AST_ROOT, newAstRoot, newAstRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CnlPackage.CNL_RULE__AST_ROOT:
				if (astRoot != null)
					msgs = ((InternalEObject)astRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CnlPackage.CNL_RULE__AST_ROOT, null, msgs);
				return basicSetAstRoot((Expression)otherEnd, msgs);
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
			case CnlPackage.CNL_RULE__AST_ROOT:
				return basicSetAstRoot(null, msgs);
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
			case CnlPackage.CNL_RULE__AST_ROOT:
				return getAstRoot();
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
			case CnlPackage.CNL_RULE__AST_ROOT:
				setAstRoot((Expression)newValue);
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
			case CnlPackage.CNL_RULE__AST_ROOT:
				setAstRoot((Expression)null);
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
			case CnlPackage.CNL_RULE__AST_ROOT:
				return astRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //CNLRuleImpl
