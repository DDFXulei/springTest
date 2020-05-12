package com.eastall.work.aspect_anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类，含有多个通知
 * @author admin
 *
 */
@Component
@Aspect
public class MyAspect {
	//切入点当前有效
	//@Before("execution(* com.eastall.work.aspect_anno.UserServiceImpl.*(..))")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("anno_前置通知："+joinPoint.getSignature().getName());
	}
	
	//声明公共切入点
	@Pointcut("execution(* com.eastall.work.aspect_anno.UserServiceImpl.*(..))")
	private void myPointCut() {
		
	}
	
	//后置通知
	@AfterReturning(value = "myPointCut()",returning = "ret")
	public void myAfter(JoinPoint joinPoint,Object ret) {
		System.out.println("anno_后置通知："+joinPoint.getSignature().getName()+" 返回值："+ret);
	}
	
	//环绕通知 返回类型必须是Object
	@Around("myPointCut()")
	public Object myArroud(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("anno_环绕_前置");
		Object obj = jp.proceed();	
		System.out.println("anno_环绕_后置,方法返回值："+obj);
		return obj;
	}
	
	@AfterThrowing(value = "myPointCut()",throwing = "e")
	//抛出异常
	public void myAfterThrowing(JoinPoint jp, Throwable e) {
		System.out.println(e.getMessage());
	}
	
	@After("myPointCut()")
	//最终通知
	public void myAfter2() {
		System.out.println("anno_最终通知");
	}
	
}
