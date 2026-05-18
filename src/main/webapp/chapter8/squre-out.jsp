<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@page errorPage="squre-error.jsp" %>

<%

String input =request.getParameter("user");
int num=Integer.parseInt(input);
int result =num*num;

%>

<%="入力した値:"+num %>
<%="結果:"+result %>
</body>
</html>