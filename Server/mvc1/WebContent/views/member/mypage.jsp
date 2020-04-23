<%@page import="kh.java.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Member m = (Member) session.getAttribute("member");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
<script>
	$(function() {
		$("#submit").hide();
		$("#btn").click(function() {
			$(this).hide();
			$("#submit").show();
			$("input").prop("readonly", false);
		});
	});
</script>
</head>
<body>
	<h1>마이페이지</h1>
	<hr>
	<form action="/views/member/updateMember.jsp" method="post">
		<table border="1">
			<tr>
				<th>아이디</th>
				<td>
					<input type="hidden" name="memberNo" value="<%=m.getMemberNo()%>"> 
					<input type="text" name="memberId" value="<%=m.getMemberId()%>" readonly>
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="memberPw"
					value="<%=m.getMemberPw()%>" readonly></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="memberName"
					value="<%=m.getMemberName()%>" readonly></td>
			</tr>
			<tr>
				<th>발사이즈</th>
				<td><input type="text" name="footSize"
					value="<%=m.getFootSize()%>" readonly></td>
			</tr>
			<tr>
				<th colspan="2">
				<button id="btn" type="button">정보수정</button>
				<input id="submit" type="submit" value="수정완료"></th>
			</tr>
		</table>
	</form>
</body>
</html>