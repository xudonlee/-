package com.itzl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itzl.pojo.News;
import com.itzl.service.NewsService;
import com.itzl.service.impl.NewsServiceImpl;



/**
 * Servlet implementation class ReturnUpdateNewsServlet
 */
@WebServlet("/returnUpdateNewsServlet.do")
public class ReturnUpdateNewsServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("ids");
		
		NewsService ns = (NewsService) getObjectByIOC(NewsServiceImpl.class);
		News n = ns.queryNewsById(new Integer(id));
		request.setAttribute("n", n);
		request.getRequestDispatcher("updateNews.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
