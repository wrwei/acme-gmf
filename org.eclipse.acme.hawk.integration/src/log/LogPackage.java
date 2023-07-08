/**
 */
package log;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see log.LogFactory
 * @model kind="package"
 * @generated
 */
public interface LogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "log";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.acme.log/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "log_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogPackage eINSTANCE = log.impl.LogPackageImpl.init();

	/**
	 * The meta object id for the '{@link log.impl.LogElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see log.impl.LogElementImpl
	 * @see log.impl.LogPackageImpl#getLogElement()
	 * @generated
	 */
	int LOG_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link log.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see log.impl.LogImpl
	 * @see log.impl.LogPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__NAME = LOG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sublog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__SUBLOG = LOG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = LOG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link log.impl.SubLogImpl <em>Sub Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see log.impl.SubLogImpl
	 * @see log.impl.LogPackageImpl#getSubLog()
	 * @generated
	 */
	int SUB_LOG = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOG__NAME = LOG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOG__CONTENT = LOG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LOG_FEATURE_COUNT = LOG_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link log.LogElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see log.LogElement
	 * @generated
	 */
	EClass getLogElement();

	/**
	 * Returns the meta object for the attribute '{@link log.LogElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see log.LogElement#getName()
	 * @see #getLogElement()
	 * @generated
	 */
	EAttribute getLogElement_Name();

	/**
	 * Returns the meta object for class '{@link log.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see log.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the containment reference list '{@link log.Log#getSublog <em>Sublog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sublog</em>'.
	 * @see log.Log#getSublog()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_Sublog();

	/**
	 * Returns the meta object for class '{@link log.SubLog <em>Sub Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Log</em>'.
	 * @see log.SubLog
	 * @generated
	 */
	EClass getSubLog();

	/**
	 * Returns the meta object for the attribute '{@link log.SubLog#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see log.SubLog#getContent()
	 * @see #getSubLog()
	 * @generated
	 */
	EAttribute getSubLog_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogFactory getLogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link log.impl.LogElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see log.impl.LogElementImpl
		 * @see log.impl.LogPackageImpl#getLogElement()
		 * @generated
		 */
		EClass LOG_ELEMENT = eINSTANCE.getLogElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ELEMENT__NAME = eINSTANCE.getLogElement_Name();

		/**
		 * The meta object literal for the '{@link log.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see log.impl.LogImpl
		 * @see log.impl.LogPackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>Sublog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__SUBLOG = eINSTANCE.getLog_Sublog();

		/**
		 * The meta object literal for the '{@link log.impl.SubLogImpl <em>Sub Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see log.impl.SubLogImpl
		 * @see log.impl.LogPackageImpl#getSubLog()
		 * @generated
		 */
		EClass SUB_LOG = eINSTANCE.getSubLog();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_LOG__CONTENT = eINSTANCE.getSubLog_Content();

	}

} //LogPackage
