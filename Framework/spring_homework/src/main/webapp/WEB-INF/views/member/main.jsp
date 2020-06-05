<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/resources/css/style.css?after" rel="stylesheet" type="text/css">
<script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
<title>A_CLASS - 메인 페이지</title>
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
        margin: 0 auto;
		width: 600px;
		height: 300px;
        line-height: 300px;
		text-align: center;
	}
	
	.imgDiv>img {
		max-width: 500px;
		max-height: 300px;
		text-align: center;
        vertical-align: middle;
	}
	
	.info {
        display: inline-block;
		overflow: hidden;
        margin: 20px;
	}
	
	.info>* {
		float: left;
        text-align: center;
	}
    
    .main>button {
        width: 90%; 
        height: 50px; 
        background-color: #30A9DE; 
        border: none; 
        color: white; 
        font-size: 1.3em; 
        font-weight: bold; 
        border-radius: 10px; 
        outline: none;
    }
    
    .main>button:hover {
        cursor: pointer;
    }
</style>
<script>
    $(function() {
        var img = $(".imgDiv>img");
        console.log(img.css("height"));
        img.css("margin-top", (300 - img.css("height").replace("px", "")) / 2);
    });
</script>
</head>
<body>
    <jsp:include page="/WEB-INF/views/common/header.jsp"/>
    <section class="container">
        <jsp:include page="/WEB-INF/views/common/menu.jsp"/>
        <div class="main">
            <div class="menuButton">
                <button class="btn toggle">menu toggle</button>
            </div>
            <div class="info">
                <div class="imgDiv">
                    <img src="/resources/img/logo/${sessionScope.company.companyLogo }">
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
            <button>비밀번호 변경하기</button>
        </div>
    </section>
</body>
</html>