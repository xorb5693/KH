<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 페이지</title>
<style>
	#login-box {
		width: 400px;
		color: black;
		margin: 0 auto;
	}
    
    #login-box>ul>li {
        font-size: 20px;
    }
    
    #btn-wrapper {
        text-align: center;
    }
    
    #btn-wrapper>button {
        width: 100%;
        margin-top: 20px;
    }
    
    #btn-wrapper>a {
        font-size: 15px;
    }
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/header.jsp" />
    <section class="container">
        <form action="/login" method="post" id="login-box">
            <h1>로그인</h1>
            <ul>
                <li>
                    <label for="memberId">아이디</label>
                </li>
                <li>
                    <input type="text" name="memberId" id="memberId" class="form-control">
                </li>
                <br>
                <li>
                    <label for="memberPw">비밀번호</label>
                </li>
                <li>
                    <input type="password" name="memberPw" id="memberPw" class="form-control">
                </li>
                <li id="btn-wrapper">
                    <button class="btn btn-outline-danger btn-lg" type="submit">로그인</button>
                    <button class="btn btn-outline-danger btn-lg" type="reset">초기화</button>
                    <br><br>
                    <a href="#">아이디/비밀번호 찾기</a>
                </li>
            </ul>
        </form>
    </section>
</body>
</html>