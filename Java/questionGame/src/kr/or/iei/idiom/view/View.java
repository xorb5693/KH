package kr.or.iei.idiom.view;

public class View {

	public void userInterface() {
		System.out.println("\n========== 사자성어 맟추기 게임 ==========");
		System.out.println("1. 게임 시작");
		System.out.println("2. 스코어");
		System.out.println("0. 뒤로가기");
		System.out.print(" 선택 > ");	
	}
	
	public void answer(String answer) {
		System.out.println("정답입니다.");	
	}
	
	public void explanation(String explanation) {
	System.out.println(explanation);
	}
	
	public void reTurn() {
		System.out.println("뒤로 돌아갑니다.");
	}
	
	public void menu() {
		System.out.println("\n============================== 선택 ==============================");
		System.out.println("메뉴로 가시겠습니까?");
		System.out.println("1. 계속하기");
		System.out.println("0. 메뉴로 돌아가기");
		System.out.print(" 선택 > ");
	}
	
	public void noAnswer(String answer) {
		System.out.println("틀렸습니다. 정답은 : " + answer);
	}

	public void quizPrint(int i, String quiz) {
		System.out.printf("\n============================== 문제 (%d)번 ============================== \n\n", i+1);
		System.out.printf("%s \n※!메뉴로 돌아가시려면 '포기'를 입력해주세요!※\n", quiz);
		System.out.print("답 입력 : ");
	}
	
	public void score(int score, int dap) {
		System.out.printf("점수(문제당 100점) : %d \n", score);
		System.out.printf("맞춘 문제 수 : %d", dap);
		
	}
}
