package kh.java.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kh.java.vo.Coffee;
import kh.java.vo.Dessert;
import kh.java.vo.Goods;
import kh.java.vo.Juice;

public class CafeMgr {

	int totalPrice = 100000;

	// size = false : smll, ture : large
	// temp = false : hot, true : cold
	Coffee[] c = new Coffee[20];
	Coffee[] c1 = new Coffee[20];
	Coffee[] c2 = new Coffee[20];
	int cIndex;

	Juice[] j = new Juice[10];
	Juice[] j1 = new Juice[10];
	Juice[] j2 = new Juice[10];
	int jIndex;

	Dessert[] d = new Dessert[10];
	Dessert[] d1 = new Dessert[10];
	Dessert[] d2 = new Dessert[10];
	int dIndex;

	Goods[] etc = new Goods[20];
	Goods[] etc1 = new Goods[20];
	Goods[] etc2 = new Goods[20];
	int eIndex;

	Goods[] cart = new Goods[20];

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public CafeMgr() {

		c[cIndex] = new Coffee("아메리카노", 2000, 20, false, false);
		c1[cIndex] = new Coffee("아메리카노", 1000, 0, false, false);
		c2[cIndex++] = new Coffee("아메리카노", 1000, 100, false, false);
		c[cIndex] = new Coffee("아메리카노", 2000, 20, false, true);
		c1[cIndex] = new Coffee("아메리카노", 1000, 0, false, true);
		c2[cIndex++] = new Coffee("아메리카노", 1000, 100, false, true);
		c[cIndex] = new Coffee("아메리카노", 2500, 20, true, false);
		c1[cIndex] = new Coffee("아메리카노", 1250, 0, true, false);
		c2[cIndex++] = new Coffee("아메리카노", 1250, 100, true, false);
		c[cIndex] = new Coffee("아메리카노", 2500, 20, true, true);
		c1[cIndex] = new Coffee("아메리카노", 1250, 0, true, true);
		c2[cIndex++] = new Coffee("아메리카노", 1250, 100, true, true);

		c[cIndex] = new Coffee("카페라떼", 2500, 20, false, false);
		c1[cIndex] = new Coffee("카페라떼", 1250, 0, false, false);
		c2[cIndex++] = new Coffee("카페라떼", 1250, 100, false, false);
		c[cIndex] = new Coffee("카페라떼", 2500, 20, false, true);
		c1[cIndex] = new Coffee("카페라떼", 1250, 0, false, true);
		c2[cIndex++] = new Coffee("카페라떼", 1250, 100, false, true);
		c[cIndex] = new Coffee("카페라떼", 3000, 20, true, false);
		c1[cIndex] = new Coffee("카페라떼", 1500, 0, true, false);
		c2[cIndex++] = new Coffee("카페라떼", 1500, 100, true, false);
		c[cIndex] = new Coffee("카페라떼", 3000, 20, true, true);
		c1[cIndex] = new Coffee("카페라떼", 1500, 0, true, true);
		c2[cIndex++] = new Coffee("카페라떼", 1500, 100, true, true);

		c[cIndex] = new Coffee("카라멜마끼아또", 3000, 20, false, false);
		c1[cIndex] = new Coffee("카라멜마끼아또", 1500, 0, false, false);
		c2[cIndex++] = new Coffee("카라멜마끼아또", 1500, 100, false, false);
		c[cIndex] = new Coffee("카라멜마끼아또", 3000, 20, false, true);
		c1[cIndex] = new Coffee("카라멜마끼아또", 1500, 0, false, true);
		c2[cIndex++] = new Coffee("카라멜마끼아또", 1500, 100, false, true);
		c[cIndex] = new Coffee("카라멜마끼아또", 3500, 20, true, false);
		c1[cIndex] = new Coffee("카라멜마끼아또", 1750, 0, true, false);
		c2[cIndex++] = new Coffee("카라멜마끼아또", 1750, 100, true, false);
		c[cIndex] = new Coffee("카라멜마끼아또", 3500, 20, true, true);
		c1[cIndex] = new Coffee("카라멜마끼아또", 1750, 0, true, true);
		c2[cIndex++] = new Coffee("카라멜마끼아또", 1750, 100, true, true);

		j[jIndex] = new Juice("오렌지 주스", 3000, 15, false);
		j1[jIndex] = new Juice("오렌지 주스", 1500, 0, false);
		j2[jIndex++] = new Juice("오렌지 주스", 1500, 100, false);
		j[jIndex] = new Juice("오렌지 주스", 3500, 15, true);
		j1[jIndex] = new Juice("오렌지 주스", 1750, 0, true);
		j2[jIndex++] = new Juice("오렌지 주스", 1750, 100, true);

		j[jIndex] = new Juice("딸기 주스", 3000, 15, false);
		j1[jIndex] = new Juice("딸기 주스", 1500, 0, false);
		j2[jIndex++] = new Juice("딸기 주스", 1500, 100, false);
		j[jIndex] = new Juice("딸기 주스", 3500, 15, true);
		j1[jIndex] = new Juice("딸기 주스", 1750, 0, true);
		j2[jIndex++] = new Juice("딸기 주스", 1750, 100, true);

		j[jIndex] = new Juice("바나나 주스", 3000, 15, false);
		j1[jIndex] = new Juice("바나나 주스", 1500, 0, false);
		j2[jIndex++] = new Juice("바나나 주스", 1500, 100, false);
		j[jIndex] = new Juice("바나나 주스", 3500, 15, true);
		j1[jIndex] = new Juice("바나나 주스", 1750, 0, true);
		j2[jIndex++] = new Juice("바나나 주스", 1750, 100, true);

		d[dIndex] = new Dessert("치즈 케이크", 3000, 15, false, "2020-02-11");
		d1[dIndex] = new Dessert("치즈 케이크", 1500, 0, false, "2020-02-11");
		d2[dIndex++] = new Dessert("치즈 케이크", 1500, 100, false, "2020-02-11");
		d[dIndex] = new Dessert("치즈 케이크", 5000, 15, true, "2020-02-11");
		d1[dIndex] = new Dessert("치즈 케이크", 2500, 0, true, "2020-02-11");
		d2[dIndex++] = new Dessert("치즈 케이크", 2500, 100, true, "2020-02-11");

		d[dIndex] = new Dessert("초콜릿 케이크", 3000, 15, false, "2020-02-11");
		d1[dIndex] = new Dessert("초콜릿 케이크", 1500, 0, false, "2020-02-11");
		d2[dIndex++] = new Dessert("초콜릿 케이크", 1500, 100, false, "2020-02-11");
		d[dIndex] = new Dessert("초콜릿 케이크", 5000, 15, true, "2020-02-11");
		d1[dIndex] = new Dessert("초콜릿 케이크", 2500, 0, true, "2020-02-11");
		d2[dIndex++] = new Dessert("초콜릿 케이크", 2500, 100, true, "2020-02-11");

		d[dIndex] = new Dessert("딸기 케이크", 3000, 15, false, "2020-02-11");
		d1[dIndex] = new Dessert("딸기 케이크", 1500, 0, false, "2020-02-11");
		d2[dIndex++] = new Dessert("딸기 케이크", 1500, 100, false, "2020-02-11");
		d[dIndex] = new Dessert("딸기 케이크", 5000, 15, true, "2020-02-11");
		d1[dIndex] = new Dessert("딸기 케이크", 2500, 0, true, "2020-02-11");
		d2[dIndex++] = new Dessert("딸기 케이크", 2500, 100, true, "2020-02-11");

		etc[eIndex] = new Goods("텀블러", 5000, 15);
		etc1[eIndex] = new Goods("텀블러", 2500, 0);
		etc2[eIndex++] = new Goods("텀블러", 2500, 100);
		etc[eIndex] = new Goods("머그컵", 5000, 15);
		etc1[eIndex] = new Goods("머그컴", 2500, 0);
		etc2[eIndex++] = new Goods("머그컵", 2500, 100);
	}

	public void main() {
		while (true) {
			System.out.println("===== GS25 =====");
			System.out.println("1. 알바");
			System.out.println("2. 손님");
			System.out.println("3. 납품업체");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");

			try {
				int select = Integer.parseInt(br.readLine());

				System.out.println();

				switch (select) {
				case 1:
					alba();
					break;
				case 2:
					client();
					break;
				case 3:
					server();
					break;
				case 0:
					return;
				default:
					System.out.println("0~3 사이의 숫자를 입력해 주세요.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void alba() {
		while (true) {
			System.out.println("===== 일해라 알바야 =====");
			System.out.println("1. 새 제품 등록");
			System.out.println("2. 현재 재고 현황 보기");
			System.out.println("3. 재고 요청");
			System.out.println("4. 제품 삭제");
			System.out.println("0. 뒤로가기");
			System.out.print("선택 > ");

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					insertProduct();
					break;
				case 2:
					printCoffee();
					printJuice();
					printDesert();
					printEtc();
					delay();
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					return;
				default:
					System.out.println("0~4 사이의 숫자를 입력해 주세요.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void insertProduct() {
		while (true) {
			System.out.println("===== 제품 등록 ======");
			System.out.println("1. 커피 등록");
			System.out.println("2. 과일 주스 등록");
			System.out.println("3. 디저트 등록");
			System.out.println("4. 기타 등록");
			System.out.println("0. 이전으로");
			System.out.print("선택 > ");

			try {
				int select = Integer.parseInt(br.readLine());

				if (select == 0) {
					System.out.println("이전 페이지로 돌아갑니다.");
					delay();
					return;
				} else if (select > 0 && select < 5) {
					System.out.print("상품명을 입력하세요. : ");
					String name = br.readLine();

					System.out.print("상품 가격을 입력하세요. : ");
					int price = Integer.parseInt(br.readLine());

					System.out.print("상품 수량을 입력하세요. : ");
					int stock = Integer.parseInt(br.readLine());

					switch (select) {
					case 1:
						System.out.print("크기[1. Small/2. Large] : ");
						boolean size = (Integer.parseInt(br.readLine()) == 1) ? false : true;

						System.out.print("온도[1. Hot/2. Cold] : ");
						boolean temp = (Integer.parseInt(br.readLine()) == 1) ? false : true;

						c[cIndex] = new Coffee(name, price, stock, size, temp);
						c1[cIndex] = new Coffee(name, price / 2, 0, size, temp);
						c2[cIndex++] = new Coffee(name, price / 2, 100, size, temp);
						break;
					case 2:
						System.out.print("크기[1. Small/2. Large] : ");
						size = (Integer.parseInt(br.readLine()) == 1) ? false : true;

						j[jIndex] = new Juice(name, price, stock, size);
						j1[jIndex] = new Juice(name, price / 2, 0, size);
						j2[jIndex++] = new Juice(name, price / 2, 100, size);
						break;
					case 3:
						System.out.print("크기[1. Small/2. Large] : ");
						size = (Integer.parseInt(br.readLine()) == 1) ? false : true;

						System.out.print("유통기한(yyyy-mm-dd) : ");
						String expired = br.readLine();

						d[dIndex] = new Dessert(name, price, stock, size, expired);
						d1[dIndex] = new Dessert(name, price / 2, 0, size, expired);
						d2[dIndex++] = new Dessert(name, price / 2, 100, size, expired);
						break;
					case 4:
						etc[eIndex] = new Goods(name, price, stock);
						etc1[eIndex] = new Goods(name, price / 2, 0);
						etc2[eIndex++] = new Goods(name, price / 2, 100);
						break;
					}
					System.out.println("제품 등록이 완료되었습니다.");
				} else {
					System.out.println("0~4 사이의 숫자를 입력하세요.");
				}
				delay();
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void printCoffee() {

		System.out.println("===== 커피 =====");
		System.out.println("No.\t이름\t\t\t가격\t재고");

		for (int i = 0; i < cIndex; i++) {
			String name = (c[i].getTemp() ? "아이스" : "뜨거운") + " " + c[i].getName() + " "
					+ (c[i].getSize() ? "Large" : "Small") + "\t";
			for (int k = 0; k < (23 - name.length()) / 8; k++) {
				name += "\t";
			}
			System.out.println((i + 1) + "\t" + name + c[i].getPrice() + "\t" + c[i].getStock());
		}

	}

	public void printJuice() {
		System.out.println("===== 과일 주스 =====");
		System.out.println("No.\t이름\t\t가격\t재고");

		for (int i = 0; i < jIndex; i++) {
			String name = j[i].getName() + " " + (j[i].getSize() ? "Large" : "Small") + "\t";
			for (int k = 0; k < (15 - name.length()) / 8; k++) {
				name += "\t";
			}
			System.out.println((i + 1) + "\t" + name + j[i].getPrice() + "\t" + j[i].getStock());
		}
	}

	public void printDesert() {
		System.out.println("===== 디저트 =====");
		System.out.println("No.\t이름\t\t가격\t재고\t유통기한");

		for (int i = 0; i < dIndex; i++) {
			String name = d[i].getName() + " " + (d[i].getSize() ? "Large" : "Small") + "\t";
			for (int k = 0; k < (15 - name.length()) / 8; k++) {
				name += "\t";
			}
			System.out.println(
					(i + 1) + "\t" + name + d[i].getPrice() + "\t" + d[i].getStock() + "\t" + d[i].getExpired());
		}
	}

	public void printEtc() {
		System.out.println("===== 기타 =====");
		System.out.println("No.\t이름\t가격\t재고");

		for (int i = 0; i < eIndex; i++) {
			System.out.println((i + 1) + "\t" + etc[i].getName() + "\t" + etc[i].getPrice() + "\t" + etc[i].getStock());
		}
	}

	public void client() {

	}

	public void server() {

	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
