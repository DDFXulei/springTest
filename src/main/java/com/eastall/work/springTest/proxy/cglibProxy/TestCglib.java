package com.eastall.work.springTest.proxy.cglibProxy;

import org.junit.Test;

public class TestCglib {

	@Test
	public void demo1() {
		UserServiceImpl userService = MyBeanFactory.createUserService();
		userService.addUser();
		userService.deleteUser();
		
	}
}
