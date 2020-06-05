<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>A_CLASS - 회원가입</title>
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css">
    <script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
    <style>
        .login {
            width: 600px;
            height: 900px;
        }

        .login>p {
            font-size: 3.5em;
            margin: 0;
            text-align: center;
            padding-top: 10px;
            padding-bottom: 20px;
            font-weight: bolder;
        }

        .btn {
            width: 400px;
            height: 50px;
            line-height: 50px;
            margin-top: 40px;
            margin-bottom: 10px;
            font-size: 1.2em;
            font-weight: bolder;
        }

        .aBox {
            text-align: center;
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
        
        span {
            font-size: 15px;
            font-weight: bold;
            color: red;
        }

    </style>
    <script>
        var check = 0;
        var ajaxCheck = 1;
        $(function() {
            $(".gradation").css("height", screen.height);
            $(".login").css("margin-top", (screen.height - 1050) / 2);
            
            $("#memberId").keyup(function() {
                var memberId = $(this).val();
                $.ajax({
                    url: "/checkId.do",
                    data: {memberId: memberId},
                    type: "get",
                    success: function(data) {
//                    	console.log(data);
                        if (data == "0") {
                            ajaxCheck = 0;
                            $("#memberId").prev().children().html("");
                        } else {
                            ajaxCheck = 1;
                            $("#memberId").prev().children().html("중복된 사용자가 존재합니다.");
                        }
                    }                    
                });
            });
            
            $("#memberId").blur(function() {
                var regExp = /^[a-z]{1}[a-z0-9]{4,}@.+$/;
                if (!regExp.test($(this).val())) {
                    check++;
                    $(this).prev().children().html("이메일 형식 ex)test@gmail.com");
                    return;
                } else {
                    $(this).prev().children().html("");
                    $("#memberId").keyup();
                }
                
            });
            
            $("#memberPw").blur(function() {
                var regExp = /^(?=.*[a-zA-Z])(?=.*[!@#$%^~*+=-])(?=.*[0-9]).{8,16}$/;

                if (!regExp.test($(this).val())) {
                    check++;
                    $(this).prev().children().html("소문자, 대문자, 특수문자 포함 8~16글자");
                } else {
                    if ($("#memberPw2").val() != "") {
                        $("#memberPw2").blur();
                    }
                    $(this).prev().children().html("");
                }
            });
            
            $("#memberPw2").blur(function() {
                
                if ($(this).val() != $("#memberPw").val()) {
                    check++;
                    $(this).prev().children().html("두 비밀번호가 동일하지 않습니다");
                } else {
                    $(this).prev().children().html("");
                }
            });
            
            $("#memberName").blur(function() {
                
                var regExp = /^[가-힣]{2,}$/;
                
                if (!regExp.test($(this).val())) {
                    check++;
                    $(this).prev().children().html("한글로 2글자 이상");
                } else {
                    $(this).prev().children().html("");
                }
            });
            
            $("#age").blur(function() {
                
                var regExp = /\d/;
                
                if (!regExp.test($(this).val())) {
                    check++;
                    $(this).prev().children().html("숫자만 입력하세요");
                } else {
                    $(this).prev().children().html("");
                }
            });
            
            $("#phone").blur(function() {
                
                var regExp = /^01[0-9]{1}-[0-9]{3,4}-[0-9]{4}$/;
                
                if (!regExp.test($(this).val())) {
                    check++;
                    $(this).prev().children().html("전화번호를 정확하게 입력하세요");
                } else {
                    $(this).prev().children().html("");
                }
            });
        });
        
        function checkInput() {
            var input = $(".check");
//            console.log(input.length);
            check = 0;
            
            for (var i = 0; i < input.length; i++) {
                $(input).eq(i).blur();
            }
            
            if (ajaxCheck == 1) {
                return false;
            }
            
            if (check != 0) {
                return false;
            }
            
            return true;
        }

    </script>
</head>

<body class="gradation">
    <div class="login">
        <p>회원가입</p>
        <form action="/join.do" method="post">
            <div>
                <p>회사 <span></span></p>
                <select name="companyCode" class="input">
                    <optgroup label="회사명"/>
                    <c:forEach items="${list }" var="com">
                        <option value="${com.companyCode }">${com.companyName }</option>
                    </c:forEach>
                </select><br>
            </div>
            <div>
                <p>아이디 <span></span></p>
                <input type="text" name="memberId" id="memberId" class="input check" placeholder="이메일 형식 ex) test@gmail.com" required><br>
            </div>
            <div>
                <p>비밀번호 <span></span></p>
                <input type="password" name="memberPw" id="memberPw" class="input check" placeholder="소문자, 대문자, 특수문자 포함 8~16글자" required><br>
            </div>
            <div>
                <p>비밀번호 재입력 <span></span></p>
                <input type="password" name="memberPw2" id="memberPw2" class="input check" placeholder="소문자, 대문자, 특수문자 포함 8~16글자" required><br>
            </div>
            <div>
                <p>이름 <span></span></p>
                <input type="text" name="memberName" id="memberName" class="input check" placeholder="한글로 2글자 이상" required><br>
            </div>
            <div>
                <p>나이 <span></span></p>
                <input type="text" name="age" id="age" class="input check" placeholder="숫자만 입력" required><br>
            </div>
            <div>
                <p>휴대전화 <span></span></p>
                <input type="text" name="phone" id="phone" class="input check" placeholder="ex)010-1234-5678" required><br>
            </div>
            <input type="submit" value="회원가입" class="btn btn_black" onclick="return checkInput();">

        </form>
        <div class="aBox">
            <a href="/">메인으로 돌아가기</a>
        </div>
    </div>
</body>

</html>
