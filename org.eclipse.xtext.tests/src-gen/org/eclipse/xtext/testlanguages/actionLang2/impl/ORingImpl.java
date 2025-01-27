/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.actionLang2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.testlanguages.actionLang2.ActionLang2Package;
import org.eclipse.xtext.testlanguages.actionLang2.ORing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.actionLang2.impl.ORingImpl#getDisjuncts <em>Disjuncts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORingImpl extends MinimalEObjectImpl.Container implements ORing
{
  /**
   * The cached value of the '{@link #getDisjuncts() <em>Disjuncts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisjuncts()
   * @generated
   * @ordered
   */
  protected EList<ORing> disjuncts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ORingImpl()
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
    return ActionLang2Package.Literals.ORING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ORing> getDisjuncts()
  {
    if (disjuncts == null)
    {
      disjuncts = new EObjectContainmentEList<ORing>(ORing.class, this, ActionLang2Package.ORING__DISJUNCTS);
    }
    return disjuncts;
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
      case ActionLang2Package.ORING__DISJUNCTS:
        return ((InternalEList<?>)getDisjuncts()).basicRemove(otherEnd, msgs);
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
      case ActionLang2Package.ORING__DISJUNCTS:
        return getDisjuncts();
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
      case ActionLang2Package.ORING__DISJUNCTS:
        getDisjuncts().clear();
        getDisjuncts().addAll((Collection<? extends ORing>)newValue);
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
      case ActionLang2Package.ORING__DISJUNCTS:
        getDisjuncts().clear();
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
      case ActionLang2Package.ORING__DISJUNCTS:
        return disjuncts != null && !disjuncts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ORingImpl
