package com.eastall.work.springTest.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {

	private Object target;

	public JDKDynamicProxy(Object target) {
		this.target = target;
	}

	public <T> T getProxy() {
		return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("事务开始。。。");
		result = method.invoke(target, args);
		System.out.println("事务提交了。。。");
		return result;
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, Throwable {
		Subject sb = new RealSubject();
		JDKDynamicProxy jdkProxy = new JDKDynamicProxy(sb);
		jdkProxy.invoke(jdkProxy.getProxy(), sb.getClass().getDeclaredMethod("doSomeThing"), args);		
		
	}

}













