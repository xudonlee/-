package com.itzl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itzl.service.NewsService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:Spring*.xml");
		NewsService ns = app.getBean(NewsService.class); 
		ns.addNews();

	}
}
