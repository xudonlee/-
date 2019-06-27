package com.itzl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itzl.service.PersonService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring*.xml");
		PersonService ps = app.getBean(PersonService.class);
		ps.zhuanZhang();
	}

}
