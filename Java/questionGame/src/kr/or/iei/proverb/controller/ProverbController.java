package kr.or.iei.proverb.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

import kr.or.iei.proverb.view.ProverbView;
import kr.or.iei.proverb.vo.Question;
import kr.or.iei.vo.User;

public class ProverbController {

	ArrayList<Question> questionList = new ArrayList<Question>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ProverbView view = new ProverbView();
	int quizCount;
	User loginUser;

	public ProverbController() {

	}
	
	public ProverbController(User loginUser) {
		
		this.loginUser = loginUser;
		
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("Proverb Question.txt"));

			while (true) {
				String line = br.readLine();

				if (line == null) {
					break;
				}

				StringTokenizer st = new StringTokenizer(line, "/");

				Question que = new Question(st.nextToken(), st.nextToken(), st.nextToken(), false);
				questionList.add(que);

				// System.out.println(que);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void selectQueCount() {

		while (true) {
			view.selectQueCountView();

			try {
				int select = Integer.parseInt(br.readLine());

				if (select == 0) {
					return;
				} else if (select == 1) {
					quizCount = 5;
					question();
					return;
				} else if (select == 2) {
					quizCount = 10;
					question();
					return;
				} else {
					view.printMsg("0~2 사이의 숫자를 입력하세요.");
				}

			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void question() {
		int score = 0;
		int count = 1;
		Random rand = new Random();
		
		while(count <= quizCount) {
			
			int quizNum = rand.nextInt(questionList.size());
			
			if (questionList.get(quizNum).isCheck()) {
				continue;
			} else {
				boolean answerCheck = view.quiz(questionList.get(quizNum), count);
				if (answerCheck) {
					score += 100;
				}
				count++;
				questionList.get(quizNum).setCheck(true);
			}
		}
		
		view.printScore(score);
		
		if (loginUser.getProverbScore() < score) {
			loginUser.setProverbScore(score);
		}
	}
}
