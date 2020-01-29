package kr.or.iei.func;

public class PrintInfo {
	
	public void printInfo() {
		String name = "박태규";
		int age = 27;
		char sex = '남';
		String address = "서울";
		String phone = "01041555693";
		String email = "tg5693@gmail.com";
		
		System.out.println("이름\t나이\t성별\t지역\t전화번호\t\t이메일");
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, sex, address, phone, email);
		System.out.println("------------------------------------------------------------------------");
		
		name = "김동준";
		age = 25;
		sex = '남';
		address = "인천";
		phone = "01049179188";
		email = "practice968426@gmail.com";
		
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, sex, address, phone, email);
	}
}
