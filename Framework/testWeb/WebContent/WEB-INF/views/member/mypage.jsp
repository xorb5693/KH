<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>마이페이지</h1>
	<hr>
	<form action="/updateMember" method="post">
		<table>
			<tr>
				<td>아이디 : </td>
				<td><input type="text" name="memberId" value="${sessionScope.member.memberId }" readonly="readonly"></td>
			</tr>
			<tr>
				<td>비밀번호 : </td>
				<td><input type="password" name="memberPw" value="${sessionScope.member.memberPw }"></td>
			</tr>
			<tr>
				<td>이름 : </td>
				<td><input type="text" name="memberName" value="${sessionScope.member.memberName }"></td>
			</tr>
			<tr>
				<td>나이 : </td>
				<td><input type="text" value="${sessionScope.member.age }" readonly></td>
			</tr>
			<tr>
				<td>가입일 : </td>
				<td><input type="text" value="${sessionScope.member.enrollDate }" readonly></td>
			</tr>
			<tr>
				<th rowspan="2">
					<input type="submit" value="정보수정">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>