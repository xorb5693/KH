<%@page import="kh.java.member.model.service.MemberService"%>
<%@page import="kh.java.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Member m = (Member)session.getAttribute("member");
	String memberId = m.getMemberId();
	
	int result = new MemberService().removeMember(memberId);
	if (result > 0) {
		session.invalidate();
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		<% if (result > 0) {%>
			alert("회원 탈퇴 성공");
		<% } else { %>
			alert("회원 탈퇴 실패");
		<% } %>
		
		location.href="/";
	</script>
	
</body>
</html>