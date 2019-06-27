package com.itzl.service.impl;


import org.springframework.stereotype.Service;

import com.itzl.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {

	@Override
	public int queryNewsByFy() {
		System.out.println("分页查询");
		return 0;
	}

	@Override
	public int deleteNewsById(String[] ids) {
		System.out.println("删除成功");
		return 0;
	}

	@Override
	public int addNews() {
		System.out.println("添加成功");
		return 0;
	}

	@Override
	public int updateNewsById() {
		System.out.println("更新成功");
		return 0;
	}
	
	

}
