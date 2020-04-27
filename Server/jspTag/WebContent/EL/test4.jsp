<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>배열처리</h1>
	<h3>첫번째 회원</h3>
	아이디 : ${list[0].id }<br>
	비밀번호 : ${list[0].pw }<br>
	이름 : ${list[0].name }
	<h3>두번째 회원</h3>
	아이디 : ${list[1].id }<br>
	비밀번호 : ${list[1].pw }<br>
	이름 : ${list[1].name }
</body>
</html>