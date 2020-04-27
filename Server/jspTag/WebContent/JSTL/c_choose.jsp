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
	전송 값 확인 : ${param.num2 }<br>
	<c:choose>
		<c:when test="${param.num2 == 1 }">
			1을 입력하셨습니다.
		</c:when>
		<c:when test="${param.num2 == 2 }">
			2을 입력하셨습니다.
		</c:when>
		<c:when test="${param.num2 == 3 }">
			3을 입력하셨습니다.
		</c:when>
		<c:otherwise>
			잘못 입력하셨습니다.
		</c:otherwise>
	</c:choose><br>
</body>
</html>