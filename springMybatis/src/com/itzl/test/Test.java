package com.itzl.test;

import com.itzl.pojo.User;
import com.itzl.service.UserService;
import com.itzl.service.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		UserService us=new UserServiceImpl();
		User u=new User();
		u.setUserName("张三");
		u.setPwd("e10adc3949ba59abbe56e057f20f883e");
		u=us.loginUser(u);
		System.out.println(u);
	}

}
