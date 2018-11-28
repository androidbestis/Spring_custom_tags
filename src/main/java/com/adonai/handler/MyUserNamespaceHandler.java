package com.adonai.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 定义一个nameSpaceHandler，用于注册到Spring框架里面，在spring解析算定义标签的时候可以用我们自定义的处理方式
 */
public class MyUserNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
