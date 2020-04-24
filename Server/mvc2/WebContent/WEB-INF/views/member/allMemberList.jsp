<%@page import="kh.java.member.model.vo.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전체회원 정보</h1>
	<hr>
	<table border="1">
		<tr>
			<th>회원번호</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>발사이즈</th>
		</tr>
		<%for(Member m: list) {%>
		<tr>
			<td><%=m.getMemberNo() %></td>
			<td><%=m.getMemberId() %></td>
			<td><%=m.getMemberPw() %></td>
			<td><%=m.getMemberName() %></td>
			<td><%=m.getFootSize() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>