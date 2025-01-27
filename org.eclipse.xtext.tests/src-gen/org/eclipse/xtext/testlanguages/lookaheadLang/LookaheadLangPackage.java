/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.lookaheadLang;

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
 * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookaheadLangFactory
 * @model kind="package"
 * @generated
 */
public interface LookaheadLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lookaheadLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/2008/xtext/LookaheadLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lookaheadLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LookaheadLangPackage eINSTANCE = org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.EntryImpl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.AltsImpl <em>Alts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.AltsImpl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getAlts()
   * @generated
   */
  int ALTS = 1;

  /**
   * The number of structural features of the '<em>Alts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead0Impl <em>Look Ahead0</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead0Impl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead0()
   * @generated
   */
  int LOOK_AHEAD0 = 2;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD0__X = ALTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Look Ahead0</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD0_FEATURE_COUNT = ALTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead1Impl <em>Look Ahead1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead1Impl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead1()
   * @generated
   */
  int LOOK_AHEAD1 = 3;

  /**
   * The feature id for the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD1__Y = ALTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD1__X = ALTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD1__Z = ALTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Look Ahead1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD1_FEATURE_COUNT = ALTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead2Impl <em>Look Ahead2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead2Impl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead2()
   * @generated
   */
  int LOOK_AHEAD2 = 4;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD2__Z = 0;

  /**
   * The number of structural features of the '<em>Look Ahead2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD2_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead3Impl <em>Look Ahead3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead3Impl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead3()
   * @generated
   */
  int LOOK_AHEAD3 = 5;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD3__X = ALTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD3__Z = ALTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Look Ahead3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD3_FEATURE_COUNT = ALTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead4Impl <em>Look Ahead4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead4Impl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead4()
   * @generated
   */
  int LOOK_AHEAD4 = 6;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD4__X = 0;

  /**
   * The number of structural features of the '<em>Look Ahead4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD4_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAheadPredicateImpl <em>Look Ahead Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAheadPredicateImpl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAheadPredicate()
   * @generated
   */
  int LOOK_AHEAD_PREDICATE = 7;

  /**
   * The number of structural features of the '<em>Look Ahead Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD_PREDICATE_FEATURE_COUNT = ALTS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookBeyondImpl <em>Look Beyond</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookBeyondImpl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookBeyond()
   * @generated
   */
  int LOOK_BEYOND = 8;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_BEYOND__LEFT = ALTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_BEYOND__RIGHT = ALTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Look Beyond</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_BEYOND_FEATURE_COUNT = ALTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAheadStringsImpl <em>Look Ahead Strings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAheadStringsImpl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAheadStrings()
   * @generated
   */
  int LOOK_AHEAD_STRINGS = 9;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD_STRINGS__VALUES = 0;

  /**
   * The number of structural features of the '<em>Look Ahead Strings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOK_AHEAD_STRINGS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.FewerLookAheadStringsImpl <em>Fewer Look Ahead Strings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.FewerLookAheadStringsImpl
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getFewerLookAheadStrings()
   * @generated
   */
  int FEWER_LOOK_AHEAD_STRINGS = 10;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEWER_LOOK_AHEAD_STRINGS__VALUES = 0;

  /**
   * The number of structural features of the '<em>Fewer Look Ahead Strings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEWER_LOOK_AHEAD_STRINGS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.lookaheadLang.Entry#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.Entry#getContents()
   * @see #getEntry()
   * @generated
   */
  EReference getEntry_Contents();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.Alts <em>Alts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alts</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.Alts
   * @generated
   */
  EClass getAlts();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead0 <em>Look Ahead0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Look Ahead0</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead0
   * @generated
   */
  EClass getLookAhead0();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead0#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead0#getX()
   * @see #getLookAhead0()
   * @generated
   */
  EAttribute getLookAhead0_X();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead1 <em>Look Ahead1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Look Ahead1</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead1
   * @generated
   */
  EClass getLookAhead1();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead1#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Y</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead1#getY()
   * @see #getLookAhead1()
   * @generated
   */
  EReference getLookAhead1_Y();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead1#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead1#getX()
   * @see #getLookAhead1()
   * @generated
   */
  EAttribute getLookAhead1_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead1#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead1#getZ()
   * @see #getLookAhead1()
   * @generated
   */
  EAttribute getLookAhead1_Z();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead2 <em>Look Ahead2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Look Ahead2</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead2
   * @generated
   */
  EClass getLookAhead2();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead2#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead2#getZ()
   * @see #getLookAhead2()
   * @generated
   */
  EAttribute getLookAhead2_Z();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead3 <em>Look Ahead3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Look Ahead3</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead3
   * @generated
   */
  EClass getLookAhead3();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead3#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead3#getX()
   * @see #getLookAhead3()
   * @generated
   */
  EAttribute getLookAhead3_X();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead3#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Z</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead3#getZ()
   * @see #getLookAhead3()
   * @generated
   */
  EReference getLookAhead3_Z();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead4 <em>Look Ahead4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Look Ahead4</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead4
   * @generated
   */
  EClass getLookAhead4();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead4#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead4#getX()
   * @see #getLookAhead4()
   * @generated
   */
  EAttribute getLookAhead4_X();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAheadPredicate <em>Look Ahead Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Look Ahead Predicate</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAheadPredicate
   * @generated
   */
  EClass getLookAheadPredicate();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond <em>Look Beyond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Look Beyond</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond
   * @generated
   */
  EClass getLookBeyond();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond#getLeft()
   * @see #getLookBeyond()
   * @generated
   */
  EReference getLookBeyond_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond#getRight()
   * @see #getLookBeyond()
   * @generated
   */
  EReference getLookBeyond_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAheadStrings <em>Look Ahead Strings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Look Ahead Strings</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAheadStrings
   * @generated
   */
  EClass getLookAheadStrings();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookAheadStrings#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookAheadStrings#getValues()
   * @see #getLookAheadStrings()
   * @generated
   */
  EAttribute getLookAheadStrings_Values();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.lookaheadLang.FewerLookAheadStrings <em>Fewer Look Ahead Strings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fewer Look Ahead Strings</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.FewerLookAheadStrings
   * @generated
   */
  EClass getFewerLookAheadStrings();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.testlanguages.lookaheadLang.FewerLookAheadStrings#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.FewerLookAheadStrings#getValues()
   * @see #getFewerLookAheadStrings()
   * @generated
   */
  EAttribute getFewerLookAheadStrings_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LookaheadLangFactory getLookaheadLangFactory();

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
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.EntryImpl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTRY__CONTENTS = eINSTANCE.getEntry_Contents();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.AltsImpl <em>Alts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.AltsImpl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getAlts()
     * @generated
     */
    EClass ALTS = eINSTANCE.getAlts();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead0Impl <em>Look Ahead0</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead0Impl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead0()
     * @generated
     */
    EClass LOOK_AHEAD0 = eINSTANCE.getLookAhead0();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOK_AHEAD0__X = eINSTANCE.getLookAhead0_X();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead1Impl <em>Look Ahead1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead1Impl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead1()
     * @generated
     */
    EClass LOOK_AHEAD1 = eINSTANCE.getLookAhead1();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOK_AHEAD1__Y = eINSTANCE.getLookAhead1_Y();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOK_AHEAD1__X = eINSTANCE.getLookAhead1_X();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOK_AHEAD1__Z = eINSTANCE.getLookAhead1_Z();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead2Impl <em>Look Ahead2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead2Impl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead2()
     * @generated
     */
    EClass LOOK_AHEAD2 = eINSTANCE.getLookAhead2();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOK_AHEAD2__Z = eINSTANCE.getLookAhead2_Z();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead3Impl <em>Look Ahead3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead3Impl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead3()
     * @generated
     */
    EClass LOOK_AHEAD3 = eINSTANCE.getLookAhead3();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOK_AHEAD3__X = eINSTANCE.getLookAhead3_X();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOK_AHEAD3__Z = eINSTANCE.getLookAhead3_Z();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead4Impl <em>Look Ahead4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead4Impl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAhead4()
     * @generated
     */
    EClass LOOK_AHEAD4 = eINSTANCE.getLookAhead4();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOK_AHEAD4__X = eINSTANCE.getLookAhead4_X();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAheadPredicateImpl <em>Look Ahead Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAheadPredicateImpl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAheadPredicate()
     * @generated
     */
    EClass LOOK_AHEAD_PREDICATE = eINSTANCE.getLookAheadPredicate();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookBeyondImpl <em>Look Beyond</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookBeyondImpl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookBeyond()
     * @generated
     */
    EClass LOOK_BEYOND = eINSTANCE.getLookBeyond();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOK_BEYOND__LEFT = eINSTANCE.getLookBeyond_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOK_BEYOND__RIGHT = eINSTANCE.getLookBeyond_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAheadStringsImpl <em>Look Ahead Strings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAheadStringsImpl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getLookAheadStrings()
     * @generated
     */
    EClass LOOK_AHEAD_STRINGS = eINSTANCE.getLookAheadStrings();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOK_AHEAD_STRINGS__VALUES = eINSTANCE.getLookAheadStrings_Values();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.FewerLookAheadStringsImpl <em>Fewer Look Ahead Strings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.FewerLookAheadStringsImpl
     * @see org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookaheadLangPackageImpl#getFewerLookAheadStrings()
     * @generated
     */
    EClass FEWER_LOOK_AHEAD_STRINGS = eINSTANCE.getFewerLookAheadStrings();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEWER_LOOK_AHEAD_STRINGS__VALUES = eINSTANCE.getFewerLookAheadStrings_Values();

  }

} //LookaheadLangPackage
