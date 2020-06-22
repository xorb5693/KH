package kr.or.iei.common;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component("cardHandler")
public class CardHandler extends TextWebSocketHandler {

	private ArrayList<WebSocketSession> members;

	public CardHandler() {
		members = new ArrayList<WebSocketSession>();
	}

	// 소켓이 생성되어 연결되었을 때 실행되는 메소드
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {

		System.out.println("카드 페이지 연결 성공!!");
		members.add(session);// 신규 접속자 정보 저장
	}
	
	public void cardResponse(String cardNo) throws Exception {
		
		if (!members.isEmpty()) {
			WebSocketSession ws = members.get(0);
			ws.sendMessage(new TextMessage(cardNo));
		}
	}

	// 연결이 끊겼을 때 동작하는 메소드
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {

		System.out.println("카드 페이지 연결 종료!!");
		members.remove(session);
	}
}
