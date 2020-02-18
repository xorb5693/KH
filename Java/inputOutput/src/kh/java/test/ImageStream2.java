package kh.java.test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.omg.Messaging.SyncScopeHelper;

public class ImageStream2 {

	public void imageTest() {
		// quiz.txt 파일의 내용을 읽어오기 위한 보조스트림
		BufferedReader br = null;
		// 이미지 파일로 내보내기 위한 주스트림
		FileOutputStream fos = null;
		// 이미지 파일로 내보내기 위한 보조스트림
		BufferedOutputStream bos = null;
		
		try {

			// 1줄로 되어 있는 파일
			// 16진수 숫자 1개 공백이 반복되고 있는 파일
			// quiz.txt 파일을 읽어오기 위한 주스트림 생성과 속도 증가를 위한 보조스트림 생성
			br = new BufferedReader(new FileReader("quiz.txt"));
			
			// 문서 파일이 1줄로 되어 있기 때문에 파일에서 1줄 읽어옴
			String str = br.readLine();
			// 16진수를 1개씩 저장하기 위해 공백을 구분자로 잘라낸다
			StringTokenizer sT = new StringTokenizer(str, " ");
			// String 타입으로 분리, 16진수로 잘라낸 데이터를 저장하기 위한 ArrayList 생성
			ArrayList<Byte> al = new ArrayList<Byte>();
			
			// 바이트 스트림으로 데이터를 내보내기 위해 16진수로 변환하여 바이트로 저장
			while(sT.hasMoreTokens()) {
				byte b = (byte)Integer.parseInt(sT.nextToken(), 16);
				al.add(b);
			}
			
			System.out.println(al.size());
			
			// quiz.gif로 파일을 저장하기 위한 주스트림 생성
			fos = new FileOutputStream("quiz3.gif");
			
			long start = System.currentTimeMillis();
			
			for (int i : al) {
				fos.write(i);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("파일 저장 완료 : " + (end - start));

			// quiz2.gif로 파일을 저장하기 위한 보조스트림 생성
			bos = new BufferedOutputStream(new FileOutputStream("quiz4.gif"));
			
			start = System.currentTimeMillis();
			
			for (int i : al) {
				bos.write(i);
			}
			
			bos.flush();
			end = System.currentTimeMillis();
			System.out.println("파일 저장 완료 : " + (end - start));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fos.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
