<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A_CLASS - 게시판 리스트</title>
<link href="/resources/css/style.css?after" rel="stylesheet" type="text/css">
<script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/header.jsp"/>
    <section class="container">
        <jsp:include page="/WEB-INF/views/common/menu.jsp"/>
        <div class="main">
            <table class="table table-bordered boardList">
                <tr>
                    <th width="7%" style="min-width:57px;">번호</th>
                    <th width="60%">제목</th>
                    <th width="13%" style="min-width:57px;">작성자</th>
                    <th width="10%" style="min-width:57px;">작성일</th>
                    <th width="10%" style="min-width:57px;">조회수</th>
                </tr>
                <c:forEach items="${list }" var="b" varStatus="status">
                	<tr>
	                	<td>${status.count + (reqPage - 1) * 10 }</td>
	                	<td>${b.boardTitle }</td>
	                	<td>${b.boardWriter }</td>
	                	<td>${b.writeDate }</td>
	                	<td>${b.readCount }</td>
	                </tr>
                </c:forEach>
            </table>
        </div>
    </section>
</body>
</html>