package com.itzl.service;

import com.itzl.pojo.User;

public interface UserService {
	public User loginUser(User user);
	public User getName(String name);
	public int registere(User user);
}
