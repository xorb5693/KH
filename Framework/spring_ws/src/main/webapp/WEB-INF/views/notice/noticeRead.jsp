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
					<a href="javascript:filedownload('${notice.filename }','${notice.filepath }' )" >${notice.filename }</a>
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
					<input type="button" value="수정" onclick="location.href = '/noticeModifyFrm.do?noticeNo=${notice.noticeNo }'">
					<input type="button" value="삭제" onclick="if(confirm('게시글을 삭제하시겠습니까?')) {location.href = '/noticeDelete.do?noticeNo=${notice.noticeNo }';}">
				</td>
			</tr>
		</c:if>
	</table>
	<script>
		function filedownload(filename, filepath) {
			location.href = "/noticeFileDownload.do?filename=" + filename + "&filepath=" + filepath;
		}
	</script>
</body>
</html>