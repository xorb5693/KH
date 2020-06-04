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
	<form action="/noticeModify.do" method="post" enctype="multipart/form-data">
		<input type="hidden" name="noticeNo" value="${notice.ntocieNo }">
		제목 : <input type="text" name="noticeTitle" value="${notice.noticeTitle }"><br>
		작성자 : <input type="text" name="noticeWriter" value="${sessionScope.member.memberId }" readonly><br>
		첨부파일 : <input type="file" name="file"><br>
		내용 : <textarea rows="5" cols="20" name="noticeContent"></textarea><br>
		<input type="submit" value="글쓰기">
	</form>
</body>
</html>