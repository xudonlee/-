package com.itzl.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class BaseServlet extends HttpServlet{
	private ApplicationContext app;
	@Override
	public void init() throws ServletException {
		app=WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
	}
	public Object getObjectByIOC(Class c) {
		return app.getBean(c);
	}

}
