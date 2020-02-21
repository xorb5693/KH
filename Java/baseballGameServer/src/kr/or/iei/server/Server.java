package kr.or.iei.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class Server {

	ArrayList<Integer> num = new ArrayList<Integer>();
	Random rand = new Random();
	int rank = 1;
	int member = 0;

	public void main() {

		int count = 0;

		//3개의 0~9 사이의 숫자를 뽑기 위한 반복문
		//반복문은 count가 3이 될 때 까지 반복한다.
		while (count < 3) {
			int number = rand.nextInt(10);

			//난수로 뽑은 숫자가 리스트에 존재하는지 확인한다.			
			if (!num.contains(number)) {
				//만약 난수로 뽑은 숫자가 리스트에 없다면(false) 리스트에 해당 숫자를 저장하고 count를 1증가 시킨다.
				num.add(number);
				count++;
			}
		}

		try {
			//ServerSocket 생성
			ServerSocket serverSock = new ServerSocket(60001);

			System.out.println("서버 소켓을 생성 했습니다.");
			System.out.println("클라이언트의 접속을 기다립니다......");
			System.out.println("서버숫자 -> " + num.get(0) + " " + num.get(1) + " " + num.get(2));

			while (true) {
				//클라이언트의 연결 요청이 올 때 까지 기다리고, 클라이언트가 연결이 되면 멤버를 1 증가시킨다.
				Socket client = serverSock.accept();
				member++;

				System.out.println("클라이언트가 접속했습니다.");
				System.out.println("현재 총 " + member + " 명 클라이언트");

				//ServerThread 객체 생성.
				//매개변수로 숫자 리스트와 현재 Server 객체, 그리고 클라이언트 Socket 객체를 넘긴다.
				ServerThread serverThread = new ServerThread(num, this, client);
				//스레드 시작
				serverThread.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//클라이언트로 현재 랭크를 전송하고, member 숫자를 감소시키기 위한 메소드.
	//매개변수로 클라이언트의 OutputStream을 받는다.
	public void print(DataOutputStream dos) {
		System.out.println("3 스트라이크 현재 클라이언트와 접속을 종료합니다.");
		member--;
		System.out.println("현재 접속된 클라이언트 : " + member + "명");
		try {
			dos.writeInt(rank++);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
