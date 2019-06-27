package com.itzl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itzl.dao.StudentDao;
import com.itzl.pojo.Student;
import com.itzl.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sd;
	@Override
	public Student login(Student stu) {
		System.out.println("SERVICE登录成功");
		
		return sd.login(stu);
	}

}
