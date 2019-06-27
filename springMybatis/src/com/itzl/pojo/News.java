package com.itzl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class News {
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNewId() {
		return newId;
	}
	public void setNewId(Integer newId) {
		this.newId = newId;
	}
	public String getNewTitle() {
		return newTitle;
	}
	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}
	public String getNewEditor() {
		return newEditor;
	}
	public void setNewEditor(String newEditor) {
		this.newEditor = newEditor;
	}
	public String getNewContext() {
		return newContext;
	}
	public void setNewContext(String newContext) {
		this.newContext = newContext;
	}
	public String getNewPic() {
		return newPic;
	}
	public void setNewPic(String newPic) {
		this.newPic = newPic;
	}
	public Date getNewDate() {
		return newDate;
	}
	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}
	private Integer newId;
	private String newTitle;
	private String newEditor;
	private String newContext;
	private String newPic;
	private Date newDate;
	
	
}
