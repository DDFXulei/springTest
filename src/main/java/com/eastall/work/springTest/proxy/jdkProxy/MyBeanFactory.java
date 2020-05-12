package com.eastall.work.springTest.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {

	public static UserService createUserService() {
		
		//1、目标类
		final UserService userService = new UserServiceImpl();
		
		//2、切面类
		final MyAspect myAspect = new MyAspect();
		
		/*
		 * 3、代理类：将目标类（切入点）与切面类（通知）结合
		 * Proxy.newProxyInstance
		 * 参数1：loader，类加载器，	动态代理类  在运行时创建，任何类都需要类加载器将其加载到内存中
		 * 		一般情况下	类.class.getClassLoader()
		 * 					目标类实例.getClass().getClassLoader()
		 * 参数2：interfaces 代理类需要实现的全部接口
		 * 		方式1：目标类实例.getClass().getInterfaces();  注意只能得到自己的接口，不能获得父元素接口
		 * 		方式2：new Class[]{UserService.class}
		 * 		例如：jdbc驱动 -->	DriverManager 获得接口Connection	
		 * 
		 * 参数3：InvocationHandler	处理类，接口，必须进行实现类，一般采用匿名内部类
		 * 		提供invoke()方法	，代理类的每一个方法执行时，都会调用一次invoke
		 * 		参数3-1：Object proxy：代理对象
		 * 		参数3-2：Method method：代理对象当前执行的方法的描述对象（反射）
		 * 				执行方法名：method.getName()
		 *  			执行方法：method.invoke(对象，实际参数)
		 * 		参数3-3：Object[] args：方法实际参数	
		 * 
		 * 
		 */
		UserService proxyUserService = (UserService)Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), 
				new Class[] {UserService.class}, 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						//前方法
						myAspect.before();
						
						//执行目标类方法
						Object obj = method.invoke(userService, args);
						
						//后方法
						myAspect.after();
						
						return obj;
					}
				});
		
		
		
		
		return proxyUserService;
	}
}
