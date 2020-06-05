<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.js"></script>
<script>
	$(function() {
		$("#fileDelBtn").click(function() {
            $("input[name=status]").val("delete");
            $(".delFile").hide();
            $("#fileDelBtn").hide();
            $("#file").show();
        });
	});
</script>
</head>
<body>
	<form action="/noticeModify.do" method="post" enctype="multipart/form-data">
		<input type="hidden" name="noticeNo" value="${notice.noticeNo }">
		제목 : <input type="text" name="noticeTitle" value="${notice.noticeTitle }"><br>
		작성자 : <input type="text" name="noticeWriter" value="${sessionScope.member.memberId }" readonly><br>
		첨부파일 :
		<input type="hidden" name="status" value="stay">
		<c:if test="${not empty notice.filename }">
			<input type="file" name="file" id="file" style="display: none;">
			<span class="delFile">${notice.filename }</span>
			<button type="button" id="fileDelBtn">파일삭제</button>
			<input type="hidden" name="oldFilename" value="${notice.filename }">
			<input type="hidden" name="oldFilepath" value="${notice.filepath }">
		</c:if> 
		<c:if test="${empty notice.filename }">
			<input type="file" name="file">
		</c:if>
		<br>
		내용 : <textarea rows="5" cols="20" name="noticeContent">${notice.noticeContent }</textarea><br>
		<input type="submit" value="글쓰기">
	</form>
</body>
</html>