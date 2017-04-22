package com.codelooru.custns;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CustomNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("createservice", new CreateServiceNamespaceBeanDefinitionParser());
	}

}
