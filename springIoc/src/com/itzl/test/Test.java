package com.itzl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itzl.pojo.Student;
import com.itzl.service.StudentService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:springIoc.xml");
		StudentService ss = (StudentService) app.getBean("studentServiceImpl");
		ss.login(null);
	}
}
