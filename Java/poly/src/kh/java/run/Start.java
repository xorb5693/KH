package kh.java.run;

import kh.java.test.Animal;
import kh.java.test.Tiger;

public class Start {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.crying();
		
		Tiger tiger = new Tiger();
		tiger.crying();
		tiger.hunting();
		
		Animal animalTiger = new Tiger();	//up-casting을 통해 자식 클래스의 객체 선언 가능
		((Tiger)animalTiger).hunting();		//down-casting을 통해 자식 클래스의 기능 사용 가능
	}

}
