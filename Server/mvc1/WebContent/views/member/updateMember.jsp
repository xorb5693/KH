<%@page import="kh.java.member.model.service.MemberService"%>
<%@page import="kh.java.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	Member m = new Member();
	m.setMemberNo(Integer.parseInt(request.getParameter("memberNo")));
	m.setMemberId(request.getParameter("memberId"));
	m.setMemberPw(request.getParameter("memberPw"));
	m.setMemberName(request.getParameter("memberName"));
	m.setFootSize(Integer.parseInt(request.getParameter("footSize")));

	int result = new MemberService().updateMember(m);

	if (result > 0) {
		session.setAttribute("member", m);
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
		
	<%if (result > 0) {%>
		alert("정보 수정 성공");
	<%} else {%>
		alert("정보 수정 실패");
	<%}%>
		location.href = "/views/member/mypage.jsp"
	</script>
</body>
</html>