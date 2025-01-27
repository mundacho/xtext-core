/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getSourceLocation <em>Source Location</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getOutputLocation <em>Output Location</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject
{
  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' containment reference list.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_Implements()
   * @model containment="true"
   * @generated
   */
  EList<SimpleTypeRef> getImplements();

  /**
   * Returns the value of the '<em><b>Source Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Location</em>' attribute.
   * @see #setSourceLocation(String)
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_SourceLocation()
   * @model
   * @generated
   */
  String getSourceLocation();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getSourceLocation <em>Source Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Location</em>' attribute.
   * @see #getSourceLocation()
   * @generated
   */
  void setSourceLocation(String value);

  /**
   * Returns the value of the '<em><b>Output Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Location</em>' attribute.
   * @see #setOutputLocation(String)
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_OutputLocation()
   * @model
   * @generated
   */
  String getOutputLocation();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit#getOutputLocation <em>Output Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Location</em>' attribute.
   * @see #getOutputLocation()
   * @generated
   */
  void setOutputLocation(String value);

  /**
   * Returns the value of the '<em><b>Provided Capabilities</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Capabilities</em>' containment reference list.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_ProvidedCapabilities()
   * @model containment="true"
   * @generated
   */
  EList<ProvidedCapability> getProvidedCapabilities();

  /**
   * Returns the value of the '<em><b>Required Capabilities</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Capabilities</em>' containment reference list.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_RequiredCapabilities()
   * @model containment="true"
   * @generated
   */
  EList<AliasedRequiredCapability> getRequiredCapabilities();

  /**
   * Returns the value of the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Required Capabilities</em>' containment reference list.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_MetaRequiredCapabilities()
   * @model containment="true"
   * @generated
   */
  EList<RequiredCapability> getMetaRequiredCapabilities();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage#getUnit_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

} // Unit
