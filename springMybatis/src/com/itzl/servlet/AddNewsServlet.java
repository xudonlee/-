package com.itzl.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.itzl.pojo.News;
import com.itzl.service.FileUploadService;
import com.itzl.service.NewsService;
import com.itzl.service.impl.FileUploadServiceImpl;
import com.itzl.service.impl.NewsServiceImpl;


/**
 * Servlet implementation class AddNewsServlet
 */
@WebServlet("/addNewsServlet.do")
public class AddNewsServlet extends BaseServlet {
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
		
		
		DiskFileItemFactory dff=new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(dff);
		try {
			List<FileItem> fs = sfu.parseRequest(request);
			FileUploadService fus = new FileUploadServiceImpl();
			NewsService ns = new NewsServiceImpl();
			News n = fus.newsUpload(fs);
  			int flag = ns.addNews(n);
  			if(flag>0){
  				response.sendRedirect("newsListServlet.do");
  			}else{
  				response.sendRedirect("addNews.jsp?error="+URLEncoder.encode("添加失败", "UTF-8"));
  			}
			
		} catch (FileUploadException e) {
			
			e.printStackTrace();
		}
	}

}
