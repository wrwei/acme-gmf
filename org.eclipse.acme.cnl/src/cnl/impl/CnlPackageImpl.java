/**
 */
package cnl.impl;

import cnl.AfterDateExpression;
import cnl.AndExpression;
import cnl.ArithmeticExpression;
import cnl.ArithmeticOperations;
import cnl.BaseExpression;
import cnl.BeforeDateExpression;
import cnl.BooleanValue;
import cnl.CNLRule;
import cnl.CnlFactory;
import cnl.CnlPackage;
import cnl.ComparisonExpression;
import cnl.ConstrainedNaturalLanguageRules;
import cnl.DateExpression;
import cnl.DateValue;
import cnl.DecimalValue;
import cnl.EOLExpressionRule;
import cnl.ElementScope;
import cnl.EmptyValue;
import cnl.EnumTypeExpression;
import cnl.EnumValue;
import cnl.Enumerations;
import cnl.EqualityExpression;
import cnl.ExistanceValue;
import cnl.Expression;
import cnl.Feature;
import cnl.FeatureValue;
import cnl.GPLRule;
import cnl.GTEExpression;
import cnl.GreaterThanExpression;
import cnl.IfandonlyifExpression;
import cnl.ImpliesExpression;
import cnl.IntegerValue;
import cnl.LTEExpression;
import cnl.LessThanExpression;
import cnl.LogicalExpression;
import cnl.MatchScopedRule;
import cnl.MatchingRule;
import cnl.MetaData;
import cnl.MetaValue;
import cnl.NegatedEqualityExpression;
import cnl.NumericAggregation;
import cnl.NumericAverage;
import cnl.NumericMaximum;
import cnl.NumericMinimum;
import cnl.NumericSummation;
import cnl.OnorafterDateExpression;
import cnl.OnorbeforeDateExpression;
import cnl.OrExpression;
import cnl.PrimitiveTypeExpression;
import cnl.PrimitiveTypes;
import cnl.Rule;
import cnl.ScopedRules;
import cnl.StringValue;
import cnl.Type;
import cnl.TypeExpression;
import cnl.Types;
import cnl.UniquenessCheck;
import cnl.ValidationRules;
import cnl.ValueContainment;
import cnl.XorExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CnlPackageImpl extends EPackageImpl implements CnlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainedNaturalLanguageRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopedRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchScopedRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cnlRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gplRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolExpressionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatedEqualityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gteExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lteExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliesExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifandonlyifExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beforeDateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterDateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onorbeforeDateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onorafterDateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericSummationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericAverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericMaximumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericMinimumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniquenessCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existanceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cnl.CnlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CnlPackageImpl() {
		super(eNS_URI, CnlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CnlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CnlPackage init() {
		if (isInited) return (CnlPackage)EPackage.Registry.INSTANCE.getEPackage(CnlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCnlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CnlPackageImpl theCnlPackage = registeredCnlPackage instanceof CnlPackageImpl ? (CnlPackageImpl)registeredCnlPackage : new CnlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCnlPackage.createPackageContents();

		// Initialize created meta-data
		theCnlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCnlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CnlPackage.eNS_URI, theCnlPackage);
		return theCnlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstrainedNaturalLanguageRules() {
		return constrainedNaturalLanguageRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstrainedNaturalLanguageRules_Rules() {
		return (EReference)constrainedNaturalLanguageRulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstrainedNaturalLanguageRules_Metadata() {
		return (EReference)constrainedNaturalLanguageRulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationRules() {
		return validationRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScopedRules() {
		return scopedRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScopedRules_Scope() {
		return (EReference)scopedRulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScopedRules_Rules() {
		return (EReference)scopedRulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatchScopedRule() {
		return matchScopedRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatchScopedRule_Matches() {
		return (EReference)matchScopedRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatchScopedRule_Rule() {
		return (EReference)matchScopedRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatchingRule() {
		return matchingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatchingRule_VariableName() {
		return (EAttribute)matchingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatchingRule_Scope() {
		return (EReference)matchingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementScope() {
		return elementScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementScope_Type() {
		return (EReference)elementScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_IsActive() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_ScopedBy() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Message() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCNLRule() {
		return cnlRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCNLRule_AstRoot() {
		return (EReference)cnlRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGPLRule() {
		return gplRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGPLRule_Code() {
		return (EAttribute)gplRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEOLExpressionRule() {
		return eolExpressionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEOLExpressionRule_Info() {
		return (EAttribute)eolExpressionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Rule() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparisonExpression() {
		return comparisonExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparisonExpression_Lhs() {
		return (EReference)comparisonExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparisonExpression_Rhs() {
		return (EReference)comparisonExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEqualityExpression() {
		return equalityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegatedEqualityExpression() {
		return negatedEqualityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGreaterThanExpression() {
		return greaterThanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLessThanExpression() {
		return lessThanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGTEExpression() {
		return gteExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTEExpression() {
		return lteExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArithmeticExpression() {
		return arithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArithmeticExpression_Lhs() {
		return (EReference)arithmeticExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArithmeticExpression_Rhs() {
		return (EReference)arithmeticExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArithmeticExpression_Type() {
		return (EAttribute)arithmeticExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalExpression() {
		return logicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalExpression_Lhs() {
		return (EReference)logicalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalExpression_Rhs() {
		return (EReference)logicalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImpliesExpression() {
		return impliesExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrExpression() {
		return orExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXorExpression() {
		return xorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndExpression() {
		return andExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfandonlyifExpression() {
		return ifandonlyifExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseExpression() {
		return baseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateExpression() {
		return dateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDateExpression_Lhs() {
		return (EReference)dateExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDateExpression_Rhs() {
		return (EReference)dateExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeforeDateExpression() {
		return beforeDateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAfterDateExpression() {
		return afterDateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOnorbeforeDateExpression() {
		return onorbeforeDateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOnorafterDateExpression() {
		return onorafterDateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureValue() {
		return featureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureValue_Feature() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureValue_Scope() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureValue_VariableName() {
		return (EAttribute)featureValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeExpression() {
		return typeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeExpression_Feature() {
		return (EReference)typeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeExpression() {
		return primitiveTypeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveTypeExpression_Type() {
		return (EAttribute)primitiveTypeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumTypeExpression() {
		return enumTypeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumTypeExpression_Type() {
		return (EReference)enumTypeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericAggregation() {
		return numericAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumericAggregation_Feature() {
		return (EReference)numericAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericSummation() {
		return numericSummationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericAverage() {
		return numericAverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericMaximum() {
		return numericMaximumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericMinimum() {
		return numericMinimumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueContainment() {
		return valueContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueContainment_Feature() {
		return (EReference)valueContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueContainment_Collection() {
		return (EReference)valueContainmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniquenessCheck() {
		return uniquenessCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniquenessCheck_Features() {
		return (EReference)uniquenessCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumValue_Enumeration() {
		return (EReference)enumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumValue_Value() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerValue_Value() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimalValue() {
		return decimalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalValue_Value() {
		return (EAttribute)decimalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateValue() {
		return dateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateValue_Value() {
		return (EAttribute)dateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmptyValue() {
		return emptyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistanceValue() {
		return existanceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaData() {
		return metaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetaData_LegalValues() {
		return (EReference)metaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaValue() {
		return metaValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaValue_Name() {
		return (EAttribute)metaValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerations() {
		return enumerationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypes() {
		return typesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Features() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArithmeticOperations() {
		return arithmeticOperationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrimitiveTypes() {
		return primitiveTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CnlFactory getCnlFactory() {
		return (CnlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		constrainedNaturalLanguageRulesEClass = createEClass(CONSTRAINED_NATURAL_LANGUAGE_RULES);
		createEReference(constrainedNaturalLanguageRulesEClass, CONSTRAINED_NATURAL_LANGUAGE_RULES__RULES);
		createEReference(constrainedNaturalLanguageRulesEClass, CONSTRAINED_NATURAL_LANGUAGE_RULES__METADATA);

		validationRulesEClass = createEClass(VALIDATION_RULES);

		scopedRulesEClass = createEClass(SCOPED_RULES);
		createEReference(scopedRulesEClass, SCOPED_RULES__SCOPE);
		createEReference(scopedRulesEClass, SCOPED_RULES__RULES);

		matchScopedRuleEClass = createEClass(MATCH_SCOPED_RULE);
		createEReference(matchScopedRuleEClass, MATCH_SCOPED_RULE__MATCHES);
		createEReference(matchScopedRuleEClass, MATCH_SCOPED_RULE__RULE);

		matchingRuleEClass = createEClass(MATCHING_RULE);
		createEAttribute(matchingRuleEClass, MATCHING_RULE__VARIABLE_NAME);
		createEReference(matchingRuleEClass, MATCHING_RULE__SCOPE);

		elementScopeEClass = createEClass(ELEMENT_SCOPE);
		createEReference(elementScopeEClass, ELEMENT_SCOPE__TYPE);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEAttribute(ruleEClass, RULE__IS_ACTIVE);
		createEReference(ruleEClass, RULE__SCOPED_BY);
		createEAttribute(ruleEClass, RULE__MESSAGE);

		cnlRuleEClass = createEClass(CNL_RULE);
		createEReference(cnlRuleEClass, CNL_RULE__AST_ROOT);

		gplRuleEClass = createEClass(GPL_RULE);
		createEAttribute(gplRuleEClass, GPL_RULE__CODE);

		eolExpressionRuleEClass = createEClass(EOL_EXPRESSION_RULE);
		createEAttribute(eolExpressionRuleEClass, EOL_EXPRESSION_RULE__INFO);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__RULE);

		comparisonExpressionEClass = createEClass(COMPARISON_EXPRESSION);
		createEReference(comparisonExpressionEClass, COMPARISON_EXPRESSION__LHS);
		createEReference(comparisonExpressionEClass, COMPARISON_EXPRESSION__RHS);

		equalityExpressionEClass = createEClass(EQUALITY_EXPRESSION);

		negatedEqualityExpressionEClass = createEClass(NEGATED_EQUALITY_EXPRESSION);

		greaterThanExpressionEClass = createEClass(GREATER_THAN_EXPRESSION);

		lessThanExpressionEClass = createEClass(LESS_THAN_EXPRESSION);

		gteExpressionEClass = createEClass(GTE_EXPRESSION);

		lteExpressionEClass = createEClass(LTE_EXPRESSION);

		arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);
		createEReference(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__LHS);
		createEReference(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__RHS);
		createEAttribute(arithmeticExpressionEClass, ARITHMETIC_EXPRESSION__TYPE);

		logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);
		createEReference(logicalExpressionEClass, LOGICAL_EXPRESSION__LHS);
		createEReference(logicalExpressionEClass, LOGICAL_EXPRESSION__RHS);

		impliesExpressionEClass = createEClass(IMPLIES_EXPRESSION);

		orExpressionEClass = createEClass(OR_EXPRESSION);

		xorExpressionEClass = createEClass(XOR_EXPRESSION);

		andExpressionEClass = createEClass(AND_EXPRESSION);

		ifandonlyifExpressionEClass = createEClass(IFANDONLYIF_EXPRESSION);

		baseExpressionEClass = createEClass(BASE_EXPRESSION);

		dateExpressionEClass = createEClass(DATE_EXPRESSION);
		createEReference(dateExpressionEClass, DATE_EXPRESSION__LHS);
		createEReference(dateExpressionEClass, DATE_EXPRESSION__RHS);

		beforeDateExpressionEClass = createEClass(BEFORE_DATE_EXPRESSION);

		afterDateExpressionEClass = createEClass(AFTER_DATE_EXPRESSION);

		onorbeforeDateExpressionEClass = createEClass(ONORBEFORE_DATE_EXPRESSION);

		onorafterDateExpressionEClass = createEClass(ONORAFTER_DATE_EXPRESSION);

		featureValueEClass = createEClass(FEATURE_VALUE);
		createEReference(featureValueEClass, FEATURE_VALUE__FEATURE);
		createEReference(featureValueEClass, FEATURE_VALUE__SCOPE);
		createEAttribute(featureValueEClass, FEATURE_VALUE__VARIABLE_NAME);

		typeExpressionEClass = createEClass(TYPE_EXPRESSION);
		createEReference(typeExpressionEClass, TYPE_EXPRESSION__FEATURE);

		primitiveTypeExpressionEClass = createEClass(PRIMITIVE_TYPE_EXPRESSION);
		createEAttribute(primitiveTypeExpressionEClass, PRIMITIVE_TYPE_EXPRESSION__TYPE);

		enumTypeExpressionEClass = createEClass(ENUM_TYPE_EXPRESSION);
		createEReference(enumTypeExpressionEClass, ENUM_TYPE_EXPRESSION__TYPE);

		numericAggregationEClass = createEClass(NUMERIC_AGGREGATION);
		createEReference(numericAggregationEClass, NUMERIC_AGGREGATION__FEATURE);

		numericSummationEClass = createEClass(NUMERIC_SUMMATION);

		numericAverageEClass = createEClass(NUMERIC_AVERAGE);

		numericMaximumEClass = createEClass(NUMERIC_MAXIMUM);

		numericMinimumEClass = createEClass(NUMERIC_MINIMUM);

		valueContainmentEClass = createEClass(VALUE_CONTAINMENT);
		createEReference(valueContainmentEClass, VALUE_CONTAINMENT__FEATURE);
		createEReference(valueContainmentEClass, VALUE_CONTAINMENT__COLLECTION);

		uniquenessCheckEClass = createEClass(UNIQUENESS_CHECK);
		createEReference(uniquenessCheckEClass, UNIQUENESS_CHECK__FEATURES);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		enumValueEClass = createEClass(ENUM_VALUE);
		createEReference(enumValueEClass, ENUM_VALUE__ENUMERATION);
		createEAttribute(enumValueEClass, ENUM_VALUE__VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		decimalValueEClass = createEClass(DECIMAL_VALUE);
		createEAttribute(decimalValueEClass, DECIMAL_VALUE__VALUE);

		dateValueEClass = createEClass(DATE_VALUE);
		createEAttribute(dateValueEClass, DATE_VALUE__VALUE);

		emptyValueEClass = createEClass(EMPTY_VALUE);

		existanceValueEClass = createEClass(EXISTANCE_VALUE);

		metaDataEClass = createEClass(META_DATA);
		createEReference(metaDataEClass, META_DATA__LEGAL_VALUES);

		metaValueEClass = createEClass(META_VALUE);
		createEAttribute(metaValueEClass, META_VALUE__NAME);

		enumerationsEClass = createEClass(ENUMERATIONS);

		typesEClass = createEClass(TYPES);

		enumEClass = createEClass(ENUM);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__FEATURES);

		featureEClass = createEClass(FEATURE);

		// Create enums
		arithmeticOperationsEEnum = createEEnum(ARITHMETIC_OPERATIONS);
		primitiveTypesEEnum = createEEnum(PRIMITIVE_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scopedRulesEClass.getESuperTypes().add(this.getValidationRules());
		matchScopedRuleEClass.getESuperTypes().add(this.getValidationRules());
		matchingRuleEClass.getESuperTypes().add(this.getCNLRule());
		cnlRuleEClass.getESuperTypes().add(this.getRule());
		gplRuleEClass.getESuperTypes().add(this.getRule());
		eolExpressionRuleEClass.getESuperTypes().add(this.getGPLRule());
		comparisonExpressionEClass.getESuperTypes().add(this.getExpression());
		equalityExpressionEClass.getESuperTypes().add(this.getComparisonExpression());
		negatedEqualityExpressionEClass.getESuperTypes().add(this.getComparisonExpression());
		greaterThanExpressionEClass.getESuperTypes().add(this.getComparisonExpression());
		lessThanExpressionEClass.getESuperTypes().add(this.getComparisonExpression());
		gteExpressionEClass.getESuperTypes().add(this.getComparisonExpression());
		lteExpressionEClass.getESuperTypes().add(this.getComparisonExpression());
		arithmeticExpressionEClass.getESuperTypes().add(this.getExpression());
		logicalExpressionEClass.getESuperTypes().add(this.getExpression());
		impliesExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
		orExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
		xorExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
		andExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
		ifandonlyifExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
		baseExpressionEClass.getESuperTypes().add(this.getExpression());
		dateExpressionEClass.getESuperTypes().add(this.getExpression());
		beforeDateExpressionEClass.getESuperTypes().add(this.getDateExpression());
		afterDateExpressionEClass.getESuperTypes().add(this.getDateExpression());
		onorbeforeDateExpressionEClass.getESuperTypes().add(this.getDateExpression());
		onorafterDateExpressionEClass.getESuperTypes().add(this.getDateExpression());
		featureValueEClass.getESuperTypes().add(this.getBaseExpression());
		typeExpressionEClass.getESuperTypes().add(this.getBaseExpression());
		primitiveTypeExpressionEClass.getESuperTypes().add(this.getTypeExpression());
		enumTypeExpressionEClass.getESuperTypes().add(this.getTypeExpression());
		numericAggregationEClass.getESuperTypes().add(this.getBaseExpression());
		numericSummationEClass.getESuperTypes().add(this.getNumericAggregation());
		numericAverageEClass.getESuperTypes().add(this.getNumericAggregation());
		numericMaximumEClass.getESuperTypes().add(this.getNumericAggregation());
		numericMinimumEClass.getESuperTypes().add(this.getNumericAggregation());
		valueContainmentEClass.getESuperTypes().add(this.getBaseExpression());
		uniquenessCheckEClass.getESuperTypes().add(this.getBaseExpression());
		stringValueEClass.getESuperTypes().add(this.getBaseExpression());
		enumValueEClass.getESuperTypes().add(this.getBaseExpression());
		booleanValueEClass.getESuperTypes().add(this.getBaseExpression());
		integerValueEClass.getESuperTypes().add(this.getBaseExpression());
		decimalValueEClass.getESuperTypes().add(this.getBaseExpression());
		dateValueEClass.getESuperTypes().add(this.getBaseExpression());
		emptyValueEClass.getESuperTypes().add(this.getBaseExpression());
		existanceValueEClass.getESuperTypes().add(this.getBaseExpression());
		metaValueEClass.getESuperTypes().add(this.getBaseExpression());
		enumerationsEClass.getESuperTypes().add(this.getMetaData());
		typesEClass.getESuperTypes().add(this.getMetaData());
		enumEClass.getESuperTypes().add(this.getMetaValue());
		typeEClass.getESuperTypes().add(this.getMetaValue());
		featureEClass.getESuperTypes().add(this.getMetaValue());

		// Initialize classes and features; add operations and parameters
		initEClass(constrainedNaturalLanguageRulesEClass, ConstrainedNaturalLanguageRules.class, "ConstrainedNaturalLanguageRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstrainedNaturalLanguageRules_Rules(), this.getValidationRules(), null, "rules", null, 0, -1, ConstrainedNaturalLanguageRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstrainedNaturalLanguageRules_Metadata(), this.getMetaData(), null, "metadata", null, 0, -1, ConstrainedNaturalLanguageRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationRulesEClass, ValidationRules.class, "ValidationRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scopedRulesEClass, ScopedRules.class, "ScopedRules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopedRules_Scope(), this.getElementScope(), null, "scope", null, 1, 1, ScopedRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScopedRules_Rules(), this.getRule(), this.getRule_ScopedBy(), "rules", null, 0, -1, ScopedRules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchScopedRuleEClass, MatchScopedRule.class, "MatchScopedRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchScopedRule_Matches(), this.getMatchingRule(), null, "matches", null, 0, -1, MatchScopedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchScopedRule_Rule(), this.getRule(), null, "rule", null, 0, 1, MatchScopedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchingRuleEClass, MatchingRule.class, "MatchingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchingRule_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, MatchingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchingRule_Scope(), this.getElementScope(), null, "scope", null, 1, 1, MatchingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementScopeEClass, ElementScope.class, "ElementScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementScope_Type(), this.getType(), null, "type", null, 1, 1, ElementScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_IsActive(), ecorePackage.getEBoolean(), "isActive", "true", 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_ScopedBy(), this.getScopedRules(), this.getScopedRules_Rules(), "scopedBy", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Message(), ecorePackage.getEString(), "message", "", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cnlRuleEClass, CNLRule.class, "CNLRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCNLRule_AstRoot(), this.getExpression(), this.getExpression_Rule(), "astRoot", null, 1, 1, CNLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gplRuleEClass, GPLRule.class, "GPLRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPLRule_Code(), ecorePackage.getEString(), "code", null, 1, 1, GPLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolExpressionRuleEClass, EOLExpressionRule.class, "EOLExpressionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEOLExpressionRule_Info(), ecorePackage.getEString(), "info", null, 0, 1, EOLExpressionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Rule(), this.getCNLRule(), this.getCNLRule_AstRoot(), "rule", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonExpressionEClass, ComparisonExpression.class, "ComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparisonExpression_Lhs(), this.getExpression(), null, "lhs", null, 1, 1, ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonExpression_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalityExpressionEClass, EqualityExpression.class, "EqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negatedEqualityExpressionEClass, NegatedEqualityExpression.class, "NegatedEqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanExpressionEClass, GreaterThanExpression.class, "GreaterThanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanExpressionEClass, LessThanExpression.class, "LessThanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gteExpressionEClass, GTEExpression.class, "GTEExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lteExpressionEClass, LTEExpression.class, "LTEExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmeticExpressionEClass, ArithmeticExpression.class, "ArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmeticExpression_Lhs(), this.getExpression(), null, "lhs", null, 1, 1, ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticExpression_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArithmeticExpression_Type(), this.getArithmeticOperations(), "type", null, 1, 1, ArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalExpressionEClass, LogicalExpression.class, "LogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalExpression_Lhs(), this.getExpression(), null, "lhs", null, 1, 1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalExpression_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impliesExpressionEClass, ImpliesExpression.class, "ImpliesExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorExpressionEClass, XorExpression.class, "XorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifandonlyifExpressionEClass, IfandonlyifExpression.class, "IfandonlyifExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseExpressionEClass, BaseExpression.class, "BaseExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateExpressionEClass, DateExpression.class, "DateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDateExpression_Lhs(), this.getBaseExpression(), null, "lhs", null, 1, 1, DateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDateExpression_Rhs(), this.getBaseExpression(), null, "rhs", null, 1, 1, DateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beforeDateExpressionEClass, BeforeDateExpression.class, "BeforeDateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(afterDateExpressionEClass, AfterDateExpression.class, "AfterDateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onorbeforeDateExpressionEClass, OnorbeforeDateExpression.class, "OnorbeforeDateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onorafterDateExpressionEClass, OnorafterDateExpression.class, "OnorafterDateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureValueEClass, FeatureValue.class, "FeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValue_Feature(), this.getFeature(), null, "feature", null, 1, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValue_Scope(), this.getElementScope(), null, "scope", null, 0, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureValue_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeExpressionEClass, TypeExpression.class, "TypeExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeExpression_Feature(), this.getFeatureValue(), null, "feature", null, 1, 1, TypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeExpressionEClass, PrimitiveTypeExpression.class, "PrimitiveTypeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveTypeExpression_Type(), this.getPrimitiveTypes(), "type", null, 1, 1, PrimitiveTypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumTypeExpressionEClass, EnumTypeExpression.class, "EnumTypeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumTypeExpression_Type(), this.getEnum(), null, "type", null, 1, 1, EnumTypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericAggregationEClass, NumericAggregation.class, "NumericAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericAggregation_Feature(), this.getFeatureValue(), null, "feature", null, 1, 1, NumericAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericSummationEClass, NumericSummation.class, "NumericSummation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericAverageEClass, NumericAverage.class, "NumericAverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericMaximumEClass, NumericMaximum.class, "NumericMaximum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericMinimumEClass, NumericMinimum.class, "NumericMinimum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueContainmentEClass, ValueContainment.class, "ValueContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueContainment_Feature(), this.getFeatureValue(), null, "feature", null, 1, 1, ValueContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueContainment_Collection(), this.getBaseExpression(), null, "collection", null, 1, -1, ValueContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniquenessCheckEClass, UniquenessCheck.class, "UniquenessCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniquenessCheck_Features(), this.getFeatureValue(), null, "features", null, 1, -1, UniquenessCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumValue_Enumeration(), this.getEnum(), null, "enumeration", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalValueEClass, DecimalValue.class, "DecimalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalValue_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DecimalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateValueEClass, DateValue.class, "DateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateValue_Value(), ecorePackage.getEDate(), "value", null, 1, 1, DateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyValueEClass, EmptyValue.class, "EmptyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(existanceValueEClass, ExistanceValue.class, "ExistanceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaDataEClass, MetaData.class, "MetaData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaData_LegalValues(), this.getMetaValue(), null, "legalValues", null, 0, -1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaValueEClass, MetaValue.class, "MetaValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaValue_Name(), ecorePackage.getEString(), "name", null, 1, 1, MetaValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationsEClass, Enumerations.class, "Enumerations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typesEClass, Types.class, "Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumEClass, cnl.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Features(), this.getFeature(), null, "features", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(arithmeticOperationsEEnum, ArithmeticOperations.class, "ArithmeticOperations");
		addEEnumLiteral(arithmeticOperationsEEnum, ArithmeticOperations.PLUS);
		addEEnumLiteral(arithmeticOperationsEEnum, ArithmeticOperations.MINUS);
		addEEnumLiteral(arithmeticOperationsEEnum, ArithmeticOperations.TIMES);
		addEEnumLiteral(arithmeticOperationsEEnum, ArithmeticOperations.DIV);

		initEEnum(primitiveTypesEEnum, PrimitiveTypes.class, "PrimitiveTypes");
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.STRING);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.BOOLEAN);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.INTEGER);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.DECIMAL);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.DATE);

		// Create resource
		createResource(eNS_URI);
	}

} //CnlPackageImpl
