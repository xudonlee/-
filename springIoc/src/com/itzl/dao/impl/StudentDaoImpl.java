package com.itzl.dao.impl;

import org.springframework.stereotype.Repository;

import com.itzl.dao.StudentDao;
import com.itzl.pojo.Student;
@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public Student login(Student stu) {
		System.out.println("DAO登录成功");
		return new Student();
	}

	@Override
	public String getName() {
		
		return null;
	}

}
