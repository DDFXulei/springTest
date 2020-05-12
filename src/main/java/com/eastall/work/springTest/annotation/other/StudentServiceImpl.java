package com.eastall.work.springTest.annotation.other;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("studentServiceId")
@Scope("prototype")
public class StudentServiceImpl implements StudentService {


	@Override
	public void addStudent() {

		System.out.println("service");
	}

	@PostConstruct
	public void init() {
		System.out.println("annotation IoC 初始化方法");
	}
	
	@Deprecated
	public void destroy() {
		System.out.println("annotation IoC 销毁方法");
	}
}
