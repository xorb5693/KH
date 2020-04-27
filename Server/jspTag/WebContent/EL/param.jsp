<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/EL/test7.jsp" method="post">
		아이디<input type="text" name="id"><br>
		관심있는 스포츠 선택<br>
		축구<input type="checkbox" name="sports" value="축구">
		야구<input type="checkbox" name="sports" value="야구">
		농구<input type="checkbox" name="sports" value="농구">
		족구<input type="checkbox" name="sports" value="족구">
		<br>
		<input type="submit" value="확인">
	</form>
</body>
</html>