package kh.java.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public void main() {

		// PORT번호 저장
		// 0~65535
		// 60000 사용
		Scanner sc = new Scanner(System.in);
		try {
			// 1. 서버의 소켓 객체 생성
			ServerSocket server = new ServerSocket(60000);
			// 2. 클라이언트의 접속 요청을 기다림
			// 3. 요청이 오면 수락
			System.out.println("클라이언트를 기다린다.");
			// 4. 클라이언트 정보를 저장
			Socket client = server.accept();
			System.out.println("클라이언트 접속");

			// 5. 클라이언트 정보를 통해서 OutputStream 생성
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			// 6. 클라이언트 정보를 통해서 InputStream 생성
			DataInputStream dis = new DataInputStream(client.getInputStream());

			while (true) {
				System.out.print("메세지 입력 : ");
				String msg = sc.nextLine();

				dos.writeUTF(msg);
				
				if (msg.equals("exit")) {
					break;
				}

				String clientMsg = dis.readUTF();

				System.out.println("client > " + clientMsg);
				
				if (clientMsg.equals("exit")) {
					break;
				}
			}
			
			System.out.println("클라이언트와 연결이 끊어졌습니다.");

			dis.close();
			dos.close();
			client.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}
}
