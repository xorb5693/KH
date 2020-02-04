package kr.or.iei.func;

import java.util.Scanner;
import java.util.Random;

public class Lotto {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public Lotto() {
		while (true) {
			try {

				int select;

				while (true) {
					System.out.println("====== 프로그램 선택 ======");
					System.out.println("1. 1회");
					System.out.println("2. 당첨될 때 까지");
					System.out.println("3. 프로그램 종료");
					System.out.print("선택 > ");

					select = Integer.parseInt(sc.next());
					if (select == 1 || select == 2 || select == 3) {
						break;
					}
				}

				if (select == 1) {
					lottoOne();
				} else if (select == 2) {
					lottoLoop();
				} else if (select == 3) {
					break;
				} else {
					System.out.println("1~3 사이의 숫자를 입력해 주세요.");
				}

			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			}
		}
	}

	//1번만 비교하는 로또 프로그램
	private void lottoOne() {
		while (true) {
			System.out.println("========== 로또 프로그램 ==========");

			int count = 0;
			int userNum[] = new int[6];
			int comNum[] = new int[6];
			int number, i, temp;

			//사용자 숫자 입력
			while (count != 6) {
				System.out.print((count + 1) + "번째 번호 입력(1~45) : ");
				number = sc.nextInt();

				if (number < 1 || number > 45) {
					//사용자가 입력한 숫자가 1~45 사이가 아닌 경우
					System.out.println("잘못입력하셨습니다. 1~45중 한개를 입력해주세요.");
				} else {
					//사용자가 입력한 숫자가 1~45 사이인 경우 중복 체크
					for (i = 0; i < count; i++) {
						//동일한 숫자가 존재하는 경우 break
						if (userNum[i] == number) {
							System.out.println("이미 중복된 번호입니다. 다시 입력해주세요.");
							break;
						}
					}

					//count가 i인 경우 즉, count번까지 동일한 숫자가 아닌 경우 userNum[count]에 숫자를 입력하고 count를 1 증가시킨다.
					if (i == count) {
						userNum[count] = number;
						count++;
					}
				}
			}

			//버블 정렬을 이용하여 숫자 정렬
			for (i = 0; i < userNum.length - 1; i++) {
				for (int j = 0; j < userNum.length - i - 1; j++) {
					if (userNum[j] > userNum[j + 1]) {
						temp = userNum[j];
						userNum[j] = userNum[j + 1];
						userNum[j + 1] = temp;
					}
				}
			}
			System.out.println("사용자 번호");

			for (i = 0; i < userNum.length; i++) {
				System.out.print(userNum[i] + " ");
			}

			System.out.println();

			count = 0;

			//컴퓨터 숫자 입력
			while (count != 6) {
				//난수를 이용하여 숫자를 입력한다.
				number = rand.nextInt(45) + 1;

				for (i = 0; i < count; i++) {
					//동일한 숫자가 존재하는 경우 break
					if (comNum[i] == number) {
						break;
					}
				}

				//count가 i인 경우 즉, count번까지 동일한 숫자가 존재하지 않는 경우 comNum[count]에 숫자를 입력하고 count를 1 증가시킨다.
				if (i == count) {
					comNum[count] = number;
					count++;
				}
			}

			//버블 정렬을 이용하여 숫자 정렬
			for (i = 0; i < comNum.length - 1; i++) {
				for (int j = 0; j < comNum.length - i - 1; j++) {
					if (comNum[j] > comNum[j + 1]) {
						temp = comNum[j];
						comNum[j] = comNum[j + 1];
						comNum[j + 1] = temp;
					}
				}
			}
			System.out.println("컴퓨터 번호");

			for (i = 0; i < comNum.length; i++) {
				System.out.print(comNum[i] + " ");
			}

			System.out.println();

			//동일한 숫자가 존재하는 갯수가 몇개인지 저장하기 위한 변수
			int collect = 0;

			//이중 for문을 이용하여 동일한 숫자가 존재하면 collect를 더한다.
			for (i = 0; i < userNum.length; i++) {
				for (int j = 0; j < userNum.length; j++) {
					if (userNum[i] == comNum[j]) {
						collect++;
						break;
					}
				}
			}

			System.out.println("맞은 갯수 : " + collect);

			switch (collect) {
			case 6:
				System.out.println("1등");
				break;
			case 5:
				System.out.println("3등");
				break;
			case 4:
				System.out.println("4등");
				break;
			case 3:
				System.out.println("5등");
				break;
			default:
				System.out.println("꽝");
			}

			System.out.print("한번 더 하시겠습니까(1. yes, 2. no)? ");
			int again = sc.nextInt();

			if (again != 1) {
				break;
			}
		}
	}

	//로또가 3등 이상까지 당첨될 때 까지 무한루프를 도는 프로그램
	private void lottoLoop() {
		System.out.println("========== 로또 프로그램 ==========");

		int count = 0;
		//loop 횟수를 저장하기 위한 변수
		int loop = 1;
		int userNum[] = new int[6];
		int comNum[] = new int[6];
		int clearArray[] = new int[6];
		int number, i, temp;

		//6개의 숫자 입력
		while (count != 6) {
			System.out.print((count + 1) + "번째 번호 입력(1~45) : ");
			number = sc.nextInt();

			if (number < 1 || number > 45) {
				//입력받은 숫자가 1~45 사이의 숫자가 아닌 경우
				System.out.println("잘못입력하셨습니다. 1~45중 한개를 입력해주세요.");
			} else {
				//입력받은 숫자가 1~45 사이인경우 중복 체크
				for (i = 0; i < count; i++) {
					//중복체크는 0부터 count까지 체크한다. 동일한 숫자가 존재하는 경우 break로 for문을 빠져나온다.
					if (userNum[i] == number) {
						System.out.println("이미 중복된 번호입니다. 다시 입력해주세요.");
						break;
					}
				}

				//i값이 count + 1인경우 즉, count번째 숫자까지 겹치는 숫자가 없는 경우 userNum[count]에 저장한다 
				if (i == count) {
					userNum[count] = number;
					count++;
				}
			}
		}

		//버블정렬을 이용하여 숫자 정렬
		for (i = 0; i < userNum.length - 1; i++) {
			for (int j = 0; j < userNum.length - i - 1; j++) {
				if (userNum[j] > userNum[j + 1]) {
					temp = userNum[j];
					userNum[j] = userNum[j + 1];
					userNum[j + 1] = temp;
				}
			}
		}

		while (true) {

			count = 0;
			System.out.println("========== " + loop + "회차 ==========");
			
			comNum = clearArray.clone();
			
			//컴퓨터의 6개의 숫자를 저장한다
			while (count != 6) {
				//난수를 이용하여 숫자를 입력한다.
				number = rand.nextInt(45) + 1;

				for (i = 0; i < count; i++) {
					//중복체크는 0부터 count까지 체크한다. 동일한 숫자가 존재하는 경우 break로 for문을 빠져나온다.
					if (comNum[i] == number) {
						break;
					}
				}

				//i값이 count + 1인경우 즉, count번째 숫자까지 겹치는 숫자가 없는 경우 userNum[count]에 저장한다
				if (i == count) {
					comNum[count] = number;
					count++;
				}
			}

			//버블정렬을 이용하여 숫자 정렬
			for (i = 0; i < comNum.length - 1; i++) {
				for (int j = 0; j < comNum.length - i - 1; j++) {
					if (comNum[j] > comNum[j + 1]) {
						temp = comNum[j];
						comNum[j] = comNum[j + 1];
						comNum[j + 1] = temp;
					}
				}
			}
			
			System.out.println("사용자 번호");

			for (i = 0; i < userNum.length; i++) {
				System.out.print(userNum[i] + " ");
			}

			System.out.println();
			
			System.out.println("컴퓨터 번호");

			for (i = 0; i < comNum.length; i++) {
				System.out.print(comNum[i] + " ");
			}

			System.out.println();
			
			//동일한 숫자가 존재하는 갯수가 몇개인지 저장하기 위한 변수
			int collect = 0;

			//이중 for문을 이용하여 동일한 숫자가 존재하면 collect를 1 증가
			for (i = 0; i < userNum.length; i++) {
				for (int j = 0; j < userNum.length; j++) {
					if (userNum[i] == comNum[j]) {
						collect++;
						break;
					}
				}
			}

			System.out.println("맞은 갯수 : " + collect);

			switch (collect) {
			case 6:
				System.out.println("1등");
				break;
			case 5:
				System.out.println("3등");
				break;
			case 4:
				System.out.println("4등");
				break;
			case 3:
				System.out.println("5등");
				break;
			default:
				System.out.println("꽝");
			}
			
			if (collect > 4) {
				//collect가 4보다 큰 경우 즉, 3등 이상인 경우 무한 루프를 빠져나간다.
				break;
			} else {
				//collect가 4이하인 경우 loop를 1 증가시킨다.
				loop++;
			}
		}
		
	}
}
