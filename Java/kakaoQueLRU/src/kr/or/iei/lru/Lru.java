package kr.or.iei.lru;

import java.util.ArrayList;
import java.util.Scanner;

public class Lru {

	ArrayList<String> cities = new ArrayList<String>();
	int index;
	int cahce;
	int time;
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

			if (cities.contains(city)) {
				cities.remove(city);
				cities.add(city);
				time++;
			} else {
				if (index == cahce) {
					if (cahce != 0) {
						cities.remove(0);
						cities.add(city);
					}
				} else {
					cities.add(city);
					index++;
				}
				time += 5;
			}

			// System.out.println(time);
		}

		System.out.println("총 실행시간 " + time);
	}
}
