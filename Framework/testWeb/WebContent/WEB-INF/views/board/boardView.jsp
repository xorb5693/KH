<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시판</h2>
	<hr>
	<table>
		<tr>
			<th>제목</th>
			<td>${b.boardTitle }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${b.boardWriter }</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${b.readCount }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${b.contentBr }</td>
		</tr>
		<tr>
			<th colspan="2">
				<a href="/boardUpdateFrm?boardNo=${b.boardNo }">수정</a>
				<a href="/boardDelete?boardNo=${b.boardNo }">삭제</a>
			</th>
		</tr>
	</table>
</body>
</html>