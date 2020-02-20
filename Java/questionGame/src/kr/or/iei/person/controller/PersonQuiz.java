package kr.or.iei.person.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import kr.or.iei.person.view.PersonView;
import kr.or.iei.vo.User;

public class PersonQuiz {
	int score = 0;
	int index = 0;
	int num = 1;
	PersonView view = new PersonView();
	User loginUser;
	
	public PersonQuiz() {
		
	}
	
	public PersonQuiz(User loginUser) {

		this.loginUser = loginUser;
	}

	public void main() {
		while (true) {
			int sel = view.mainMenu();

			switch (sel) {
			case 1:
				PersonQuiz();
				break;
			case 0:
				return;

			}
		}

	}

	public int PersonQuiz() {

		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);
		

		FileReader fr;

		loop: try {

			fr = new FileReader("person.txt");
			br = new BufferedReader(fr);
			view.print1();
			while (true) {
				String str = br.readLine();
				StringTokenizer sT = new StringTokenizer(str, "/");
				ArrayList<String> al = new ArrayList<String>();
				while (sT.hasMoreTokens()) {
					String st = sT.nextToken();
					al.add(st);

				}

				for (int i = index; i < al.size(); i++) {

					view.print2(al.get(i), num);
					num++;
					String str2 = sc.next();
					if (str2.equals("0") || num > 10) {
						al.clear();
						num = 1;
						view.printScore(score);
						
						if (loginUser.getPersonScore() < score) {
							loginUser.setPersonScore(score);
						}
						score = 0;
						
						break loop;
					}

					else if (al.get(i + 1).equals(str2)) {

						score += view.answer();
						i++;

					} else {

						view.print3(al.get(i + 1));
						i++;

					}

				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return score;
	}

}
