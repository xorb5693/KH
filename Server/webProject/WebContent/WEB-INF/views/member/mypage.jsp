<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>마이페이지</title>
    <style>
        #mypage {
            width: 600px;
            margin: 0 auto;
        }

        #mypage>table th {
            vertical-align: middle
        }

        #btn-box {
            text-align: center
        }

    </style>
    
    <script>
        function deleteMember(memberId) {
            if(confirm(memberId + "을(를) 탈퇴하시겠습니까?")) {
                location.href="/deleteMember?memberId="+memberId;
            }
        }
    </script>
</head>

<body>
    <jsp:include page="/WEB-INF/views/common/header.jsp" />
    <section class="container">
        <form action="/updateMember" method="post" id="mypage">
            <h1>회원정보</h1>
            <table class="table">
                <tr>
                    <th><label for="memberId">아이디</label></th>
                    <td><input type="text" name="memberId" id="memberId" class="form-control" value="${m.memberId }" readonly></td>
                </tr>
                <tr>
                    <th><label for="memberPw">비밀번호</label></th>
                    <td><input type="password" name="memberPw" id="memberPw" class="form-control" value="${m.memberPw }"></td>
                </tr>
                <tr>
                    <th><label for="memberName">이름</label></th>
                    <td><input type="text" name="memberName" id="memberName" class="form-control" value="${m.memberName }"></td>
                </tr>
                <tr>
                    <th><label for="age">나이</label></th>
                    <td><input type="text" name="age" id="age" class="form-control" value="${m.age }"></td>
                </tr>
                <tr>
                    <th><label for="email">이메일</label></th>
                    <td><input type="text" name="email" id="email" class="form-control" value="${m.email }"></td>
                </tr>
                <tr>
                    <th><label for="phone">전화번호</label></th>
                    <td><input type="text" name="phone" id="phone" class="form-control" value="${m.phone }"></td>
                </tr>
                <tr>
                    <th><label for="address">주소</label></th>
                    <td><input type="text" name="address" id="address" class="form-control" value="${m.address }"></td>
                </tr>
                <tr>
                    <th><label for="enrollDate">가입일</label></th>
                    <td><input type="text" name="enrollDate" id="enrollDate" class="form-control" value="${m.enrollDate }" readonly></td>
                </tr>
            </table>
            <hr>
            <div id="btn-box">
                <button class="btn btn-outline-danger btn-lg" type="submit">수정하기</button>
                <c:if test="${m.memberId eq 'admin' }">
                    <button class="btn btn-outline-danger btn-lg" type="button" onclick="location.href='/adminPage'">회원관리</button>
                </c:if>
                <c:if test="${m.memberId ne 'admin' }">
                    <button class="btn btn-outline-danger btn-lg" type="button" onclick="deleteMember('${m.memberId}')">회원탈퇴</button>
                </c:if>
            </div>
        </form>
    </section>
</body>

</html>
