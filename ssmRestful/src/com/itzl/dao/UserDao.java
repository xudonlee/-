package com.itzl.dao;

import com.itzl.pojo.User;

public interface UserDao {
	public User loginUser(User user);
	public User getName(String name);
	public int registere(User user);
	
}
