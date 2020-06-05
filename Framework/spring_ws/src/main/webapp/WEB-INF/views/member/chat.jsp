<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
</head>
<body>
	<textarea rows="5" cols="30" id="msgArea"></textarea>
	<br>
	메세지 : <input type="text" id="chatMsg"><br>
	상대 아이디 : <input type="text" id="target"><br>
	<button id="sendBtn">전송</button>
	<script>
		var ws;
		var memberId = "${sessionScope.member.memberId}";
		
		function connect() {
			ws = new WebSocket("ws://192.168.10.25/chat.do");
			ws.onopen = function() {
                console.log("웹소켓 연결 생성");
                
				var msg = {
                    type: "register",
                    memberId: memberId
                }
                
                ws.send(JSON.stringify(msg));
			};
			
			ws.onmessage = function(e) {
				var msg = e.data;
                var chat = $("#msgArea").val() + "\n상대방 : " + msg;
                $("#msgArea").val(chat);
			};
			
			ws.onclose = function() {
				console.log("연결종료");
			};
		}
        
        $(function() {
            connect();
            $("#sendBtn").click(function() {
                var chat = $("#chatMsg").val();
                var msg = $("#msgArea").val() + "\n나 : " + chat;
                $("#msgArea").val(msg);
                $("#chatMsg").val("");
                
                var sendMsg = {
                    type: "chat",
                    target: $("#target").val(),
                    msg: chat
                }
                
                ws.send(JSON.stringify(sendMsg));
            });
            
        });
	</script>
</body>
</html>