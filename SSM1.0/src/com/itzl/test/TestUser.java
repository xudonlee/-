package com.itzl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itzl.pojo.User;
import com.itzl.service.UserService;

public class TestUser {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:springIOC.xml");
		UserService us = (UserService) app.getBean("userServiceImpl");
		User u=app.getBean(User.class);
		u.setName("张三");
		u.setPwd("e10adc3949ba59abbe56e057f20f883e");
		u=us.loginUser(u);
		System.out.println(u);
	}

}
