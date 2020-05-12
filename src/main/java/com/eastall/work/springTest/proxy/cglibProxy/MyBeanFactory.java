package com.eastall.work.springTest.proxy.cglibProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyBeanFactory {

	public static UserServiceImpl createUserService() {
		
		//1、目标类
		final UserServiceImpl userService = new UserServiceImpl();
		
		//2、切面类
		final MyAspect myAspect = new MyAspect();
		
		//3、代理类
		
		
		//3.1核心类
		Enhancer enhancer = new Enhancer();
		
		//3.2确定父类
		enhancer.setSuperclass(userService.getClass());
		
		//3.3设置回调函数,MethodInterceptor接口等效于 jdk的InvocationHandler接口
		//3.3.1 intercept等效于jdk invoke()
		//	参数1、参数2、参数3 与invoke()一样
		
		
		enhancer.setCallback(
				new MethodInterceptor() {
					
					@Override
					public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

						myAspect.before();
						
						Object obj = method.invoke(userService, args);
						//执行代理类的父类，执行目标类（目标类和代理类 父子关系）
						methodProxy.invokeSuper(proxy, args);
						
						myAspect.after();
						
						return obj;
					}
			
		});
		//3.4创建代理
		UserServiceImpl proxyService = (UserServiceImpl) enhancer.create();
		
		return proxyService;
		
	
	}
}
