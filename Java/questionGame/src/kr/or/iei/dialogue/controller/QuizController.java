package kr.or.iei.dialogue.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import kr.or.iei.dialogue.view.QuizView;
import kr.or.iei.vo.User;

public class QuizController {
	Scanner sc = new Scanner(System.in);
	QuizView view = new QuizView();
	ArrayList<String> quiz = new ArrayList<String>();
	ArrayList<String> anser = new ArrayList<String>();
	ArrayList<String> hint = new ArrayList<String>();
	ArrayList<Boolean> ranquiz = new ArrayList<Boolean>();
	Random r = new Random();
	int point = 0;
	User loginUser;
		
	public QuizController() {
		
		
	}
	
	public QuizController(User loginUser) {
		super();		
		this.loginUser = loginUser;
		
		BufferedReader br1 = null;
		try {
			FileReader fr1 = new FileReader("quizMds.txt");
			br1 = new BufferedReader(fr1);
			while (true) {
				String str1 = br1.readLine();
				if (str1 == null) {
					break;
				}
				StringTokenizer sT = new StringTokenizer(str1,"/");
				quiz.add(sT.nextToken());
				anser.add(sT.nextToken());
				hint.add(sT.nextToken());
				ranquiz.add(false);
			}		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void main1() {
		while(true) {
			point = 0;
			int select = view.mainView();
			switch(select) {
			case 1:
				gameStart();
				break;
			case 2:
				randomGame();
				break;
			case 3:
				return;
				
			}
		}

	}
	public void gameStart() {
		
		for(int i=0;i<quiz.size();i++) {
			System.out.println(quiz.get(i));
			System.out.println("힌트 : "+hint.get(i));
			System.out.print("정답입력 : ");
			String str = sc.nextLine();
			
			if(anser.get(i).equals(str)) {				
				System.out.println("정답입니다");
				point += 100;				
			}else {
				System.out.println("땡!!! 정답 : " + anser.get(i));
			}
			
		} 
		
		view.printScore(point);
		
		if (loginUser.getDialogueScore() < point) {
			loginUser.setDialogueScore(point);
		}
		
//		return point;								
	}
	
	public void randomGame() {
		int index = 0;
		
		while(index<10) {
			int random = r.nextInt(10);
			if(ranquiz.get(random) == false) {
				System.out.println(quiz.get(random));
				System.out.println("힌트 : "+hint.get(random));
				System.out.print("정답입력 : ");
				String str = sc.nextLine();
				ranquiz.set(random, true);
				index++;
				if(anser.get(random).equals(str)) {				
					System.out.println();
					System.out.println("정답입니다");					
					point += 100;
					
				}else {
					System.out.println();
					System.out.println("땡!!! 정답 : " + anser.get(random));
					
				}								
			}
			else {				
			}							
		}
		for(int i=0;i<ranquiz.size();i++) {
			ranquiz.set(i, false);
			index--;
		}

		view.printScore(point);
		
		if (loginUser.getDialogueScore() < point) {
			loginUser.setDialogueScore(point);
		}
		
		
	}

}
