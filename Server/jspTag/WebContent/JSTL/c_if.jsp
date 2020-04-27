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
	넘어온 값 : ${param.num1 }<br>
	<c:if test="${param.num1 % 2 == 0 }" var="result1">
		짝수<br>
	</c:if>
	<c:if test="${param.num1 % 2 == 1 }" var="result2">
		홀수<br>
	</c:if>
	첫번째 if 결과 : ${result1 }<br>
	두번째 if 결과 : ${result2 }<br>
</body>
</html>