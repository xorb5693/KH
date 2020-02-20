package kr.or.iei.idiom.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import kr.or.iei.idiom.view.View;
import kr.or.iei.vo.User;

public class Controller {
	View v = new View();
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	ArrayList<String> quiz = new ArrayList<String>();
	ArrayList<String> answer = new ArrayList<String>();
	ArrayList<String> explanation = new ArrayList<String>();
	int score;
	int dap = 0;
	User loginUser;
	
	public Controller() {
		
	}
	
	public Controller(User loginUser) {
		this.loginUser = loginUser;
	}

	public void idiom() {

		BufferedReader br = null;
		BufferedReader br2 = null;
		BufferedReader br3 = null;

		try {
			FileReader fr = new FileReader("idiom.txt");
			FileReader fr2 = new FileReader("dap.txt");
			FileReader fr3 = new FileReader("explanation.txt");
			br = new BufferedReader(fr);
			br2 = new BufferedReader(fr2);
			br3 = new BufferedReader(fr3);

			while (true) {
				String str = br.readLine(); // 한줄씩 읽어옴. 문제
				if (str == null) {
					break;
				}
				quiz.add(str);
			}

			while (true) {
				String str2 = br2.readLine(); // 한줄씩 읽어옴. 답
				if (str2 == null) {
					break;
				}
				answer.add(str2);
			}

			while (true) {
				String str3 = br3.readLine(); // 한줄씩 읽어옴. 틀림
				if (str3 == null) {
					break;
				}
				explanation.add(str3);
			}
			while (true) {
				v.userInterface();
				int sel = sc.nextInt();

				switch (sel) {
				case 1:
					score = 0;
					dap = 0;
					for (int i = 0; i < quiz.size(); i++) {
						v.quizPrint(i, quiz.get(i));
						String userDap = sc.next();
						if (userDap.equals("포기")) {
							v.menu();
							int numSel = sc.nextInt();
							if (numSel == 1) {
								i--;
								continue;
							} else {
								score = 0;
								dap = 0;
								break;
							}
						}
						if (userDap.equals(answer.get(i))) {
							v.answer(answer.get(i));
							score += 100;
							dap++;

						} else {
							v.noAnswer(answer.get(i));
							v.explanation(explanation.get(i));
						}
					}
					break;
				case 2:
					v.score(score, dap);
					break;
				case 0:
					
					if (loginUser.getIdiomScore() < score) {
						loginUser.setIdiomScore(score);
					}
					
					v.reTurn();
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				br2.close();
				br3.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
