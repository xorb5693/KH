<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	label {
		display: inline-block;
		width: 90px;
	}
</style>
</head>
<body>
	<form action="/login" method="post">
		<label for="memberId">아이디 : </label><input type="text" name="memberId" id="memberId"><br>
		<label for="memberPw">비밀번호 : </label><input type="password" name="memberPw" id="memberPw"><br>
		<input type="submit" value="로그인"><br>
		<a href="/joinFrm">회원가입</a>
	</form>
</body>
</html>