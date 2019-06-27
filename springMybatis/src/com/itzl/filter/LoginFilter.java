package com.itzl.filter;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itzl.pojo.User;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) arg0;
		HttpServletResponse resp=(HttpServletResponse) arg1;
		HttpSession session=req.getSession();
		String reqPath = req.getServletPath();
		User loginUser = (User) session.getAttribute("loginUser");
		
		if (loginUser!=null||"/userlogin.jsp".equals(reqPath)||"/loginServlet.do".equals(reqPath)) {
			arg2.doFilter(req,resp);
		}else {
			String basePath = req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+req.getContextPath()+"/";
			resp.sendRedirect(basePath+"userlogin.jsp?error="+URLEncoder.encode("非法请求,请先登录!","utf-8"));
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
