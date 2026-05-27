<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ツイート一覧</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

	<div class="container">
		<h1>ツイート一覧</h1>
		<%-- 新規投稿 --%>
		<p>
			<a href="new_tweet.jsp">新規投稿</a>
		</p>

		<%-- ツイート一覧の表示 --%>
		<ul class="tweet-list">
			<li>
				<div class="tweet-content">
					<p>
						<c:forEach var="t" items="${tweets}">
						
						
							<br>
							<h2>
								${t.content}
							</h2>
							<br>
							<p>
								投稿者:
								${t.author}
							</p>
							<p>
								投稿日時:
								${t.postedAt}
							</p>
							
							
						</c:forEach>
					</p>
					<!-- <p class="tweet-info">投稿者: author - 投稿日時: posted_at</p> -->
				</div>
			</li>
		</ul>
	</div>
</body>
</html>
