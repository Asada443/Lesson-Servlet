<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="product" class="bean.Product"/>

<jsp:setProperty name="product" property="*" />

<h2>商品情報</h2>

<p>
商品ID :
<jsp:getProperty name="product" property="id"/>
</p>

<p>
商品名 :
<jsp:getProperty name="product" property="name"/>
</p>

<p>
価格 :
<jsp:getProperty name="product" property="price"/>
</p>

</body>
</html>