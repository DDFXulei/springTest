package com.eastall.work.springTest.proxy;

public class RealSubject implements Subject {

	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("RealSubject do something...");
	}

}
