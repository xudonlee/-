package com.itzl.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itzl.pojo.User;
import com.itzl.service.UserService;
import com.itzl.service.impl.UserServiceImpl;

/**
 * Servlet implementation class RegistereServlet
 */
@WebServlet("/registereServlet.do")
public class RegistereServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		User us = (User) getObjectByIOC(User.class);
		UserService ud = (UserService) getObjectByIOC(UserServiceImpl.class);
		if (ud.getUserName(name)==null) {
			us.setUserName(name);
			us.setPwd(pwd);
			ud.registered(us);
			response.sendRedirect("loginServlet.do");
		}else {
			response.sendRedirect("registered.jsp?error="+URLEncoder.encode("用户名已被使用","utf-8"));
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
