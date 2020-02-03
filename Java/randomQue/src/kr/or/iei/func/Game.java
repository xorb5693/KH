package kr.or.iei.func;

import java.util.Scanner;
import java.util.Random;

public class Game {

	Random rand = new Random();
	Scanner sc = new Scanner(System.in);

	public void game1() throws NumberFormatException {
		//최저 카운트 기록을 저장하기 위한 변수
		int max = 0;

		while (true) {
			System.out.println("== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			
			int check = Integer.parseInt(sc.next());
			
			if (check < 1 || check > 3) {
				//입력된 숫자가 1~3 사이가 아니면 다시
				System.out.println("잘못입력하셨습니다.");
				continue;
			} else if (check == 3) {
				//게임 종료
				break;
			} else if (check == 2) {
				//최저 기록 확인
				if (max != 0) {
					System.out.println("현재 최고 기록은 " + max + "회 입니다.");
				} else {
					System.out.println("아직 기록이 없습니다.");
				}
				continue;
			}

			//난수 생성
			int randNum = rand.nextInt(99) + 1;
			int userNum;
			int count = 1;

			System.out.println("<< Game Start >>");

			while (true) {
				System.out.print(count + " 회차 번호 입력 : ");
				userNum = Integer.parseInt(sc.next());

				if (userNum < 1 || userNum > 99) {
					//숫자 범위를 벗어나면 오류 메시지 출력.
					System.out.println("입력범위 오류");
				} else if (userNum > randNum) {
					//사용자가 입력한 숫자보다 난수가 더 작으면 down을 출력하고 count에 1을 더한다.
					System.out.println("<< DOWN >>");
					count++;
				} else if (userNum < randNum) {
					//사용자가 입력한 숫자보다 난수가 더 크면 up을 출력하고 count에 1을 더한다.
					System.out.println("<< UP >>");
					count++;
				} else {
					//만약 사용자가 정답을 입력했다면 정답을 출력하고 max값이 0이거나 count보다 크면 max를 count로 바꾼다.
					System.out.println("<< 정답 >>");
					if (count < max || max == 0) {
						max = count;
					}
					break;
				}
			}
		}
	}

	public void game2() throws NumberFormatException {
		//승패 정보를 저장할 변수
		int win = 0;
		int lose = 0;
		//사용자가 입력한 숫자와 컴퓨터가 입력한 숫자를 저장할 변수
		int userNum, comNum;

		while (true) {
			//게임 종료를 선택할 때 해당 정보를 저장할 변수
			boolean endGame = false;
			
			System.out.println("Baskin Robbins31 Game");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			
			int check = Integer.parseInt(sc.next());
			
			if (check < 1 || check > 3) {
				//입력된 숫자가 1~3이 아니면 다시
				System.out.println("잘못입력하셨습니다.");
				continue;
			} else if (check == 3) {
				//게임 종료
				break;
			} else if (check == 2) {
				//승패 정보를 확인
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);

				continue;
			}

			System.out.println("<< Game Start >>");
			//현재까지 불린 숫자가 몇인지 저장하기 위한 변수 
			int baskin = 0;

			while (true) {
				System.out.print("Input Number(1~3) : ");
				userNum = Integer.parseInt(sc.next());

				System.out.println("<< Your Turn >>");
				if (userNum < 1 || userNum > 3) {
					System.out.println("1~3 사이 값을 입력해주세요.");
					continue;
				}
				
				//사용자가 입력한 1~3사이의 숫자를 baskin에 더하면서 화면에 출력한다.
				for (int i = 0; i < userNum; i++) {
					baskin++;
					System.out.println(baskin + "!");
					if (baskin == 31) {
						//baskin이 31이 된 순간 endGame을 true로 바꾸고 lose를 1 올린 다음 반복문을 종료한다.
						System.out.println("패배ㅠㅠ");
						lose++;
						endGame = true;
						break;
					}
				}

				//endGame이 true 즉, 사용자가 패배한 경우 시작 화면으로
				if (endGame == true) {
					break;
				}

				System.out.println("<< Computer Turn >>");
				comNum = rand.nextInt(3) + 1;

				//컴퓨터가 난수로 만들어낸 숫자를 baskin에 더하면서 화면에 출력한다.
				for (int i = 0; i < comNum; i++) {
					baskin++;
					System.out.println(baskin + "!");
					if (baskin == 31) {
						//baskin이 31이 된 순간 endGame을 true로 바꾸고 win을 1 올린 다음 반복문을 종료한다.
						System.out.println("승리!");
						win++;
						endGame = true;
						break;
					}
				}

				//endGame이 true 즉, 사용자가 승리한 경우 시작 화면으로
				if (endGame == true) {
					break;
				}
			}

		}

	}

	public void game3() throws NumberFormatException {

		//소지금
		int money = 10000;
		//승무패 횟수
		int win = 0;
		int lose = 0;
		int draw = 0;
		//사용자의 주사위와 컴퓨터의 주사위의 숫자를 저장할 변수
		int userDice1, userDice2, userDice3, comDice1, comDice2, comDice3;
		//주사위의 합을 저장할 변수
		int userSum, comSum;
		//게임을 계속하는지의 여부를 저장하기 위한 변수
		boolean endGame = false;

		while (true) {
			endGame = false;
			System.out.println("===== Dice Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			
			int check = Integer.parseInt(sc.next());
			
			//시작화면 선택지
			if (check < 1 || check > 3) {
				//숫자 1~3을 입력하지 않으면 처리하지 않는다.
				System.out.println("잘못입력하셨습니다.");
				continue;
			} else if (check == 3) {
				//3을 입력하면 게임 종료
				break;
			} else if (check == 2) {
				//2를 입력하면 게임 전적 출력
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				System.out.println("DRAW : " + draw);
				System.out.println("내 소지금 : " + money + "원");
				continue;
			} else if (money == 0) {
				//1을 입력했는데 만약 money가 0이면 잔액이 없다 출력을 하고 시작화면으로 돌아간다.
				System.out.println("잔액이 없습니다. bye~");
				continue;
			}

			while (true) {
				System.out.println("<< Game Start >>");

				userDice1 = rand.nextInt(6) + 1;
				userDice2 = rand.nextInt(6) + 1;
				userDice3 = rand.nextInt(6) + 1;
				userSum = userDice1 + userDice2 + userDice3;
				System.out.println("1번째 주사위 값 : " + userDice1);
				System.out.println("2번째 주사위 값 : " + userDice2);
				System.out.println("3번째 주사위 값 : " + userDice3);
				System.out.println("내 주사위 총 합 : " + userSum);
				System.out.print("배팅 하시겠습니까[y/n] : ");
				//배팅 여부
				char again = sc.next().charAt(0);

				if (again == 'y') {
					comDice1 = rand.nextInt(6) + 1;
					comDice2 = rand.nextInt(6) + 1;
					comDice3 = rand.nextInt(6) + 1;
					comSum = comDice1 + comDice2 + comDice3;
					while (true) {
						System.out.print("얼마를 배팅하시겠습니까(현재 내 소지금 " + money + "원) : ");
						int batting = Integer.parseInt(sc.next());

						if (batting > money) {
							System.out.println("금액이 부족합니다. 다시 입력해주세요.");
							continue;
						} else {
							System.out.println("컴퓨터 1번째 주사위 값 : " + comDice1);
							System.out.println("컴퓨터 2번째 주사위 값 : " + comDice2);
							System.out.println("컴퓨터 3번째 주사위 값 : " + comDice3);
							System.out.println("컴퓨터 주사위 총 합 : " + comSum);
							System.out.println("<< 결과 >>");
							
							//승패 여부에 따라 소지금 증감 연산 및 win, lose, draw의 증가.
							if (userSum > comSum) {
								System.out.println("승리!!!!!");
								System.out.println("+" + batting + "원!!");
								money += batting;
								win++;
							} else if (userSum == comSum) {
								System.out.println("비겼습니다......");
								draw++;
							} else {
								System.out.println("패배");
								System.out.println("-" + batting + "원!!");
								money -= batting;
								lose++;
								
								//만약 소지금이 0원이 되면 게임을 다시 시작하지 않고 바로 시작화면으로 돌아간다.
								if (money == 0) {
									System.out.println("거지 Bye~");
									endGame = true;
									break;
								}
							}
							
							System.out.print("한번 더 하시겠습니까[y/n] : ");
							again = sc.next().charAt(0);
							if (again != 'y') { 
								//화면에 y를 입력하지 않으면 endGame을 true로 바꾼다.
								endGame = true;
							}
							
							break;
						}
					}
				} else {
					System.out.println("메뉴로 돌아갑니다.");
					break;
				}
				
				//endGame이 true면 게임의 시작화면으로 돌아간다.
				if (endGame) {
					break;
				}
			}

		}
	}
}
