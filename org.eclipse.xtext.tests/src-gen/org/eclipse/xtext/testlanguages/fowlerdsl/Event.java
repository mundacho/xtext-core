/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.fowlerdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.fowlerdsl.Event#isResetting <em>Resetting</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.fowlerdsl.Event#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.fowlerdsl.Event#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.testlanguages.fowlerdsl.FowlerdslPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Resetting</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resetting</em>' attribute.
   * @see #setResetting(boolean)
   * @see org.eclipse.xtext.testlanguages.fowlerdsl.FowlerdslPackage#getEvent_Resetting()
   * @model
   * @generated
   */
  boolean isResetting();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.fowlerdsl.Event#isResetting <em>Resetting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resetting</em>' attribute.
   * @see #isResetting()
   * @generated
   */
  void setResetting(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.testlanguages.fowlerdsl.FowlerdslPackage#getEvent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.fowlerdsl.Event#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see org.eclipse.xtext.testlanguages.fowlerdsl.FowlerdslPackage#getEvent_Code()
   * @model
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.fowlerdsl.Event#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

} // Event
