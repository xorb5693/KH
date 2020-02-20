package kr.or.iei.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {

	int num[];
	Server server;
	Socket socket;

	public ServerThread(int num[], Server server, Socket socket) {

		this.num = num;
		this.server = server;
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());

			while (true) {
				int strike = 0, ball = 0;
				int insertNum[] = new int[3];
				insertNum[0] = dis.readInt();
				insertNum[1] = dis.readInt();
				insertNum[2] = dis.readInt();

				System.out.println("클라이언트가 입력한 수 -> " + insertNum[0] + " " + insertNum[1] + " " + insertNum[2]);

				for (int i = 0; i < 3; i++) {
					if (num[i] == insertNum[i]) {
						strike++;
					}
				}

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (num[i] == insertNum[j] && i != j) {
							ball++;
						}
					}
				}

				System.out.println(strike + " 스트라이크 " + ball + " 볼");

				dos.writeInt(strike);
				dos.writeInt(ball);

				System.out.println();

				if (strike == 3) {
					server.print(dos);
					break;
				}
			}

			dis.close();
			dos.close();
			serverClose(socket);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}

	private void serverClose(Socket socket) throws IOException {
		socket.close();
	}
}
