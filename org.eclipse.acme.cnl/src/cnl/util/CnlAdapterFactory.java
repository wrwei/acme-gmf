/**
 */
package cnl.util;

import cnl.AfterDateExpression;
import cnl.AndExpression;
import cnl.ArithmeticExpression;
import cnl.BaseExpression;
import cnl.BeforeDateExpression;
import cnl.BooleanValue;
import cnl.CNLRule;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cnl.CnlPackage
 * @generated
 */
public class CnlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CnlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CnlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CnlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CnlSwitch<Adapter> modelSwitch =
		new CnlSwitch<Adapter>() {
			@Override
			public Adapter caseConstrainedNaturalLanguageRules(ConstrainedNaturalLanguageRules object) {
				return createConstrainedNaturalLanguageRulesAdapter();
			}
			@Override
			public Adapter caseValidationRules(ValidationRules object) {
				return createValidationRulesAdapter();
			}
			@Override
			public Adapter caseScopedRules(ScopedRules object) {
				return createScopedRulesAdapter();
			}
			@Override
			public Adapter caseMatchScopedRule(MatchScopedRule object) {
				return createMatchScopedRuleAdapter();
			}
			@Override
			public Adapter caseMatchingRule(MatchingRule object) {
				return createMatchingRuleAdapter();
			}
			@Override
			public Adapter caseElementScope(ElementScope object) {
				return createElementScopeAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseCNLRule(CNLRule object) {
				return createCNLRuleAdapter();
			}
			@Override
			public Adapter caseGPLRule(GPLRule object) {
				return createGPLRuleAdapter();
			}
			@Override
			public Adapter caseEOLExpressionRule(EOLExpressionRule object) {
				return createEOLExpressionRuleAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseComparisonExpression(ComparisonExpression object) {
				return createComparisonExpressionAdapter();
			}
			@Override
			public Adapter caseEqualityExpression(EqualityExpression object) {
				return createEqualityExpressionAdapter();
			}
			@Override
			public Adapter caseNegatedEqualityExpression(NegatedEqualityExpression object) {
				return createNegatedEqualityExpressionAdapter();
			}
			@Override
			public Adapter caseGreaterThanExpression(GreaterThanExpression object) {
				return createGreaterThanExpressionAdapter();
			}
			@Override
			public Adapter caseLessThanExpression(LessThanExpression object) {
				return createLessThanExpressionAdapter();
			}
			@Override
			public Adapter caseGTEExpression(GTEExpression object) {
				return createGTEExpressionAdapter();
			}
			@Override
			public Adapter caseLTEExpression(LTEExpression object) {
				return createLTEExpressionAdapter();
			}
			@Override
			public Adapter caseArithmeticExpression(ArithmeticExpression object) {
				return createArithmeticExpressionAdapter();
			}
			@Override
			public Adapter caseLogicalExpression(LogicalExpression object) {
				return createLogicalExpressionAdapter();
			}
			@Override
			public Adapter caseImpliesExpression(ImpliesExpression object) {
				return createImpliesExpressionAdapter();
			}
			@Override
			public Adapter caseOrExpression(OrExpression object) {
				return createOrExpressionAdapter();
			}
			@Override
			public Adapter caseXorExpression(XorExpression object) {
				return createXorExpressionAdapter();
			}
			@Override
			public Adapter caseAndExpression(AndExpression object) {
				return createAndExpressionAdapter();
			}
			@Override
			public Adapter caseIfandonlyifExpression(IfandonlyifExpression object) {
				return createIfandonlyifExpressionAdapter();
			}
			@Override
			public Adapter caseBaseExpression(BaseExpression object) {
				return createBaseExpressionAdapter();
			}
			@Override
			public Adapter caseDateExpression(DateExpression object) {
				return createDateExpressionAdapter();
			}
			@Override
			public Adapter caseBeforeDateExpression(BeforeDateExpression object) {
				return createBeforeDateExpressionAdapter();
			}
			@Override
			public Adapter caseAfterDateExpression(AfterDateExpression object) {
				return createAfterDateExpressionAdapter();
			}
			@Override
			public Adapter caseOnorbeforeDateExpression(OnorbeforeDateExpression object) {
				return createOnorbeforeDateExpressionAdapter();
			}
			@Override
			public Adapter caseOnorafterDateExpression(OnorafterDateExpression object) {
				return createOnorafterDateExpressionAdapter();
			}
			@Override
			public Adapter caseFeatureValue(FeatureValue object) {
				return createFeatureValueAdapter();
			}
			@Override
			public Adapter caseTypeExpression(TypeExpression object) {
				return createTypeExpressionAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeExpression(PrimitiveTypeExpression object) {
				return createPrimitiveTypeExpressionAdapter();
			}
			@Override
			public Adapter caseEnumTypeExpression(EnumTypeExpression object) {
				return createEnumTypeExpressionAdapter();
			}
			@Override
			public Adapter caseNumericAggregation(NumericAggregation object) {
				return createNumericAggregationAdapter();
			}
			@Override
			public Adapter caseNumericSummation(NumericSummation object) {
				return createNumericSummationAdapter();
			}
			@Override
			public Adapter caseNumericAverage(NumericAverage object) {
				return createNumericAverageAdapter();
			}
			@Override
			public Adapter caseNumericMaximum(NumericMaximum object) {
				return createNumericMaximumAdapter();
			}
			@Override
			public Adapter caseNumericMinimum(NumericMinimum object) {
				return createNumericMinimumAdapter();
			}
			@Override
			public Adapter caseValueContainment(ValueContainment object) {
				return createValueContainmentAdapter();
			}
			@Override
			public Adapter caseUniquenessCheck(UniquenessCheck object) {
				return createUniquenessCheckAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseEnumValue(EnumValue object) {
				return createEnumValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseDecimalValue(DecimalValue object) {
				return createDecimalValueAdapter();
			}
			@Override
			public Adapter caseDateValue(DateValue object) {
				return createDateValueAdapter();
			}
			@Override
			public Adapter caseEmptyValue(EmptyValue object) {
				return createEmptyValueAdapter();
			}
			@Override
			public Adapter caseExistanceValue(ExistanceValue object) {
				return createExistanceValueAdapter();
			}
			@Override
			public Adapter caseMetaData(MetaData object) {
				return createMetaDataAdapter();
			}
			@Override
			public Adapter caseMetaValue(MetaValue object) {
				return createMetaValueAdapter();
			}
			@Override
			public Adapter caseEnumerations(Enumerations object) {
				return createEnumerationsAdapter();
			}
			@Override
			public Adapter caseTypes(Types object) {
				return createTypesAdapter();
			}
			@Override
			public Adapter caseEnum(cnl.Enum object) {
				return createEnumAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cnl.ConstrainedNaturalLanguageRules <em>Constrained Natural Language Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.ConstrainedNaturalLanguageRules
	 * @generated
	 */
	public Adapter createConstrainedNaturalLanguageRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.ValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.ValidationRules
	 * @generated
	 */
	public Adapter createValidationRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.ScopedRules <em>Scoped Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.ScopedRules
	 * @generated
	 */
	public Adapter createScopedRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.MatchScopedRule <em>Match Scoped Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.MatchScopedRule
	 * @generated
	 */
	public Adapter createMatchScopedRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.MatchingRule <em>Matching Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.MatchingRule
	 * @generated
	 */
	public Adapter createMatchingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.ElementScope <em>Element Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.ElementScope
	 * @generated
	 */
	public Adapter createElementScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.CNLRule <em>CNL Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.CNLRule
	 * @generated
	 */
	public Adapter createCNLRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.GPLRule <em>GPL Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.GPLRule
	 * @generated
	 */
	public Adapter createGPLRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.EOLExpressionRule <em>EOL Expression Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.EOLExpressionRule
	 * @generated
	 */
	public Adapter createEOLExpressionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.ComparisonExpression <em>Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.ComparisonExpression
	 * @generated
	 */
	public Adapter createComparisonExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.EqualityExpression
	 * @generated
	 */
	public Adapter createEqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.NegatedEqualityExpression <em>Negated Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.NegatedEqualityExpression
	 * @generated
	 */
	public Adapter createNegatedEqualityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.GreaterThanExpression <em>Greater Than Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.GreaterThanExpression
	 * @generated
	 */
	public Adapter createGreaterThanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.LessThanExpression <em>Less Than Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.LessThanExpression
	 * @generated
	 */
	public Adapter createLessThanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.GTEExpression <em>GTE Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.GTEExpression
	 * @generated
	 */
	public Adapter createGTEExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.LTEExpression <em>LTE Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.LTEExpression
	 * @generated
	 */
	public Adapter createLTEExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.ArithmeticExpression
	 * @generated
	 */
	public Adapter createArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.LogicalExpression
	 * @generated
	 */
	public Adapter createLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.ImpliesExpression <em>Implies Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.ImpliesExpression
	 * @generated
	 */
	public Adapter createImpliesExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.OrExpression
	 * @generated
	 */
	public Adapter createOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.XorExpression <em>Xor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.XorExpression
	 * @generated
	 */
	public Adapter createXorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.IfandonlyifExpression <em>Ifandonlyif Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.IfandonlyifExpression
	 * @generated
	 */
	public Adapter createIfandonlyifExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.BaseExpression <em>Base Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.BaseExpression
	 * @generated
	 */
	public Adapter createBaseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.DateExpression <em>Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.DateExpression
	 * @generated
	 */
	public Adapter createDateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.BeforeDateExpression <em>Before Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.BeforeDateExpression
	 * @generated
	 */
	public Adapter createBeforeDateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.AfterDateExpression <em>After Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.AfterDateExpression
	 * @generated
	 */
	public Adapter createAfterDateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.OnorbeforeDateExpression <em>Onorbefore Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.OnorbeforeDateExpression
	 * @generated
	 */
	public Adapter createOnorbeforeDateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.OnorafterDateExpression <em>Onorafter Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.OnorafterDateExpression
	 * @generated
	 */
	public Adapter createOnorafterDateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.FeatureValue
	 * @generated
	 */
	public Adapter createFeatureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.TypeExpression <em>Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.TypeExpression
	 * @generated
	 */
	public Adapter createTypeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.PrimitiveTypeExpression <em>Primitive Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.PrimitiveTypeExpression
	 * @generated
	 */
	public Adapter createPrimitiveTypeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.EnumTypeExpression <em>Enum Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.EnumTypeExpression
	 * @generated
	 */
	public Adapter createEnumTypeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.NumericAggregation <em>Numeric Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.NumericAggregation
	 * @generated
	 */
	public Adapter createNumericAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.NumericSummation <em>Numeric Summation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.NumericSummation
	 * @generated
	 */
	public Adapter createNumericSummationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.NumericAverage <em>Numeric Average</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.NumericAverage
	 * @generated
	 */
	public Adapter createNumericAverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.NumericMaximum <em>Numeric Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.NumericMaximum
	 * @generated
	 */
	public Adapter createNumericMaximumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.NumericMinimum <em>Numeric Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.NumericMinimum
	 * @generated
	 */
	public Adapter createNumericMinimumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.ValueContainment <em>Value Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.ValueContainment
	 * @generated
	 */
	public Adapter createValueContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.UniquenessCheck <em>Uniqueness Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.UniquenessCheck
	 * @generated
	 */
	public Adapter createUniquenessCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.DecimalValue <em>Decimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.DecimalValue
	 * @generated
	 */
	public Adapter createDecimalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.DateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.DateValue
	 * @generated
	 */
	public Adapter createDateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.EmptyValue <em>Empty Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.EmptyValue
	 * @generated
	 */
	public Adapter createEmptyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.ExistanceValue <em>Existance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.ExistanceValue
	 * @generated
	 */
	public Adapter createExistanceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.MetaData
	 * @generated
	 */
	public Adapter createMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.MetaValue <em>Meta Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.MetaValue
	 * @generated
	 */
	public Adapter createMetaValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.Enumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.Enumerations
	 * @generated
	 */
	public Adapter createEnumerationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.Types
	 * @generated
	 */
	public Adapter createTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cnl.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cnl.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CnlAdapterFactory
