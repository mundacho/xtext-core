/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.crossref.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.AbstractNode;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class AbstractDecoratingDiagnosticProducer implements DiagnosticProducer {

	private final DiagnosticProducer producer;
	
	public AbstractDecoratingDiagnosticProducer(DiagnosticProducer producer) {
		super();
		this.producer = producer;
	}

	public void addDefaultDiagnostic() {
		producer.addDefaultDiagnostic();
	}

	public void addDiagnostic(String message) {
		producer.addDiagnostic(message);
	}

	public AbstractNode getNode() {
		return producer.getNode();
	}

	public void setNode(AbstractNode node) {
		producer.setNode(node);
	}

	public void setTarget(EObject object, EStructuralFeature feature) {
		producer.setTarget(object, feature);
	}
	
}
