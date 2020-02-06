package kr.or.iei.func;

public class Animal {

	private String name;
	private String species;
	private String category;
	private int age;
	private String sex;
	
	public Animal(String name, String species, String category, int age, String sex) {
		this.name = name;
		this.species = species;
		this.category = category;
		this.age = age;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void eat() {
		System.out.println(name + "이(가) 식사를 합니다.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(".");
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("♪");
	}
	
	public void bath() {

		System.out.println(name + "이(가) 목욕을 합니다.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(".");
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("♨");
	}
	
	public void sleep() {
		
		char print = 'z';

		System.out.println(name + "이(가) 잠을 잡니다.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(print);
				print = (char)(print ^ 32);
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("!!");
	}
	
	public void play() {
		System.out.println(name + "와(과) 놀아줍니다.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(".");
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("♥");
	}
	
	public void getInfo() {
		System.out.println("===== " + name + " 정보 =====");
		System.out.println("종 : " + species);
		System.out.println("종류 : " + category);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
