<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table {
		width: 600px;
		margin-top: 10px;
		margin-bottom: 10px;
	}
	
	tr {
		width: 100%;
	}
	
	th, td {
        border-bottom: 1px solid rgba(0, 0, 0, 0.2);
		width: 50%;
		text-align: center;
		padding: 1em;
	} 
	
	tr:first-child>th, tr:first-child>td {
        border-top: 1px solid rgba(0, 0, 0, 0.2);
	} 
	
	.imgDiv {
		width: 500px;
		height: 300px;
		text-align: center;
	}
	
	.imgDiv>img {
		max-width: 500px;
		max-height: 300px;
	}
	
	.info {
		overflow: hidden;
	}
	
	.info>* {
		float: left;
	}
</style>
</head>
<body>
	<div class="info">
		<div class="imgDiv">
			<img src="/img/logo/${sessionScope.company.companyLogo }">
		</div>
		<table>
			<tr>
				<th>소속</th>
				<td>${sessionScope.company.companyName }</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td>${sessionScope.member.memberId }</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${sessionScope.member.memberName }</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>${sessionScope.member.phone }</td>
			</tr>
			<tr>
				<th>회원등급</th>
				<td>
					<c:if test="${sessionScope.member.memberLevel eq 1 }">
						일반회원
					</c:if>
					<c:if test="${sessionScope.member.memberLevel eq 3 }">
						관리자회원
					</c:if>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>