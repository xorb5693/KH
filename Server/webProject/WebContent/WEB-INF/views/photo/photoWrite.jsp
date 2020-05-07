<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사진게시판 글쓰기</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/header.jsp"/>
	<section class="container">
        <form action="/photoWrite" method="post" enctype="multipart/form-data" style="width: 1000px; margin: 0 auto;">
            <table class="table table-bordered">
                <tr>
                    <th>작성자</th>
                    <td>
                        <input type="hidden" name="photoWriter" value="${sessionScope.member.memberId }">
                        ${sessionScope.member.memberId }
                    </td>
                </tr>
                <tr>
                    <th>첨부파일</th>
                    <td><input type="file" name="photoFilename" onchange="loadImg(this);"></td>
                </tr>
                <tr>
                    <th>이미지 보기</th>
                    <td>
                        <div id="img-viewer">
                            <img id="img-view" width="350px;">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td><textarea name="photoContent" rows="3" style="width: 100%;"></textarea></td>
                </tr>
                <tr>
                    <th style="text-align: center;" colspan="2">
                        <button type="submit" class="btn btn-outline-primary">등록하기</button>
                    </th>
                </tr>
            </table>            
        </form>
    </section>
    <script>
        function loadImg(obj) {
            console.log(obj.files);
            if (obj.files.length != 0 && obj.files[0] != 0) {
                var reader = new FileReader();
                reader.readAsDataURL(obj.files[0]);
                reader.onload = function(e) {
                    $("#img-view").attr("src", e.target.result);
                }
            } else {
                $("#img-view").attr("src", "");
            }
        }
    </script>
</body>
</html>