<%@page import="kh.java.member.model.service.MemberService"%>
<%@page import="kh.java.member.model.vo.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Member login = (Member) session.getAttribute("member");
	ArrayList<Member> list = new MemberService().selectAllMember();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>회원번호</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>발사이즈</th>
			<%
				if (login.getMemberId().equals("admin")) {
			%>
			<th>탈퇴</th>
			<%
				}
			%>
		</tr>
		<%
			for (Member m : list) {
		%>
		<%
			if (!m.getMemberId().equals("admin")) {
		%>
		<tr>
			<td><%=m.getMemberNo()%></td>
			<td><%=m.getMemberId()%></td>
			<td><%=m.getMemberPw()%></td>
			<td><%=m.getMemberName()%></td>
			<td><%=m.getFootSize()%></td>
			<%
				if (login.getMemberId().equals("admin")) {
			%>
			<td><a href="/views/member/removeMember.jsp?memberId=<%=m.getMemberId()%>">탈퇴시키기</a></td>
			<%
				} //if-2닫기
			%>
		</tr>
		<%
			} //if-1닫기
		%>
		<%
			} //for 닫기
		%>
	</table>
</body>
</html>