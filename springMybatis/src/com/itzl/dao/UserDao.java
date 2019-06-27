package com.itzl.dao;

import com.itzl.pojo.User;

public interface UserDao {
	public User loginUser(User user);
	public User getUserName(String name);
	public int registered(User user);
	
}
