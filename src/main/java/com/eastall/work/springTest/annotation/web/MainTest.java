package com.eastall.work.springTest.annotation.web;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	@Test
	public void test1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String path = new String("com/eastall/work/springTest/annotation/web/bean.xml");
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		StudentAction studentAction = app.getBean("studentActionId", StudentAction.class);
		studentAction.execute();
//		app.getClass().getMethod("close").invoke(app);
		
	}
}
