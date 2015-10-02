/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wicketstuff.selectize;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;

public class SelectizeJavaScriptResourceReference extends JavaScriptResourceReference
{

	private static final long serialVersionUID = 1L;

	/**
	 * Singleton instance of this reference
	 */
	private static final SelectizeJavaScriptResourceReference INSTANCE = new SelectizeJavaScriptResourceReference();

	/**
	 * @return the single instance of the resource reference
	 */
	public static SelectizeJavaScriptResourceReference instance()
	{
		return INSTANCE;
	}

	/**
	 * Private constructor.
	 */
	private SelectizeJavaScriptResourceReference()
	{
		super(SelectizeJavaScriptResourceReference.class,
			"res/selectize/js/standalone/selectize.js");
	}

	@Override
	public List<HeaderItem> getDependencies()
	{
		List<HeaderItem> dependencies = new ArrayList<HeaderItem>();
		dependencies.add(JavaScriptHeaderItem.forReference(JQueryResourceReference.get()));
		return dependencies;
	}
}
