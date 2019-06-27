<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
		.top{
			position:absolute;
			 top:0px;
			 left:0px;
			 width:100%;
			 height:20%;
			 border: 1px solid;
			}
		.left{
			 position:absolute;
			 top:20%;
			 left:0px;
			 width:20%;
			 height:100%;
			 border: 1px solid;
			 }
		.right{ 
			 position:absolute;
			 top:20%;
			 left:20%;
			 width:80%;
			 height:100%;
			 border: 1px solid;
		}
	</style>
  </head>
  <body>
  	<div class="par">
  		<div class="top" align="center">
	 		<h1>欢迎${loginUser.userName }登录&nbsp;&nbsp;<a href="userlogin.jsp" style="color: red;font-size: 16px; text-decoration: none;">退出系统</a></h1>
  		</div>
    	<div class="left">
    		<ul>
    			<c:forEach items="${loginUser.role.powers }" var="p">
    				<li><a href="${p.url }" target="right">${p.powerName }</a></li><p>
    			</c:forEach>
    		</ul>
    	</div>
    	<div class="right">
    		<iframe name="right"  frameborder="0"  height="100%" width="100%">
    		</iframe>
    	</div>
    </div>
  </body>
</html>
