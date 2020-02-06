package kr.or.iei.func;

import java.util.Scanner;
import java.util.Random;

public class Example {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public void exam1() {

		int arr[][] = new int[5][5];
		int num = 1;

		// 0행 4열부터 열 방향으로 1씩 증가
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				arr[i][j] = num;
				num++;
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// 0행 0열부터 행 방향으로 1씩 증가
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = num;
				num++;
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// 0행 4열부터 열방향으로 1씩 증가
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				arr[j][i] = num;
				num++;
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// 짝수행은 오른쪽에서 왼쪽으로, 홀수행은 왼쪽에서 오른쪽으로 1씩 증가
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num;
					num++;
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// 짝수행은 왼쪽에서 오른쪽으로, 홀수행은 오른쪽에서 왼쪽으로 1씩 증가
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num;
					num++;
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// 짝수열은 위에서 아래로, 홀수열은 아래에서 위로 1씩 증가
		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = num;
					num++;
				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[j][i] = num;
					num++;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// 짝수열은 아래에서 위로, 홀수열은 위에서 아래로 1씩 증가
		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = num;
					num++;
				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[j][i] = num;
					num++;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");
	}

	public void exam2() {
		int row, column;

		// 행 입력
		while (true) {
			System.out.print("가로행의 개수를 입력하세요(1~10) ==> ");
			row = sc.nextInt();

			if (row >= 1 && row <= 10) {
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}

		// 열 입력
		while (true) {
			System.out.print("세로열의 개수를 입력하세요(1~10) ==> ");
			column = sc.nextInt();

			if (column >= 1 && column <= 10) {
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}

		char arr[][] = new char[row][column];

		// 랜덤으로 알파벳 소문자 넣기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) (rand.nextInt(26) + 97);
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%c\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");
	}

	public void exam3() {
		// 달팽이 배열 시계방향

		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int row = sc.nextInt();

		int arr[][] = new int[row][row];
		int max = row * row + 1;
		int num = 1;
		int count = row;
		int caseCheck = 0;
		int startRow = 0;
		int startColumn = 0;
		int i;

		while (num != max) {
			switch (caseCheck) {
			case 0:
				// 오른쪽에서 왼쪽으로 진행하는 경우, 행은 고정, 열만 변경. 열의 값은 증가.
				for (i = startColumn; i < startColumn + count; i++) {
					arr[startRow][i] = num;
					// System.out.println("arr[" + startRow + "][" + i + "] = " + num);
					num++;
				}
				startColumn = i - 1;
				startRow++;
				count--;
				break;
			case 1:
				// 위에서 아래로 진행하는 경우, 열은 고정, 행만 변경. 행의 값은 증가.
				for (i = startRow; i < startRow + count; i++) {
					arr[i][startColumn] = num;
					num++;
				}
				startRow = i - 1;
				startColumn--;
				break;
			case 2:
				// 왼쪽에서 아래로 진행하는 경우, 행은 고정, 열만 변경. 열의 값은 감소.
				for (i = startColumn; i > startColumn - count; i--) {
					arr[startRow][i] = num;
					num++;
				}
				startColumn = i + 1;
				startRow--;
				count--;
				break;
			case 3:
				// 아래에서 위로 진행하는 경우, 열은 고정, 행만 변경. 행의 값은 감소.
				for (i = startRow; i > startRow - count; i--) {
					arr[i][startColumn] = num;
					num++;
				}
				startRow = i + 1;
				startColumn++;
				break;
			}

			caseCheck = (caseCheck + 1) % 4;
		}

		// 출력
		for (i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}

	public void exam4() {
		// 달팽이 배열 역시계방향
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int row = sc.nextInt();

		int arr[][] = new int[row][row];
		int max = row * row + 1;
		int num = 1;
		int count = row;
		int caseCheck = 0;
		int startRow = 0;
		int startColumn = row - 1;
		int i;

		while (num != max) {
			switch (caseCheck) {
			case 0:
				// 왼쪽에서 오른쪽으로 진행하는 경우, 행은 고정, 열만 변경. 열의 값은 감소.
				for (i = startColumn; i > startColumn - count; i--) {
					arr[startRow][i] = num;
					// System.out.println("arr[" + startRow + "][" + i + "] = " + num);
					num++;
				}
				startColumn = i + 1;
				startRow++;
				count--;
				break;
			case 1:
				// 위쪽에서 아래쪽으로 진행하는 경우, 열은 고정, 행만 변경. 행의 값은 증가.
				for (i = startRow; i < startRow + count; i++) {
					arr[i][startColumn] = num;
					// System.out.println("arr[" + i + "][" + startColumn + "] = " + num);
					num++;
				}
				startRow = i - 1;
				startColumn++;
				break;
			case 2:
				// 오른쪽에서 왼쪽으로 진행하는 경우, 행은 고정, 열만 변경. 열의 값은 증가.
				for (i = startColumn; i < startColumn + count; i++) {
					arr[startRow][i] = num;
					// System.out.println("arr[" + startRow + "][" + i + "] = " + num);
					num++;
				}
				startColumn = i - 1;
				startRow--;
				count--;
				break;
			case 3:
				// 아래쪽에서 위쪽으로 진행하는 경우, 열은 고정, 행만 변경. 행의 값은 감소.
				for (i = startRow; i > startRow - count; i--) {
					arr[i][startColumn] = num;
					// System.out.println("arr[" + i + "][" + startColumn + "] = " + num);
					num++;
				}
				startRow = i + 1;
				startColumn--;
				break;
			}

			// System.out.println("caseCheck : " + caseCheck);
			caseCheck = (caseCheck + 1) % 4;
		}

		// 출력
		for (i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}

	public void exam5() {

		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int insert = sc.nextInt();

		int arr[][] = new int[insert][insert];
		// 증감 상태를 저장하기 위한 변수. 1이면 증가, -1이면 감소 상태이다.
		int course = 1;
		// 현재 행과 열을 저장하기 위한 변수.
		int row = 0;
		int column = 0;
		// 1사이클에서 몇회 계산을 진행해야 하는지 저장하기 위한 변수.
		int count = arr.length * 2 - 1;
		int i, j;
		int num = 1;

		while (true) {

			for (i = 0; i < count / 2 + 1; i++) {
				// System.out.println("arr[" + row + "][" + column + "] = " + num);
				arr[row][column] = num;
				// course가 1이면 column이 1 증가, -1이면 column이 1 감소한다.
				column = (column * course + 1) * course;
				num++;
			}

			column = (column * course - 1) * course;

			for (i = count / 2 + 1; i < count; i++) {
				// System.out.println("arr[" + row + "][" + column + "] = " + num);
				row = (row * course + 1) * course;
				arr[row][column] = num;
				num++;
			}

			count -= 2;

			if (count < 0) {
				break;
			} else {
				course *= -1;
			}

			column = (column * course + 1) * course;
		}

		// 출력
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}

	public void exam6() {

		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int insert = sc.nextInt();

		int arr[][] = new int[insert][insert];
		// 증감 상태를 저장하기 위한 변수. 1이면 증가, -1이면 감소 상태이다.
		int course = -1;
		// 현재 행과 열을 저장하기 위한 변수.
		int row = 0;
		int column = insert - 1;
		// 1사이클에서 몇회 계산을 진행해야 하는지 저장하기 위한 변수.
		int count = arr.length * 2 - 1;
		int i, j;
		int num = 1;

		while (true) {

			for (i = 0; i < count / 2 + 1; i++) {
				// System.out.println("arr[" + row + "][" + column + "] = " + num);
				arr[row][column] = num;
				// course가 1이면 column이 1 증가, -1이면 column이 1 감소한다.
				column = (column * course + 1) * course;
				num++;
			}

			column = (column * course - 1) * course;
			course *= -1;

			for (i = count / 2 + 1; i < count; i++) {
				// System.out.println("arr[" + row + "][" + column + "] = " + num);
				row = (row * course + 1) * course;
				arr[row][column] = num;
				num++;
			}

			count -= 2;

			if (count < 0) {
				break;
			}

			column = (column * course + 1) * course;
		}

		// 출력
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");

	}

	public void exam7() { // 달팽이배열
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size]; // 입력받은크기의 정방형 배열 생성
		int k = 1; // 배열안의 채울 값 변수
		int inc = 1; // 인덱스번호 증감용 변수
		int r = 0; // 2차원배열 행 인덱스번호
		int c = -1; // 2차원배열 열 인덱스번호
		while (size > 0) {
			for (int i = 0; i < size; i++) {
				c = c + inc;
				arr[r][c] = k;
				k++;
			}
			size--;
			for (int i = 0; i < size; i++) {
				r = r + inc;
				arr[r][c] = k;
				k++;
			}
			inc = -inc;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam8() {
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size]; // 입력받은크기의 정방형 배열 생성
		int k = 1; // 배열안의 채울 값 변수
		int inc = -1; // 인덱스번호 증감용 변수
		int r = 0; // 2차원배열 행 인덱스번호
		int c = size; // 2차원배열 열 인덱스번호
		while (size > 0) {
			for (int i = 0; i < size; i++) {
				c = c + inc;
				arr[r][c] = k;
				k++;
			}
			size--;
			inc = -inc;
			for (int i = 0; i < size; i++) {
				r = r + inc;
				arr[r][c] = k;
				k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
