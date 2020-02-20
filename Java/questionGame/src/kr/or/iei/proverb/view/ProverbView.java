package kr.or.iei.proverb.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kr.or.iei.proverb.vo.Question;

public class ProverbView {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//문제 개수 선택
	public void selectQueCountView() {
		
		System.out.println("\n========== 문개 개수 선택 ==========");
		System.out.print("풀 문제의 개수를 선택하세요[1. 5개/2. 10개/0. 돌아가기] : ");
		
	}
	
	//문제 맞추기
	public boolean quiz(Question que, int count) {
		
		System.out.println("Quiz." + count);
		System.out.println(que.getQuestion());
		System.out.print("정답 입력 : ");
		
		try {
			String answer = br.readLine();
			
			if (answer.equals(que.getAnswer())) {
				System.out.println("정답입니다!");
				System.out.println("뜻 : " + que.getMean());
				System.out.println();
				return true;
			} else {
				System.out.println("오답입니다.");
				System.out.println("정답 : " + que.getAnswer());
				System.out.println("뜻 : " + que.getMean());
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void printScore(int score) {
		System.out.println("점수 : " + score);
	}

	// 메세지 출력
	public void printMsg(String msg) {
		System.out.println(msg);
	}

	// 에러 메세지 출력
	public void printErrMsg(String msg) {
		System.err.println(msg);
	}

}
