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
	<c:if test="${empty sessionScope.member }">
		<form action="/login" method="post">
			아이디 : <input type="text" name="memberId"><br>
			비밀번호 : <input type="password" name="memberPw"><br>
			<input type="submit" value="로그인">
			<input type="reset" value="취소">	<br>
			<a href="joinFrm">회원가입</a>
		</form>
	</c:if>
	<c:if test="${not empty sessionScope.member }">
		<h2>[${sessionScope.member.memberName }]님</h2>
		<hr>
		<a href="/allMember">전체 회원 조회</a><br>
		<a href="/mypage">내정보 보기</a><br>
		<a href="/delete">회원탈퇴</a><br>
		<a href="/logout">로그아웃</a><br>
	</c:if>
</body>
</html>