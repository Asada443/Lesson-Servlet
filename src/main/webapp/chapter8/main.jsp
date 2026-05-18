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

request.setAttribute("name", "John");
RequestDispatcher rd = request.getRequestDispatcher("sub.jsp");
rd.forward(request, response);
out.print("Hello, ");



%>

</body>
</html>