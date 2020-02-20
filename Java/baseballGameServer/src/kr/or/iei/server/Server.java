package kr.or.iei.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {

	int num[] = new int[3];
	Random rand = new Random();
	int rank = 1;
	int member = 0;

	public void main() {

		System.out.println("test");

		int count = 0;
		int i;

		while (count < 3) {
			int number = rand.nextInt(10);

			for (i = 0; i < count; i++) {
				if (num[i] == number) {
					break;
				}
			}

			if (i == count) {
				num[count++] = number;
			}
		}

		try {
			ServerSocket serverSock = new ServerSocket(60001);

			System.out.println("서버 소켓을 생성 했습니다.");
			System.out.println("클라이언트의 접속을 기다립니다......");
			System.out.println("서버숫자 -> " + num[0] + " " + num[1] + " " + num[2]);

			while (true) {
				Socket client = serverSock.accept();
				member++;

				System.out.println("클라이언트가 접속했습니다.");
				System.out.println("현재 총 " + member + " 명 클라이언트");

				// DataOutputStream dos = new DataOutputStream(client.getOutputStream());
				// DataInputStream dis = new DataInputStream(client.getInputStream());
				//
				// while (true) {
				// int strike = 0, ball = 0;
				// int insertNum[] = new int[3];
				// insertNum[0] = dis.readInt();
				// insertNum[1] = dis.readInt();
				// insertNum[2] = dis.readInt();
				//
				// System.out.println("클라이언트가 입력한 수 -> " + insertNum[0] + " " + insertNum[1] + "
				// " + insertNum[2]);
				//
				// for (i = 0; i < 3; i ++) {
				// if (num[i] == insertNum[i]) {
				// strike++;
				// }
				// }
				//
				// for (i = 0; i < 3; i++) {
				// for (int j = 0; j < 3; j++) {
				// if (num[i] == insertNum[j] && i != j) {
				// ball++;
				// }
				// }
				// }
				//
				// System.out.println(strike + " 스트라이크 " + ball + " 볼");
				//
				// dos.writeInt(strike);
				// dos.writeInt(ball);
				//
				// System.out.println();
				//
				// if (strike == 3) {
				// System.out.println(strike + " 스트라이크 현재 클라이언트와 접속을 종료합니다.");
				// member--;
				// dos.writeInt(rank++);
				// break;
				// }
				// }
				//
				// dis.close();
				// dos.close();

				ServerThread serverThread = new ServerThread(num, this, client);
				serverThread.start();
			}
//			client.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void print(DataOutputStream dos) {
		System.out.println("3 스트라이크 현재 클라이언트와 접속을 종료합니다.");
		member--;
		try {
			dos.writeInt(rank++);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
