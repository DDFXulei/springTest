package com.eastall.work.springTest.beanfactoryTest;

public class UserServiceImpl implements UserService {

	public void init() {
		System.out.println("初始化方法");
	}
	
	public void destroy() {
		System.out.println("销毁方法");
	}
	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("添加了一个用户");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("删除了一个用户");
	}

}
