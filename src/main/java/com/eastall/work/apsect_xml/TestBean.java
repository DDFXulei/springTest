package com.eastall.work.apsect_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	@Test
	public void demo1() {
		
		String path = "com/eastall/work/apsect_xml/bean.xml";		
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		//获取代理类
		UserService userService = (UserService) app.getBean("userServiceId");
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
		
	}
}
