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
		int i, j;
		for (i = 0; i < 5; i++)
			System.out.print("*");
		
		System.out.println();
		System.out.println();
		
		for (i = 0; i < 5; i++)
			System.out.println("*");
		
		System.out.println();
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		for (i = 1; i <= 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 0; i < 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 0; i < 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 4; i >= 0; i--) {
			for (j = 1; j <= 5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 5; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 4; i >= 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
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
		
		System.out.println();
		
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
		
		System.out.println();
	}
}
