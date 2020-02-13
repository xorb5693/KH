package kh.java.run;

import kh.java.test.AnimalMgr;
import kh.java.test.AnimalMgr2;
import kh.java.test.Bear;
import kh.java.test.GenericEx;
import kh.java.test.GenericEx2;
import kh.java.test.Tiger;

public class Start {

	public static void main(String[] args) {

		GenericEx<String> ge = new GenericEx<String>();
		
		ge.setData("test");
		System.out.println(ge.getData());

		GenericEx<Integer> ge1 = new GenericEx<Integer>();
		
		ge1.setData(14214);
		System.out.println(ge1.getData());
		
		//hp가 100인 Tiger 객체의 주소가 t에 저장
		Tiger t = new Tiger(1000);
		Bear b = new Bear(2000);
		
		//AnimalMgr 생성자의 매개변수 타입은 Object
		//다형성에 의해서 Tiger 객체의 주소가 Object 타입 변수에 저장
		AnimalMgr am1 = new AnimalMgr(t);
		AnimalMgr am2 = new AnimalMgr(b);
		
		Object obj = am1.getData();
		//해당 객체는 Tiger 객체이므로 getHp() 메소드 호출
		//부모타입 Object에는 getHp()메소드가 존재하지 않는다.
		//obj.getHp(); => 에러
		
		//Tiger객체만이 가지고 있는 메소드를 호출하기 위해서는 down-casting이 필요
		((Tiger)am1.getData()).getHp();
		((Bear)am2.getData()).getHp();
		
		//제네릭 적용
		AnimalMgr2<Tiger> am3 = new AnimalMgr2<Tiger>(t);
		//AniamlMgr2는 제네릭에 제한을 걸었기 때문에 Bear는 사용 불가
//		AnimalMgr2<Bear> am4 = new AnimalMgr2<Bear>(b);
		
		//제네릭을 적용했기에 down-casting이 필요가 없음
		am3.getData().getHp();
//		am4.getData().getHp();
		
		GenericEx2<String, Integer> ge2 = new GenericEx2<String, Integer>();
	}

}
