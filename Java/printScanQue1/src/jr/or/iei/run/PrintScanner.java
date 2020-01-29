package jr.or.iei.run;

import java.util.Scanner;

public class PrintScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String address;
		double height;
		double weight;
		char sex;
		
		System.out.print("이름을 입력하세요. : ");
		name = sc.next();
		
		System.out.print("나이를 입력하세요. : ");
		age = sc.nextInt();

		sc.nextLine();
		System.out.print("주소를 입력하세요. : ");
		address = sc.nextLine();
		
		System.out.print("키를 입력하세요. : ");
		height = sc.nextDouble();
		
		System.out.print("몸무게를 입력하세요. : ");
		weight = sc.nextDouble();
		
		System.out.print("성별을 입력하세요. : ");
		sex = sc.next().charAt(0);
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("키 : " + (int)height);
		System.out.printf("몸무게 : %.1f\n", weight);
		System.out.println("성별 : " + sex);
		
		int kor, math, eng;
		
		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();
		
		System.out.print("수학점수 입력 : ");
		math = sc.nextInt();
		
		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (double)sum / 3;
		
		System.out.printf("당신 성적의 총 합은 %d점이고 평균은 %.2f입니다!", sum, avg);
	}

}
