/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parser.fragments.fragmentTestLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRF Named With Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.PRFNamedWithAction#getPrev <em>Prev</em>}</li>
 *   <li>{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.PRFNamedWithAction#getRef2 <em>Ref2</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage#getPRFNamedWithAction()
 * @model
 * @generated
 */
public interface PRFNamedWithAction extends PRFNamed
{
  /**
   * Returns the value of the '<em><b>Prev</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prev</em>' containment reference.
   * @see #setPrev(PRFNamed)
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage#getPRFNamedWithAction_Prev()
   * @model containment="true"
   * @generated
   */
  PRFNamed getPrev();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.PRFNamedWithAction#getPrev <em>Prev</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prev</em>' containment reference.
   * @see #getPrev()
   * @generated
   */
  void setPrev(PRFNamed value);

  /**
   * Returns the value of the '<em><b>Ref2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref2</em>' reference.
   * @see #setRef2(PRFNamed)
   * @see org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage#getPRFNamedWithAction_Ref2()
   * @model
   * @generated
   */
  PRFNamed getRef2();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.parser.fragments.fragmentTestLanguage.PRFNamedWithAction#getRef2 <em>Ref2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref2</em>' reference.
   * @see #getRef2()
   * @generated
   */
  void setRef2(PRFNamed value);

} // PRFNamedWithAction
