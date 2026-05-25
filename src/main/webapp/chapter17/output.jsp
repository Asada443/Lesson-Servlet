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
String name=(String)session.getAttribute("name") ;
%>



<p>
名前 :
<%="こんにちは！"+name+"さん"%>
</p>

<a href="input.jsp">
戻る
</a>

</body>
</html>