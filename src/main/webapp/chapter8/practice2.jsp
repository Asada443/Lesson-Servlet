<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
 String message = request.getParameter("message");
 out.print(message);
 %> 

<%-- <% 
String numStr=request.getParameter("num");
int num=Integer.parseInt(numStr);
out.println(num*2);
%> --%>
</body>
</html>