<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>시슴!</h1>
	<hr>
	<form action="/kh/member/login.kh" method="post">
		<fieldset>
			<legend>로그인</legend>
			아이디 : <input type="text" name="memberId"><br>
			비밀번호 : <input type="password" name="memberPw"><br>
			<input type="submit" value="로그인">
		</fieldset>
	</form>
</body>
</html>