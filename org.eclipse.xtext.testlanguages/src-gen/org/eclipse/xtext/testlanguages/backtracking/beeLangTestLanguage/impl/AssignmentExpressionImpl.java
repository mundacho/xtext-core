/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AssignmentExpressionImpl#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AssignmentExpressionImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.AssignmentExpressionImpl#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends ExpressionImpl implements AssignmentExpression
{
  /**
   * The cached value of the '{@link #getLeftExpr() <em>Left Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExpr()
   * @generated
   * @ordered
   */
  protected Expression leftExpr;

  /**
   * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected String functionName = FUNCTION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightExpr() <em>Right Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightExpr()
   * @generated
   * @ordered
   */
  protected Expression rightExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BeeLangTestLanguagePackage.Literals.ASSIGNMENT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getLeftExpr()
  {
    return leftExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExpr(Expression newLeftExpr, NotificationChain msgs)
  {
    Expression oldLeftExpr = leftExpr;
    leftExpr = newLeftExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__LEFT_EXPR, oldLeftExpr, newLeftExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeftExpr(Expression newLeftExpr)
  {
    if (newLeftExpr != leftExpr)
    {
      NotificationChain msgs = null;
      if (leftExpr != null)
        msgs = ((InternalEObject)leftExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__LEFT_EXPR, null, msgs);
      if (newLeftExpr != null)
        msgs = ((InternalEObject)newLeftExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__LEFT_EXPR, null, msgs);
      msgs = basicSetLeftExpr(newLeftExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__LEFT_EXPR, newLeftExpr, newLeftExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFunctionName()
  {
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunctionName(String newFunctionName)
  {
    String oldFunctionName = functionName;
    functionName = newFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__FUNCTION_NAME, oldFunctionName, functionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getRightExpr()
  {
    return rightExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightExpr(Expression newRightExpr, NotificationChain msgs)
  {
    Expression oldRightExpr = rightExpr;
    rightExpr = newRightExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__RIGHT_EXPR, oldRightExpr, newRightExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRightExpr(Expression newRightExpr)
  {
    if (newRightExpr != rightExpr)
    {
      NotificationChain msgs = null;
      if (rightExpr != null)
        msgs = ((InternalEObject)rightExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__RIGHT_EXPR, null, msgs);
      if (newRightExpr != null)
        msgs = ((InternalEObject)newRightExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__RIGHT_EXPR, null, msgs);
      msgs = basicSetRightExpr(newRightExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__RIGHT_EXPR, newRightExpr, newRightExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__LEFT_EXPR:
        return basicSetLeftExpr(null, msgs);
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__RIGHT_EXPR:
        return basicSetRightExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__LEFT_EXPR:
        return getLeftExpr();
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__FUNCTION_NAME:
        return getFunctionName();
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__RIGHT_EXPR:
        return getRightExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__LEFT_EXPR:
        setLeftExpr((Expression)newValue);
        return;
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__FUNCTION_NAME:
        setFunctionName((String)newValue);
        return;
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__RIGHT_EXPR:
        setRightExpr((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__LEFT_EXPR:
        setLeftExpr((Expression)null);
        return;
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__FUNCTION_NAME:
        setFunctionName(FUNCTION_NAME_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__RIGHT_EXPR:
        setRightExpr((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__LEFT_EXPR:
        return leftExpr != null;
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__FUNCTION_NAME:
        return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION__RIGHT_EXPR:
        return rightExpr != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (functionName: ");
    result.append(functionName);
    result.append(')');
    return result.toString();
  }

} //AssignmentExpressionImpl
