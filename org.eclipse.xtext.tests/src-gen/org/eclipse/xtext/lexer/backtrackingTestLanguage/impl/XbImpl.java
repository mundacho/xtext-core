/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.lexer.backtrackingTestLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.lexer.backtrackingTestLanguage.BacktrackingTestLanguagePackage;
import org.eclipse.xtext.lexer.backtrackingTestLanguage.Xb;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.lexer.backtrackingTestLanguage.impl.XbImpl#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.xtext.lexer.backtrackingTestLanguage.impl.XbImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XbImpl extends MinimalEObjectImpl.Container implements Xb
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final String X_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected String x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final String Y_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected String y = Y_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XbImpl()
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
    return BacktrackingTestLanguagePackage.Literals.XB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setX(String newX)
  {
    String oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BacktrackingTestLanguagePackage.XB__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setY(String newY)
  {
    String oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BacktrackingTestLanguagePackage.XB__Y, oldY, y));
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
      case BacktrackingTestLanguagePackage.XB__X:
        return getX();
      case BacktrackingTestLanguagePackage.XB__Y:
        return getY();
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
      case BacktrackingTestLanguagePackage.XB__X:
        setX((String)newValue);
        return;
      case BacktrackingTestLanguagePackage.XB__Y:
        setY((String)newValue);
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
      case BacktrackingTestLanguagePackage.XB__X:
        setX(X_EDEFAULT);
        return;
      case BacktrackingTestLanguagePackage.XB__Y:
        setY(Y_EDEFAULT);
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
      case BacktrackingTestLanguagePackage.XB__X:
        return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
      case BacktrackingTestLanguagePackage.XB__Y:
        return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
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
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(')');
    return result.toString();
  }

} //XbImpl
