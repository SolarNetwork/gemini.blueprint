/******************************************************************************
 * Copyright (c) 2006, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution. 
 * The Eclipse Public License is available at 
 * http://www.eclipse.org/legal/epl-v10.html and the Apache License v2.0
 * is available at http://www.opensource.org/licenses/apache2.0.php.
 * You may elect to redistribute this code under either of these licenses. 
 * 
 * Contributors:
 *   VMware Inc.
 *****************************************************************************/

package org.eclipse.gemini.blueprint.extender.internal.support;

import java.util.function.Predicate;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.core.ResolvableType;

/**
 * @author Costin Leau
 */
public class DummyApplicationEventMulticaster implements ApplicationEventMulticaster {

	@Override
	public void addApplicationListener(ApplicationListener<?> listener) {
	}

	@Override
	public void multicastEvent(ApplicationEvent event) {
	}

	@Override
	public void multicastEvent(ApplicationEvent event, ResolvableType eventType) {

	}

	@Override
	public void removeAllListeners() {
	}

	@Override
	public void removeApplicationListener(ApplicationListener<?> arg0) {
	}

	@Override
	public void removeApplicationListenerBean(String arg0) {
	}

	@Override
	public void addApplicationListenerBean(String listenerBeanName) {
	}

	@Override
	public void removeApplicationListeners(Predicate<ApplicationListener<?>> predicate) {
	}

	@Override
	public void removeApplicationListenerBeans(Predicate<String> predicate) {
	}

}
