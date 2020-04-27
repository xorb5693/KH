<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL 연산자</h1>
	<table border="1">
		<tr>
			<th>표현식</th>
			<th>값</th>
		</tr>
		<tr>
			<td>\${2+5 }</td>
			<td>${2+5 }</td>
		</tr>
		<tr>
			<td>\${4/5 }</td>
			<td>${4/5 }</td>
		</tr>
		<tr>
			<td>\${2 < 3 }</td>
			<td>${2 < 3 }</td>
		</tr>
		<tr>
			<td>\${2 lt 3 }</td>
			<td>${2 lt 3 }</td>
		</tr>
		<tr>
			<td>\${2 gt 3 }</td>
			<td>${2 gt 3 }</td>
		</tr>
		<tr>
			<td>\${2 le 3 }</td>
			<td>${2 le 3 }</td>
		</tr>
		<tr>
			<td>\${2 eq 3 }</td>
			<td>${2 eq 3 }</td>
		</tr>
		<!-- <tr>
			<td>\${2 ne 3 }</td>
			<td>${2 ne 3 }</td>
		</tr> -->
		<tr>
			<td>\${(5>3)?5:3 }</td>
			<td>${(5>3)?5:3 }</td>
		</tr>
	</table>
</body>
</html>