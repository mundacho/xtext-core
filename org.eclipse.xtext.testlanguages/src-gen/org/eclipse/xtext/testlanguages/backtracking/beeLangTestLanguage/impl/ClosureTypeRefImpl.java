/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Closure Type Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureTypeRefImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureTypeRefImpl#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.ClosureTypeRefImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClosureTypeRefImpl extends TypeRefImpl implements ClosureTypeRef
{
  /**
   * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterTypes()
   * @generated
   * @ordered
   */
  protected EList<String> parameterTypes;

  /**
   * The default value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarArgs()
   * @generated
   * @ordered
   */
  protected static final boolean VAR_ARGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarArgs()
   * @generated
   * @ordered
   */
  protected boolean varArgs = VAR_ARGS_EDEFAULT;

  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final String RETURN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected String returnType = RETURN_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClosureTypeRefImpl()
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
    return BeeLangTestLanguagePackage.Literals.CLOSURE_TYPE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getParameterTypes()
  {
    if (parameterTypes == null)
    {
      parameterTypes = new EDataTypeEList<String>(String.class, this, BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__PARAMETER_TYPES);
    }
    return parameterTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isVarArgs()
  {
    return varArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarArgs(boolean newVarArgs)
  {
    boolean oldVarArgs = varArgs;
    varArgs = newVarArgs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__VAR_ARGS, oldVarArgs, varArgs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReturnType(String newReturnType)
  {
    String oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__RETURN_TYPE, oldReturnType, returnType));
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
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__PARAMETER_TYPES:
        return getParameterTypes();
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__VAR_ARGS:
        return isVarArgs();
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__RETURN_TYPE:
        return getReturnType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__PARAMETER_TYPES:
        getParameterTypes().clear();
        getParameterTypes().addAll((Collection<? extends String>)newValue);
        return;
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__VAR_ARGS:
        setVarArgs((Boolean)newValue);
        return;
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__RETURN_TYPE:
        setReturnType((String)newValue);
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
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__PARAMETER_TYPES:
        getParameterTypes().clear();
        return;
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__VAR_ARGS:
        setVarArgs(VAR_ARGS_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
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
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__PARAMETER_TYPES:
        return parameterTypes != null && !parameterTypes.isEmpty();
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__VAR_ARGS:
        return varArgs != VAR_ARGS_EDEFAULT;
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF__RETURN_TYPE:
        return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
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
    result.append(" (parameterTypes: ");
    result.append(parameterTypes);
    result.append(", varArgs: ");
    result.append(varArgs);
    result.append(", returnType: ");
    result.append(returnType);
    result.append(')');
    return result.toString();
  }

} //ClosureTypeRefImpl
