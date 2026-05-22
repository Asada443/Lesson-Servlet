<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.List" %>
<%@ page import="bean.Product" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="/Servlet/chapter15/sort2?order=asc">価格が安い順</a>
<a href="/Servlet/chapter15/sort2?order=desc">価格が高い順</a>

<% 

List<Product>list=(List<Product>)request.getAttribute("list");

if(list!=null){
	
	for(Product p:list){
	
	%>
	
<p>
<%=p.getId() %>	
<%=p.getName() %>
<%=p.getPrice() %>
</p>

<%
	}
	
}
%>

</body>
</html>