package com.eastall.work.apsect_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类，含有多个通知
 * @author admin
 *
 */
public class MyAspect {
	//前置通知
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知："+joinPoint.getSignature().getName());
	}
	
	//后置通知
	public void myAfter(JoinPoint joinPoint,Object ret) {
		System.out.println("后置通知："+joinPoint.getSignature().getName()+" 返回值："+ret);
	}
	
	//环绕通知 返回类型必须是Object
	public Object myArroud(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("前置");
		Object obj = jp.proceed();	
		System.out.println("后置,方法返回值："+obj);
		return obj;
	}
	
	//抛出异常
	public void myAfterThrowing(JoinPoint jp, Throwable e) {
		System.out.println(e.getMessage());
	}
	
	//最终通知
	public void myAfter2() {
		System.out.println("最终通知");
	}
	
}
