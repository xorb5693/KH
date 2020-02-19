package kr.or.iei.func;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class WordChain {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int count[] = new int[2];
	Random rand = new Random();
	ArrayList<String> wordList = new ArrayList<String>();

	public WordChain() {

		BufferedReader brWord = null;

		try {
			brWord = new BufferedReader(new FileReader("words.txt"));

			while (true) {
				String word = brWord.readLine();

				if (word == null) {
					break;
				}

				wordList.add(word);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				brWord.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void main() {

		while (true) {

			System.out.println("===== 끝말잇기 게임 =====");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 전적");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");

			try {

				int select = Integer.parseInt(br.readLine());
				switch (select) {
				case 1:
					wordChain();
					break;
				case 2:
					displayRecord();
					break;
				case 0:
					br.close();
					return;
				}
			} catch (NumberFormatException e) {
				System.err.println("숫자를 입력하세요.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}

		}
	}

	public void wordChain() {

		boolean first = true;
		String userStr = null, comStr = null;
		ArrayList<String> useList = new ArrayList<String>();

		while (true) {

			try {
				while (true) {
					System.out.print("단어 입력 : ");
					userStr = br.readLine();

					if (userStr.length() == 1) {
						//입력한 단어가 1글자 이하인 경우 다시 입력
						System.out.println("다시 입력하세요(1글자 이상)");
						continue;
					}

					// 단어 입력을 처음 받은 경우 무한 루프를 바로 빠져 나온다.
					if (first) {
						first = false;
						break;

					} else {
						// 단어 입력이 2번째 이상인 경우
						if (comStr.charAt(comStr.length() - 1) != userStr.charAt(0)) {
							// 이전 단어의 끝 글자와 입력 단어의 시작 글자가 다른 경우 다시 입력
							System.out.println("다시 입력하세요('" + comStr.charAt(comStr.length() - 1) + "'로 시작)");
							continue;
						} else if (useList.contains(userStr)) {
							// 이전에 입력했던 단어 중 하나인 경우
							System.out.println("다시 입력하세요(이미 입력한 단어입니다)");
							continue;
						} else {
							// 위의 조건을 모두 만족한 경우 무한 루프를 빠져 나온다.
							break;
						}
					}
				}

				if (!wordList.contains(userStr)) {
					// 해당 단어가 단어장에 없는 경우 패배를 출력하고 메인 메뉴로 돌아간다.
					System.out.println("패배!");
					count[1]++;
					break;
				}

				// 출력한 단어를 리스트에 추가한다.
				useList.add(userStr);

				// 컴퓨터가 입력 가능한 단어 리스트 초기화
				ArrayList<String> comList = new ArrayList<String>();

				for (String comWord : wordList) {
					// 단어장을 순회하며 출력한 단어 리스트에 해당 단어가 없으면서 사용자가 입력한 단어의 끝 글자와 순회중인 단어의 첫 글자가 같은 경우
					// comList에 단어를 추가한다.
					if (userStr.charAt(userStr.length() - 1) == comWord.charAt(0) && !useList.contains(comWord)) {
						comList.add(comWord);
					}
				}

				if (comList.size() == 0) {
					// 만약 comList에 단어가 하나도 없으면 승리를 출력하고 메인 메뉴로 돌아간다.
					System.out.println("승리!");
					count[0]++;
					break;
				} else {
					// 아닌경우 comList 중 하나를 랜덤으로 화면에 출력한다.
					int ranNum = rand.nextInt(comList.size());
					comStr = comList.get(ranNum);
					System.out.println("컴퓨터 : " + comStr);
				}

				// 출력한 단어를 리스트에 추가한다.
				useList.add(comStr);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public void displayRecord() {
		System.out.println("승리 : " + count[0]);
		System.out.println("패배 : " + count[1]);
	}

	public void delay() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
