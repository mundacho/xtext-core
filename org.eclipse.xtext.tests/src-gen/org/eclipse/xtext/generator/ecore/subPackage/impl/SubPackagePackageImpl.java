/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.generator.ecore.subPackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.generator.ecore.subPackage.AnotherSuperMain;
import org.eclipse.xtext.generator.ecore.subPackage.SubMain;
import org.eclipse.xtext.generator.ecore.subPackage.SubPackageFactory;
import org.eclipse.xtext.generator.ecore.subPackage.SubPackagePackage;

import org.eclipse.xtext.generator.ecore.superPackage.SuperPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubPackagePackageImpl extends EPackageImpl implements SubPackagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subMainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anotherSuperMainEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.generator.ecore.subPackage.SubPackagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SubPackagePackageImpl()
  {
    super(eNS_URI, SubPackageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link SubPackagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SubPackagePackage init()
  {
    if (isInited) return (SubPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubPackagePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredSubPackagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    SubPackagePackageImpl theSubPackagePackage = registeredSubPackagePackage instanceof SubPackagePackageImpl ? (SubPackagePackageImpl)registeredSubPackagePackage : new SubPackagePackageImpl();

    isInited = true;

    // Initialize simple dependencies
    SuperPackagePackage.eINSTANCE.eClass();
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSubPackagePackage.createPackageContents();

    // Initialize created meta-data
    theSubPackagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSubPackagePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SubPackagePackage.eNS_URI, theSubPackagePackage);
    return theSubPackagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSubMain()
  {
    return subMainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSubMain_SuperMains()
  {
    return (EReference)subMainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSubMain_Another()
  {
    return (EReference)subMainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAnotherSuperMain()
  {
    return anotherSuperMainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubPackageFactory getSubPackageFactory()
  {
    return (SubPackageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    subMainEClass = createEClass(SUB_MAIN);
    createEReference(subMainEClass, SUB_MAIN__SUPER_MAINS);
    createEReference(subMainEClass, SUB_MAIN__ANOTHER);

    anotherSuperMainEClass = createEClass(ANOTHER_SUPER_MAIN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SuperPackagePackage theSuperPackagePackage = (SuperPackagePackage)EPackage.Registry.INSTANCE.getEPackage(SuperPackagePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    anotherSuperMainEClass.getESuperTypes().add(theSuperPackagePackage.getAnotherSuperMain());

    // Initialize classes and features; add operations and parameters
    initEClass(subMainEClass, SubMain.class, "SubMain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubMain_SuperMains(), theSuperPackagePackage.getSuperMain(), null, "superMains", null, 0, -1, SubMain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubMain_Another(), this.getAnotherSuperMain(), null, "another", null, 0, 1, SubMain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anotherSuperMainEClass, AnotherSuperMain.class, "AnotherSuperMain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SubPackagePackageImpl
