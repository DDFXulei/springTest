package com.eastall.work.springTest.collectionDI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	@Test
	public void Test1() {
		String path = "com/eastall/work/springTest/collectionDI/bean.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		CollData coll = app.getBean(CollData.class);
		System.out.println(coll);
	}
}
