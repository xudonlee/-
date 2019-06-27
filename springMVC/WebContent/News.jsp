<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  </head>
  <body>
 		<p>这是新闻页面</p>
 		<form action="scope/news" method="post">
			<input type="hidden" name="_method" value="delete"/>
		<input type="checkbox" name="ids" value="1" />1
		<input type="checkbox" name="ids" value="2"/>2
		<input type="checkbox" name="ids" value="3"/>3
		<input type="submit" value="删除"/>
		</form>
		
		<form action="scope/news" method="post">
		<input type="hidden" name="_method" value="put"/>
		<input type="submit" value="添加"/>
		</form>
		
		<form action="scope/news/12" method="post">
		<input type="hidden" name="_method" value="put"/>
		<input type="submit" value="修改"/>
		</form>
 		
  </body>
</html>
