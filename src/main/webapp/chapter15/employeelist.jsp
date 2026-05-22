<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<%@ page import="bean.Employee" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="employeelist" method="get">

<input type="submit" value="従業員の一覧">

</form>

<%
List<Employee> list =
(List<Employee>)request.getAttribute("list");

if(list != null){

	for(Employee e : list){
%>

<p>
<%= e.getId() %>
:
<%= e.getName() %>
:
<%= e.getAge() %>
</p>

<%
	}
}
%>

</body>
</html>