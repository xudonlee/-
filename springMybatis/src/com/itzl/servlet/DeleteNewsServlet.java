package com.itzl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itzl.service.NewsService;
import com.itzl.service.impl.NewsServiceImpl;



/**
 * Servlet implementation class DeleteNewsServlet
 */
@WebServlet("/deleteNewsServlet.do")
public class DeleteNewsServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] ids= request.getParameterValues("checkbox1");
		NewsService ns =  (NewsService) getObjectByIOC(NewsServiceImpl.class);
		ns.deleteNewsById(ids);
		response.sendRedirect("newsListServlet.do");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
