<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>제목</th>
			<td>${notice.noticeTitle }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${notice.noticeWriter }</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${notice.regDate }</td>
		</tr>
		<tr>
			<th>첨부파일</th>
			<td>
				<c:if test="${not empty notice.filename }">
					<a href="/resources/upload/notice/${notice.filepath }" download>${notice.filename }</a>
				</c:if>
			</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${notice.contentBr }</td>
		</tr>
		<c:if test="${sessionScope.member.memberId eq notice.noticeWriter }">
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="수정" onclick="location.href = '/noticeModify.do'">
					<input type="button" value="삭제" onclick="location.href = '/noticeDelete.do'">
				</td>
			</tr>
		</c:if>
	</table>
	<script>
		
	</script>
</body>
</html>