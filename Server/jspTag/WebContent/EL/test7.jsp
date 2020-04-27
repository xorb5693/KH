<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	입력한 아이디 : ${param.id }<br>
	선택한 운동 : ${paramValues.sports[0] } ${paramValues.sports[1] } ${paramValues.sports[2] } ${paramValues.sports[3] }<br>
</body>
</html>