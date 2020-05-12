package com.eastall.work.springTest.proxy.jdkProxy;

import org.junit.Test;

public class TestJDK {

	@Test
	public void demo1() {
		UserService userService = MyBeanFactory.createUserService();
		userService.addUser();
		userService.deleteUser();
		
	}
}
