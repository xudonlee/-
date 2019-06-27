package com.itzl.pojo;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class User implements HttpSessionListener{
	private Integer id;
	private Integer uId;
	private String userName;
	private Role role;
	private String pwd;
	
	
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		ServletContext sct = se.getSession().getServletContext();
		
		Integer onLineUser = (Integer) sct.getAttribute("onLineUser");
		if (null == onLineUser) {
			onLineUser = new Integer(1);
		}else {
			int count = onLineUser.intValue();
			onLineUser = new Integer(count+1);
		}
		sct.setAttribute("onLineUser", onLineUser);
		
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		ServletContext sct = se.getSession().getServletContext();
		Integer onLineUser = (Integer) sct.getAttribute("onLineUser");
		if (null == onLineUser) {
			onLineUser = new Integer(0);
		}else {
			int count = onLineUser.intValue();
			onLineUser = new Integer(count-1);
		}
		sct.setAttribute("onLineUser", onLineUser);
		
		//销毁session
		 HttpSession session = se.getSession();
		 session.invalidate();
		
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	

}
