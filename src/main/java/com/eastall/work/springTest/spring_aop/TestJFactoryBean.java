package com.eastall.work.springTest.spring_aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJFactoryBean {

	@Test
	public void demo1() {
		
		String path = "com/eastall/work/springTest/spring_aop/bean.xml";		
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		//获取代理类
		UserService userService = (UserService) app.getBean("userServiceId");
		userService.addUser();
		userService.deleteUser();
		
	}
}
