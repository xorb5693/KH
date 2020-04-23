<%@page import="kh.java.member.model.service.MemberService"%>
<%@page import="kh.java.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String memberId = request.getParameter("memberId");
	String memberPw = request.getParameter("memberPw");
	String memberName = request.getParameter("memberName");
	int footSize = Integer.parseInt(request.getParameter("footSize"));
	
	Member m = new Member(0, memberId, memberPw, memberName, footSize);
	
	int result = new MemberService().insertMember(m);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script>
		<%if (result > 0) {%>
			alert("회원가입 성공!");
			location.href = "/views/member/login.jsp";
		<%} else {%>
			alert("회원가입 실패");
			location.href = "/";
		<%} %>
	</script>
</head>
<body>
</body>
</html>