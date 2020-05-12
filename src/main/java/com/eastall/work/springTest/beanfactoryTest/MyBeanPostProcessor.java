package com.eastall.work.springTest.beanfactoryTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("前方法"+beanName);
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("后方法"+beanName);
		return Proxy.newProxyInstance(MyBeanPostProcessor.class.getClassLoader(), 
				bean.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						
						System.out.println("开启事务。。。");
						Object obj = method.invoke(bean, args);
						System.out.println("提交事务。。。");
						return obj;
					}
				});
	}
}
