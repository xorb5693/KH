package kh;

import java.io.*;

public class HelloJava {

	public static void main(String[] args) {
		
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String str;
				
			for (int i = 0; i < 10; i++) {
				str = bf.readLine();
				System.out.println(str);
			}
		} catch (IOException ie) {
			System.err.println(1);
		}
	}

}
