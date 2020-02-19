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
						System.out.println("다시 입력하세요(1글자 이상)");
						continue;
					}

					if (first) {
						first = false;
						break;
						
					} else {
						
						if (comStr.charAt(comStr.length() - 1) != userStr.charAt(0)) {
							System.out.println("다시 입력하세요('" + comStr.charAt(comStr.length() - 1) + "'로 시작)");
							continue;
						} else if (useList.contains(userStr)) {
							System.out.println("다시 입력하세요(이미 입력한 단어입니다)");
							continue;
						} else {
							break;
						}
					}
				}

				if (!wordList.contains(userStr)) {
					System.out.println("패배!");
					count[1]++;
					break;
				}

				useList.add(userStr);

				ArrayList<String> comList = new ArrayList<String>();

				for (String comWord : wordList) {
					if (userStr.charAt(userStr.length() - 1) == comWord.charAt(0) && !useList.contains(comWord)) {
						comList.add(comWord);
					}
				}

				if (comList.size() == 0) {
					System.out.println("승리!");
					count[0]++;
					break;
				} else {
					int ranNum = rand.nextInt(comList.size());
					comStr = comList.get(ranNum);
					System.out.println("컴퓨터 : " + comStr);
				}

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
