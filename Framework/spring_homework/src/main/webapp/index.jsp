<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css">
    <script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
    <style>
        .login {
            width: 600px;
            height: 700px;
        }

        .login>p {
            font-size: 3.5em;
            margin: 0;
            text-align: center;
            padding-top: 100px;
            padding-bottom: 20px;
            font-weight: bolder;
        }

        .btn {
            width: 400px;
            height: 50px;
            line-height: 50px;
            margin-top: 50px;
            margin-bottom: 20px;
            font-size: 1.2em;
            font-weight: bolder;
        }

        .aBox {
            text-align: right;
            width: 400px;
            margin: 0 auto;
        }

        .aBox>a {
            color: rgba(0, 0, 0, 0.7);
        }
        
        .aBox>a:hover {
            color: rgba(0, 0, 0, 1.0);
            font-weight: bolder;
        }

    </style>
    <script>
        $(function() {
            $(".gradation").css("height", screen.height);
            $(".login").css("margin-top", (screen.height - 850) / 2);
        });

    </script>
</head>

<body class="gradation">
    <div class="login">
        <p>A_CLASS</p>
        <c:if test="${empty sessionScope.member }">
            <form action="/login.do" method="post">
                <div>
                    <p>아이디</p>
                    <input type="text" name="memberId" id="memberId" class="input" required><br>
                </div>
                <div>
                    <p>비밀번호</p>
                    <input type="password" name="memberPw" id="memberPw" class="input" required><br>
                </div>
                <input type="submit" value="로그인" class="btn btn_black"><br>

            </form>
            <div class="aBox">
                <a href="/joinFrm.do">회원가입</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="/findMember.do">아이디/비밀번호 찾기</a>
            </div>
        </c:if>
        <c:if test="${not empty sessionScope.member }">
            <script>
                location.href = "/main.do";

            </script>
        </c:if>
    </div>
</body>

</html>
