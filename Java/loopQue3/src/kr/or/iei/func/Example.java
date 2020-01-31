package kr.or.iei.func;

public class Example {

	public void exam1() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public void exam2() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void exam3() {
		int i, j, start, end, end2;
		
		System.out.println("Q1.");
		//Q1. 별 가로로 5개
		for (i = 0; i < 5; i++)
			System.out.print("*");
		
		System.out.println();
		System.out.println("Q2.");
		
		//Q2. 별 세로로 5개
		for (i = 0; i < 5; i++)
			System.out.println("*");
		
		System.out.println("Q3.");
		
		//Q3. 별 5X5
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q4.");

		//Q4. 5X5로 각 행의 숫자 출력
		for (i = 1; i <= 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("Q5.");
		
		//Q5. 5X5로 각 열의 숫자 출력
		for (i = 0; i < 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("Q6.");

		//Q6. 열+행-1 출력
		for (i = 0; i < 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		
		System.out.println("Q7.");
		
		//Q7. Q6을 반대로
		for (i = 4; i >= 0; i--) {
			for (j = 1; j <= 5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		
		System.out.println("Q8.");
		
		//Q8. 꼭지점이 왼쪽 위인 직각삼각형
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q9.");
		
		//Q9. 꼭지점이 왼쪽 아래인 직각삼각형
		for (i = 5; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q10.");
		
		//Q10. 꼭지점이 오른쪽 아래인 직각삼각형
		for (i = 0; i < 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q11.");
		
		//Q11. 꼭지점이 오른쪽 위인 직각삼각형
		for (i = 4; i >= 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q12.");
		
		//Q12. 꼭지점이 가운데인 이등변 삼각형
		for (i = 0; i <= 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 4; i >= 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q12-1.");
		
		//Q12. 꼭지점이 가운데인 이등변 삼각형 반복문 수 단축
		for (i = 0; i <= 10; i++) {
			if (i <= 5) {
				start = 0;
				end = i;
			} else {
				start = i;
				end = 10;
			}
			
			for (j = start; j < end; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q13.");
		
		//Q13. 모래시계 반쪽
		for (i = 5; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 2; i <= 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q13-1.");
		
		//Q13. 모래시계 반쪽 반복문 수 단축
		for (i = 0; i < 9; i++) {
			if (i < 5) {
				start = i;
				end = 5;
			} else {
				start = 3;
				end = i;
			}
			for (j = start; j < end; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q16.");
		
		//Q16. 꼭지점이 위인 이등변 삼각형
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("Q17.");
		
		//Q17. 꼭지점이 아래인 이등변 삼각형
		for (i = 5; i > 0; i--) {
			for (j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("Q18.");
		
		//Q18. 다이아
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 4; i > 0; i--) {
			for (j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q18-1.");
		
		//Q18. 다이아 반복문 수 단축
		for (i = 0; i < 9; i++) {
			if (i < 5) {
				end = 2 * i + 1;
				end2 = 4 - i;
			} else {
				end = (9 - i) * 2 - 1;
				end2 = i - 4;
			}
			for (j = 0; j < end2; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < end; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q19.");
		
		//Q19. 안이 빈 다이아	
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			for (j = 0; j < 2 * i + 1; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 4; i > 0; i--) {
			for (j = 0; j < 6 - i; j++) {
				System.out.print("*");
			}
			for (j = 0; j < 2 * i - 1; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q19-1.");
		
		//Q19. 안이 빈 다이아 반복문 수 단축
		for (i = 0; i < 9; i++) {
			if (i < 5) {
				end = 5 - i;
				end2 = 2 * i + 1;
			} else {
				end = i - 3;
				end2 = 2 * (9 - i) - 1;
			}
			for (j = 0; j < end; j++) {
				System.out.print("*");
			}
			for (j = 0; j < end2; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < end; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q20.");
		
		//Q20.안이 빈 모래시계
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (j = 0; j < 2 * (5 - i) - 1; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 4; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (j = 0; j < 2 * (5 - i) + 1; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q20-1.");
		
		//Q20. 안이 빈 모래시계 반복문 수 단축
		for (i = 0; i < 9; i++) {
			if (i < 5) {
				end = i + 1;
				end2 = 2 * (5 - i) - 1;
			} else {
				end = 9 - i;
				end2 = 2 * (i - 3) - 1;
			}
			for (j = 0; j < end; j++) {
				System.out.print("*");
			}
			for (j = 0; j < end2; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < end; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Q21.");
		
		//Q21. 모래시계
		for (i = 5; i > 0; i--) {
			for (j = 0; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < 2 * (i + 1) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("Q21-1.");
		
		//Q21. 모래시계 반복문 수 단축
		for (i = 0; i < 9; i++) {
			if (i < 5) {
				end = 2 * (5 - i) - 1;
				end2 = i + 1;
			} else {
				end = 2 * (i - 3) - 1;
				end2 = 9 - i;
			}
			for (j = 0; j < end2; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < end; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
