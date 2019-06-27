package com.itzl.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itzl.pojo.User;
import com.itzl.service.UserService;
import com.itzl.service.impl.UserServiceImpl;
import com.itzl.util.MD5;


@WebServlet("/loginServlet.do")
public class LoginServlet extends BaseServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String name = req.getParameter("username");
			String pwd = req.getParameter("password");
			String isno = req.getParameter("isno");
			
			User us = (User) getObjectByIOC(User.class);
			if (name!=null&&!"".equals(name)&&pwd!=null&&!"".equals(pwd)) {
				us.setUserName(name);
				if (pwd.length()<32) {
					us.setPwd(MD5.GetMD5Code(pwd));
				}else {
					us.setPwd(pwd);
				}
			}
			UserService ud = (UserService) getObjectByIOC(UserServiceImpl.class);
			
			us=ud.loginUser(us);
			
			
			
			if(us!=null){
				HttpSession session=req.getSession();
				session.setAttribute("loginUser",us);
				if("yse".equals(isno)){
					Cookie names = new Cookie("username",URLEncoder.encode(us.getUserName(), "utf-8"));
					Cookie pwds = new Cookie("password",us.getPwd());
					//设置存储路径
					names.setPath("/springMybatis");
					pwds.setPath("/springMybatis");
					//设置保存时长
					names.setMaxAge(24*3600);
					pwds.setMaxAge(24*3600);
					//把cookie发送给客户端
					resp.addCookie(names);
					resp.addCookie(pwds);
				}
				//请求转发
				resp.sendRedirect("userMap.jsp");
			}else{
				resp.sendRedirect("userlogin.jsp?error="+URLEncoder.encode("用户名或者密码错误","utf-8"));
			}
		
		
		
	}

	
}
