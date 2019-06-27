package com.itzl.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Before("execution(* com.itzl.service..add*(..))")
	public void before() {
		System.out.println("方法开始");
	}
	
	@After("execution(* com.itzl.service..*.*(..))")
	public void after() {
		System.out.println("方法结束");
	}
	
}
