package com.itzl.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FenYe {
	private Integer page;
	private Integer rows=3;
	private Integer rowsCount;//总行数
	private Integer pageCount;//总页数
	private Integer startRows;
	private Integer endRows;
	private Query query;
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getRowsCount() {
		return rowsCount;
	}
	public void setRowsCount(Integer rowsCount) {
		this.rowsCount = rowsCount;
	}
	public Integer getPageCount() {
		if(getRowsCount()%getRows()==0) {
			pageCount=getRowsCount()/getRows();
		}else {
			pageCount=getRowsCount()/getRows()+1;
		}
		
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getStartRows() {
		
		startRows=(getPage()-1)*getRows();
		return startRows;
	}
	public void setStartRows(Integer startRows) {
		this.startRows = startRows;
	}
	public Integer getEndRows() {
		
		endRows=getPage()*getRows();
		return endRows;
	}
	public void setEndRows(Integer endRows) {
		this.endRows = endRows;
	}
	public Query getQuery() {
		return query;
	}
	public void setQuery(Query query) {
		this.query = query;
	}
	
	
	

}
