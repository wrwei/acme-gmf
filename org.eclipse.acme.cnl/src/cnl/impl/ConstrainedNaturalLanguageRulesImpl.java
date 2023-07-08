/**
 */
package cnl.impl;

import cnl.CnlPackage;
import cnl.ConstrainedNaturalLanguageRules;
import cnl.MetaData;
import cnl.ValidationRules;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constrained Natural Language Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cnl.impl.ConstrainedNaturalLanguageRulesImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link cnl.impl.ConstrainedNaturalLanguageRulesImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstrainedNaturalLanguageRulesImpl extends EObjectImpl implements ConstrainedNaturalLanguageRules {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidationRules> rules;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaData> metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainedNaturalLanguageRulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CnlPackage.Literals.CONSTRAINED_NATURAL_LANGUAGE_RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidationRules> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<ValidationRules>(ValidationRules.class, this, CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaData> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<MetaData>(MetaData.class, this, CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__RULES:
				return getRules();
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__METADATA:
				return getMetadata();
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
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends ValidationRules>)newValue);
				return;
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends MetaData>)newValue);
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
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__RULES:
				getRules().clear();
				return;
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__METADATA:
				getMetadata().clear();
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
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__RULES:
				return rules != null && !rules.isEmpty();
			case CnlPackage.CONSTRAINED_NATURAL_LANGUAGE_RULES__METADATA:
				return metadata != null && !metadata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstrainedNaturalLanguageRulesImpl
