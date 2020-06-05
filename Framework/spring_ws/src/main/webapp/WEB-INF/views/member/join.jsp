<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
</head>
<body>
	<form action="/join.do" method="post">
		<fieldset>
			<legend>회원가입</legend>
			아이디 : <input type="text" name="memberId"><span id="chkId"></span><br>
			비밀번호 : <input type="password" name="memberPw"><br>
			이름 : <input type="text" name="memberName"><br>
			나이 : <input type="text" name="age"><br>
			<input type="submit" value="회원가입"><br>
		</fieldset>
	</form>
	<script>
        $(function() {
            $("input[name=memberId]").keyup(function() {
                var memberId = $(this).val();
                $.ajax({
                    url: "/checkId.do",
                    data: {memberId: memberId},
                    type: "get",
                    success: function(data) {
                        if (data == '0') {
                            $("#chkId").html("사용가능한 아이디");
                        } else {
                            $("#chkId").html("이미 사용중인 아이디");
                        }
                    },
                    error: function() {
                        console.log("ajax 통신 실패");
                    }
                });
            });
        });
	</script>
</body>
</html>