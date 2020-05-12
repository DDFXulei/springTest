package com.eastall.work.springTest.annotation.other;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	@Test
	public void test1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String path = new String("com/eastall/work/springTest/annotation/other/bean.xml");
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		StudentService studentService = app.getBean("studentServiceId", StudentService.class);
		StudentService studentService2 = app.getBean("studentServiceId", StudentService.class);
		System.out.println(studentService);
		System.out.println(studentService2);
//		app.getClass().getMethod("close").invoke(app);
		
	}
}
