/*******************************************************************************
 * Copyright (c) 2008 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.app;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class WorkflowApplication implements IApplication
{
	public Object start(IApplicationContext context) throws Exception
	{
		String workflow = (String) context.getArguments().get("-workflow");
		WorkflowRunner.run(workflow);
		return null;
	}

	public void stop()
	{}
}
