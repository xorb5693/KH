package kr.or.iei.lru;

import java.util.HashMap;
import java.util.Scanner;

public class LruMap {

	HashMap<String, Integer> cities = new HashMap<String, Integer>();
	int cahce;
	int time;
	int index;
	Scanner sc = new Scanner(System.in);
	
	public void main() {
		System.out.println("----- LRU -----");

		System.out.print("캐시 사이즈를 입력하세요 : ");
		cahce = sc.nextInt();

		while (true) {
			System.out.print("도시를 입력하세요 : ");
			String city = sc.next().toLowerCase();

			if (city.equals("break")) {
				break;
			}

			if (cities.containsKey(city)) {
				cities.put(city, 0);
				time++;
			} else {
				for (String name : cities.keySet()) {
					cities.put(name, cities.get(name) + 1);
				}
				
				if (cahce == index) {
					if (cahce != 0) {
						int max = -1;
						String cityName = "";
						
						for (String name : cities.keySet()) {
							if (max < cities.get(name)) {
								max = cities.get(name);
								cityName = name;
							}
						}
						
						cities.remove(cityName);
						cities.put(city, 0);
					}
				} else {
					cities.put(city, 0);
					index++;
				}
				
				time += 5;
			}

//			 System.out.println(time);
		}

		System.out.println("총 실행시간 " + time);
	}
}
