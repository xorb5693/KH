package kr.or.iei.func;

import java.io.*;

public class Example {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void exam() {
		
		try {
			System.out.print("2차원 배열 크기 입력 : ");
			int num = Integer.parseInt(br.readLine());
			boolean map1[][] = new boolean[num][num];
			boolean map2[][] = new boolean[num][num];
			
			int mapNum;
			int max = (int)Math.pow(2, num) - 1;
			
			System.out.println("지도 1");
			for (int i = 0; i < num; i++) {
				
				while (true) {
					System.out.print("숫자" + (i + 1) + " : ");
					mapNum = Integer.parseInt(br.readLine());

					//입력받은 숫자가 배열 크기 이내인지 파악	
					if (mapNum > max) {
						System.out.println("범위 내의 숫자를 입력하세요.");
					} else {
						break;
					}
				}

				//10진수 -> 2진수 변환. 2진수의 가장 끝 자리가 배열의 0번
				for (int j = 0; j < map1[i].length; j++) {
					if (mapNum % 2 == 1) {
						map1[i][j] = true;
					} else {
						map1[i][j] = false;
					}
					mapNum /= 2;
					if (mapNum == 0) break;
				}
			}
			
			System.out.println("지도 2");
			for (int i = 0; i < num; i++) {
				
				while (true) {
					System.out.print("숫자" + (i + 1) + " : ");
					mapNum = Integer.parseInt(br.readLine());

					//입력받은 숫자가 배열 크기 이내인지 파악	
					if (mapNum > max) {
						System.out.println("범위 내의 숫자를 입력하세요.");
					} else {
						break;
					}
				}
				
				//10진수 -> 2진수 변환. 2진수의 가장 끝 자리가 배열의 0번
				for (int j = 0; j < map1[i].length; j++) {
					if (mapNum % 2 == 1) {
						map2[i][j] = true;
					} else {
						map2[i][j] = false;
					}
					mapNum /= 2;
					if (mapNum == 0) break;
				}
				
			}

			//입력받은 두 배열을 비교.
			for (int i = 0; i < num; i++) {
				System.out.print("\"");
				
				//2진수의 가장 끝 자리가 배열의 0번이므로 연산은 배열의 가장 끝 부터 실행한다. 
				for (int j = num - 1 ; j >= 0; j--) {
					
					//map1[i][j]와 map2[i][j] 중 하나라도 true면 #출력, 둘 다 false면 공백 출력
					if (map1[i][j] || map2[i][j]) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("\"");
			}
			
		} catch (IOException ie) {
			System.err.println(ie);
		} catch (NumberFormatException ne) {
			System.err.println("숫자를 입력하세요.");
		}
	}
}
