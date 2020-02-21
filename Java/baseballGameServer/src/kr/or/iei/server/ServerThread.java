package kr.or.iei.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {

	ArrayList<Integer> num = new ArrayList<Integer>();
	Server server = null;
	Socket socket = null;

	// 생성자. 매개변수로 숫자 배열과 Server 객체, 클라이언트의 Socket 객체를 받는다.
	public ServerThread(ArrayList<Integer> num, Server server, Socket socket) {

		this.num = num;
		this.server = server;
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			//클라이언트의 메시지를 받기 위한 dis와 클라이언트로 메시지를 전송하기 위한 dos
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());

			while (true) {
				int strike = 0, ball = 0;
				int insertNum[] = new int[3];
				//readInt 메소드를 통해 3개의 숫자를 전송받는다.
				insertNum[0] = dis.readInt();
				insertNum[1] = dis.readInt();
				insertNum[2] = dis.readInt();

				System.out.println("클라이언트가 입력한 수 -> " + insertNum[0] + " " + insertNum[1] + " " + insertNum[2]);

				//만약 같은 자리의 숫자가 동일하다면 strike를 1 증가시킨다.
				for (int i = 0; i < 3; i++) {
					if (num.get(i) == insertNum[i]) {
						strike++;
					}
				}

				//클라이언트에서 입력받은 숫자를 contains 메소드를 통해 리스트에 있는지 확인하고 만약 있다면 ball을 1 증가시킨다.
				for (int i = 0; i < 3; i++) {
					if (num.contains(insertNum[i])) {
						ball++;
					}
				}
				
				//실질적인 ball의 값은 strike를 뺀 값이다.
				//이유는 ball을 연산하기 위한 contains 메소드는 같은 위치인 경우라도 true를 리턴하기에 strike인 경우에도 ball을 추가하기 때문이다. 
				ball -= strike;

				System.out.println(strike + " 스트라이크 " + ball + " 볼");

				//클라이언트를 통해 strike와 ball을 전송한다.
				dos.writeInt(strike);
				dos.writeInt(ball);

				System.out.println();

				//만약 strike가 3이면 Server객체의 print 메소드를 호출한다.
				if (strike == 3) {
					server.print(dos);
					break;
				}
			}

			//클라이언트와의 스트림과 Socket을 닫는다.
			dis.close();
			dos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
