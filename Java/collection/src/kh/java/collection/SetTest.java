package kh.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {

	public void test1() {
		HashSet<Integer> data = new HashSet<Integer>();
		
		data.add(10);	//true 리턴
		data.add(20);
		data.add(30);
		data.add(10);	//false 리턴
		
		System.out.println(data.size());	//3
		
		System.out.println("Iterator로 출력");
		
		//iterator : 반복자를 사용해 추출
		Iterator iter = data.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("for-each로 출력");
		
		for(Integer num : data) {
			System.out.println(num);
		}
		
		System.out.println("forEach로 출력");
		
		data.forEach(num -> {
			System.out.println(num);
		});
		
		System.out.println("ArrayList로 출력");
		ArrayList<Integer> al = new ArrayList<Integer>(data);
		
		al.forEach(num -> {
			System.out.println(num);
		});
	}
	
	public void lotto() {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		while(lotto.size() < 6) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (!lotto.add(num)) {
				System.out.println("중복된 숫자입니다.");
			}
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>(lotto);
		Collections.sort(al);
		
		for (Integer num : al) {
			System.out.println(num);
		}
	}
}
