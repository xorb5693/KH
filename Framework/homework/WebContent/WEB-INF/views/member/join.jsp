<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	label {
		display: inline-block;
		width: 90px;
	}
</style>
</head>
<body>
	<form action="/join" method="post">
		<fieldset>
			<legend>회원가입</legend>
			<label>회사 : </label>
			<select name="companyCode">
				<c:forEach items="${list }" var="com">
					<option value="${com.companyCode }">${com.companyName }</option>
				</c:forEach>
			</select><br>
			<label for="memberId">아이디 : </label><input type="text" name="memberId" id="memberId"><br>
			<label for="memberPw">비밀번호 : </label><input type="password" name="memberPw" id="memberPw"><br>
			<label for="memberName">이름 : </label><input type="text" name="memberName" id="memberName"><br>
			<label for="age">나이 : </label><input type="text" name="age" id="age"><br>
			<input type="submit" value="회원가입">
			<input type="reset" value="취소">
		</fieldset>
	</form>
</body>
</html>