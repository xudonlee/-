package com.itzl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itzl.dao.UserDao;
import com.itzl.pojo.User;
import com.itzl.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao ud;
	@Override
	public User loginUser(User user) {
		
		
		return ud.loginUser(user);
		
	}

	@Override
	public User registered(User user) {
		
		return null;
	}

}
