<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>게시글 번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:forEach items="${list }" var="n">
			<tr>
				<td>${n.noticeNo }</td>
				<td><a href="/noticeRead.do?noticeNo=${n.noticeNo}">${n.noticeTitle }</a></td>
				<td>${n.noticeWriter }</td>
				<td>${n.regDate }</td>
			</tr>
		</c:forEach>
	</table>
	<div class="pageNavi">
		<div>
			${pageNavi }
		</div>
	</div>
</body>
</html>