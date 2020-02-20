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
		
		String ipAddress = "127.0.0.1";
		int portNumber = 60001;
		
		try {
			Socket socket = new Socket(ipAddress, portNumber);
			
			System.out.println("클라이언트 소켓을 생성했습니다");
			System.out.println("아구 게임을 시작합니다");
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			while (true) {
				System.out.println("세 수를 입력해 주세요(ex: 1 2 3)");
				System.out.print(" -->");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				
				dos.writeInt(num1);
				dos.writeInt(num2);
				dos.writeInt(num3);
				
				int strike = dis.readInt();
				int ball = dis.readInt();
				
				System.out.println(": " + strike + " 스트라이크 " + ball + "볼");
				System.out.println("");
				
				if (strike == 3) {
					System.out.println("3 스트라이크!! 프로그램을 종료합니다..\n");
					int rank = dis.readInt();
					System.out.println(rank + " 등입니다.");
					System.out.println("\n프로그램을 종료합니다");
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
