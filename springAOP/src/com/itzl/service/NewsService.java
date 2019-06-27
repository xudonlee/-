package com.itzl.service;

import java.util.List;


public interface NewsService {
	/* 分页查询 */
	public int queryNewsByFy();
	/*
	 * 
	 * 删除操作
	 * 
	 */
	public int deleteNewsById(String[] ids);
	/*
	 * 增加操作
	 * */
	public int addNews();
	/*
	 * 根据ID查询
	 * */

	
	/**
	 * 根据新闻主键修改
	 */
	
	public int updateNewsById();
}
