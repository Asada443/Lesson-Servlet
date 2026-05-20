<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>


	<form action="contact" method="post">
	
		<p>氏名*</p>
		<input type="text" name="name">
		<p>会社</p>
		<input type="text" name="company">
		<p>メールアドレス*</p>
		<input type="text" name="mailAddress">

		<p>お問い合わせ内容*</p>
		<p>
			<textarea name="review" rows="5" cols="30"></textarea>
		</p>

		<p>メルマガ種類</p>
		<p>
			<input type="checkbox" name="magazine" value="総合案内">総合案内
		</p>
		<p>
			<input type="checkbox" name="magazine" value="セミナー案内">セミナー案内
		</p>
		<p>
			<input type="checkbox" name="magazine" value="求人採用案内">求人採用案内
		</p>

		<p>資料請求希望</p>
		<p>
			<input type="radio" name="book" value="yes">YES
		</p>
		<p>
			<input type="radio" name="book" value="no">NO
		</p>
		
		<input type="submit" value="送信">
		
	</form>

</body>
</html>