/**
 */
package cnl.impl;

import cnl.CnlPackage;
import cnl.MetaData;
import cnl.MetaValue;

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
 * An implementation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cnl.impl.MetaDataImpl#getLegalValues <em>Legal Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MetaDataImpl extends EObjectImpl implements MetaData {
	/**
	 * The cached value of the '{@link #getLegalValues() <em>Legal Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaValue> legalValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CnlPackage.Literals.META_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaValue> getLegalValues() {
		if (legalValues == null) {
			legalValues = new EObjectContainmentEList<MetaValue>(MetaValue.class, this, CnlPackage.META_DATA__LEGAL_VALUES);
		}
		return legalValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CnlPackage.META_DATA__LEGAL_VALUES:
				return ((InternalEList<?>)getLegalValues()).basicRemove(otherEnd, msgs);
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
			case CnlPackage.META_DATA__LEGAL_VALUES:
				return getLegalValues();
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
			case CnlPackage.META_DATA__LEGAL_VALUES:
				getLegalValues().clear();
				getLegalValues().addAll((Collection<? extends MetaValue>)newValue);
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
			case CnlPackage.META_DATA__LEGAL_VALUES:
				getLegalValues().clear();
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
			case CnlPackage.META_DATA__LEGAL_VALUES:
				return legalValues != null && !legalValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetaDataImpl
