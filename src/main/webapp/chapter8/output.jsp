<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@page errorPage="errors.jsp" %>

<% 
String username=request.getParameter("user");

String age=request.getParameter("age");
int num=Integer.parseInt(age);
%>

<% if(username== null || username.isEmpty() || age==null || age.isEmpty()){
	throw new Exception("ユーザー名または年齢が未入力です。");
}
%>

<%="ユーザー名:"+username %>
<br>
<%="年齢:"+num %>
</body>
</html>