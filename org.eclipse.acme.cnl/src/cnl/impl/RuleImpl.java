/**
 */
package cnl.impl;

import cnl.CnlPackage;
import cnl.Rule;
import cnl.ScopedRules;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cnl.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link cnl.impl.RuleImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link cnl.impl.RuleImpl#getScopedBy <em>Scoped By</em>}</li>
 *   <li>{@link cnl.impl.RuleImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
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
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CnlPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CnlPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CnlPackage.RULE__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopedRules getScopedBy() {
		if (eContainerFeatureID() != CnlPackage.RULE__SCOPED_BY) return null;
		return (ScopedRules)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopedBy(ScopedRules newScopedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScopedBy, CnlPackage.RULE__SCOPED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopedBy(ScopedRules newScopedBy) {
		if (newScopedBy != eInternalContainer() || (eContainerFeatureID() != CnlPackage.RULE__SCOPED_BY && newScopedBy != null)) {
			if (EcoreUtil.isAncestor(this, newScopedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScopedBy != null)
				msgs = ((InternalEObject)newScopedBy).eInverseAdd(this, CnlPackage.SCOPED_RULES__RULES, ScopedRules.class, msgs);
			msgs = basicSetScopedBy(newScopedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CnlPackage.RULE__SCOPED_BY, newScopedBy, newScopedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CnlPackage.RULE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CnlPackage.RULE__SCOPED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScopedBy((ScopedRules)otherEnd, msgs);
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
			case CnlPackage.RULE__SCOPED_BY:
				return basicSetScopedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CnlPackage.RULE__SCOPED_BY:
				return eInternalContainer().eInverseRemove(this, CnlPackage.SCOPED_RULES__RULES, ScopedRules.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CnlPackage.RULE__NAME:
				return getName();
			case CnlPackage.RULE__IS_ACTIVE:
				return isIsActive();
			case CnlPackage.RULE__SCOPED_BY:
				return getScopedBy();
			case CnlPackage.RULE__MESSAGE:
				return getMessage();
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
			case CnlPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case CnlPackage.RULE__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case CnlPackage.RULE__SCOPED_BY:
				setScopedBy((ScopedRules)newValue);
				return;
			case CnlPackage.RULE__MESSAGE:
				setMessage((String)newValue);
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
			case CnlPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CnlPackage.RULE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case CnlPackage.RULE__SCOPED_BY:
				setScopedBy((ScopedRules)null);
				return;
			case CnlPackage.RULE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case CnlPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CnlPackage.RULE__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case CnlPackage.RULE__SCOPED_BY:
				return getScopedBy() != null;
			case CnlPackage.RULE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
