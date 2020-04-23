<%@page import="kh.java.member.model.vo.Member"%>
<%@page import="kh.java.member.model.service.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("utf-8");
    	String memberId = request.getParameter("memberId");
    	String memberPw = request.getParameter("memberPw");
    	
    	Member login = new Member();
    	login.setMemberId(memberId);
    	login.setMemberPw(memberPw);
    	
    	Member loginMember = new MemberService().selectOneMember(login);
    	
    	if (loginMember != null) {
    		//로그인 성공시 로그인 정보를 session에 저장
    		session.setAttribute("member", loginMember);
    	}
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% if (loginMember != null) { %>
		<h1>로그인 성공!</h1>
		<p><%= loginMember.getMemberName() %>님 환영합니다.</p>
		<a href="/">메인페이지로 이동</a><br>
		<a href="/views/member/login.jsp">로그인 화면으로 이동</a><br>
		<a href="/views/member/allMemberList.jsp">전체회원 조회</a><br>
		<a href="/views/member/mypage.jsp">마이페이지</a><br>
		<a href="/views/member/remove.jsp">회원탈퇴</a>
	<% } else { %>
		<h1>로그인 실패!</h1>
		<a href="/views/member/login.jsp">로그인 화면으로 돌아가기</a>
	<% } %>
</body>
</html>