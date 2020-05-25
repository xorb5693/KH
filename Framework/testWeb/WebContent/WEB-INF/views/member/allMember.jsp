<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<th>회원번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>나이</th>
			<th>가입일</th>
		</tr>
		<c:forEach items="${list }" var="m">
			<tr>
				<td>${m.memberNo }</td>
				<td>${m.memberId }</td>
				<td>${m.memberName }</td>
				<td>${m.age }</td>
				<td>${m.enrollDate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>