package kh.java.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public void main() {

		int portNumber = 60000;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("서버 아이피 입력 : ");
		//"192.168.10.12"
		String serverIP = sc.next();
		
		try {
			Socket socket = new Socket(serverIP, portNumber);

			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

			sc.nextLine();
			while (true) {
				String serverMsg = dis.readUTF();
				System.out.println("server > " + serverMsg);

				if (serverMsg.equals("exit")) {
					break;
				}

				System.out.print("메세지 입력 : ");
				String msg = sc.nextLine();

				dos.writeUTF(msg);
				
				if (msg.equals("exit")) {
					break;
				}
			}

			System.out.println("서버와 연결이 끊어졌습니다.");
			
			dis.close();
			dos.close();
			socket.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
