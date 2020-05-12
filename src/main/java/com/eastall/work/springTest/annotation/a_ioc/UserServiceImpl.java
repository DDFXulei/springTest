package com.eastall.work.springTest.annotation.a_ioc;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

	public void init() {
		System.out.println("annotation IoC 初始化方法");
	}
	
	public void destroy() {
		System.out.println("annotation IoC 销毁方法");
	}
	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("annotation IoC 添加了一个用户");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("annotation IoC 删除了一个用户");
	}

}
