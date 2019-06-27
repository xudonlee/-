package com.itzl.dao;

import java.util.List;

import com.itzl.pojo.Books;
import com.itzl.pojo.FenYe;
import com.itzl.pojo.Query;

public interface BooksDao {
	public int deleteBooks(int id);
	public int addToBooks(Books books);
    public int updateBooks(Books books);
    public Books queryBookById(int id);
    public List<Books> queryBookByFy(FenYe fy);
    public int queryRowsCount(Query query);
  
}
