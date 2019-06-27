package com.itzl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itzl.dao.BookTypeDao;
import com.itzl.pojo.BookType;
import com.itzl.service.BookTypeService;
@Service
public class BookTypeServiceImpl implements BookTypeService {
@Autowired
private BookTypeDao btd;
	@Override
	public BookType queryBookType() {
		
		return btd.queryBookType();
	}

}
