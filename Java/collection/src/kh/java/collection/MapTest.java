package kh.java.collection;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public void test1() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 2);
		map.put("two", 3);
		
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("four"));	//key값에 해당하는 value가 없으므로 null이 리턴
		
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
		
//		map.remove("two");
		System.out.println(map);
		
		System.out.println(map.containsKey("one"));
		System.out.println(map.containsKey("two"));
		
		Set<String> keys = map.keySet();
		
		keys.forEach(str -> {
			System.out.println("key : " + str + ", value : " + map.get(str));
		});
		
		System.out.println("==========");
		
		for(String str : keys) {
			System.out.println("key : " + str + ", value : " + map.get(str));	
		}
	}
}
