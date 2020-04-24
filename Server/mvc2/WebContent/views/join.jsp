<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
<title>Insert title here</title>
	<style>
		label {
			display: inline-block;
			width: 100px;
		}
	</style>
	
	<script>
		function checkId() {
			var memberId = $("input[name=memberId]").val();
			if (memberId == "") {
				alert("아이디를 입력하세요");
				return false;
			}
			
			var url = "/checkId"; //중복체크를 처리할 Servlet Mapping 값
			var title = "checkId"; //새로 열리는 창과 checkIdFrm form을 연결할 값
			//status -> 새로 열리는 창의 옵션
			var status = "left=500px, top=100px, width=300px, height=200px, menubar=no, status=no,scrollbars=yes";
			console.log(status);
			var popup = window.open("", title, status);
			$("input[name=checkId]").val(memberId);
			$("#checkIdFrm").attr("action", url);
			$("#checkIdFrm").attr("method", "post");
			$("#checkIdFrm").attr("target", title); //새로 열린 popup창과 form 태그를 연결
			$("#checkIdFrm").submit();
		}
	</script>
</head>
<body>
	<h1>회원가입</h1>
	<hr>
	<form id="checkIdFrm">
		<input type="hidden" name="checkId">
	</form>
	<form action="/join" method="post">
		<fieldset>
			<legend>회원가입</legend>
			<label for="id">아이디 : </label><input type="text" name="memberId" id="id">
			<button type="button" onclick="checkId();">중복체크</button><br>
			<label for="pw">비밀번호 : </label><input type="password" name="memberPw" id="pw"><br>
			<label for="name">이름 : </label><input type="text" name="memberName" id="name"><br>
			<label for="size">발사이즈 : </label><input type="text" name="footSize" id="size"><br>
			<input type="submit" value="회원가입">
			<input type="reset" value="초기화">
		</fieldset>
	</form>
</body>
</html>