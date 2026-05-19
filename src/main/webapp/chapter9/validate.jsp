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
String username=request.getParameter("username");

if(username==null || username.isEmpty()){
	request.getRequestDispatcher("error.jsp")
	.forward(request,response);
}else if(username.equals("admin")){
	response.sendRedirect("admin.jsp");
}
else {
	request.getRequestDispatcher("home.jsp")
	.forward(request,response);
}




%>

</body>
</html>