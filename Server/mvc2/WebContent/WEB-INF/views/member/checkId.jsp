<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	boolean result = (Boolean)request.getAttribute("result");
    	String checkId = (String)request.getAttribute("checkId");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script>
		function setMemberId(memberId) {
			var id = opener.document.getElementsByName("memberId");
			var pw = opener.document.getElementsByName("memberPw");
			id[0].value = memberId;	//부모창 아이디 설정
			pw[0].focus();	//부모창 패스워드 포커스
			self.close();	//현재창 닫기
		}
	</script>
</head>
<body>
	<div id="checked-container">
		<%if(result) {%>
			[<sapn><%=checkId %></sapn>]은(는) 사용이 가능합니다.
			<br><br>
			<button type="button" onclick="setMemberId('<%=checkId %>')">닫기</button>
		<%} else {%>
			[<san><%=checkId %></san>]은(는) 이미 사용 중 입니다.
			<br><br>
			<form action="/checkId" method="post">
				<input type="text" name="checkId" placeholder="아이디 입력"><br>
				<input type="submit" value="중복검사">
			</form>
		<%} %>
	</div>
</body>
</html>