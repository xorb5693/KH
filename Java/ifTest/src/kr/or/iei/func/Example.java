package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);
	
	public void exam1() {
		
		System.out.println("======== 숫자 구별 프로그램 ========");
		
		System.out.print("임의의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 양수입니다.\n", num);
		}
		if (num == 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 0입니다.\n", num);
		}
		if (num < 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 음수입니다.\n", num);
		}
	}
	
	public void exam2() {
		
		System.out.println("========= 두수 비교 프로그램 ========");
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.printf("%d > %d\n", num1, num2);
			System.out.println("첫번째 수가 더 큽니다");
		}
		if (num1 == num2) {
			System.out.printf("%d = %d\n", num1, num2);
			System.out.println("두 수가 같습니다");
		}
		if (num1 < num2) {
			System.out.printf("%d < %d\n", num1, num2);
			System.out.println("두번째 수가 더 큽니다");
		}
	}
	
	public void exam3() {
		
		System.out.println("========= 계산기 프로그램 =========");

		System.out.print("연산자를 입력하세요(+, -, *, /) : ");
		char oper = sc.next().charAt(0);
		
		System.out.print("첫번째 정수를 입력 하세요. : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력 하세요. : ");
		int num2 = sc.nextInt();
		
		if (oper =='+') {
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
		}
		if (oper =='-') {
			System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		}
		if (oper =='*') {
			System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
		}
		if (oper =='/') {
			System.out.printf("%d / %d = %f\n", num1, num2, ((double)num1 / num2));
		}
	}
	
	public void test1() {
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
//		if (num % 2 != 0) {
//			System.out.println("홀수입니다.");
//		}
	}
	
	public void exam4() {
		System.out.println("========= 놀이공원 프로그램 =========");
		
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int people = sc.nextInt();
		
		System.out.print("어른은 몇명입니까?(1인당 15000원) : ");
		int adult = sc.nextInt();
		
		System.out.print("아이 몇명입니까?(1인당 5000원) : ");
		int child = sc.nextInt();
		
		if (people == adult + child) {
			System.out.printf("지불하실 총 금액은 %d원 입니다.\n", (adult * 15000 + child * 5000));
		} else {
			System.out.println("인원수가 맞지 않습니다.");
		}
		
		System.out.println();
	}
	
	public void exam5() {
		System.out.println("========= 퀴즈 프로그램 =========");
		
		int collect = 0;
		
		System.out.println("첫번째 퀴즈");
		System.out.print("사과는 영어로 무엇일까요(1. apple, 2. 스티브 잡스)? : ");
		int answer = sc.nextInt();
		if (answer == 1) {
			System.out.println("정답!!!");
			collect++;
		} else {
			System.out.println("땡!!");
		}
		
		System.out.println("두번째 퀴즈");
		System.out.print("바나나는 길어 길으면 기차 기차는  (1. 비싸, 2. 빨라)? : ");
		answer = sc.nextInt();
		if (answer == 2) {
			System.out.println("정답!!");
			collect++;
		} else {
			System.out.println("땡!!");
		}
		
		System.out.println("총 " + collect + "문제를 맞췄습니다.");
		System.out.println();
	}
	
	public void exam6() {
		System.out.println("======== 심리테스트 ========");
		
		int answer;
		
		System.out.print("당신은 술을 좋아하십니까(1. yes, 2. no)? : ");
		answer = sc.nextInt();
		
		if (answer == 1) {
			System.out.print("당신은 담배를 피웁니까(1.yes, 2. no)? : ");
			answer = sc.nextInt();
			
			if (answer == 1) {
				System.out.println("담배는 건강에 좋지 않습니다.");
			} else {
				System.out.println("술은 간에 좋지 않습니다.");
			}
		} else {
			System.out.print("당신은 이성친구가 있습니까(1. yes, 2. no)? : ");
			answer = sc.nextInt();
			
			if (answer == 1) {
				System.out.println("올..ㅋ");
			} else {
				System.out.println("힘내요 ㅠㅠ");
			}
		}
		
		System.out.println();
	}
}
