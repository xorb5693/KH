<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공지사항 : ${n.noticeTitle }</title>
    <style>
        .table-wrapper, .comment-write {
            width: 1000px;
            margin: 0 auto;
        }
        
        .table-wrapper>.table th {
            width: 20%;
        }
        
        .table-wrapper>.table td {
            width: 80%;
        }
        
        .comment-write td {
            text-align: center;
        }
        
        .comment-write td>textarea {
            resize: none;
        }
    </style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/header.jsp"/>
	<section class="container">
        <div class="table-wrapper">
            <h1>공지</h1>
            <table class="table table-bordered">
                <tr>
                    <th>제목</th>
                    <td>${n.noticeTitle}</td>
                </tr>
                <tr>
                    <th>작성자</th>
                    <td>${n.noticeWriter }</td>
                </tr>
                <tr>
                    <th>첨부파일</th>
                    <td>
                    	<c:if test="${not empty n.filename }">
                    		<img src="/img/file.png" width="16px">
                    		<a href="javascript:fileDownload('${n.filename }', '${n.filepath }')">${n.filename }</a>
                    	</c:if>
                    </td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td>${n.contentBr }</td>
                </tr>
                <tr>
                    <th colspan="2" style="text-align: center;">
                        <c:if test="${not empty sessionScope.member and sessionScope.member.memberId eq 'admin'}">
                            <a class="btn btn-outline-primary btn-sm" href="/updateNoticeFrm?noticeNo=${n.noticeNo }&reqPage=<%=request.getParameter("reqPage")%>">수정하기</a>
                            <a class="btn btn-outline-primary btn-sm" href="javascript:void(0);" onclick="deleteNotice('${n.noticeNo}')">삭제하기</a>
                        </c:if>
                        <a href="/noticeList?reqPage=1" class="btn btn-outline-primary btn-sm">목록으로</a>
                    </th>
                </tr>
            </table>
        </div>
        <c:if test="${not empty sessionScope.member}">
            <div class="comment-write">
                <form action="/noticeCommentInsert" method="post">
                    <!-- 작성자, 게시글 번호, 참조, 댓글 레벨 -->
                    <input type="hidden" name="noticeCommentWriter" value="${sessionScope.member.memberId }">
                    <input type="hidden" name="noticeRef" value="${n.noticeNo }">
                    <input type="hidden" name="noticeCommentLevle" value="1">
                    <input type="hidden" name="noticeCommentRef" value="0">
                    <table class="table">
                        <tr>
                            <td width="90%">
                                <textarea class="form-control" name="noticeCommentContent" placeholder="댓글은 내 얼굴입니다."></textarea>
                            </td>
                            <td width="10%">
                                <button type="submit" class="btn btn-primary">댓글 작성</button>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </c:if>
	</section>
	<script>
		function fileDownload(filename, filepath) {
			var newFilename = encodeURIComponent(filename);
            var newFilepath = encodeURIComponent(filepath);
            
            location.href = "/noticeFileDownload?filename=" + newFilename + "&filepath=" + newFilepath;
		}
		
		function deleteNotice(noticeNo) {
			if (confirm("해당 게시글을 삭제하시겠습니까?")) {
                location.href = "/deleteNotice?noticeNo=" + noticeNo;
            }
		}
	</script>
</body>
</html>