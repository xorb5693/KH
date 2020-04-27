<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>내장객체 사용(request, session)</h1>
	넘어온 값1(request) : ${requestScope.name }<br>
	넘어온 값2(session) : ${sessionScope.name }<br>
	${name }
</body>
</html>