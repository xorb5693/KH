package kr.or.iei.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import kr.or.iei.capital.controller.Congtr;
import kr.or.iei.dialogue.controller.QuizController;
import kr.or.iei.idiom.controller.Controller;
import kr.or.iei.movie.controller.SixQuizController;
import kr.or.iei.person.controller.PersonQuiz;
import kr.or.iei.proverb.controller.ProverbController;
import kr.or.iei.view.MainView;
import kr.or.iei.vo.User;
import kr.or.iei.vo.UserPoint;

public class MainController {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	MainView mainView = new MainView();
	ArrayList<User> userList = new ArrayList<User>();
	ArrayList<String> userIDs = new ArrayList<String>();
	User loginUser;

	public MainController() {

		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("user.txt"));
			userList = (ArrayList<User>) ois.readObject();

			for (User user : userList) {
				userIDs.add(user.getId());
			}

			// System.out.println(userList.get(0).getId());
			// System.out.println(userList.get(0).getPw());

		} catch (FileNotFoundException e) {
			// 파일이 없는 경우 마스터 계정 생성
			User user = new User("master", "master");
			userList.add(user);
			exitProgram();

			try {
				ois = new ObjectInputStream(new FileInputStream("user.txt"));
				userList = (ArrayList<User>) ois.readObject();

				for (User reUser : userList) {
					userIDs.add(user.getId());
				}

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} finally {
				try {
					ois.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 로그인 선택 화면
	public void login() {

		mainView.printCat();

		while (true) {

			mainView.LoginView();

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					signIn();
					break;
				case 2:
					signUp();
					break;
				case 0:
					mainView.printDog();
					mainView.printMsg("게임을 종료합니다.");
					exitProgram();
					return;
				default:
					mainView.printMsg("0~2 사이의 숫자를 입력하세요.");
				}
			} catch (NumberFormatException e) {
				mainView.printErrMsg("숫자를 입력하세요.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	// 로그인 선택시
	public void signIn() {

		User user = mainView.signInView(userList);

		if (user == null) {
			mainView.printMsg("로그인에 실패하셨습니다.");
		} else {
			loginUser = user;
			mainView.printMsg("로그인하셨습니다.");
			delay();
			mainMenu();
		}

	}

	// 회원가입 선택시
	public void signUp() {

		User loginUser = mainView.signUpView(userList);

		if (loginUser == null) {
			mainView.printMsg("회원 가입에 실패하셨습니다.");
		} else {
			userList.add(loginUser);
			mainView.printMsg("회원 가입에 성공하셨습니다.");
			exitProgram();
		}
	}

	// 로그인시 선택 화면
	public void mainMenu() {

		while (true) {
			mainView.mainMenuView();
			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					selectGame();
					break;
				case 2:
					selectRank();
					break;
				case 0:
					mainView.printDog();
					mainView.printMsg("로그아웃 합니다.");
					return;
				default:
					mainView.printMsg("0~2 사이의 숫자를 입력하세요.");
				}
			} catch (NumberFormatException e) {
				mainView.printErrMsg("숫자를 입력하세요.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	public void selectGame() {

		while (true) {
			mainView.selectGameView();
			
			try {
				int select = Integer.parseInt(br.readLine());
				
				switch (select) {
				case 1:
					// 인물 선택
					PersonQuiz prsonQuiz = new PersonQuiz(loginUser);
					prsonQuiz.main();
					break;
				case 2:
					// 영화 제목 선택
					SixQuizController sixQuizCon = new SixQuizController(loginUser);
					sixQuizCon.mainController();
					break;
				case 3:
					// 사자성어 선택
					Controller con = new Controller(loginUser);
					con.idiom();
					break;
				case 4:
					// 속담 선택
					ProverbController probCon = new ProverbController(loginUser);
					probCon.selectQueCount();
					break;
				case 5:
					// 수도 선택
					Congtr congtr = new Congtr(loginUser);
					congtr.main();
					break;
				case 6:
					// 명대사 선택
					QuizController quizCon = new QuizController(loginUser);
					quizCon.main1();
					break;
				case 0:
					return;
				default:
					mainView.printMsg("0~6 사이의 숫자를 입력하세요.");
				}
			} catch (NumberFormatException e) {
				mainView.printErrMsg("숫자를 입력하세요.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				exitProgram();
				delay();
			}
		}
	}

	// 랭킹 출력
	public void selectRank() {

		while (true) {
			mainView.selectRank();
			ArrayList<UserPoint> pointList = new ArrayList<UserPoint>();

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					// 인물 선택
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getPersonScore()));
						}
					}
					mainView.printRank(pointList, "인물");
					break;
				case 2:
					// 영화 제목 선택
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getMovieScore()));
						}
					}
					mainView.printRank(pointList, "영화");
					break;
				case 3:
					// 사자성어 선택
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getIdiomScore()));
						}
					}
					mainView.printRank(pointList, "사자성어");
					break;
				case 4:
					// 속담 선택
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getProverbScore()));
						}
					}
					mainView.printRank(pointList, "속담");
					break;
				case 5:
					// 수도 선택
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getCapitalScroe()));
						}
					}
					mainView.printRank(pointList, "수도");
					break;
				case 6:
					// 명대사 선택
					for (User user : userList) {
						if (!user.getId().equals("master")) {
							pointList.add(new UserPoint(user.getId(), user.getDialogueScore()));
						}
					}
					mainView.printRank(pointList, "명대사");
					break;
				case 0:
					return;
				default:
					mainView.printMsg("0~6 사이의 숫자를 입력하세요.");
				}
			} catch (NumberFormatException e) {
				mainView.printErrMsg("숫자를 입력하세요.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	// 시스템 갱신
	public void exitProgram() {

		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("user.txt"));
			oos.writeObject(userList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
