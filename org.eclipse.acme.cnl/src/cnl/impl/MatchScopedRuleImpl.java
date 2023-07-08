/**
 */
package cnl.impl;

import cnl.CnlPackage;
import cnl.MatchScopedRule;
import cnl.MatchingRule;
import cnl.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Scoped Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cnl.impl.MatchScopedRuleImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link cnl.impl.MatchScopedRuleImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchScopedRuleImpl extends ValidationRulesImpl implements MatchScopedRule {
	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchingRule> matches;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchScopedRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CnlPackage.Literals.MATCH_SCOPED_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatchingRule> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentEList<MatchingRule>(MatchingRule.class, this, CnlPackage.MATCH_SCOPED_RULE__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		Rule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CnlPackage.MATCH_SCOPED_RULE__RULE, oldRule, newRule);
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
	public void setRule(Rule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CnlPackage.MATCH_SCOPED_RULE__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CnlPackage.MATCH_SCOPED_RULE__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CnlPackage.MATCH_SCOPED_RULE__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CnlPackage.MATCH_SCOPED_RULE__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case CnlPackage.MATCH_SCOPED_RULE__RULE:
				return basicSetRule(null, msgs);
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
			case CnlPackage.MATCH_SCOPED_RULE__MATCHES:
				return getMatches();
			case CnlPackage.MATCH_SCOPED_RULE__RULE:
				return getRule();
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
			case CnlPackage.MATCH_SCOPED_RULE__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends MatchingRule>)newValue);
				return;
			case CnlPackage.MATCH_SCOPED_RULE__RULE:
				setRule((Rule)newValue);
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
			case CnlPackage.MATCH_SCOPED_RULE__MATCHES:
				getMatches().clear();
				return;
			case CnlPackage.MATCH_SCOPED_RULE__RULE:
				setRule((Rule)null);
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
			case CnlPackage.MATCH_SCOPED_RULE__MATCHES:
				return matches != null && !matches.isEmpty();
			case CnlPackage.MATCH_SCOPED_RULE__RULE:
				return rule != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchScopedRuleImpl
