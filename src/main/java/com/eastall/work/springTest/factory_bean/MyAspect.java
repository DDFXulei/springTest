package com.eastall.work.springTest.factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 
 * 切面类中确定通知，需要实现不同的接口，接口就是规范，从而就确定方法名称。
 * 采用环绕通知，必须手动执行目标方法
 * @author 33759
 *
 */
public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation)  {

		System.out.println("方法环绕");
		Object obj = null;
		try {
			obj = invocation.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("方法环绕后");
		return obj;
	}
}
