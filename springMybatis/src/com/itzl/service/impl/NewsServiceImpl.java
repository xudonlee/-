package com.itzl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itzl.service.NewsService;
import com.itzl.dao.NewsDao;
import com.itzl.pojo.FenYe;
import com.itzl.pojo.News;
import com.itzl.pojo.Query;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao nd;
	@Override
	public List<News> queryNewsByFy(FenYe fy, Query query, String pg) {
		
		fy.setRowsCount(nd.queryRowsCount(query));
  		
  	
  		if(pg==null||"".equals(pg)){
  			pg="1";
  		}
  		
  		
  		int pgn = new Integer(pg);
  		if(pgn<1){
  			pgn=1;
  		}
  		if(pgn>fy.getPageCount()&&fy.getPageCount()>0){
  			pgn=fy.getPageCount();
  		} 
  		fy.setPage(pgn);
  		fy.setQuery(query);
		
  		List<News> ns=nd.queryNewsByFy(fy);
  		
  		return ns;
	}
	@Override
	public int deleteNewsById(String[] ids) {
		
		
		int flag=1;
		try {
			for (String str : ids) {
				nd.deleteNews(new Integer(str));
				
				
			}
			
		} catch (Exception e) {
			 flag=0;
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public int addNews(News news) {
		
		int flag= nd.addToNews(news);
		 
		 return flag;
				 
	}
	@Override
	public News queryNewsById(int id) {
		
		
		News ns = nd.queryNewsById(id);
		
		return ns;
		
	}
	@Override
	public int updateNewsById(News ns) {
		
		int flag= nd.updateNews(ns);
		
		return flag;
	}

}
