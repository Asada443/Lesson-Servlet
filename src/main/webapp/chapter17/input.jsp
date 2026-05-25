<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%String name=(String)session.getAttribute("name");

if(name==null){
	name="";
}

%>

<form action="nameInput" method="post">



名前:
<input type="text" name="name" value="<%= name %>">
<input type="submit" value="送信">


</form>

</body>
</html>