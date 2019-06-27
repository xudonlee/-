package com.itzl.service;

import java.util.List;

import com.itzl.pojo.FenYe;
import com.itzl.pojo.News;
import com.itzl.pojo.Query;

public interface NewsService {
	/* 分页查询 */
	public List<News> queryNewsByFy(FenYe fy,Query query,String pg);
	/*
	 * 
	 * 删除操作
	 * 
	 */
	public int deleteNewsById(String[] ids);
	/*
	 * 增加操作
	 * */
	public int addNews(News news);
	/*
	 * 根据ID查询
	 * */
	public News queryNewsById(int id);
	
	/**
	 * 根据新闻主键修改
	 */
	
	public int updateNewsById(News ns);
}
