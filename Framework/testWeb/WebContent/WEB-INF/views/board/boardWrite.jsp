<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 작성</h2>
	<hr>
	<form action="/boardWrite" method="post">
		제목 : <input type="text" name="boardTitle"><br>
		작성자 : <input type="text" name="boardWriter" value="${sessionScope.member.memberId }" readonly><br>
		내용 : <textarea rows="5" cols="20" name="boardContent"></textarea><br>
		<input type="submit" value="등록">
	</form>
</body>
</html>