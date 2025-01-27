/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AndExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AtExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguageFactory;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CachedExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFunction;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallNamedFunction;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ChainedExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureParameter;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.FeatureExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.GuardExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.OrExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Parameter;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterDeclaration;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterList;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.TypeRef;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryOpExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPostOpExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPreOpExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ValueLiteral;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.VariableExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeeLangTestLanguagePackageImpl extends EPackageImpl implements BeeLangTestLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providedCapabilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasedRequiredCapabilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredCapabilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass closureParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guardExpressionEClass = null;

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
  private EClass typeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass closureTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withContextExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cachedExpressionEClass = null;

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
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryOpExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryOpExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryPreOpExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryPostOpExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chainedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callNamedFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createExpressionEClass = null;

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
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BeeLangTestLanguagePackageImpl()
  {
    super(eNS_URI, BeeLangTestLanguageFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link BeeLangTestLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BeeLangTestLanguagePackage init()
  {
    if (isInited) return (BeeLangTestLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(BeeLangTestLanguagePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredBeeLangTestLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    BeeLangTestLanguagePackageImpl theBeeLangTestLanguagePackage = registeredBeeLangTestLanguagePackage instanceof BeeLangTestLanguagePackageImpl ? (BeeLangTestLanguagePackageImpl)registeredBeeLangTestLanguagePackage : new BeeLangTestLanguagePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theBeeLangTestLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theBeeLangTestLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBeeLangTestLanguagePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BeeLangTestLanguagePackage.eNS_URI, theBeeLangTestLanguagePackage);
    return theBeeLangTestLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Units()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Functions()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnit()
  {
    return unitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnit_Documentation()
  {
    return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnit_Name()
  {
    return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnit_Version()
  {
    return (EAttribute)unitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnit_Implements()
  {
    return (EReference)unitEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnit_SourceLocation()
  {
    return (EAttribute)unitEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnit_OutputLocation()
  {
    return (EAttribute)unitEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnit_ProvidedCapabilities()
  {
    return (EReference)unitEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnit_RequiredCapabilities()
  {
    return (EReference)unitEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnit_MetaRequiredCapabilities()
  {
    return (EReference)unitEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnit_Functions()
  {
    return (EReference)unitEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProvidedCapability()
  {
    return providedCapabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProvidedCapability_NameSpace()
  {
    return (EAttribute)providedCapabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProvidedCapability_CondExpr()
  {
    return (EReference)providedCapabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProvidedCapability_Name()
  {
    return (EAttribute)providedCapabilityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProvidedCapability_Version()
  {
    return (EAttribute)providedCapabilityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAliasedRequiredCapability()
  {
    return aliasedRequiredCapabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAliasedRequiredCapability_NameSpace()
  {
    return (EAttribute)aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAliasedRequiredCapability_Name()
  {
    return (EAttribute)aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAliasedRequiredCapability_Alias()
  {
    return (EAttribute)aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAliasedRequiredCapability_CondExpr()
  {
    return (EReference)aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAliasedRequiredCapability_Greedy()
  {
    return (EAttribute)aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAliasedRequiredCapability_Min()
  {
    return (EAttribute)aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAliasedRequiredCapability_Max()
  {
    return (EAttribute)aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAliasedRequiredCapability_VersionRange()
  {
    return (EAttribute)aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRequiredCapability()
  {
    return requiredCapabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequiredCapability_NameSpace()
  {
    return (EAttribute)requiredCapabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequiredCapability_Name()
  {
    return (EAttribute)requiredCapabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRequiredCapability_CondExpr()
  {
    return (EReference)requiredCapabilityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequiredCapability_Greedy()
  {
    return (EAttribute)requiredCapabilityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequiredCapability_Min()
  {
    return (EAttribute)requiredCapabilityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequiredCapability_Max()
  {
    return (EAttribute)requiredCapabilityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRequiredCapability_VersionRange()
  {
    return (EAttribute)requiredCapabilityEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getParameterList_Parameters()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getParameter_Expr()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getClosureParameter()
  {
    return closureParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParameterDeclaration()
  {
    return parameterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getParameterDeclaration_Type()
  {
    return (EReference)parameterDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParameterDeclaration_Name()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFunction_Documentation()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFunction_Visibility()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFunction_Final()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunction_ReturnType()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunction_Parameters()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFunction_VarArgs()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunction_Guard()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunction_FuncExpr()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGuardExpression()
  {
    return guardExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGuardExpression_GuardExpr()
  {
    return (EReference)guardExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTypeRef()
  {
    return typeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSimpleTypeRef()
  {
    return simpleTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleTypeRef_RawType()
  {
    return (EAttribute)simpleTypeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleTypeRef_ActualArgumentsList()
  {
    return (EAttribute)simpleTypeRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getClosureTypeRef()
  {
    return closureTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getClosureTypeRef_ParameterTypes()
  {
    return (EAttribute)closureTypeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getClosureTypeRef_VarArgs()
  {
    return (EAttribute)closureTypeRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getClosureTypeRef_ReturnType()
  {
    return (EAttribute)closureTypeRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWithExpression()
  {
    return withExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWithExpression_ReferencedAdvice()
  {
    return (EAttribute)withExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getWithExpression_FuncExpr()
  {
    return (EReference)withExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWithContextExpression()
  {
    return withContextExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getWithContextExpression_Expr()
  {
    return (EReference)withContextExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWithContextExpression_Alias()
  {
    return (EAttribute)withContextExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getWithContextExpression_ContextBlock()
  {
    return (EReference)withContextExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCallExpression()
  {
    return callExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getValueLiteral()
  {
    return valueLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getValueLiteral_Value()
  {
    return (EAttribute)valueLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAssignmentExpression()
  {
    return assignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAssignmentExpression_LeftExpr()
  {
    return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAssignmentExpression_FunctionName()
  {
    return (EAttribute)assignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAssignmentExpression_RightExpr()
  {
    return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDefValue()
  {
    return defValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefValue_Final()
  {
    return (EAttribute)defValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDefValue_Type()
  {
    return (EReference)defValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefValue_Name()
  {
    return (EAttribute)defValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDefValue_ValueExpr()
  {
    return (EReference)defValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefValue_Immutable()
  {
    return (EAttribute)defValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCachedExpression()
  {
    return cachedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCachedExpression_Expr()
  {
    return (EReference)cachedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOrExpression()
  {
    return orExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrExpression_LeftExpr()
  {
    return (EReference)orExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrExpression_RightExpr()
  {
    return (EReference)orExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAndExpression()
  {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAndExpression_LeftExpr()
  {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAndExpression_RightExpr()
  {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBinaryOpExpression()
  {
    return binaryOpExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBinaryOpExpression_LeftExpr()
  {
    return (EReference)binaryOpExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBinaryOpExpression_FunctionName()
  {
    return (EAttribute)binaryOpExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBinaryOpExpression_RightExpr()
  {
    return (EReference)binaryOpExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnaryOpExpression()
  {
    return unaryOpExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnaryOpExpression_FunctionName()
  {
    return (EAttribute)unaryOpExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnaryOpExpression_Expr()
  {
    return (EReference)unaryOpExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnaryPreOpExpression()
  {
    return unaryPreOpExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnaryPreOpExpression_FunctionName()
  {
    return (EAttribute)unaryPreOpExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnaryPreOpExpression_Expr()
  {
    return (EReference)unaryPreOpExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnaryPostOpExpression()
  {
    return unaryPostOpExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnaryPostOpExpression_Expr()
  {
    return (EReference)unaryPostOpExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnaryPostOpExpression_FunctionName()
  {
    return (EAttribute)unaryPostOpExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCallFeature()
  {
    return callFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCallFeature_FuncExpr()
  {
    return (EReference)callFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCallFeature_Name()
  {
    return (EAttribute)callFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCallFeature_ParameterList()
  {
    return (EReference)callFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAtExpression()
  {
    return atExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAtExpression_ObjExpr()
  {
    return (EReference)atExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAtExpression_IndexExpr()
  {
    return (EReference)atExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFeatureExpression()
  {
    return featureExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeatureExpression_ObjExpr()
  {
    return (EReference)featureExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFeatureExpression_FeatureName()
  {
    return (EAttribute)featureExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCallFunction()
  {
    return callFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCallFunction_FuncExpr()
  {
    return (EReference)callFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCallFunction_ParameterList()
  {
    return (EReference)callFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChainedExpression()
  {
    return chainedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChainedExpression_Expressions()
  {
    return (EReference)chainedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariableExpression()
  {
    return variableExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVariableExpression_Name()
  {
    return (EAttribute)variableExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCallNamedFunction()
  {
    return callNamedFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCallNamedFunction_Name()
  {
    return (EAttribute)callNamedFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCallNamedFunction_ParameterList()
  {
    return (EReference)callNamedFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCreateExpression()
  {
    return createExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCreateExpression_TypeExpr()
  {
    return (EAttribute)createExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCreateExpression_ParameterList()
  {
    return (EReference)createExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCreateExpression_Alias()
  {
    return (EAttribute)createExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCreateExpression_ContextBlock()
  {
    return (EReference)createExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BeeLangTestLanguageFactory getBeeLangTestLanguageFactory()
  {
    return (BeeLangTestLanguageFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__UNITS);
    createEReference(modelEClass, MODEL__FUNCTIONS);

    unitEClass = createEClass(UNIT);
    createEAttribute(unitEClass, UNIT__DOCUMENTATION);
    createEAttribute(unitEClass, UNIT__NAME);
    createEAttribute(unitEClass, UNIT__VERSION);
    createEReference(unitEClass, UNIT__IMPLEMENTS);
    createEAttribute(unitEClass, UNIT__SOURCE_LOCATION);
    createEAttribute(unitEClass, UNIT__OUTPUT_LOCATION);
    createEReference(unitEClass, UNIT__PROVIDED_CAPABILITIES);
    createEReference(unitEClass, UNIT__REQUIRED_CAPABILITIES);
    createEReference(unitEClass, UNIT__META_REQUIRED_CAPABILITIES);
    createEReference(unitEClass, UNIT__FUNCTIONS);

    providedCapabilityEClass = createEClass(PROVIDED_CAPABILITY);
    createEAttribute(providedCapabilityEClass, PROVIDED_CAPABILITY__NAME_SPACE);
    createEReference(providedCapabilityEClass, PROVIDED_CAPABILITY__COND_EXPR);
    createEAttribute(providedCapabilityEClass, PROVIDED_CAPABILITY__NAME);
    createEAttribute(providedCapabilityEClass, PROVIDED_CAPABILITY__VERSION);

    aliasedRequiredCapabilityEClass = createEClass(ALIASED_REQUIRED_CAPABILITY);
    createEAttribute(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__NAME_SPACE);
    createEAttribute(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__NAME);
    createEAttribute(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__ALIAS);
    createEReference(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__COND_EXPR);
    createEAttribute(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__GREEDY);
    createEAttribute(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__MIN);
    createEAttribute(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__MAX);
    createEAttribute(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__VERSION_RANGE);

    requiredCapabilityEClass = createEClass(REQUIRED_CAPABILITY);
    createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__NAME_SPACE);
    createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__NAME);
    createEReference(requiredCapabilityEClass, REQUIRED_CAPABILITY__COND_EXPR);
    createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__GREEDY);
    createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__MIN);
    createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__MAX);
    createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__VERSION_RANGE);

    parameterListEClass = createEClass(PARAMETER_LIST);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAMETERS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__EXPR);

    closureParameterEClass = createEClass(CLOSURE_PARAMETER);

    parameterDeclarationEClass = createEClass(PARAMETER_DECLARATION);
    createEReference(parameterDeclarationEClass, PARAMETER_DECLARATION__TYPE);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__NAME);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__DOCUMENTATION);
    createEAttribute(functionEClass, FUNCTION__VISIBILITY);
    createEAttribute(functionEClass, FUNCTION__FINAL);
    createEReference(functionEClass, FUNCTION__RETURN_TYPE);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEReference(functionEClass, FUNCTION__PARAMETERS);
    createEAttribute(functionEClass, FUNCTION__VAR_ARGS);
    createEReference(functionEClass, FUNCTION__GUARD);
    createEReference(functionEClass, FUNCTION__FUNC_EXPR);

    guardExpressionEClass = createEClass(GUARD_EXPRESSION);
    createEReference(guardExpressionEClass, GUARD_EXPRESSION__GUARD_EXPR);

    expressionEClass = createEClass(EXPRESSION);

    typeRefEClass = createEClass(TYPE_REF);

    simpleTypeRefEClass = createEClass(SIMPLE_TYPE_REF);
    createEAttribute(simpleTypeRefEClass, SIMPLE_TYPE_REF__RAW_TYPE);
    createEAttribute(simpleTypeRefEClass, SIMPLE_TYPE_REF__ACTUAL_ARGUMENTS_LIST);

    closureTypeRefEClass = createEClass(CLOSURE_TYPE_REF);
    createEAttribute(closureTypeRefEClass, CLOSURE_TYPE_REF__PARAMETER_TYPES);
    createEAttribute(closureTypeRefEClass, CLOSURE_TYPE_REF__VAR_ARGS);
    createEAttribute(closureTypeRefEClass, CLOSURE_TYPE_REF__RETURN_TYPE);

    withExpressionEClass = createEClass(WITH_EXPRESSION);
    createEAttribute(withExpressionEClass, WITH_EXPRESSION__REFERENCED_ADVICE);
    createEReference(withExpressionEClass, WITH_EXPRESSION__FUNC_EXPR);

    withContextExpressionEClass = createEClass(WITH_CONTEXT_EXPRESSION);
    createEReference(withContextExpressionEClass, WITH_CONTEXT_EXPRESSION__EXPR);
    createEAttribute(withContextExpressionEClass, WITH_CONTEXT_EXPRESSION__ALIAS);
    createEReference(withContextExpressionEClass, WITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK);

    callExpressionEClass = createEClass(CALL_EXPRESSION);

    valueLiteralEClass = createEClass(VALUE_LITERAL);
    createEAttribute(valueLiteralEClass, VALUE_LITERAL__VALUE);

    assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);
    createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__LEFT_EXPR);
    createEAttribute(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__FUNCTION_NAME);
    createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__RIGHT_EXPR);

    defValueEClass = createEClass(DEF_VALUE);
    createEAttribute(defValueEClass, DEF_VALUE__FINAL);
    createEReference(defValueEClass, DEF_VALUE__TYPE);
    createEAttribute(defValueEClass, DEF_VALUE__NAME);
    createEReference(defValueEClass, DEF_VALUE__VALUE_EXPR);
    createEAttribute(defValueEClass, DEF_VALUE__IMMUTABLE);

    cachedExpressionEClass = createEClass(CACHED_EXPRESSION);
    createEReference(cachedExpressionEClass, CACHED_EXPRESSION__EXPR);

    orExpressionEClass = createEClass(OR_EXPRESSION);
    createEReference(orExpressionEClass, OR_EXPRESSION__LEFT_EXPR);
    createEReference(orExpressionEClass, OR_EXPRESSION__RIGHT_EXPR);

    andExpressionEClass = createEClass(AND_EXPRESSION);
    createEReference(andExpressionEClass, AND_EXPRESSION__LEFT_EXPR);
    createEReference(andExpressionEClass, AND_EXPRESSION__RIGHT_EXPR);

    binaryOpExpressionEClass = createEClass(BINARY_OP_EXPRESSION);
    createEReference(binaryOpExpressionEClass, BINARY_OP_EXPRESSION__LEFT_EXPR);
    createEAttribute(binaryOpExpressionEClass, BINARY_OP_EXPRESSION__FUNCTION_NAME);
    createEReference(binaryOpExpressionEClass, BINARY_OP_EXPRESSION__RIGHT_EXPR);

    unaryOpExpressionEClass = createEClass(UNARY_OP_EXPRESSION);
    createEAttribute(unaryOpExpressionEClass, UNARY_OP_EXPRESSION__FUNCTION_NAME);
    createEReference(unaryOpExpressionEClass, UNARY_OP_EXPRESSION__EXPR);

    unaryPreOpExpressionEClass = createEClass(UNARY_PRE_OP_EXPRESSION);
    createEAttribute(unaryPreOpExpressionEClass, UNARY_PRE_OP_EXPRESSION__FUNCTION_NAME);
    createEReference(unaryPreOpExpressionEClass, UNARY_PRE_OP_EXPRESSION__EXPR);

    unaryPostOpExpressionEClass = createEClass(UNARY_POST_OP_EXPRESSION);
    createEReference(unaryPostOpExpressionEClass, UNARY_POST_OP_EXPRESSION__EXPR);
    createEAttribute(unaryPostOpExpressionEClass, UNARY_POST_OP_EXPRESSION__FUNCTION_NAME);

    callFeatureEClass = createEClass(CALL_FEATURE);
    createEReference(callFeatureEClass, CALL_FEATURE__FUNC_EXPR);
    createEAttribute(callFeatureEClass, CALL_FEATURE__NAME);
    createEReference(callFeatureEClass, CALL_FEATURE__PARAMETER_LIST);

    atExpressionEClass = createEClass(AT_EXPRESSION);
    createEReference(atExpressionEClass, AT_EXPRESSION__OBJ_EXPR);
    createEReference(atExpressionEClass, AT_EXPRESSION__INDEX_EXPR);

    featureExpressionEClass = createEClass(FEATURE_EXPRESSION);
    createEReference(featureExpressionEClass, FEATURE_EXPRESSION__OBJ_EXPR);
    createEAttribute(featureExpressionEClass, FEATURE_EXPRESSION__FEATURE_NAME);

    callFunctionEClass = createEClass(CALL_FUNCTION);
    createEReference(callFunctionEClass, CALL_FUNCTION__FUNC_EXPR);
    createEReference(callFunctionEClass, CALL_FUNCTION__PARAMETER_LIST);

    chainedExpressionEClass = createEClass(CHAINED_EXPRESSION);
    createEReference(chainedExpressionEClass, CHAINED_EXPRESSION__EXPRESSIONS);

    variableExpressionEClass = createEClass(VARIABLE_EXPRESSION);
    createEAttribute(variableExpressionEClass, VARIABLE_EXPRESSION__NAME);

    callNamedFunctionEClass = createEClass(CALL_NAMED_FUNCTION);
    createEAttribute(callNamedFunctionEClass, CALL_NAMED_FUNCTION__NAME);
    createEReference(callNamedFunctionEClass, CALL_NAMED_FUNCTION__PARAMETER_LIST);

    createExpressionEClass = createEClass(CREATE_EXPRESSION);
    createEAttribute(createExpressionEClass, CREATE_EXPRESSION__TYPE_EXPR);
    createEReference(createExpressionEClass, CREATE_EXPRESSION__PARAMETER_LIST);
    createEAttribute(createExpressionEClass, CREATE_EXPRESSION__ALIAS);
    createEReference(createExpressionEClass, CREATE_EXPRESSION__CONTEXT_BLOCK);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    closureParameterEClass.getESuperTypes().add(this.getParameter());
    functionEClass.getESuperTypes().add(this.getExpression());
    simpleTypeRefEClass.getESuperTypes().add(this.getTypeRef());
    closureTypeRefEClass.getESuperTypes().add(this.getTypeRef());
    withExpressionEClass.getESuperTypes().add(this.getExpression());
    withContextExpressionEClass.getESuperTypes().add(this.getExpression());
    callExpressionEClass.getESuperTypes().add(this.getExpression());
    valueLiteralEClass.getESuperTypes().add(this.getExpression());
    assignmentExpressionEClass.getESuperTypes().add(this.getExpression());
    defValueEClass.getESuperTypes().add(this.getExpression());
    cachedExpressionEClass.getESuperTypes().add(this.getExpression());
    orExpressionEClass.getESuperTypes().add(this.getExpression());
    andExpressionEClass.getESuperTypes().add(this.getExpression());
    binaryOpExpressionEClass.getESuperTypes().add(this.getExpression());
    unaryOpExpressionEClass.getESuperTypes().add(this.getExpression());
    unaryPreOpExpressionEClass.getESuperTypes().add(this.getExpression());
    unaryPostOpExpressionEClass.getESuperTypes().add(this.getExpression());
    callFeatureEClass.getESuperTypes().add(this.getExpression());
    atExpressionEClass.getESuperTypes().add(this.getExpression());
    featureExpressionEClass.getESuperTypes().add(this.getExpression());
    callFunctionEClass.getESuperTypes().add(this.getExpression());
    chainedExpressionEClass.getESuperTypes().add(this.getExpression());
    variableExpressionEClass.getESuperTypes().add(this.getExpression());
    callNamedFunctionEClass.getESuperTypes().add(this.getCallExpression());
    createExpressionEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Units(), this.getUnit(), null, "units", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Functions(), this.getFunction(), null, "functions", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnit_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnit_Version(), ecorePackage.getEString(), "version", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnit_Implements(), this.getSimpleTypeRef(), null, "implements", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnit_SourceLocation(), ecorePackage.getEString(), "sourceLocation", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnit_OutputLocation(), ecorePackage.getEString(), "outputLocation", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnit_ProvidedCapabilities(), this.getProvidedCapability(), null, "providedCapabilities", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnit_RequiredCapabilities(), this.getAliasedRequiredCapability(), null, "requiredCapabilities", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnit_MetaRequiredCapabilities(), this.getRequiredCapability(), null, "metaRequiredCapabilities", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnit_Functions(), this.getFunction(), null, "functions", null, 0, -1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providedCapabilityEClass, ProvidedCapability.class, "ProvidedCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProvidedCapability_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvidedCapability_CondExpr(), this.getExpression(), null, "condExpr", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvidedCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvidedCapability_Version(), ecorePackage.getEString(), "version", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aliasedRequiredCapabilityEClass, AliasedRequiredCapability.class, "AliasedRequiredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAliasedRequiredCapability_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAliasedRequiredCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1, AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAliasedRequiredCapability_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAliasedRequiredCapability_CondExpr(), this.getExpression(), null, "condExpr", null, 0, 1, AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAliasedRequiredCapability_Greedy(), ecorePackage.getEBoolean(), "greedy", null, 0, 1, AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAliasedRequiredCapability_Min(), ecorePackage.getEInt(), "min", null, 0, 1, AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAliasedRequiredCapability_Max(), ecorePackage.getEInt(), "max", null, 0, 1, AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAliasedRequiredCapability_VersionRange(), ecorePackage.getEString(), "versionRange", null, 0, 1, AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiredCapabilityEClass, RequiredCapability.class, "RequiredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequiredCapability_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequiredCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequiredCapability_CondExpr(), this.getExpression(), null, "condExpr", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequiredCapability_Greedy(), ecorePackage.getEBoolean(), "greedy", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequiredCapability_Min(), ecorePackage.getEInt(), "min", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequiredCapability_Max(), ecorePackage.getEInt(), "max", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequiredCapability_VersionRange(), ecorePackage.getEString(), "versionRange", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterList_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Expr(), this.getExpression(), null, "expr", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(closureParameterEClass, ClosureParameter.class, "ClosureParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterDeclarationEClass, ParameterDeclaration.class, "ParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterDeclaration_Type(), this.getTypeRef(), null, "type", null, 0, 1, ParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_Visibility(), ecorePackage.getEString(), "visibility", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_ReturnType(), this.getTypeRef(), null, "returnType", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Parameters(), this.getParameterDeclaration(), null, "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_VarArgs(), ecorePackage.getEBoolean(), "varArgs", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Guard(), this.getGuardExpression(), null, "guard", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_FuncExpr(), this.getExpression(), null, "funcExpr", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guardExpressionEClass, GuardExpression.class, "GuardExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGuardExpression_GuardExpr(), this.getExpression(), null, "guardExpr", null, 0, 1, GuardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleTypeRefEClass, SimpleTypeRef.class, "SimpleTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleTypeRef_RawType(), ecorePackage.getEString(), "rawType", null, 0, 1, SimpleTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleTypeRef_ActualArgumentsList(), ecorePackage.getEString(), "actualArgumentsList", null, 0, -1, SimpleTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(closureTypeRefEClass, ClosureTypeRef.class, "ClosureTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClosureTypeRef_ParameterTypes(), ecorePackage.getEString(), "parameterTypes", null, 0, -1, ClosureTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClosureTypeRef_VarArgs(), ecorePackage.getEBoolean(), "varArgs", null, 0, 1, ClosureTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClosureTypeRef_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, ClosureTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(withExpressionEClass, WithExpression.class, "WithExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWithExpression_ReferencedAdvice(), ecorePackage.getEString(), "referencedAdvice", null, 0, -1, WithExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWithExpression_FuncExpr(), this.getExpression(), null, "funcExpr", null, 0, 1, WithExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(withContextExpressionEClass, WithContextExpression.class, "WithContextExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWithContextExpression_Expr(), this.getExpression(), null, "expr", null, 0, 1, WithContextExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWithContextExpression_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, WithContextExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWithContextExpression_ContextBlock(), this.getExpression(), null, "contextBlock", null, 0, 1, WithContextExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callExpressionEClass, CallExpression.class, "CallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valueLiteralEClass, ValueLiteral.class, "ValueLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, ValueLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentExpressionEClass, AssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignmentExpression_LeftExpr(), this.getExpression(), null, "leftExpr", null, 0, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignmentExpression_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignmentExpression_RightExpr(), this.getExpression(), null, "rightExpr", null, 0, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defValueEClass, DefValue.class, "DefValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefValue_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, DefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefValue_Type(), this.getTypeRef(), null, "type", null, 0, 1, DefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, DefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefValue_ValueExpr(), this.getExpression(), null, "valueExpr", null, 0, 1, DefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefValue_Immutable(), ecorePackage.getEBoolean(), "immutable", null, 0, 1, DefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cachedExpressionEClass, CachedExpression.class, "CachedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCachedExpression_Expr(), this.getExpression(), null, "expr", null, 0, 1, CachedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrExpression_LeftExpr(), this.getExpression(), null, "leftExpr", null, 0, 1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrExpression_RightExpr(), this.getExpression(), null, "rightExpr", null, 0, 1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpression_LeftExpr(), this.getExpression(), null, "leftExpr", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndExpression_RightExpr(), this.getExpression(), null, "rightExpr", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryOpExpressionEClass, BinaryOpExpression.class, "BinaryOpExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryOpExpression_LeftExpr(), this.getExpression(), null, "leftExpr", null, 0, 1, BinaryOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryOpExpression_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, BinaryOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryOpExpression_RightExpr(), this.getExpression(), null, "rightExpr", null, 0, 1, BinaryOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryOpExpressionEClass, UnaryOpExpression.class, "UnaryOpExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryOpExpression_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, UnaryOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryOpExpression_Expr(), this.getExpression(), null, "expr", null, 0, 1, UnaryOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryPreOpExpressionEClass, UnaryPreOpExpression.class, "UnaryPreOpExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryPreOpExpression_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, UnaryPreOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryPreOpExpression_Expr(), this.getExpression(), null, "expr", null, 0, 1, UnaryPreOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryPostOpExpressionEClass, UnaryPostOpExpression.class, "UnaryPostOpExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryPostOpExpression_Expr(), this.getExpression(), null, "expr", null, 0, 1, UnaryPostOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnaryPostOpExpression_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, UnaryPostOpExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callFeatureEClass, CallFeature.class, "CallFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallFeature_FuncExpr(), this.getExpression(), null, "funcExpr", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCallFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCallFeature_ParameterList(), this.getParameterList(), null, "parameterList", null, 0, 1, CallFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atExpressionEClass, AtExpression.class, "AtExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtExpression_ObjExpr(), this.getExpression(), null, "objExpr", null, 0, 1, AtExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtExpression_IndexExpr(), this.getExpression(), null, "indexExpr", null, 0, 1, AtExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureExpressionEClass, FeatureExpression.class, "FeatureExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureExpression_ObjExpr(), this.getExpression(), null, "objExpr", null, 0, 1, FeatureExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureExpression_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, FeatureExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callFunctionEClass, CallFunction.class, "CallFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallFunction_FuncExpr(), this.getExpression(), null, "funcExpr", null, 0, 1, CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCallFunction_ParameterList(), this.getParameterList(), null, "parameterList", null, 0, 1, CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chainedExpressionEClass, ChainedExpression.class, "ChainedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChainedExpression_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ChainedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableExpressionEClass, VariableExpression.class, "VariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callNamedFunctionEClass, CallNamedFunction.class, "CallNamedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCallNamedFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, CallNamedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCallNamedFunction_ParameterList(), this.getParameterList(), null, "parameterList", null, 0, 1, CallNamedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createExpressionEClass, CreateExpression.class, "CreateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateExpression_TypeExpr(), ecorePackage.getEString(), "typeExpr", null, 0, 1, CreateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateExpression_ParameterList(), this.getParameterList(), null, "parameterList", null, 0, 1, CreateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateExpression_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, CreateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateExpression_ContextBlock(), this.getExpression(), null, "contextBlock", null, 0, 1, CreateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BeeLangTestLanguagePackageImpl
