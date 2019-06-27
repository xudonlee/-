<%@page import="com.itzl.pojo.News"%>

<%@page import="com.itzl.dao.NewsDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="<%=basePath%>/ckeditor/ckeditor.js"></script>
	<script type="text/javascript" src="<%=basePath%>/My97DatePicker/WdatePicker.js"></script>
  </head>
  <body>
  		
  		<font size="1" color="red">${URLDecoder.decode(param.error, 'utf-8') }</font><p>
  		<form action="updateNewsServlet.do" method="post" enctype="multipart/form-data">
  				<input type="hidden" name="id" value="${n.id }">
  			新闻编号:<input type="text" name="newsid" value="${n.newId }"/><p>
  			新闻标题:<input type="text" name="newstitle" value="${n.newTitle }"/><p>
  			新闻内容:<textarea rows="5" cols="25" name="context" class="ckeditor">${n.newContext}</textarea><p>
  			新闻作者:<input type="text" name="newseditor" value="${n.newEditor }"/><p>
  			新闻日期:<input type="text" name="newsdate" onclick="WdatePicker()" class="Wdate" readonly="readonly" value="${n.newDate }"/><p>
  			<img alt="" src="${n.newPic }"><p>
  			新闻图片:<input type="file" name="newspic"><p>
  			<input type="submit" value="确认修改"/>
  		</form>
  </body>
</html>
