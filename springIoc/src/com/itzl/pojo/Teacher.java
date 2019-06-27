package com.itzl.pojo;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Teacher {
	private String name;
	private String age;
	private List<Student> students;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
