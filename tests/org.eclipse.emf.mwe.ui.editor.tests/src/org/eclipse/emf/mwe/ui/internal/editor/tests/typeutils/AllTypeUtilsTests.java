/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.tests.typeutils;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTypeUtilsTests {

	public static Test suite() {
		final TestSuite suite = new TestSuite("Test suite for org.eclipse.emf.mwe.ui.internal.editor.tests.typeutils");
		// $JUnit-BEGIN$
		suite.addTestSuite(PropertyNamesTests.class);
		suite.addTestSuite(TypeUtilsTests.class);
		suite.addTestSuite(ClassHierarchyTests.class);
		suite.addTestSuite(GetSetterTests.class);
		// $JUnit-END$
		return suite;
	}

}