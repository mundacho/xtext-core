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

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.TypeRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.DefValueImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.DefValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.DefValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.DefValueImpl#getValueExpr <em>Value Expr</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.DefValueImpl#isImmutable <em>Immutable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefValueImpl extends ExpressionImpl implements DefValue
{
  /**
   * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected static final boolean FINAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected boolean final_ = FINAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeRef type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueExpr() <em>Value Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueExpr()
   * @generated
   * @ordered
   */
  protected Expression valueExpr;

  /**
   * The default value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmutable()
   * @generated
   * @ordered
   */
  protected static final boolean IMMUTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmutable()
   * @generated
   * @ordered
   */
  protected boolean immutable = IMMUTABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefValueImpl()
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
    return BeeLangTestLanguagePackage.Literals.DEF_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinal(boolean newFinal)
  {
    boolean oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.DEF_VALUE__FINAL, oldFinal, final_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeRef getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeRef newType, NotificationChain msgs)
  {
    TypeRef oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.DEF_VALUE__TYPE, oldType, newType);
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
  public void setType(TypeRef newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.DEF_VALUE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.DEF_VALUE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.DEF_VALUE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.DEF_VALUE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getValueExpr()
  {
    return valueExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueExpr(Expression newValueExpr, NotificationChain msgs)
  {
    Expression oldValueExpr = valueExpr;
    valueExpr = newValueExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.DEF_VALUE__VALUE_EXPR, oldValueExpr, newValueExpr);
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
  public void setValueExpr(Expression newValueExpr)
  {
    if (newValueExpr != valueExpr)
    {
      NotificationChain msgs = null;
      if (valueExpr != null)
        msgs = ((InternalEObject)valueExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.DEF_VALUE__VALUE_EXPR, null, msgs);
      if (newValueExpr != null)
        msgs = ((InternalEObject)newValueExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.DEF_VALUE__VALUE_EXPR, null, msgs);
      msgs = basicSetValueExpr(newValueExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.DEF_VALUE__VALUE_EXPR, newValueExpr, newValueExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isImmutable()
  {
    return immutable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImmutable(boolean newImmutable)
  {
    boolean oldImmutable = immutable;
    immutable = newImmutable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.DEF_VALUE__IMMUTABLE, oldImmutable, immutable));
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
      case BeeLangTestLanguagePackage.DEF_VALUE__TYPE:
        return basicSetType(null, msgs);
      case BeeLangTestLanguagePackage.DEF_VALUE__VALUE_EXPR:
        return basicSetValueExpr(null, msgs);
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
      case BeeLangTestLanguagePackage.DEF_VALUE__FINAL:
        return isFinal();
      case BeeLangTestLanguagePackage.DEF_VALUE__TYPE:
        return getType();
      case BeeLangTestLanguagePackage.DEF_VALUE__NAME:
        return getName();
      case BeeLangTestLanguagePackage.DEF_VALUE__VALUE_EXPR:
        return getValueExpr();
      case BeeLangTestLanguagePackage.DEF_VALUE__IMMUTABLE:
        return isImmutable();
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
      case BeeLangTestLanguagePackage.DEF_VALUE__FINAL:
        setFinal((Boolean)newValue);
        return;
      case BeeLangTestLanguagePackage.DEF_VALUE__TYPE:
        setType((TypeRef)newValue);
        return;
      case BeeLangTestLanguagePackage.DEF_VALUE__NAME:
        setName((String)newValue);
        return;
      case BeeLangTestLanguagePackage.DEF_VALUE__VALUE_EXPR:
        setValueExpr((Expression)newValue);
        return;
      case BeeLangTestLanguagePackage.DEF_VALUE__IMMUTABLE:
        setImmutable((Boolean)newValue);
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
      case BeeLangTestLanguagePackage.DEF_VALUE__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.DEF_VALUE__TYPE:
        setType((TypeRef)null);
        return;
      case BeeLangTestLanguagePackage.DEF_VALUE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.DEF_VALUE__VALUE_EXPR:
        setValueExpr((Expression)null);
        return;
      case BeeLangTestLanguagePackage.DEF_VALUE__IMMUTABLE:
        setImmutable(IMMUTABLE_EDEFAULT);
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
      case BeeLangTestLanguagePackage.DEF_VALUE__FINAL:
        return final_ != FINAL_EDEFAULT;
      case BeeLangTestLanguagePackage.DEF_VALUE__TYPE:
        return type != null;
      case BeeLangTestLanguagePackage.DEF_VALUE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BeeLangTestLanguagePackage.DEF_VALUE__VALUE_EXPR:
        return valueExpr != null;
      case BeeLangTestLanguagePackage.DEF_VALUE__IMMUTABLE:
        return immutable != IMMUTABLE_EDEFAULT;
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
    result.append(" (final: ");
    result.append(final_);
    result.append(", name: ");
    result.append(name);
    result.append(", immutable: ");
    result.append(immutable);
    result.append(')');
    return result.toString();
  }

} //DefValueImpl
