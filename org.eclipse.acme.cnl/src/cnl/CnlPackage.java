/**
 */
package cnl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see cnl.CnlFactory
 * @model kind="package"
 * @generated
 */
public interface CnlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cnl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.acme/cnl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "acmecnl_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CnlPackage eINSTANCE = cnl.impl.CnlPackageImpl.init();

	/**
	 * The meta object id for the '{@link cnl.impl.ConstrainedNaturalLanguageRulesImpl <em>Constrained Natural Language Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ConstrainedNaturalLanguageRulesImpl
	 * @see cnl.impl.CnlPackageImpl#getConstrainedNaturalLanguageRules()
	 * @generated
	 */
	int CONSTRAINED_NATURAL_LANGUAGE_RULES = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_NATURAL_LANGUAGE_RULES__RULES = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_NATURAL_LANGUAGE_RULES__METADATA = 1;

	/**
	 * The number of structural features of the '<em>Constrained Natural Language Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_NATURAL_LANGUAGE_RULES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link cnl.impl.ValidationRulesImpl <em>Validation Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ValidationRulesImpl
	 * @see cnl.impl.CnlPackageImpl#getValidationRules()
	 * @generated
	 */
	int VALIDATION_RULES = 1;

	/**
	 * The number of structural features of the '<em>Validation Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link cnl.impl.ScopedRulesImpl <em>Scoped Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ScopedRulesImpl
	 * @see cnl.impl.CnlPackageImpl#getScopedRules()
	 * @generated
	 */
	int SCOPED_RULES = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_RULES__SCOPE = VALIDATION_RULES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_RULES__RULES = VALIDATION_RULES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scoped Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_RULES_FEATURE_COUNT = VALIDATION_RULES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cnl.impl.MatchScopedRuleImpl <em>Match Scoped Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.MatchScopedRuleImpl
	 * @see cnl.impl.CnlPackageImpl#getMatchScopedRule()
	 * @generated
	 */
	int MATCH_SCOPED_RULE = 3;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_SCOPED_RULE__MATCHES = VALIDATION_RULES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_SCOPED_RULE__RULE = VALIDATION_RULES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Match Scoped Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_SCOPED_RULE_FEATURE_COUNT = VALIDATION_RULES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cnl.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.RuleImpl
	 * @see cnl.impl.CnlPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Scoped By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__SCOPED_BY = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cnl.impl.CNLRuleImpl <em>CNL Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.CNLRuleImpl
	 * @see cnl.impl.CnlPackageImpl#getCNLRule()
	 * @generated
	 */
	int CNL_RULE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNL_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNL_RULE__IS_ACTIVE = RULE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Scoped By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNL_RULE__SCOPED_BY = RULE__SCOPED_BY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNL_RULE__MESSAGE = RULE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Ast Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNL_RULE__AST_ROOT = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CNL Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNL_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.MatchingRuleImpl <em>Matching Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.MatchingRuleImpl
	 * @see cnl.impl.CnlPackageImpl#getMatchingRule()
	 * @generated
	 */
	int MATCHING_RULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE__NAME = CNL_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE__IS_ACTIVE = CNL_RULE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Scoped By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE__SCOPED_BY = CNL_RULE__SCOPED_BY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE__MESSAGE = CNL_RULE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Ast Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE__AST_ROOT = CNL_RULE__AST_ROOT;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE__VARIABLE_NAME = CNL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE__SCOPE = CNL_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matching Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE_FEATURE_COUNT = CNL_RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cnl.impl.ElementScopeImpl <em>Element Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ElementScopeImpl
	 * @see cnl.impl.CnlPackageImpl#getElementScope()
	 * @generated
	 */
	int ELEMENT_SCOPE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SCOPE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Element Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SCOPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cnl.impl.GPLRuleImpl <em>GPL Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.GPLRuleImpl
	 * @see cnl.impl.CnlPackageImpl#getGPLRule()
	 * @generated
	 */
	int GPL_RULE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPL_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPL_RULE__IS_ACTIVE = RULE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Scoped By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPL_RULE__SCOPED_BY = RULE__SCOPED_BY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPL_RULE__MESSAGE = RULE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPL_RULE__CODE = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GPL Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPL_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.EOLExpressionRuleImpl <em>EOL Expression Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.EOLExpressionRuleImpl
	 * @see cnl.impl.CnlPackageImpl#getEOLExpressionRule()
	 * @generated
	 */
	int EOL_EXPRESSION_RULE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_RULE__NAME = GPL_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_RULE__IS_ACTIVE = GPL_RULE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Scoped By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_RULE__SCOPED_BY = GPL_RULE__SCOPED_BY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_RULE__MESSAGE = GPL_RULE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_RULE__CODE = GPL_RULE__CODE;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_RULE__INFO = GPL_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EOL Expression Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_RULE_FEATURE_COUNT = GPL_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RULE = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cnl.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ComparisonExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getComparisonExpression()
	 * @generated
	 */
	int COMPARISON_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__RULE = EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cnl.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.EqualityExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getEqualityExpression()
	 * @generated
	 */
	int EQUALITY_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__RULE = COMPARISON_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__LHS = COMPARISON_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__RHS = COMPARISON_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION_FEATURE_COUNT = COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.NegatedEqualityExpressionImpl <em>Negated Equality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.NegatedEqualityExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getNegatedEqualityExpression()
	 * @generated
	 */
	int NEGATED_EQUALITY_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_EQUALITY_EXPRESSION__RULE = COMPARISON_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_EQUALITY_EXPRESSION__LHS = COMPARISON_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_EQUALITY_EXPRESSION__RHS = COMPARISON_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Negated Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_EQUALITY_EXPRESSION_FEATURE_COUNT = COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.GreaterThanExpressionImpl <em>Greater Than Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.GreaterThanExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getGreaterThanExpression()
	 * @generated
	 */
	int GREATER_THAN_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_EXPRESSION__RULE = COMPARISON_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_EXPRESSION__LHS = COMPARISON_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_EXPRESSION__RHS = COMPARISON_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Greater Than Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_EXPRESSION_FEATURE_COUNT = COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.LessThanExpressionImpl <em>Less Than Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.LessThanExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getLessThanExpression()
	 * @generated
	 */
	int LESS_THAN_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_EXPRESSION__RULE = COMPARISON_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_EXPRESSION__LHS = COMPARISON_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_EXPRESSION__RHS = COMPARISON_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Less Than Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_EXPRESSION_FEATURE_COUNT = COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.GTEExpressionImpl <em>GTE Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.GTEExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getGTEExpression()
	 * @generated
	 */
	int GTE_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_EXPRESSION__RULE = COMPARISON_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_EXPRESSION__LHS = COMPARISON_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_EXPRESSION__RHS = COMPARISON_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>GTE Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_EXPRESSION_FEATURE_COUNT = COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.LTEExpressionImpl <em>LTE Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.LTEExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getLTEExpression()
	 * @generated
	 */
	int LTE_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_EXPRESSION__RULE = COMPARISON_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_EXPRESSION__LHS = COMPARISON_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_EXPRESSION__RHS = COMPARISON_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>LTE Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_EXPRESSION_FEATURE_COUNT = COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ArithmeticExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__RULE = EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cnl.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.LogicalExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__RULE = EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cnl.impl.ImpliesExpressionImpl <em>Implies Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ImpliesExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getImpliesExpression()
	 * @generated
	 */
	int IMPLIES_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__RULE = LOGICAL_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__LHS = LOGICAL_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__RHS = LOGICAL_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Implies Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.OrExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__RULE = LOGICAL_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__LHS = LOGICAL_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__RHS = LOGICAL_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.XorExpressionImpl <em>Xor Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.XorExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getXorExpression()
	 * @generated
	 */
	int XOR_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPRESSION__RULE = LOGICAL_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPRESSION__LHS = LOGICAL_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPRESSION__RHS = LOGICAL_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Xor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.AndExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RULE = LOGICAL_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LHS = LOGICAL_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RHS = LOGICAL_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.IfandonlyifExpressionImpl <em>Ifandonlyif Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.IfandonlyifExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getIfandonlyifExpression()
	 * @generated
	 */
	int IFANDONLYIF_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFANDONLYIF_EXPRESSION__RULE = LOGICAL_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFANDONLYIF_EXPRESSION__LHS = LOGICAL_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFANDONLYIF_EXPRESSION__RHS = LOGICAL_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Ifandonlyif Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFANDONLYIF_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.BaseExpressionImpl <em>Base Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.BaseExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getBaseExpression()
	 * @generated
	 */
	int BASE_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_EXPRESSION__RULE = EXPRESSION__RULE;

	/**
	 * The number of structural features of the '<em>Base Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.DateExpressionImpl <em>Date Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.DateExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getDateExpression()
	 * @generated
	 */
	int DATE_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_EXPRESSION__RULE = EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cnl.impl.BeforeDateExpressionImpl <em>Before Date Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.BeforeDateExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getBeforeDateExpression()
	 * @generated
	 */
	int BEFORE_DATE_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_DATE_EXPRESSION__RULE = DATE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_DATE_EXPRESSION__LHS = DATE_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_DATE_EXPRESSION__RHS = DATE_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Before Date Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_DATE_EXPRESSION_FEATURE_COUNT = DATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.AfterDateExpressionImpl <em>After Date Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.AfterDateExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getAfterDateExpression()
	 * @generated
	 */
	int AFTER_DATE_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_DATE_EXPRESSION__RULE = DATE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_DATE_EXPRESSION__LHS = DATE_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_DATE_EXPRESSION__RHS = DATE_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>After Date Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_DATE_EXPRESSION_FEATURE_COUNT = DATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.OnorbeforeDateExpressionImpl <em>Onorbefore Date Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.OnorbeforeDateExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getOnorbeforeDateExpression()
	 * @generated
	 */
	int ONORBEFORE_DATE_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONORBEFORE_DATE_EXPRESSION__RULE = DATE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONORBEFORE_DATE_EXPRESSION__LHS = DATE_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONORBEFORE_DATE_EXPRESSION__RHS = DATE_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Onorbefore Date Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONORBEFORE_DATE_EXPRESSION_FEATURE_COUNT = DATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.OnorafterDateExpressionImpl <em>Onorafter Date Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.OnorafterDateExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getOnorafterDateExpression()
	 * @generated
	 */
	int ONORAFTER_DATE_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONORAFTER_DATE_EXPRESSION__RULE = DATE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONORAFTER_DATE_EXPRESSION__LHS = DATE_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONORAFTER_DATE_EXPRESSION__RHS = DATE_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Onorafter Date Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONORAFTER_DATE_EXPRESSION_FEATURE_COUNT = DATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.FeatureValueImpl <em>Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.FeatureValueImpl
	 * @see cnl.impl.CnlPackageImpl#getFeatureValue()
	 * @generated
	 */
	int FEATURE_VALUE = 31;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__FEATURE = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__SCOPE = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__VARIABLE_NAME = BASE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cnl.impl.TypeExpressionImpl <em>Type Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.TypeExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getTypeExpression()
	 * @generated
	 */
	int TYPE_EXPRESSION = 32;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXPRESSION__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXPRESSION__FEATURE = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXPRESSION_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.PrimitiveTypeExpressionImpl <em>Primitive Type Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.PrimitiveTypeExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getPrimitiveTypeExpression()
	 * @generated
	 */
	int PRIMITIVE_TYPE_EXPRESSION = 33;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_EXPRESSION__RULE = TYPE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_EXPRESSION__FEATURE = TYPE_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_EXPRESSION__TYPE = TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_EXPRESSION_FEATURE_COUNT = TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.EnumTypeExpressionImpl <em>Enum Type Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.EnumTypeExpressionImpl
	 * @see cnl.impl.CnlPackageImpl#getEnumTypeExpression()
	 * @generated
	 */
	int ENUM_TYPE_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_EXPRESSION__RULE = TYPE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_EXPRESSION__FEATURE = TYPE_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_EXPRESSION__TYPE = TYPE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Type Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_EXPRESSION_FEATURE_COUNT = TYPE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.NumericAggregationImpl <em>Numeric Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.NumericAggregationImpl
	 * @see cnl.impl.CnlPackageImpl#getNumericAggregation()
	 * @generated
	 */
	int NUMERIC_AGGREGATION = 35;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_AGGREGATION__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_AGGREGATION__FEATURE = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_AGGREGATION_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.NumericSummationImpl <em>Numeric Summation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.NumericSummationImpl
	 * @see cnl.impl.CnlPackageImpl#getNumericSummation()
	 * @generated
	 */
	int NUMERIC_SUMMATION = 36;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SUMMATION__RULE = NUMERIC_AGGREGATION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SUMMATION__FEATURE = NUMERIC_AGGREGATION__FEATURE;

	/**
	 * The number of structural features of the '<em>Numeric Summation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SUMMATION_FEATURE_COUNT = NUMERIC_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.NumericAverageImpl <em>Numeric Average</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.NumericAverageImpl
	 * @see cnl.impl.CnlPackageImpl#getNumericAverage()
	 * @generated
	 */
	int NUMERIC_AVERAGE = 37;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_AVERAGE__RULE = NUMERIC_AGGREGATION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_AVERAGE__FEATURE = NUMERIC_AGGREGATION__FEATURE;

	/**
	 * The number of structural features of the '<em>Numeric Average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_AVERAGE_FEATURE_COUNT = NUMERIC_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.NumericMaximumImpl <em>Numeric Maximum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.NumericMaximumImpl
	 * @see cnl.impl.CnlPackageImpl#getNumericMaximum()
	 * @generated
	 */
	int NUMERIC_MAXIMUM = 38;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_MAXIMUM__RULE = NUMERIC_AGGREGATION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_MAXIMUM__FEATURE = NUMERIC_AGGREGATION__FEATURE;

	/**
	 * The number of structural features of the '<em>Numeric Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_MAXIMUM_FEATURE_COUNT = NUMERIC_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.NumericMinimumImpl <em>Numeric Minimum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.NumericMinimumImpl
	 * @see cnl.impl.CnlPackageImpl#getNumericMinimum()
	 * @generated
	 */
	int NUMERIC_MINIMUM = 39;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_MINIMUM__RULE = NUMERIC_AGGREGATION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_MINIMUM__FEATURE = NUMERIC_AGGREGATION__FEATURE;

	/**
	 * The number of structural features of the '<em>Numeric Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_MINIMUM_FEATURE_COUNT = NUMERIC_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.ValueContainmentImpl <em>Value Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ValueContainmentImpl
	 * @see cnl.impl.CnlPackageImpl#getValueContainment()
	 * @generated
	 */
	int VALUE_CONTAINMENT = 40;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONTAINMENT__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONTAINMENT__FEATURE = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONTAINMENT__COLLECTION = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONTAINMENT_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cnl.impl.UniquenessCheckImpl <em>Uniqueness Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.UniquenessCheckImpl
	 * @see cnl.impl.CnlPackageImpl#getUniquenessCheck()
	 * @generated
	 */
	int UNIQUENESS_CHECK = 41;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUENESS_CHECK__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUENESS_CHECK__FEATURES = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uniqueness Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUENESS_CHECK_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.StringValueImpl
	 * @see cnl.impl.CnlPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 42;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.EnumValueImpl
	 * @see cnl.impl.CnlPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 43;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__ENUMERATION = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALUE = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cnl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.BooleanValueImpl
	 * @see cnl.impl.CnlPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 44;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.IntegerValueImpl
	 * @see cnl.impl.CnlPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 45;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.DecimalValueImpl <em>Decimal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.DecimalValueImpl
	 * @see cnl.impl.CnlPackageImpl#getDecimalValue()
	 * @generated
	 */
	int DECIMAL_VALUE = 46;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE__VALUE = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.DateValueImpl <em>Date Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.DateValueImpl
	 * @see cnl.impl.CnlPackageImpl#getDateValue()
	 * @generated
	 */
	int DATE_VALUE = 47;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE__VALUE = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.EmptyValueImpl <em>Empty Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.EmptyValueImpl
	 * @see cnl.impl.CnlPackageImpl#getEmptyValue()
	 * @generated
	 */
	int EMPTY_VALUE = 48;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The number of structural features of the '<em>Empty Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.ExistanceValueImpl <em>Existance Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.ExistanceValueImpl
	 * @see cnl.impl.CnlPackageImpl#getExistanceValue()
	 * @generated
	 */
	int EXISTANCE_VALUE = 49;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANCE_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The number of structural features of the '<em>Existance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTANCE_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.MetaDataImpl
	 * @see cnl.impl.CnlPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 50;

	/**
	 * The feature id for the '<em><b>Legal Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__LEGAL_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cnl.impl.MetaValueImpl <em>Meta Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.MetaValueImpl
	 * @see cnl.impl.CnlPackageImpl#getMetaValue()
	 * @generated
	 */
	int META_VALUE = 51;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_VALUE__RULE = BASE_EXPRESSION__RULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_VALUE__NAME = BASE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_VALUE_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.EnumerationsImpl <em>Enumerations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.EnumerationsImpl
	 * @see cnl.impl.CnlPackageImpl#getEnumerations()
	 * @generated
	 */
	int ENUMERATIONS = 52;

	/**
	 * The feature id for the '<em><b>Legal Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATIONS__LEGAL_VALUES = META_DATA__LEGAL_VALUES;

	/**
	 * The number of structural features of the '<em>Enumerations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATIONS_FEATURE_COUNT = META_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.TypesImpl <em>Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.TypesImpl
	 * @see cnl.impl.CnlPackageImpl#getTypes()
	 * @generated
	 */
	int TYPES = 53;

	/**
	 * The feature id for the '<em><b>Legal Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES__LEGAL_VALUES = META_DATA__LEGAL_VALUES;

	/**
	 * The number of structural features of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_FEATURE_COUNT = META_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.EnumImpl
	 * @see cnl.impl.CnlPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 54;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__RULE = META_VALUE__RULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = META_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = META_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.TypeImpl
	 * @see cnl.impl.CnlPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 55;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__RULE = META_VALUE__RULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = META_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FEATURES = META_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = META_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cnl.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.impl.FeatureImpl
	 * @see cnl.impl.CnlPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 56;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__RULE = META_VALUE__RULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = META_VALUE__NAME;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = META_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cnl.ArithmeticOperations <em>Arithmetic Operations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.ArithmeticOperations
	 * @see cnl.impl.CnlPackageImpl#getArithmeticOperations()
	 * @generated
	 */
	int ARITHMETIC_OPERATIONS = 57;

	/**
	 * The meta object id for the '{@link cnl.PrimitiveTypes <em>Primitive Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cnl.PrimitiveTypes
	 * @see cnl.impl.CnlPackageImpl#getPrimitiveTypes()
	 * @generated
	 */
	int PRIMITIVE_TYPES = 58;


	/**
	 * Returns the meta object for class '{@link cnl.ConstrainedNaturalLanguageRules <em>Constrained Natural Language Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrained Natural Language Rules</em>'.
	 * @see cnl.ConstrainedNaturalLanguageRules
	 * @generated
	 */
	EClass getConstrainedNaturalLanguageRules();

	/**
	 * Returns the meta object for the containment reference list '{@link cnl.ConstrainedNaturalLanguageRules#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see cnl.ConstrainedNaturalLanguageRules#getRules()
	 * @see #getConstrainedNaturalLanguageRules()
	 * @generated
	 */
	EReference getConstrainedNaturalLanguageRules_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link cnl.ConstrainedNaturalLanguageRules#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see cnl.ConstrainedNaturalLanguageRules#getMetadata()
	 * @see #getConstrainedNaturalLanguageRules()
	 * @generated
	 */
	EReference getConstrainedNaturalLanguageRules_Metadata();

	/**
	 * Returns the meta object for class '{@link cnl.ValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rules</em>'.
	 * @see cnl.ValidationRules
	 * @generated
	 */
	EClass getValidationRules();

	/**
	 * Returns the meta object for class '{@link cnl.ScopedRules <em>Scoped Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Rules</em>'.
	 * @see cnl.ScopedRules
	 * @generated
	 */
	EClass getScopedRules();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.ScopedRules#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see cnl.ScopedRules#getScope()
	 * @see #getScopedRules()
	 * @generated
	 */
	EReference getScopedRules_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link cnl.ScopedRules#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see cnl.ScopedRules#getRules()
	 * @see #getScopedRules()
	 * @generated
	 */
	EReference getScopedRules_Rules();

	/**
	 * Returns the meta object for class '{@link cnl.MatchScopedRule <em>Match Scoped Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Scoped Rule</em>'.
	 * @see cnl.MatchScopedRule
	 * @generated
	 */
	EClass getMatchScopedRule();

	/**
	 * Returns the meta object for the containment reference list '{@link cnl.MatchScopedRule#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see cnl.MatchScopedRule#getMatches()
	 * @see #getMatchScopedRule()
	 * @generated
	 */
	EReference getMatchScopedRule_Matches();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.MatchScopedRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see cnl.MatchScopedRule#getRule()
	 * @see #getMatchScopedRule()
	 * @generated
	 */
	EReference getMatchScopedRule_Rule();

	/**
	 * Returns the meta object for class '{@link cnl.MatchingRule <em>Matching Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Rule</em>'.
	 * @see cnl.MatchingRule
	 * @generated
	 */
	EClass getMatchingRule();

	/**
	 * Returns the meta object for the attribute '{@link cnl.MatchingRule#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see cnl.MatchingRule#getVariableName()
	 * @see #getMatchingRule()
	 * @generated
	 */
	EAttribute getMatchingRule_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.MatchingRule#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see cnl.MatchingRule#getScope()
	 * @see #getMatchingRule()
	 * @generated
	 */
	EReference getMatchingRule_Scope();

	/**
	 * Returns the meta object for class '{@link cnl.ElementScope <em>Element Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Scope</em>'.
	 * @see cnl.ElementScope
	 * @generated
	 */
	EClass getElementScope();

	/**
	 * Returns the meta object for the reference '{@link cnl.ElementScope#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see cnl.ElementScope#getType()
	 * @see #getElementScope()
	 * @generated
	 */
	EReference getElementScope_Type();

	/**
	 * Returns the meta object for class '{@link cnl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see cnl.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link cnl.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cnl.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link cnl.Rule#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see cnl.Rule#isIsActive()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_IsActive();

	/**
	 * Returns the meta object for the container reference '{@link cnl.Rule#getScopedBy <em>Scoped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scoped By</em>'.
	 * @see cnl.Rule#getScopedBy()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ScopedBy();

	/**
	 * Returns the meta object for the attribute '{@link cnl.Rule#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see cnl.Rule#getMessage()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Message();

	/**
	 * Returns the meta object for class '{@link cnl.CNLRule <em>CNL Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CNL Rule</em>'.
	 * @see cnl.CNLRule
	 * @generated
	 */
	EClass getCNLRule();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.CNLRule#getAstRoot <em>Ast Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ast Root</em>'.
	 * @see cnl.CNLRule#getAstRoot()
	 * @see #getCNLRule()
	 * @generated
	 */
	EReference getCNLRule_AstRoot();

	/**
	 * Returns the meta object for class '{@link cnl.GPLRule <em>GPL Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPL Rule</em>'.
	 * @see cnl.GPLRule
	 * @generated
	 */
	EClass getGPLRule();

	/**
	 * Returns the meta object for the attribute '{@link cnl.GPLRule#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see cnl.GPLRule#getCode()
	 * @see #getGPLRule()
	 * @generated
	 */
	EAttribute getGPLRule_Code();

	/**
	 * Returns the meta object for class '{@link cnl.EOLExpressionRule <em>EOL Expression Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOL Expression Rule</em>'.
	 * @see cnl.EOLExpressionRule
	 * @generated
	 */
	EClass getEOLExpressionRule();

	/**
	 * Returns the meta object for the attribute '{@link cnl.EOLExpressionRule#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see cnl.EOLExpressionRule#getInfo()
	 * @see #getEOLExpressionRule()
	 * @generated
	 */
	EAttribute getEOLExpressionRule_Info();

	/**
	 * Returns the meta object for class '{@link cnl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see cnl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the container reference '{@link cnl.Expression#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see cnl.Expression#getRule()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Rule();

	/**
	 * Returns the meta object for class '{@link cnl.ComparisonExpression <em>Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Expression</em>'.
	 * @see cnl.ComparisonExpression
	 * @generated
	 */
	EClass getComparisonExpression();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.ComparisonExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see cnl.ComparisonExpression#getLhs()
	 * @see #getComparisonExpression()
	 * @generated
	 */
	EReference getComparisonExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.ComparisonExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see cnl.ComparisonExpression#getRhs()
	 * @see #getComparisonExpression()
	 * @generated
	 */
	EReference getComparisonExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link cnl.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Expression</em>'.
	 * @see cnl.EqualityExpression
	 * @generated
	 */
	EClass getEqualityExpression();

	/**
	 * Returns the meta object for class '{@link cnl.NegatedEqualityExpression <em>Negated Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negated Equality Expression</em>'.
	 * @see cnl.NegatedEqualityExpression
	 * @generated
	 */
	EClass getNegatedEqualityExpression();

	/**
	 * Returns the meta object for class '{@link cnl.GreaterThanExpression <em>Greater Than Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Expression</em>'.
	 * @see cnl.GreaterThanExpression
	 * @generated
	 */
	EClass getGreaterThanExpression();

	/**
	 * Returns the meta object for class '{@link cnl.LessThanExpression <em>Less Than Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Expression</em>'.
	 * @see cnl.LessThanExpression
	 * @generated
	 */
	EClass getLessThanExpression();

	/**
	 * Returns the meta object for class '{@link cnl.GTEExpression <em>GTE Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTE Expression</em>'.
	 * @see cnl.GTEExpression
	 * @generated
	 */
	EClass getGTEExpression();

	/**
	 * Returns the meta object for class '{@link cnl.LTEExpression <em>LTE Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTE Expression</em>'.
	 * @see cnl.LTEExpression
	 * @generated
	 */
	EClass getLTEExpression();

	/**
	 * Returns the meta object for class '{@link cnl.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see cnl.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.ArithmeticExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see cnl.ArithmeticExpression#getLhs()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.ArithmeticExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see cnl.ArithmeticExpression#getRhs()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link cnl.ArithmeticExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cnl.ArithmeticExpression#getType()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Type();

	/**
	 * Returns the meta object for class '{@link cnl.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see cnl.LogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.LogicalExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see cnl.LogicalExpression#getLhs()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.LogicalExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see cnl.LogicalExpression#getRhs()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link cnl.ImpliesExpression <em>Implies Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Expression</em>'.
	 * @see cnl.ImpliesExpression
	 * @generated
	 */
	EClass getImpliesExpression();

	/**
	 * Returns the meta object for class '{@link cnl.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see cnl.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for class '{@link cnl.XorExpression <em>Xor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Expression</em>'.
	 * @see cnl.XorExpression
	 * @generated
	 */
	EClass getXorExpression();

	/**
	 * Returns the meta object for class '{@link cnl.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see cnl.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for class '{@link cnl.IfandonlyifExpression <em>Ifandonlyif Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ifandonlyif Expression</em>'.
	 * @see cnl.IfandonlyifExpression
	 * @generated
	 */
	EClass getIfandonlyifExpression();

	/**
	 * Returns the meta object for class '{@link cnl.BaseExpression <em>Base Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Expression</em>'.
	 * @see cnl.BaseExpression
	 * @generated
	 */
	EClass getBaseExpression();

	/**
	 * Returns the meta object for class '{@link cnl.DateExpression <em>Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Expression</em>'.
	 * @see cnl.DateExpression
	 * @generated
	 */
	EClass getDateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.DateExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see cnl.DateExpression#getLhs()
	 * @see #getDateExpression()
	 * @generated
	 */
	EReference getDateExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.DateExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see cnl.DateExpression#getRhs()
	 * @see #getDateExpression()
	 * @generated
	 */
	EReference getDateExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link cnl.BeforeDateExpression <em>Before Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before Date Expression</em>'.
	 * @see cnl.BeforeDateExpression
	 * @generated
	 */
	EClass getBeforeDateExpression();

	/**
	 * Returns the meta object for class '{@link cnl.AfterDateExpression <em>After Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Date Expression</em>'.
	 * @see cnl.AfterDateExpression
	 * @generated
	 */
	EClass getAfterDateExpression();

	/**
	 * Returns the meta object for class '{@link cnl.OnorbeforeDateExpression <em>Onorbefore Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onorbefore Date Expression</em>'.
	 * @see cnl.OnorbeforeDateExpression
	 * @generated
	 */
	EClass getOnorbeforeDateExpression();

	/**
	 * Returns the meta object for class '{@link cnl.OnorafterDateExpression <em>Onorafter Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onorafter Date Expression</em>'.
	 * @see cnl.OnorafterDateExpression
	 * @generated
	 */
	EClass getOnorafterDateExpression();

	/**
	 * Returns the meta object for class '{@link cnl.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value</em>'.
	 * @see cnl.FeatureValue
	 * @generated
	 */
	EClass getFeatureValue();

	/**
	 * Returns the meta object for the reference '{@link cnl.FeatureValue#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see cnl.FeatureValue#getFeature()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.FeatureValue#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see cnl.FeatureValue#getScope()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Scope();

	/**
	 * Returns the meta object for the attribute '{@link cnl.FeatureValue#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see cnl.FeatureValue#getVariableName()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EAttribute getFeatureValue_VariableName();

	/**
	 * Returns the meta object for class '{@link cnl.TypeExpression <em>Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Expression</em>'.
	 * @see cnl.TypeExpression
	 * @generated
	 */
	EClass getTypeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.TypeExpression#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see cnl.TypeExpression#getFeature()
	 * @see #getTypeExpression()
	 * @generated
	 */
	EReference getTypeExpression_Feature();

	/**
	 * Returns the meta object for class '{@link cnl.PrimitiveTypeExpression <em>Primitive Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Expression</em>'.
	 * @see cnl.PrimitiveTypeExpression
	 * @generated
	 */
	EClass getPrimitiveTypeExpression();

	/**
	 * Returns the meta object for the attribute '{@link cnl.PrimitiveTypeExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cnl.PrimitiveTypeExpression#getType()
	 * @see #getPrimitiveTypeExpression()
	 * @generated
	 */
	EAttribute getPrimitiveTypeExpression_Type();

	/**
	 * Returns the meta object for class '{@link cnl.EnumTypeExpression <em>Enum Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type Expression</em>'.
	 * @see cnl.EnumTypeExpression
	 * @generated
	 */
	EClass getEnumTypeExpression();

	/**
	 * Returns the meta object for the reference '{@link cnl.EnumTypeExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see cnl.EnumTypeExpression#getType()
	 * @see #getEnumTypeExpression()
	 * @generated
	 */
	EReference getEnumTypeExpression_Type();

	/**
	 * Returns the meta object for class '{@link cnl.NumericAggregation <em>Numeric Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Aggregation</em>'.
	 * @see cnl.NumericAggregation
	 * @generated
	 */
	EClass getNumericAggregation();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.NumericAggregation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see cnl.NumericAggregation#getFeature()
	 * @see #getNumericAggregation()
	 * @generated
	 */
	EReference getNumericAggregation_Feature();

	/**
	 * Returns the meta object for class '{@link cnl.NumericSummation <em>Numeric Summation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Summation</em>'.
	 * @see cnl.NumericSummation
	 * @generated
	 */
	EClass getNumericSummation();

	/**
	 * Returns the meta object for class '{@link cnl.NumericAverage <em>Numeric Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Average</em>'.
	 * @see cnl.NumericAverage
	 * @generated
	 */
	EClass getNumericAverage();

	/**
	 * Returns the meta object for class '{@link cnl.NumericMaximum <em>Numeric Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Maximum</em>'.
	 * @see cnl.NumericMaximum
	 * @generated
	 */
	EClass getNumericMaximum();

	/**
	 * Returns the meta object for class '{@link cnl.NumericMinimum <em>Numeric Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Minimum</em>'.
	 * @see cnl.NumericMinimum
	 * @generated
	 */
	EClass getNumericMinimum();

	/**
	 * Returns the meta object for class '{@link cnl.ValueContainment <em>Value Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Containment</em>'.
	 * @see cnl.ValueContainment
	 * @generated
	 */
	EClass getValueContainment();

	/**
	 * Returns the meta object for the containment reference '{@link cnl.ValueContainment#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see cnl.ValueContainment#getFeature()
	 * @see #getValueContainment()
	 * @generated
	 */
	EReference getValueContainment_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link cnl.ValueContainment#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see cnl.ValueContainment#getCollection()
	 * @see #getValueContainment()
	 * @generated
	 */
	EReference getValueContainment_Collection();

	/**
	 * Returns the meta object for class '{@link cnl.UniquenessCheck <em>Uniqueness Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniqueness Check</em>'.
	 * @see cnl.UniquenessCheck
	 * @generated
	 */
	EClass getUniquenessCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link cnl.UniquenessCheck#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see cnl.UniquenessCheck#getFeatures()
	 * @see #getUniquenessCheck()
	 * @generated
	 */
	EReference getUniquenessCheck_Features();

	/**
	 * Returns the meta object for class '{@link cnl.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see cnl.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link cnl.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cnl.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link cnl.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see cnl.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the reference '{@link cnl.EnumValue#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration</em>'.
	 * @see cnl.EnumValue#getEnumeration()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue_Enumeration();

	/**
	 * Returns the meta object for the attribute '{@link cnl.EnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cnl.EnumValue#getValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Value();

	/**
	 * Returns the meta object for class '{@link cnl.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see cnl.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link cnl.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cnl.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link cnl.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see cnl.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link cnl.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cnl.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link cnl.DecimalValue <em>Decimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Value</em>'.
	 * @see cnl.DecimalValue
	 * @generated
	 */
	EClass getDecimalValue();

	/**
	 * Returns the meta object for the attribute '{@link cnl.DecimalValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cnl.DecimalValue#getValue()
	 * @see #getDecimalValue()
	 * @generated
	 */
	EAttribute getDecimalValue_Value();

	/**
	 * Returns the meta object for class '{@link cnl.DateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Value</em>'.
	 * @see cnl.DateValue
	 * @generated
	 */
	EClass getDateValue();

	/**
	 * Returns the meta object for the attribute '{@link cnl.DateValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cnl.DateValue#getValue()
	 * @see #getDateValue()
	 * @generated
	 */
	EAttribute getDateValue_Value();

	/**
	 * Returns the meta object for class '{@link cnl.EmptyValue <em>Empty Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Value</em>'.
	 * @see cnl.EmptyValue
	 * @generated
	 */
	EClass getEmptyValue();

	/**
	 * Returns the meta object for class '{@link cnl.ExistanceValue <em>Existance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existance Value</em>'.
	 * @see cnl.ExistanceValue
	 * @generated
	 */
	EClass getExistanceValue();

	/**
	 * Returns the meta object for class '{@link cnl.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see cnl.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the containment reference list '{@link cnl.MetaData#getLegalValues <em>Legal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legal Values</em>'.
	 * @see cnl.MetaData#getLegalValues()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_LegalValues();

	/**
	 * Returns the meta object for class '{@link cnl.MetaValue <em>Meta Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Value</em>'.
	 * @see cnl.MetaValue
	 * @generated
	 */
	EClass getMetaValue();

	/**
	 * Returns the meta object for the attribute '{@link cnl.MetaValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cnl.MetaValue#getName()
	 * @see #getMetaValue()
	 * @generated
	 */
	EAttribute getMetaValue_Name();

	/**
	 * Returns the meta object for class '{@link cnl.Enumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerations</em>'.
	 * @see cnl.Enumerations
	 * @generated
	 */
	EClass getEnumerations();

	/**
	 * Returns the meta object for class '{@link cnl.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types</em>'.
	 * @see cnl.Types
	 * @generated
	 */
	EClass getTypes();

	/**
	 * Returns the meta object for class '{@link cnl.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see cnl.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for class '{@link cnl.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see cnl.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link cnl.Type#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see cnl.Type#getFeatures()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Features();

	/**
	 * Returns the meta object for class '{@link cnl.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see cnl.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for enum '{@link cnl.ArithmeticOperations <em>Arithmetic Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operations</em>'.
	 * @see cnl.ArithmeticOperations
	 * @generated
	 */
	EEnum getArithmeticOperations();

	/**
	 * Returns the meta object for enum '{@link cnl.PrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Types</em>'.
	 * @see cnl.PrimitiveTypes
	 * @generated
	 */
	EEnum getPrimitiveTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CnlFactory getCnlFactory();

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
		 * The meta object literal for the '{@link cnl.impl.ConstrainedNaturalLanguageRulesImpl <em>Constrained Natural Language Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ConstrainedNaturalLanguageRulesImpl
		 * @see cnl.impl.CnlPackageImpl#getConstrainedNaturalLanguageRules()
		 * @generated
		 */
		EClass CONSTRAINED_NATURAL_LANGUAGE_RULES = eINSTANCE.getConstrainedNaturalLanguageRules();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_NATURAL_LANGUAGE_RULES__RULES = eINSTANCE.getConstrainedNaturalLanguageRules_Rules();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_NATURAL_LANGUAGE_RULES__METADATA = eINSTANCE.getConstrainedNaturalLanguageRules_Metadata();

		/**
		 * The meta object literal for the '{@link cnl.impl.ValidationRulesImpl <em>Validation Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ValidationRulesImpl
		 * @see cnl.impl.CnlPackageImpl#getValidationRules()
		 * @generated
		 */
		EClass VALIDATION_RULES = eINSTANCE.getValidationRules();

		/**
		 * The meta object literal for the '{@link cnl.impl.ScopedRulesImpl <em>Scoped Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ScopedRulesImpl
		 * @see cnl.impl.CnlPackageImpl#getScopedRules()
		 * @generated
		 */
		EClass SCOPED_RULES = eINSTANCE.getScopedRules();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_RULES__SCOPE = eINSTANCE.getScopedRules_Scope();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_RULES__RULES = eINSTANCE.getScopedRules_Rules();

		/**
		 * The meta object literal for the '{@link cnl.impl.MatchScopedRuleImpl <em>Match Scoped Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.MatchScopedRuleImpl
		 * @see cnl.impl.CnlPackageImpl#getMatchScopedRule()
		 * @generated
		 */
		EClass MATCH_SCOPED_RULE = eINSTANCE.getMatchScopedRule();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_SCOPED_RULE__MATCHES = eINSTANCE.getMatchScopedRule_Matches();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_SCOPED_RULE__RULE = eINSTANCE.getMatchScopedRule_Rule();

		/**
		 * The meta object literal for the '{@link cnl.impl.MatchingRuleImpl <em>Matching Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.MatchingRuleImpl
		 * @see cnl.impl.CnlPackageImpl#getMatchingRule()
		 * @generated
		 */
		EClass MATCHING_RULE = eINSTANCE.getMatchingRule();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHING_RULE__VARIABLE_NAME = eINSTANCE.getMatchingRule_VariableName();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING_RULE__SCOPE = eINSTANCE.getMatchingRule_Scope();

		/**
		 * The meta object literal for the '{@link cnl.impl.ElementScopeImpl <em>Element Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ElementScopeImpl
		 * @see cnl.impl.CnlPackageImpl#getElementScope()
		 * @generated
		 */
		EClass ELEMENT_SCOPE = eINSTANCE.getElementScope();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_SCOPE__TYPE = eINSTANCE.getElementScope_Type();

		/**
		 * The meta object literal for the '{@link cnl.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.RuleImpl
		 * @see cnl.impl.CnlPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__IS_ACTIVE = eINSTANCE.getRule_IsActive();

		/**
		 * The meta object literal for the '<em><b>Scoped By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__SCOPED_BY = eINSTANCE.getRule_ScopedBy();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__MESSAGE = eINSTANCE.getRule_Message();

		/**
		 * The meta object literal for the '{@link cnl.impl.CNLRuleImpl <em>CNL Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.CNLRuleImpl
		 * @see cnl.impl.CnlPackageImpl#getCNLRule()
		 * @generated
		 */
		EClass CNL_RULE = eINSTANCE.getCNLRule();

		/**
		 * The meta object literal for the '<em><b>Ast Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNL_RULE__AST_ROOT = eINSTANCE.getCNLRule_AstRoot();

		/**
		 * The meta object literal for the '{@link cnl.impl.GPLRuleImpl <em>GPL Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.GPLRuleImpl
		 * @see cnl.impl.CnlPackageImpl#getGPLRule()
		 * @generated
		 */
		EClass GPL_RULE = eINSTANCE.getGPLRule();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPL_RULE__CODE = eINSTANCE.getGPLRule_Code();

		/**
		 * The meta object literal for the '{@link cnl.impl.EOLExpressionRuleImpl <em>EOL Expression Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.EOLExpressionRuleImpl
		 * @see cnl.impl.CnlPackageImpl#getEOLExpressionRule()
		 * @generated
		 */
		EClass EOL_EXPRESSION_RULE = eINSTANCE.getEOLExpressionRule();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_EXPRESSION_RULE__INFO = eINSTANCE.getEOLExpressionRule_Info();

		/**
		 * The meta object literal for the '{@link cnl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__RULE = eINSTANCE.getExpression_Rule();

		/**
		 * The meta object literal for the '{@link cnl.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ComparisonExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getComparisonExpression()
		 * @generated
		 */
		EClass COMPARISON_EXPRESSION = eINSTANCE.getComparisonExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_EXPRESSION__LHS = eINSTANCE.getComparisonExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_EXPRESSION__RHS = eINSTANCE.getComparisonExpression_Rhs();

		/**
		 * The meta object literal for the '{@link cnl.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.EqualityExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getEqualityExpression()
		 * @generated
		 */
		EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.NegatedEqualityExpressionImpl <em>Negated Equality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.NegatedEqualityExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getNegatedEqualityExpression()
		 * @generated
		 */
		EClass NEGATED_EQUALITY_EXPRESSION = eINSTANCE.getNegatedEqualityExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.GreaterThanExpressionImpl <em>Greater Than Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.GreaterThanExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getGreaterThanExpression()
		 * @generated
		 */
		EClass GREATER_THAN_EXPRESSION = eINSTANCE.getGreaterThanExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.LessThanExpressionImpl <em>Less Than Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.LessThanExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getLessThanExpression()
		 * @generated
		 */
		EClass LESS_THAN_EXPRESSION = eINSTANCE.getLessThanExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.GTEExpressionImpl <em>GTE Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.GTEExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getGTEExpression()
		 * @generated
		 */
		EClass GTE_EXPRESSION = eINSTANCE.getGTEExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.LTEExpressionImpl <em>LTE Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.LTEExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getLTEExpression()
		 * @generated
		 */
		EClass LTE_EXPRESSION = eINSTANCE.getLTEExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ArithmeticExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__LHS = eINSTANCE.getArithmeticExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__RHS = eINSTANCE.getArithmeticExpression_Rhs();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__TYPE = eINSTANCE.getArithmeticExpression_Type();

		/**
		 * The meta object literal for the '{@link cnl.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.LogicalExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__LHS = eINSTANCE.getLogicalExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__RHS = eINSTANCE.getLogicalExpression_Rhs();

		/**
		 * The meta object literal for the '{@link cnl.impl.ImpliesExpressionImpl <em>Implies Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ImpliesExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getImpliesExpression()
		 * @generated
		 */
		EClass IMPLIES_EXPRESSION = eINSTANCE.getImpliesExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.OrExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.XorExpressionImpl <em>Xor Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.XorExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getXorExpression()
		 * @generated
		 */
		EClass XOR_EXPRESSION = eINSTANCE.getXorExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.AndExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.IfandonlyifExpressionImpl <em>Ifandonlyif Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.IfandonlyifExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getIfandonlyifExpression()
		 * @generated
		 */
		EClass IFANDONLYIF_EXPRESSION = eINSTANCE.getIfandonlyifExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.BaseExpressionImpl <em>Base Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.BaseExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getBaseExpression()
		 * @generated
		 */
		EClass BASE_EXPRESSION = eINSTANCE.getBaseExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.DateExpressionImpl <em>Date Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.DateExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getDateExpression()
		 * @generated
		 */
		EClass DATE_EXPRESSION = eINSTANCE.getDateExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_EXPRESSION__LHS = eINSTANCE.getDateExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_EXPRESSION__RHS = eINSTANCE.getDateExpression_Rhs();

		/**
		 * The meta object literal for the '{@link cnl.impl.BeforeDateExpressionImpl <em>Before Date Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.BeforeDateExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getBeforeDateExpression()
		 * @generated
		 */
		EClass BEFORE_DATE_EXPRESSION = eINSTANCE.getBeforeDateExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.AfterDateExpressionImpl <em>After Date Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.AfterDateExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getAfterDateExpression()
		 * @generated
		 */
		EClass AFTER_DATE_EXPRESSION = eINSTANCE.getAfterDateExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.OnorbeforeDateExpressionImpl <em>Onorbefore Date Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.OnorbeforeDateExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getOnorbeforeDateExpression()
		 * @generated
		 */
		EClass ONORBEFORE_DATE_EXPRESSION = eINSTANCE.getOnorbeforeDateExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.OnorafterDateExpressionImpl <em>Onorafter Date Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.OnorafterDateExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getOnorafterDateExpression()
		 * @generated
		 */
		EClass ONORAFTER_DATE_EXPRESSION = eINSTANCE.getOnorafterDateExpression();

		/**
		 * The meta object literal for the '{@link cnl.impl.FeatureValueImpl <em>Feature Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.FeatureValueImpl
		 * @see cnl.impl.CnlPackageImpl#getFeatureValue()
		 * @generated
		 */
		EClass FEATURE_VALUE = eINSTANCE.getFeatureValue();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE__FEATURE = eINSTANCE.getFeatureValue_Feature();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE__SCOPE = eINSTANCE.getFeatureValue_Scope();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_VALUE__VARIABLE_NAME = eINSTANCE.getFeatureValue_VariableName();

		/**
		 * The meta object literal for the '{@link cnl.impl.TypeExpressionImpl <em>Type Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.TypeExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getTypeExpression()
		 * @generated
		 */
		EClass TYPE_EXPRESSION = eINSTANCE.getTypeExpression();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_EXPRESSION__FEATURE = eINSTANCE.getTypeExpression_Feature();

		/**
		 * The meta object literal for the '{@link cnl.impl.PrimitiveTypeExpressionImpl <em>Primitive Type Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.PrimitiveTypeExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getPrimitiveTypeExpression()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_EXPRESSION = eINSTANCE.getPrimitiveTypeExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE_EXPRESSION__TYPE = eINSTANCE.getPrimitiveTypeExpression_Type();

		/**
		 * The meta object literal for the '{@link cnl.impl.EnumTypeExpressionImpl <em>Enum Type Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.EnumTypeExpressionImpl
		 * @see cnl.impl.CnlPackageImpl#getEnumTypeExpression()
		 * @generated
		 */
		EClass ENUM_TYPE_EXPRESSION = eINSTANCE.getEnumTypeExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TYPE_EXPRESSION__TYPE = eINSTANCE.getEnumTypeExpression_Type();

		/**
		 * The meta object literal for the '{@link cnl.impl.NumericAggregationImpl <em>Numeric Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.NumericAggregationImpl
		 * @see cnl.impl.CnlPackageImpl#getNumericAggregation()
		 * @generated
		 */
		EClass NUMERIC_AGGREGATION = eINSTANCE.getNumericAggregation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_AGGREGATION__FEATURE = eINSTANCE.getNumericAggregation_Feature();

		/**
		 * The meta object literal for the '{@link cnl.impl.NumericSummationImpl <em>Numeric Summation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.NumericSummationImpl
		 * @see cnl.impl.CnlPackageImpl#getNumericSummation()
		 * @generated
		 */
		EClass NUMERIC_SUMMATION = eINSTANCE.getNumericSummation();

		/**
		 * The meta object literal for the '{@link cnl.impl.NumericAverageImpl <em>Numeric Average</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.NumericAverageImpl
		 * @see cnl.impl.CnlPackageImpl#getNumericAverage()
		 * @generated
		 */
		EClass NUMERIC_AVERAGE = eINSTANCE.getNumericAverage();

		/**
		 * The meta object literal for the '{@link cnl.impl.NumericMaximumImpl <em>Numeric Maximum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.NumericMaximumImpl
		 * @see cnl.impl.CnlPackageImpl#getNumericMaximum()
		 * @generated
		 */
		EClass NUMERIC_MAXIMUM = eINSTANCE.getNumericMaximum();

		/**
		 * The meta object literal for the '{@link cnl.impl.NumericMinimumImpl <em>Numeric Minimum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.NumericMinimumImpl
		 * @see cnl.impl.CnlPackageImpl#getNumericMinimum()
		 * @generated
		 */
		EClass NUMERIC_MINIMUM = eINSTANCE.getNumericMinimum();

		/**
		 * The meta object literal for the '{@link cnl.impl.ValueContainmentImpl <em>Value Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ValueContainmentImpl
		 * @see cnl.impl.CnlPackageImpl#getValueContainment()
		 * @generated
		 */
		EClass VALUE_CONTAINMENT = eINSTANCE.getValueContainment();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_CONTAINMENT__FEATURE = eINSTANCE.getValueContainment_Feature();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_CONTAINMENT__COLLECTION = eINSTANCE.getValueContainment_Collection();

		/**
		 * The meta object literal for the '{@link cnl.impl.UniquenessCheckImpl <em>Uniqueness Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.UniquenessCheckImpl
		 * @see cnl.impl.CnlPackageImpl#getUniquenessCheck()
		 * @generated
		 */
		EClass UNIQUENESS_CHECK = eINSTANCE.getUniquenessCheck();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUENESS_CHECK__FEATURES = eINSTANCE.getUniquenessCheck_Features();

		/**
		 * The meta object literal for the '{@link cnl.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.StringValueImpl
		 * @see cnl.impl.CnlPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link cnl.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.EnumValueImpl
		 * @see cnl.impl.CnlPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__ENUMERATION = eINSTANCE.getEnumValue_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnumValue_Value();

		/**
		 * The meta object literal for the '{@link cnl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.BooleanValueImpl
		 * @see cnl.impl.CnlPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link cnl.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.IntegerValueImpl
		 * @see cnl.impl.CnlPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link cnl.impl.DecimalValueImpl <em>Decimal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.DecimalValueImpl
		 * @see cnl.impl.CnlPackageImpl#getDecimalValue()
		 * @generated
		 */
		EClass DECIMAL_VALUE = eINSTANCE.getDecimalValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_VALUE__VALUE = eINSTANCE.getDecimalValue_Value();

		/**
		 * The meta object literal for the '{@link cnl.impl.DateValueImpl <em>Date Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.DateValueImpl
		 * @see cnl.impl.CnlPackageImpl#getDateValue()
		 * @generated
		 */
		EClass DATE_VALUE = eINSTANCE.getDateValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_VALUE__VALUE = eINSTANCE.getDateValue_Value();

		/**
		 * The meta object literal for the '{@link cnl.impl.EmptyValueImpl <em>Empty Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.EmptyValueImpl
		 * @see cnl.impl.CnlPackageImpl#getEmptyValue()
		 * @generated
		 */
		EClass EMPTY_VALUE = eINSTANCE.getEmptyValue();

		/**
		 * The meta object literal for the '{@link cnl.impl.ExistanceValueImpl <em>Existance Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.ExistanceValueImpl
		 * @see cnl.impl.CnlPackageImpl#getExistanceValue()
		 * @generated
		 */
		EClass EXISTANCE_VALUE = eINSTANCE.getExistanceValue();

		/**
		 * The meta object literal for the '{@link cnl.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.MetaDataImpl
		 * @see cnl.impl.CnlPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '<em><b>Legal Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__LEGAL_VALUES = eINSTANCE.getMetaData_LegalValues();

		/**
		 * The meta object literal for the '{@link cnl.impl.MetaValueImpl <em>Meta Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.MetaValueImpl
		 * @see cnl.impl.CnlPackageImpl#getMetaValue()
		 * @generated
		 */
		EClass META_VALUE = eINSTANCE.getMetaValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_VALUE__NAME = eINSTANCE.getMetaValue_Name();

		/**
		 * The meta object literal for the '{@link cnl.impl.EnumerationsImpl <em>Enumerations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.EnumerationsImpl
		 * @see cnl.impl.CnlPackageImpl#getEnumerations()
		 * @generated
		 */
		EClass ENUMERATIONS = eINSTANCE.getEnumerations();

		/**
		 * The meta object literal for the '{@link cnl.impl.TypesImpl <em>Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.TypesImpl
		 * @see cnl.impl.CnlPackageImpl#getTypes()
		 * @generated
		 */
		EClass TYPES = eINSTANCE.getTypes();

		/**
		 * The meta object literal for the '{@link cnl.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.EnumImpl
		 * @see cnl.impl.CnlPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '{@link cnl.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.TypeImpl
		 * @see cnl.impl.CnlPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__FEATURES = eINSTANCE.getType_Features();

		/**
		 * The meta object literal for the '{@link cnl.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.impl.FeatureImpl
		 * @see cnl.impl.CnlPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link cnl.ArithmeticOperations <em>Arithmetic Operations</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.ArithmeticOperations
		 * @see cnl.impl.CnlPackageImpl#getArithmeticOperations()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATIONS = eINSTANCE.getArithmeticOperations();

		/**
		 * The meta object literal for the '{@link cnl.PrimitiveTypes <em>Primitive Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cnl.PrimitiveTypes
		 * @see cnl.impl.CnlPackageImpl#getPrimitiveTypes()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPES = eINSTANCE.getPrimitiveTypes();

	}

} //CnlPackage
