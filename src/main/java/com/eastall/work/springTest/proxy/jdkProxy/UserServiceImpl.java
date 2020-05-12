package com.eastall.work.springTest.proxy.jdkProxy;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

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
