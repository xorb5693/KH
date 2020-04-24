<%@page import="kh.java.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Member member = (Member)request.getAttribute("member");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style>
		label {
			display: inline-block;
			width: 100px;
		}
	</style>
</head>
<body>
	<h1>마이페이지</h1>
	<hr>
	<form action="/updateMember" method="post">
		<input type="hidden" name="memberNo" value="<%=member.getMemberNo() %>">
		<label for="id">ID : </label><input type="text" name="memberId" id="id" value="<%=member.getMemberId() %>"><br>
		<label for="pw">PW : </label><input type="password" name="memberPw" id="pw" value="<%=member.getMemberPw() %>"><br>
		<label for="name">Name : </label><input type="text" name="memberName" id="name" value="<%=member.getMemberName() %>"><br>
		<label for="size">발사이즈 : </label><input type="text" name="footSize" id="size" value="<%=member.getFootSize() %>"><br>
		<input type="submit" value="정보수정">
	</form>	
</body>
</html>