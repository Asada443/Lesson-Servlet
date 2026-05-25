<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<%@ page import="bean.Favorite" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="favorite" method="post">


<p>お気に入り登録</p>

名前:
<input type="text" name="name">
URL:
<input type="text" name="url">
<input type="submit" name="action" value="追加">

</form>

<hr>

<form action="clear" method="post">

<p>登録一覧</p>
<input type="submit" name="action" value="クリア">

</form>

<hr>


<%List<Favorite>list=(List<Favorite>)session.getAttribute("favoriteList");

if(list!=null){
	for(Favorite f: list){

 %>
 
 <p>
 
 <a href="<%=f.getUrl() %>">
 
 <%=f.getName() %>
 
 </a>
 
 </p>
 
 <%
	}
}
 %>

</body>
</html>