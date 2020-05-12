package com.eastall.work.aspect_anno;

import org.springframework.stereotype.Service;

@Service("userServiceId")
public class UserServiceImpl implements UserService{

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("apsect_xml 添加一个用户");
		
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
//		int i = 1/0;
		System.out.println("apsect_xml 删除一个用户");
	}

	@Override
	public String updateUser() {
		// TODO Auto-generated method stub
		return "hello,world";
	}



}
