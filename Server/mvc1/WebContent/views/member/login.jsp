<%@page import="kh.java.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//로그인 정보 꺼내오기
    	Member m = (Member)session.getAttribute("member");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% if(m == null) { %>
	<h1>로그인</h1>
	<hr>
		<form action="/views/member/loginMember.jsp" method="post">
			<label>아이디 : <input type="text" name="memberId"></label><br>
			<label>비밀번호 : <input type="password" name="memberPw"></label><br>
			<input type="submit" value="로그인">
			<input type="reset" value="취소">
		</form>
		<a href="/views/member/loginMember.jsp?memberId=user01&memberPw=pass01">유저1 로그인</a>
		<a href="/views/member/joinFrm.html">회원가입</a>
	<%} else {%>
		<h3><%= m.getMemberName() %></h3>
		<hr>
		<a href="/views/member/logout.jsp">로그아웃</a>
	<%} %>
</body>
</html>