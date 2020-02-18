package kh.java.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamTest {

	Scanner sc = new Scanner(System.in);

	// FileWriter를 이용한 파일 출력
	public void primaryStream() {

		FileWriter fw = null;

		System.out.print("저장할 파일 명 : ");
		String fileName = sc.next();

		sc.nextLine();

		try {
			fw = new FileWriter(fileName);

			System.out.println("[" + fileName + "] 파일에 저장될 내용 입력");
			System.out.println("종료는 exit");

			int lineNumber = 1;

			while (true) {

				System.out.print((lineNumber++) + " : ");
				String str = sc.nextLine() + "\r\n";

				if (str.equals("exit\r\n")) {
					break;
				} else {
					fw.write(str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 보조 스트림 BufferedWriter를 이용한 파일 출력
	public void subStream() {

		BufferedWriter bw = null;

		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.next();

		sc.nextLine();

		try {
			bw = new BufferedWriter(new FileWriter(fileName));

			System.out.println("[" + fileName + "] 파일에 저장될 내용 입력");
			System.out.println("종료는 exit");

			int lineNumber = 1;

			while (true) {
				System.out.print((lineNumber++) + " : ");
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				} else {
					bw.write(str);
					bw.newLine();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 보조 스트림 BufferedReader를 사용해 파일 읽어오기
	public void reader() {
		System.out.print("로드할 파일명 입력 : ");
		String fileName = sc.next();

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fileName));

			int lineNumber = 1;

			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				
				System.out.println((lineNumber++) + ".\t" + str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
