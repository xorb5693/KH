package kh.java.test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {

	Scanner sc = new Scanner(System.in);

	//FileOutputStream을 이용한 파일 출력
	public void primaryStream() {
		FileOutputStream fos = null;	//finally에서 사용을 못하기에 선언은 미리 해야 한다.

		System.out.print("저장할 파일 명 입력 : ");
		String filename = sc.next();

		sc.nextLine();

		try {
			fos = new FileOutputStream(filename);

			System.out.println("[" + filename + "] 파일에 입력할 내용 입력");
			System.out.println("종료는 exit 입력");

			int lineNumber = 1;

			while (true) {
				System.out.print((lineNumber++) + " : ");
				String str = sc.nextLine() + "\r\n";

				if (str.equals("exit\r\n")) {
					break;
				}

				fos.write(str.getBytes());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//보조 스트림 DataOutputStream을 이용한 파일 출력
	public void subStream() {
		
		DataOutputStream dos = null;
		
		System.out.print("저장할 파일명 입력 : ");
		String filename = sc.next();
		
		sc.nextLine();
		
		try {
			dos = new DataOutputStream(new FileOutputStream(filename));
			
			System.out.println("[" + filename + "] 파일에 입력할 내용 입력");
			System.out.println("종료는 exit 입력");

			int lineNumber = 1;

			while (true) {
				System.out.print((lineNumber++) + " : ");
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				}

				dos.writeChars(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
