/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parser.antlr.gh1462Test.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.parser.antlr.gh1462Test.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.parser.antlr.gh1462Test.Gh1462TestPackage
 * @generated
 */
public class Gh1462TestSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Gh1462TestPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gh1462TestSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = Gh1462TestPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case Gh1462TestPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE1:
      {
        Rule1 rule1 = (Rule1)theEObject;
        T result = caseRule1(rule1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE2:
      {
        Rule2 rule2 = (Rule2)theEObject;
        T result = caseRule2(rule2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE3:
      {
        Rule3 rule3 = (Rule3)theEObject;
        T result = caseRule3(rule3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE4:
      {
        Rule4 rule4 = (Rule4)theEObject;
        T result = caseRule4(rule4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE5:
      {
        Rule5 rule5 = (Rule5)theEObject;
        T result = caseRule5(rule5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE6:
      {
        Rule6 rule6 = (Rule6)theEObject;
        T result = caseRule6(rule6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE7:
      {
        Rule7 rule7 = (Rule7)theEObject;
        T result = caseRule7(rule7);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE8:
      {
        Rule8 rule8 = (Rule8)theEObject;
        T result = caseRule8(rule8);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE9:
      {
        Rule9 rule9 = (Rule9)theEObject;
        T result = caseRule9(rule9);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE10:
      {
        Rule10 rule10 = (Rule10)theEObject;
        T result = caseRule10(rule10);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE11:
      {
        Rule11 rule11 = (Rule11)theEObject;
        T result = caseRule11(rule11);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.RULE12:
      {
        Rule12 rule12 = (Rule12)theEObject;
        T result = caseRule12(rule12);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Gh1462TestPackage.WRAPPER:
      {
        Wrapper wrapper = (Wrapper)theEObject;
        T result = caseWrapper(wrapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule1(Rule1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule2(Rule2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule3(Rule3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule4(Rule4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule5(Rule5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule6(Rule6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule7</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule7</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule7(Rule7 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule8</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule8</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule8(Rule8 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule9</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule9</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule9(Rule9 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule10</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule10</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule10(Rule10 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule11</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule11</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule11(Rule11 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule12</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule12</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule12(Rule12 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wrapper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wrapper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWrapper(Wrapper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //Gh1462TestSwitch
