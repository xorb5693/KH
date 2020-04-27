<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>순번</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
		<c:forEach items="${list }" var="m" varStatus="i">
			<tr>
				<td>${i.count }</td>
				<td>${m.id }</td>
				<td>${m.pw }</td>
				<td>${m.name }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>