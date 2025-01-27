/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.lookaheadLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead3;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookAhead4;
import org.eclipse.xtext.testlanguages.lookaheadLang.LookaheadLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Look Ahead3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead3Impl#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.lookaheadLang.impl.LookAhead3Impl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookAhead3Impl extends AltsImpl implements LookAhead3
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
   * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected LookAhead4 z;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LookAhead3Impl()
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
    return LookaheadLangPackage.Literals.LOOK_AHEAD3;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LookaheadLangPackage.LOOK_AHEAD3__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LookAhead4 getZ()
  {
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZ(LookAhead4 newZ, NotificationChain msgs)
  {
    LookAhead4 oldZ = z;
    z = newZ;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LookaheadLangPackage.LOOK_AHEAD3__Z, oldZ, newZ);
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
  public void setZ(LookAhead4 newZ)
  {
    if (newZ != z)
    {
      NotificationChain msgs = null;
      if (z != null)
        msgs = ((InternalEObject)z).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LookaheadLangPackage.LOOK_AHEAD3__Z, null, msgs);
      if (newZ != null)
        msgs = ((InternalEObject)newZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LookaheadLangPackage.LOOK_AHEAD3__Z, null, msgs);
      msgs = basicSetZ(newZ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LookaheadLangPackage.LOOK_AHEAD3__Z, newZ, newZ));
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
      case LookaheadLangPackage.LOOK_AHEAD3__Z:
        return basicSetZ(null, msgs);
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
      case LookaheadLangPackage.LOOK_AHEAD3__X:
        return getX();
      case LookaheadLangPackage.LOOK_AHEAD3__Z:
        return getZ();
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
      case LookaheadLangPackage.LOOK_AHEAD3__X:
        setX((String)newValue);
        return;
      case LookaheadLangPackage.LOOK_AHEAD3__Z:
        setZ((LookAhead4)newValue);
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
      case LookaheadLangPackage.LOOK_AHEAD3__X:
        setX(X_EDEFAULT);
        return;
      case LookaheadLangPackage.LOOK_AHEAD3__Z:
        setZ((LookAhead4)null);
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
      case LookaheadLangPackage.LOOK_AHEAD3__X:
        return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
      case LookaheadLangPackage.LOOK_AHEAD3__Z:
        return z != null;
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
    result.append(')');
    return result.toString();
  }

} //LookAhead3Impl
