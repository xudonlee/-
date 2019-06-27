package com.itzl.dao;

import java.util.List;

import com.itzl.pojo.FenYe;
import com.itzl.pojo.News;
import com.itzl.pojo.Query;

public interface NewsDao {

	
	public int deleteNews(int id);
	public int addToNews(News news);
    public int updateNews(News news);
    public News queryNewsById(int id);
    //public List<News> queryNewsByLike(Query query);
    
	/*
	 * 
	 * 分页查询的方法
	 * 
	 */
    public List<News> queryNewsByFy(FenYe fy);
    public int queryRowsCount(Query query);
}
