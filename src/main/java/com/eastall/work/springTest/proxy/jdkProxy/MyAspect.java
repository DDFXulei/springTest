package com.eastall.work.springTest.proxy.jdkProxy;

public class MyAspect {

	public void before() {
		System.out.println("前方法");
	}
	
	public void after() {
		System.out.println("后方法");
	}
}
