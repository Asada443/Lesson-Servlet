<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="post"  method="post">

<p>名前</p>
<p><textarea  name="name" rows="5" cols="25"></textarea>
<p>本文</p>
<p><textarea  name="mainText" rows="5" cols="25"></textarea>

<p><input type="submit" value="投稿"></p>
</form>

<h2>投稿一覧</h2>

<%
try{

	InitialContext ic =
			new InitialContext();

	DataSource ds =
			(DataSource)ic.lookup(
			"java:comp/env/jdbc/book");

	Connection con =
			ds.getConnection();

	PreparedStatement st =
			con.prepareStatement(
			"select * from posts order by id desc");

	ResultSet rs =
			st.executeQuery();

	while(rs.next()){
%>

<p>名前：
<%= rs.getString("name") %>
</p>

<p>本文：
<%= rs.getString("content") %>
</p>

<p>
<%= rs.getTimestamp("post_date") %>
</p>

<hr>

<%
	}

	rs.close();
	st.close();
	con.close();

}catch(Exception e){

	e.printStackTrace();
}
%>

</body>
</html>