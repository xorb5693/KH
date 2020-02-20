package kr.or.iei.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;

import kr.or.iei.vo.User;
import kr.or.iei.vo.UserPoint;

public class MainView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void printCat() {
		System.out.println(".");
		delay();
		System.out.println(".");
		delay();

		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		System.out.println("게임을 기동합니다.");

		delay();
	}

	public void printDog() {

		System.out.println(".");
		delay();
		System.out.println(".");
		delay();

		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}

	public void LoginView() {

		System.out.println("\n========== 로그인 선택 ===========");
		System.out.println("1. 로그인");
		System.out.println("2. 회원 가입");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
	}

	// 회원가입 뷰
	public User signUpView(ArrayList<User> userList) {

		User user = null;

		try {

			System.out.println("\n========== 회원가입 =========");
			System.out.print("아이디 : ");
			String id = br.readLine();

			for (User userCheck : userList) {
				if (userCheck.getId().equals(id)) {
					System.out.println("동일한 아이디가 존재합니다.");

					return user;
				}
			}

			System.out.print("비밀번호 : ");
			String pass = br.readLine();

			user = new User(id, pass);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return user;

	}

	// 로그인 뷰
	public User signInView(ArrayList<User> userList) {

		User user = null;

		try {
			System.out.println("\n========== 로그인 =========");
			System.out.print("아이디 : ");
			String id = br.readLine();

			System.out.print("비밀번호 : ");
			String pass = br.readLine();

			for (User userCheck : userList) {
				if (userCheck.getId().equals(id)) {

//					System.out.println(pass);
//					System.out.println(userCheck.getPw());
					if (userCheck.getPw().equals(pass)) {
						return userCheck;
					}

					System.out.println("비밀번호가 다릅니다.");
					return user;
				}
			}

			System.out.println("가입된 아이디가 아닙니다.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return user;

	}

	// 로그인 메인 화면
	public void mainMenuView() {

		System.out.println("\n========== 메뉴 선택 ==========");
		System.out.println("1. 문제 풀기");
		System.out.println("2. 랭킹 확인");
		System.out.println("0. 로그 아웃");
		System.out.print("선택 > ");
	}
	
	public void selectGameView() {

		System.out.println("\n========== 문제 선택==========");
		System.out.println("1. 인물");
		System.out.println("2. 영화제목");
		System.out.println("3. 사자성어");
		System.out.println("4. 속담");
		System.out.println("5. 수도");
		System.out.println("6. 명대사");
		System.out.println("0. 뒤로가기");
		System.out.print("선택 > ");
	}

	// 출력 랭킹 선택
	public void selectRank() {

		System.out.println("\n========== 랭킹 선택==========");
		System.out.println("1. 인물");
		System.out.println("2. 영화제목");
		System.out.println("3. 사자성어");
		System.out.println("4. 속담");
		System.out.println("5. 수도");
		System.out.println("6. 명대사");
		System.out.println("0. 뒤로가기");
		System.out.print("선택 > ");
	}

	// 랭킹 출력
	public void printRank(ArrayList<UserPoint> userList, String rank) {
		System.out.println("\n========== " + rank + " 랭킹 ==========");
		System.out.println("랭킹\t아이디\t\t점수");
		
		Collections.sort(userList);
		Collections.reverse(userList);
		int ranking = 1;

		for (UserPoint user : userList) {
			System.out.println((ranking++) + "\t" + user);
		}
	}

	// 메세지 출력
	public void printMsg(String msg) {
		System.out.println(msg);
	}

	// 에러 메세지 출력
	public void printErrMsg(String msg) {
		System.err.println(msg);
	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
