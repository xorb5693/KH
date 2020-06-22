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
	<h1>현재 카드 등록 페이지</h1>
	<a href="/">메인 페이지로</a>
	<script>
		var ws;
        var memberId = "${sessionScope.member.memberId}";
		
		function connect() {
			ws = new WebSocket("ws://192.168.10.25/card.do");
			ws.onopen = function() {
				console.log("웹소켓 연결 생성");
			};
            
            ws.onmessage = function(e) {
                var cardNo = e.data;
                
                if (confirm(memberId + "회원에 카드 번호 " + cardNo + "을(를) 등록하시겠습니까?")) {
                    console.log("insert");
                }
            };
            
            ws.onclose = function() {
                console.log("연결종료");
            };
		}
        
        $(function() {
            connect();
        })
	</script>
</body>
</html>