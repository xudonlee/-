package com.itzl.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itzl.pojo.FenYe;
import com.itzl.pojo.News;
import com.itzl.pojo.Query;
import com.itzl.service.NewsService;
import com.itzl.service.impl.NewsServiceImpl;


/**
 * Servlet implementation class NewsListServlet
 */
@WebServlet("/newsListServlet.do")
public class NewsListServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
  		Query query= (Query) getObjectByIOC(Query.class);
  		String qNewsTitle = request.getParameter("qNewsTitle");
  		if(qNewsTitle==null){
  			qNewsTitle="";
  		}
  		
  		String qNewsDateStart = request.getParameter("qNewsDateStart");
  		String qNewsDateEnd = request.getParameter("qNewsDateEnd");
  		query.setqNewsTitle(qNewsTitle);
  		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  		try {

  	  		if(qNewsDateStart!=null&&!"".equals(qNewsDateStart)){
  	  			query.setqNewsDateStart(sdf.parse(qNewsDateStart));
  	  			
  	  		}else{
  	  			qNewsDateStart="";
  	  		}
  	  		if(qNewsDateEnd!=null && !"".equals(qNewsDateEnd)){
  	  			query.setqNewsDateEnd(sdf.parse(qNewsDateEnd));
  	  		}
  	  		else{
  	  			qNewsDateEnd="";
  	  		}
		} catch (Exception e) {
			e.printStackTrace();
		}
  		
  		
  		FenYe fy = (FenYe) getObjectByIOC(FenYe.class);
  		String pg = request.getParameter("pg");
		NewsService ns = (NewsService) getObjectByIOC(NewsServiceImpl.class);
		List<News> news = ns.queryNewsByFy(fy, query, pg);
		
		request.setAttribute("news", news);
		request.setAttribute("fy", fy);
		
		
		request.getRequestDispatcher("News.jsp").forward(request, response);
	}

}
