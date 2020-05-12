package com.eastall.work.springTest.beanfactoryTest;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	@Test
	public void test1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String path = new String("com/eastall/work/springTest/beanfactoryTest/bean.xml");
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		UserService us = app.getBean("UserServiceId", UserServiceImpl.class);
		us.addUser();
//		app.getClass().getMethod("close").invoke(app);
		
	}
}
