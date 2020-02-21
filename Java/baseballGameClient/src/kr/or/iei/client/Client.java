package kr.or.iei.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public void main() {

		Scanner sc = new Scanner(System.in);
		
		//Local host
		String ipAddress = "127.0.0.1";
		int portNumber = 60001;
		
		try {
			//서버에 연결 요청
			Socket socket = new Socket(ipAddress, portNumber);
			
			System.out.println("클라이언트 소켓을 생성했습니다");
			System.out.println("아구 게임을 시작합니다");
			
			//서버의 메시지를 받기 위한 dis와 서버에 메시지를 전송하기 위한 dos
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			while (true) {
				System.out.println("세 수를 입력해 주세요(ex: 1 2 3)");
				System.out.print(" -->");
				//Scanner를 통해 3개의 숫자를 입력받는다.
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				
				//writeInt 메소드를 통해 3개의 숫자를 전송한다.
				dos.writeInt(num1);
				dos.writeInt(num2);
				dos.writeInt(num3);
				
				//3개의 숫자를 전송하면 서버에서 strike와 ball값을 전송받는다.
				int strike = dis.readInt();
				int ball = dis.readInt();
				
				//화면에 strike와 ball을 전송받는다.
				System.out.println(": " + strike + " 스트라이크 " + ball + "볼");
				System.out.println();
				
				//만약 strike가 3인 경우
				if (strike == 3) {
					System.out.println("3 스트라이크!! 프로그램을 종료합니다..\n");
					//서버에서 rank를 전송하므로 rank를 전송받는다.
					int rank = dis.readInt();
					System.out.println(rank + " 등입니다.");
					System.out.println("\n프로그램을 종료합니다");
					
					//메시지를 출력하고 서버와의 스트림과 Socket을 닫은 뒤 무한 루프를 빠져 나온다.
					dis.close();
					dos.close();
					socket.close();
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
