package kr.or.iei.func;

import java.util.Scanner;
import java.util.Random;

public class Example {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public void exam() {
		int num[] = new int[10000];
		int num2[] = new int[10000];
		int num3[] = new int[10000];
		int temp, index, remember;
		int i, j;
		
		//정렬 시간 측정을 위한 변수
		long start[] = new long[3];
		long end[] = new long[3];

		try {
			for (i = 0; i < num.length; i++) {
				System.out.print((i + 1) + "번째 숫자 입력 : ");
//				num[i] = Integer.parseInt(sc.next());
				num[i] = rand.nextInt(1000000);
				System.out.println(num[i]);
				num2[i] = num[i];
				num3[i] = num[i];
			}

			start[0] = System.currentTimeMillis();
			
			//버블정렬
			for (i = 0; i < num.length - 1; i++) {
				//1사이클 당 0부터 배열 길이 - i만큼 바로 옆의 항과 비교하여 정렬한다.
				for (j = 0; j < num.length - 1 - i; j++) {
					if (num[j] > num[j + 1]) {
						temp = num[j];
						num[j] = num[j + 1];
						num[j + 1] = temp;
					}
				}
			}
			
			end[0] = System.currentTimeMillis();

			for (i = 0; i < num.length; i++) {
				System.out.print(num[i] + "\t");
			}

			System.out.println();
			
			start[1] = System.currentTimeMillis();

			//선택정렬
			for (i = 0; i < num.length; i++) {
				//1사이클당 index를 i로 저장하여 index항이 비교하는 항보다 트면 index값을 변경한다.
				index = i;
				for (j = i + 1; j < num.length; j++) {
					if (num2[index] > num2[j]) {
						index = j;
					}
				}
				
				//만약 index가 i와 다른 경우 즉, index가 비교 전의 기존의 index와 다르면 교환한다.
				if (i != index) {
					temp = num2[i];
					num2[i] = num2[index];
					num2[index] = temp;
				}
			}
			
			end[1] = System.currentTimeMillis();

			for (i = 0; i < num2.length; i++) {
				System.out.print(num2[i] + "\t");
			}

			System.out.println();
			
			start[2] = System.currentTimeMillis();

			//삽입정렬
			for (i = 0; i < num.length - 1; i++) {
				remember = num3[i + 1];

				for (j = i; j >= 0; j--) {
					if (remember < num3[j]) {
						num3[j + 1] = num3[j];
					} else {
						break;
					}
				}
				
				num3[j + 1] = remember;
			}
			
			end[2] = System.currentTimeMillis();

			for (i = 0; i < num3.length; i++) {
				System.out.print(num3[i] + "\t");
			}

			System.out.println();
			
			for (i = 0; i < 3; i++) {
				System.out.println((i + 1) + "번 정렬 소요 시간 : " + (end[i] - start[i]));
			}
			
		} catch (NumberFormatException ne) {
			System.err.println("숫자를 입력해 주세요.");
		}
	}
}
