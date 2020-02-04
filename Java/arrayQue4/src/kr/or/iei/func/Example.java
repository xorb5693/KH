package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);

	public void exam1() {

		System.out.print("입력값 : ");
		String str = sc.next();
		int count = 0;

		char strArray[] = new char[str.length()];

		// 문자열을 배열에 복사
		for (int i = 0; i < str.length(); i++) {
			strArray[i] = str.charAt(i);
		}

		System.out.print("검색값 : ");
		char search = sc.next().charAt(0);

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == search) {
				count++;
			}
		}

		System.out.println("출력 : 입력하신 문자열 " + str + "에서 찾으시는 문자 " + search + "은(는) " + count + "개 입니다.");

		System.out.println("==========");
	}

	public void exam2() {

		char phone1[] = new char[13];
		char phone2[] = new char[13];

		System.out.print("전화번호('-'를 포함하여 입력하세요.) : ");
		String phone = sc.next();

		// 문자열을 배열에 복사
		for (int i = 0; i < phone1.length; i++) {
			phone1[i] = phone.charAt(i);
		}

		// 배열1을 다시 배열2에 복사하면서 가운데 4자리 즉, 4, 5, 6, 7번 자리를 *로 변경
		System.arraycopy(phone1, 0, phone2, 0, 4);

		for (int i = 4; i < 8; i++) {
			phone2[i] = '*';
		}

		System.arraycopy(phone1, 8, phone2, 8, 5);

		for (int i = 0; i < phone2.length; i++) {
			System.out.print(phone2[i]);
		}

		System.out.println();
		System.out.println("==========");
	}

	public void exam3() {

		String residentNumber;

		System.out.print("주민등록번호('-'를 포함하여 입력하세요.) : ");
		residentNumber = sc.next();

		char residentNumber1[] = new char[residentNumber.length()];
		char residentNumber2[] = new char[residentNumber.length()];

		// 문자열을 배열로 변환
		for (int i = 0; i < residentNumber1.length; i++) {
			residentNumber1[i] = residentNumber.charAt(i);
		}

		// 배열1을 배열2에 복사하면서 성별 뒤의 자리 즉, 8번부터 13번까지 *로 변경
		System.arraycopy(residentNumber1, 0, residentNumber2, 0, 8);

		for (int i = 8; i < residentNumber2.length; i++) {
			residentNumber2[i] = '*';
		}

		for (int i = 0; i < residentNumber2.length; i++) {
			System.out.print(residentNumber2[i]);
		}

		System.out.println();
		System.out.println("==========");
	}

	public void exam4() {

		int number;

		while (true) {
			System.out.print("홀수를 입력하세요 : ");
			number = sc.nextInt();
			if (number % 2 == 1) {
				break;
			}
		}

		int num[] = new int[number];

		int count = 1;

		for (int i = 0; i < num.length; i++) {
			if (i < num.length / 2) {
				num[i] = count;
				count++;
			} else if (i == num.length / 2) {
				num[i] = count;
			} else {
				count--;
				num[i] = count;
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d\t", num[i]);
		}
	}
}
