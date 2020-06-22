<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<link rel="stylesheet" href="/resources/datepicker/css/bootstrap-datepicker.css">
<script src="/resources/datepicker/js/bootstrap-datepicker.js"></script>
<!--한국어  달력 쓰려면 추가 로드-->
<script src="/resources/datepicker/locales/bootstrap-datepicker.ko.min.js"></script>
</head>
<body>
	<h1>시슴!</h1>
	<hr>
	<form action="/kh/member/login.kh" method="post">
		<fieldset>
			<legend>로그인</legend>
			아이디 : <input type="text" name="memberId"><br>
			비밀번호 : <input type="password" name="memberPw"><br>
			<input type="submit" value="로그인">
		</fieldset>
	</form>
	<hr>
	<div style="width: 300px;">
		<form action="/kh/member/datePicker.kh" method="get">
			<input type="text" id="datePicker" name="datePicker" class="form-control" value="2019-06-27">
			<input type="submit" value="전송">
		</form>
	</div>
</body>
<script>
	$(function() {
        var today = new Date();   

        var year = today.getFullYear(); // 년도
        var month = new String(today.getMonth() + 1);  // 월
        var date = new String(today.getDate());  // 날짜
        
        if (month.length == 1) {
            month = "0" + month;
        }
        
        if (date.length == 1) {
            date = "0" + date;
        }

        $("#datePicker").val(year + "-" + month + "-" + date);
        
        $('#datePicker').datepicker({
		    format: "yyyy-mm-dd",	//데이터 포맷 형식(yyyy : 년 mm : 월 dd : 일 )
		    startDate: '-20d',	//달력에서 선택 할 수 있는 가장 빠른 날짜. 이전으로는 선택 불가능 ( d : 일 m : 달 y : 년 w : 주)
		    endDate: '+0d',	//달력에서 선택 할 수 있는 가장 느린 날짜. 이후로 선택 불가 ( d : 일 m : 달 y : 년 w : 주)
		    autoclose : true,	//사용자가 날짜를 클릭하면 자동 캘린더가 닫히는 옵션
		    calendarWeeks : false, //캘린더 옆에 몇 주차인지 보여주는 옵션 기본값 false 보여주려면 true
		    clearBtn : false, //날짜 선택한 값 초기화 해주는 버튼 보여주는 옵션 기본값 false 보여주려면 true
		    disableTouchKeyboard : false,	//모바일에서 플러그인 작동 여부 기본값 false 가 작동 true가 작동 안함.
		    immediateUpdates: false,	//사용자가 보는 화면으로 바로바로 날짜를 변경할지 여부 기본값 :false 
		    multidate : false, //여러 날짜 선택할 수 있게 하는 옵션 기본값 :false 
		    multidateSeparator :",", //여러 날짜를 선택했을 때 사이에 나타나는 글짜 2019-05-01,2019-06-01
		    templates : {
		        leftArrow: '&laquo;',
		        rightArrow: '&raquo;'
		    }, //다음달 이전달로 넘어가는 화살표 모양 커스텀 마이징 
		    showWeekDays : true ,// 위에 요일 보여주는 옵션 기본값 : true
		    title: "캘린더",	//캘린더 상단에 보여주는 타이틀
		    todayHighlight : true ,	//오늘 날짜에 하이라이팅 기능 기본값 :false 
		    toggleActive : true,	//이미 선택된 날짜 선택하면 기본값 : false인경우 그대로 유지 true인 경우 날짜 삭제
		    weekStart : 0 ,//달력 시작 요일 선택하는 것 기본값은 0인 일요일 
		    language : "ko"	//달력의 언어 선택, 그에 맞는 js로 교체해줘야한다.
		    
		});//datepicker end
    });
</script>
</html>