/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parser.antlr.gh1462Test;

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
 * @see org.eclipse.xtext.parser.antlr.gh1462Test.Gh1462TestFactory
 * @model kind="package"
 * @generated
 */
public interface Gh1462TestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gh1462Test";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://eclipse.org/xtext/GH1462TestTestLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gh1462Test";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Gh1462TestPackage eINSTANCE = org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.RootImpl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule1Impl <em>Rule1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule1Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule1()
   * @generated
   */
  int RULE1 = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE1__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE1__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE1__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE1_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule2Impl <em>Rule2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule2Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule2()
   * @generated
   */
  int RULE2 = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE2__UNIT = 1;

  /**
   * The number of structural features of the '<em>Rule2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule3Impl <em>Rule3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule3Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule3()
   * @generated
   */
  int RULE3 = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE3__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE3__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE3__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE3_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule4Impl <em>Rule4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule4Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule4()
   * @generated
   */
  int RULE4 = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE4__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE4__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE4__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE4_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule5Impl <em>Rule5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule5Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule5()
   * @generated
   */
  int RULE5 = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE5__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE5__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE5__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE5_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule6Impl <em>Rule6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule6Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule6()
   * @generated
   */
  int RULE6 = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE6__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE6__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE6__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE6_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule7Impl <em>Rule7</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule7Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule7()
   * @generated
   */
  int RULE7 = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE7__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE7__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE7__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule7</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE7_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule8Impl <em>Rule8</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule8Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule8()
   * @generated
   */
  int RULE8 = 8;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE8__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE8__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE8__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule8</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE8_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule9Impl <em>Rule9</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule9Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule9()
   * @generated
   */
  int RULE9 = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE9__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE9__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE9__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule9</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE9_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule10Impl <em>Rule10</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule10Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule10()
   * @generated
   */
  int RULE10 = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE10__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE10__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE10__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule10</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE10_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule11Impl <em>Rule11</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule11Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule11()
   * @generated
   */
  int RULE11 = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE11__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE11__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE11__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule11</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE11_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule12Impl <em>Rule12</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule12Impl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule12()
   * @generated
   */
  int RULE12 = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE12__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE12__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE12__UNIT = 2;

  /**
   * The number of structural features of the '<em>Rule12</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE12_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.WrapperImpl <em>Wrapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.WrapperImpl
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getWrapper()
   * @generated
   */
  int WRAPPER = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER__VALUE = 0;

  /**
   * The number of structural features of the '<em>Wrapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Root#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Root#getElement()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Element();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule1 <em>Rule1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule1</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule1
   * @generated
   */
  EClass getRule1();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule1#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule1#getLeft()
   * @see #getRule1()
   * @generated
   */
  EAttribute getRule1_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule1#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule1#getRight()
   * @see #getRule1()
   * @generated
   */
  EAttribute getRule1_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule1#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule1#getUnit()
   * @see #getRule1()
   * @generated
   */
  EAttribute getRule1_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule2 <em>Rule2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule2</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule2
   * @generated
   */
  EClass getRule2();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule2#getValue()
   * @see #getRule2()
   * @generated
   */
  EAttribute getRule2_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule2#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule2#getUnit()
   * @see #getRule2()
   * @generated
   */
  EAttribute getRule2_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule3 <em>Rule3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule3</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule3
   * @generated
   */
  EClass getRule3();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule3#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule3#getLeft()
   * @see #getRule3()
   * @generated
   */
  EAttribute getRule3_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule3#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule3#getRight()
   * @see #getRule3()
   * @generated
   */
  EAttribute getRule3_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule3#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule3#getUnit()
   * @see #getRule3()
   * @generated
   */
  EAttribute getRule3_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule4 <em>Rule4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule4</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule4
   * @generated
   */
  EClass getRule4();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule4#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule4#getLeft()
   * @see #getRule4()
   * @generated
   */
  EAttribute getRule4_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule4#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule4#getRight()
   * @see #getRule4()
   * @generated
   */
  EAttribute getRule4_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule4#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule4#getUnit()
   * @see #getRule4()
   * @generated
   */
  EAttribute getRule4_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule5 <em>Rule5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule5</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule5
   * @generated
   */
  EClass getRule5();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule5#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule5#getLeft()
   * @see #getRule5()
   * @generated
   */
  EAttribute getRule5_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule5#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule5#getRight()
   * @see #getRule5()
   * @generated
   */
  EAttribute getRule5_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule5#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule5#getUnit()
   * @see #getRule5()
   * @generated
   */
  EAttribute getRule5_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule6 <em>Rule6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule6</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule6
   * @generated
   */
  EClass getRule6();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule6#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule6#getLeft()
   * @see #getRule6()
   * @generated
   */
  EAttribute getRule6_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule6#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule6#getRight()
   * @see #getRule6()
   * @generated
   */
  EReference getRule6_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule6#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule6#getUnit()
   * @see #getRule6()
   * @generated
   */
  EAttribute getRule6_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule7 <em>Rule7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule7</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule7
   * @generated
   */
  EClass getRule7();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule7#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule7#getLeft()
   * @see #getRule7()
   * @generated
   */
  EAttribute getRule7_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule7#isRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule7#isRight()
   * @see #getRule7()
   * @generated
   */
  EAttribute getRule7_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule7#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule7#getUnit()
   * @see #getRule7()
   * @generated
   */
  EAttribute getRule7_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule8 <em>Rule8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule8</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule8
   * @generated
   */
  EClass getRule8();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule8#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule8#getLeft()
   * @see #getRule8()
   * @generated
   */
  EAttribute getRule8_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule8#isRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule8#isRight()
   * @see #getRule8()
   * @generated
   */
  EAttribute getRule8_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule8#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule8#getUnit()
   * @see #getRule8()
   * @generated
   */
  EAttribute getRule8_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule9 <em>Rule9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule9</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule9
   * @generated
   */
  EClass getRule9();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule9#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule9#getLeft()
   * @see #getRule9()
   * @generated
   */
  EAttribute getRule9_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule9#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule9#getRight()
   * @see #getRule9()
   * @generated
   */
  EAttribute getRule9_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule9#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule9#getUnit()
   * @see #getRule9()
   * @generated
   */
  EAttribute getRule9_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule10 <em>Rule10</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule10</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule10
   * @generated
   */
  EClass getRule10();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule10#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule10#getLeft()
   * @see #getRule10()
   * @generated
   */
  EAttribute getRule10_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule10#isRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule10#isRight()
   * @see #getRule10()
   * @generated
   */
  EAttribute getRule10_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule10#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule10#getUnit()
   * @see #getRule10()
   * @generated
   */
  EAttribute getRule10_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule11 <em>Rule11</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule11</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule11
   * @generated
   */
  EClass getRule11();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule11#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule11#getLeft()
   * @see #getRule11()
   * @generated
   */
  EAttribute getRule11_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule11#isRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule11#isRight()
   * @see #getRule11()
   * @generated
   */
  EAttribute getRule11_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule11#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule11#getUnit()
   * @see #getRule11()
   * @generated
   */
  EAttribute getRule11_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule12 <em>Rule12</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule12</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule12
   * @generated
   */
  EClass getRule12();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule12#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule12#getLeft()
   * @see #getRule12()
   * @generated
   */
  EAttribute getRule12_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule12#isRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule12#isRight()
   * @see #getRule12()
   * @generated
   */
  EAttribute getRule12_Right();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Rule12#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Rule12#getUnit()
   * @see #getRule12()
   * @generated
   */
  EAttribute getRule12_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Wrapper <em>Wrapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wrapper</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Wrapper
   * @generated
   */
  EClass getWrapper();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.gh1462Test.Wrapper#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.xtext.parser.antlr.gh1462Test.Wrapper#getValue()
   * @see #getWrapper()
   * @generated
   */
  EAttribute getWrapper_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Gh1462TestFactory getGh1462TestFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.RootImpl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__ELEMENT = eINSTANCE.getRoot_Element();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule1Impl <em>Rule1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule1Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule1()
     * @generated
     */
    EClass RULE1 = eINSTANCE.getRule1();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE1__LEFT = eINSTANCE.getRule1_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE1__RIGHT = eINSTANCE.getRule1_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE1__UNIT = eINSTANCE.getRule1_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule2Impl <em>Rule2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule2Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule2()
     * @generated
     */
    EClass RULE2 = eINSTANCE.getRule2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE2__VALUE = eINSTANCE.getRule2_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE2__UNIT = eINSTANCE.getRule2_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule3Impl <em>Rule3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule3Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule3()
     * @generated
     */
    EClass RULE3 = eINSTANCE.getRule3();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE3__LEFT = eINSTANCE.getRule3_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE3__RIGHT = eINSTANCE.getRule3_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE3__UNIT = eINSTANCE.getRule3_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule4Impl <em>Rule4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule4Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule4()
     * @generated
     */
    EClass RULE4 = eINSTANCE.getRule4();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE4__LEFT = eINSTANCE.getRule4_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE4__RIGHT = eINSTANCE.getRule4_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE4__UNIT = eINSTANCE.getRule4_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule5Impl <em>Rule5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule5Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule5()
     * @generated
     */
    EClass RULE5 = eINSTANCE.getRule5();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE5__LEFT = eINSTANCE.getRule5_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE5__RIGHT = eINSTANCE.getRule5_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE5__UNIT = eINSTANCE.getRule5_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule6Impl <em>Rule6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule6Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule6()
     * @generated
     */
    EClass RULE6 = eINSTANCE.getRule6();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE6__LEFT = eINSTANCE.getRule6_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE6__RIGHT = eINSTANCE.getRule6_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE6__UNIT = eINSTANCE.getRule6_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule7Impl <em>Rule7</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule7Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule7()
     * @generated
     */
    EClass RULE7 = eINSTANCE.getRule7();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE7__LEFT = eINSTANCE.getRule7_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE7__RIGHT = eINSTANCE.getRule7_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE7__UNIT = eINSTANCE.getRule7_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule8Impl <em>Rule8</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule8Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule8()
     * @generated
     */
    EClass RULE8 = eINSTANCE.getRule8();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE8__LEFT = eINSTANCE.getRule8_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE8__RIGHT = eINSTANCE.getRule8_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE8__UNIT = eINSTANCE.getRule8_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule9Impl <em>Rule9</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule9Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule9()
     * @generated
     */
    EClass RULE9 = eINSTANCE.getRule9();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE9__LEFT = eINSTANCE.getRule9_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE9__RIGHT = eINSTANCE.getRule9_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE9__UNIT = eINSTANCE.getRule9_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule10Impl <em>Rule10</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule10Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule10()
     * @generated
     */
    EClass RULE10 = eINSTANCE.getRule10();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE10__LEFT = eINSTANCE.getRule10_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE10__RIGHT = eINSTANCE.getRule10_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE10__UNIT = eINSTANCE.getRule10_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule11Impl <em>Rule11</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule11Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule11()
     * @generated
     */
    EClass RULE11 = eINSTANCE.getRule11();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE11__LEFT = eINSTANCE.getRule11_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE11__RIGHT = eINSTANCE.getRule11_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE11__UNIT = eINSTANCE.getRule11_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule12Impl <em>Rule12</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule12Impl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getRule12()
     * @generated
     */
    EClass RULE12 = eINSTANCE.getRule12();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE12__LEFT = eINSTANCE.getRule12_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE12__RIGHT = eINSTANCE.getRule12_Right();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE12__UNIT = eINSTANCE.getRule12_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.WrapperImpl <em>Wrapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.WrapperImpl
     * @see org.eclipse.xtext.parser.antlr.gh1462Test.impl.Gh1462TestPackageImpl#getWrapper()
     * @generated
     */
    EClass WRAPPER = eINSTANCE.getWrapper();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRAPPER__VALUE = eINSTANCE.getWrapper_Value();

  }

} //Gh1462TestPackage
