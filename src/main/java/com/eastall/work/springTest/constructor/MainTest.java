package com.eastall.work.springTest.constructor;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	@Test
	public void test1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String path = new String("com/eastall/work/springTest/constructor/bean.xml");
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		User user = app.getBean("userId", User.class);
//		app.getClass().getMethod("close").invoke(app);
		System.out.println(user);
		
	}
}
