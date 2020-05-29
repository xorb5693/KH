<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>시슴!!!!</h1>
	<c:if test="${empty sessionScope.member }">
		<form action="/login.do" method="post">
			아이디 : <input type="text" name="memberId"><br>
			비밀번호 : <input type="password" name="memberPw"><br>
			<input type="submit" value="로그인">
		</form>
		<a href="/joinFrm.do">회원가입</a>
	</c:if>
	<c:if test="${not empty sessionScope.member }">
		<h1>[${sessionScope.member.memberName }]</h1>
		<hr>
		<a href="/logout.do">로그아웃</a><br>
		<a href="/mypage.do">마이페이지</a><br>
		<a href="/delete.do">회원탈퇴</a>
	</c:if>
</body>
</html>