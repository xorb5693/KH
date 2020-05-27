<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 수정</h2>
	<hr>
	<form action="/updateBoard" method="post">
		<input type="hidden" name="boardNo" value="${b.boardNo }">
		<table border="1">
		<tr>
			<th>제목</th>
			<td><input type="text" name="boardTitle" value="${b.boardTitle }"></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${b.boardWriter }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="5" cols="20" name="boardContent">${b.boardContent }</textarea></td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="등록">
			</th>
		</tr>
		</table>
	</form>
</body>
</html>