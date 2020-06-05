<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/mUpdate.do" method="post">
		아이디 : <input type="text" name="memberId" value="${m.memberId }" readonly><br>
		비밀번호 : <input type="password" name="memberPw"><br>
		이름 : <input type="text" name="memberName" value="${m.memberName }"><br>
		나이 : <input type="text" name="age" value="${m.age }"><br>
		가입일 : <input type="text" name="enrollDate" value="${m.enrollDate }" readonly><br>
		<input type="submit" value="정보수정">
	</form>
</body>
</html>