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
	int clientMoney = 0;

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
	int cartIndex;

	Coffee oc = new Coffee();
	Juice oj = new Juice();
	Dessert od = new Dessert();
	Goods oe = new Goods();

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
			System.out.println("===== CAFFE BENE =====");
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
			System.out.println("보유 금액 : " + totalPrice);
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
					printCoffee(c);
					printJuice(j);
					printDessert(d);
					printEtc(etc);
					delay();
					break;
				case 3:
					updateProduct();
					break;
				case 4:
					deleteProduct();
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

	public void printCoffee(Coffee[] c) {

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

	public void printJuice(Juice[] j) {
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

	public void printDessert(Dessert[] d) {
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

	public void printEtc(Goods[] e) {
		System.out.println("===== 기타 =====");
		System.out.println("No.\t이름\t가격\t재고");

		for (int i = 0; i < eIndex; i++) {
			System.out.println((i + 1) + "\t" + etc[i].getName() + "\t" + etc[i].getPrice() + "\t" + etc[i].getStock());
		}
	}

	public void deleteProduct() {
		while (true) {

			System.out.println("===== 제품 삭제 ======");
			System.out.println("1. 커피 삭제");
			System.out.println("2. 과일 주스 삭제");
			System.out.println("3. 디저트 삭제");
			System.out.println("4. 기타 삭제");
			System.out.println("0. 이전으로");
			System.out.print("선택 > ");

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					printCoffee(c);
					cIndex = deleteProduct(c, c1, c2, cIndex, oc);
					break;
				case 2:
					jIndex = deleteProduct(j, j1, j2, jIndex, oj);
					printJuice(j);
					break;
				case 3:
					dIndex = deleteProduct(d, d1, d2, dIndex, od);
					printDessert(d);
					break;
				case 4:
					eIndex = deleteProduct(etc, etc1, etc2, eIndex, oe);
					printEtc(etc);
					break;
				case 0:
					System.out.println("이전 페이지로 돌아갑니다.");
					delay();
					return;
				default:
					System.out.println("0~4 사이의 숫자를 입력하세요.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			delay();
		}
	}

	public int deleteProduct(Goods[] product, Goods[] product1, Goods[] product2, int index, Object ojt) {
		int selDelete;
		String name = "";
		while (true) {
			try {
				System.out.print("선택 > ");
				selDelete = Integer.parseInt(br.readLine()) - 1;

				if (selDelete >= 0 && selDelete < index) {
					break;
				} else {
					System.out.println("1~" + index + "사이의 숫자를 입력해 주세요.");
					continue;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (ojt instanceof Coffee) {
			name = (((Coffee) product[selDelete]).getTemp() ? "아이스" : "뜨거운") + " " + product[selDelete].getName() + " "
					+ (((Coffee) product[selDelete]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Juice) {
			name = product[selDelete].getName() + " " + (((Juice) product[selDelete]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Dessert) {
			name = product[selDelete].getName() + " " + (((Dessert) product[selDelete]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Goods) {
			name = product[selDelete].getName();
		}

		System.out.print("[" + name + "]을(를) 삭제하시겠습니까?[y/n] : ");
		try {
			char ch = br.readLine().charAt(0);

			if (ch == 'y') {
				for (int i = selDelete; i < index - 1; i++) {
					product[i] = product[i + 1];
					product1[i] = product1[i + 1];
					product2[i] = product2[i + 1];
				}

				product[--index] = null;
				product1[index] = null;
				product2[index] = null;
				System.out.println("제품이 삭제되었습니다.");
			} else {
				System.out.println("제품 삭제를 취소하였습니다.");
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}
		return index;
	}

	public void updateProduct() {
		while (true) {

			System.out.println("===== 재고 요청 ======");
			System.out.println("1. 커피 요청");
			System.out.println("2. 과일 주스 요청");
			System.out.println("3. 디저트 요청");
			System.out.println("4. 기타 요청");
			System.out.println("0. 이전으로");
			System.out.print("선택 > ");

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					printCoffee(c);
					updateProduct(c, c1, cIndex, oc);
					break;
				case 2:
					printJuice(j);
					updateProduct(j, j1, jIndex, oj);
					break;
				case 3:
					printDessert(d);
					updateProduct(d, d1, dIndex, od);
					break;
				case 4:
					printEtc(etc);
					updateProduct(etc, etc1, eIndex, oe);
					break;
				case 0:
					System.out.println("이전 페이지로 돌아갑니다.");
					delay();
					return;
				default:
					System.out.println("0~4 사이의 숫자를 입력하세요.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			delay();
		}
	}

	public void updateProduct(Goods[] product, Goods[] product1, int index, Object ojt) {

		String name = "";
		int select;

		while (true) {
			try {
				System.out.print("선택 > ");
				select = Integer.parseInt(br.readLine()) - 1;

				if (select >= 0 && select < index) {
					break;
				} else {
					System.out.println("1~" + index + "사이의 숫자를 입력해 주세요.");
					continue;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (ojt instanceof Coffee) {
			name = (((Coffee) product[select]).getTemp() ? "아이스" : "뜨거운") + " " + product[select].getName() + " "
					+ (((Coffee) product[select]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Juice) {
			name = product[select].getName() + " " + (((Juice) product[select]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Dessert) {
			name = product[select].getName() + " " + (((Dessert) product[select]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Goods) {
			name = product[select].getName();
		}
		while (true) {
			try {
				System.out.print("[" + name + "]을(를) 몇개 요청하시겠습니까 : ");
				int count = Integer.parseInt(br.readLine());

				if (totalPrice < product1[select].getPrice() * count) {
					System.out.println("소지금이 부족합니다.");
					System.out.println("현재 소지금 : " + totalPrice);
					continue;
				} else {
					product1[select].setStock(product1[select].getStock() + count);
					System.out.println("재고 요청이 완료되었습니다.");
					return;
				}

			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void client() {

		while (true) {
			System.out.println(" ====== myCoffee ====== ");
			System.out.println("현재 총 구매한 금액 : " + clientMoney + "원");
			System.out.println("1. 쇼핑하기");
			System.out.println("2. 장바구니 보기");
			System.out.println("3. 장바구니 초기화");
			System.out.println("0. 뒤로가기");
			System.out.print("선택 > ");
			try {
				int sel = Integer.parseInt(br.readLine());

				switch (sel) {
				case 1:
					shopping();
					break;
				case 2:
					shoppingList();
					break;
				case 3:
					shoppingListReset();
					break;
				case 0:
					return;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void shopping() {
		while (true) {
			System.out.println(" ====== 카페 구매 목록 ====== ");
			System.out.println("1. [커피]");
			System.out.println("2. [괴일쥬스]");
			System.out.println("3. [디저트]");
			System.out.println("4. [기타]");
			System.out.println("0. 뒤로가기");
			System.out.print("구매할 제품 카테고리를 선택해주세요 : ");

			try {
				int sel = Integer.parseInt(br.readLine());

				switch (sel) {
				case 1:
					printCoffee(c);
					buing(c);
					break;
				case 2:
					printJuice(j);
					buing(j);
					break;
				case 3:
					printDessert(d);
					buing(d);
					break;
				case 4:
					printEtc(etc);
					buing(etc);
					break;
				case 0:
					return;
				}
				delay();
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void buing(Goods[] product) {
		while (true) {

			try {
				System.out.print("구매할 제품 번호 입력 : ");
				int nIndex = Integer.parseInt(br.readLine()) - 1;
				System.out.print("구매할 개수를 입력 : ");
				int count = Integer.parseInt(br.readLine());
				if (product[nIndex].getStock() < count) {
					System.out.println("재고가 부족합니다.");
					System.out.println("이전메뉴로 돌아갑니다.");
					break;
				}
				System.out.println("[" + product[nIndex].getName() + "]제품 " + count + "개를 구입");
				System.out.print("장바구니에 담으시겠습니까[y/n]? : ");
				char sel = br.readLine().charAt(0);
				if (sel == 'y') {
					// 가격, 재고, 상품이름
					int price = product[nIndex].getPrice();
					int stock = count;
					String name = product[nIndex].getName();
					cart[cartIndex++] = new Goods(name, price, stock);
					product[nIndex].setStock(product[nIndex].getStock() - count);
					clientMoney += price * stock;
				} else if (sel == 'n') {
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			break;
		}
	}

	public void shoppingList() {
		System.out.println(" ====== 장바구니 ====== ");
		System.out.println("제품명\t가격\t수량");
		int totalPrice = 0;
		for (int i = 0; i < cartIndex; i++) {
			System.out.println(cart[i].getName() + "\t" + cart[i].getPrice() + "\t" + cart[i].getStock());

			totalPrice += cart[i].getPrice() * cart[i].getStock();
		}
		System.out.println("총 구매금액 : " + totalPrice + "원");

		this.totalPrice += totalPrice;
		delay();
	}

	public void shoppingListReset() {
		cart = new Goods[10];
		cartIndex = 0;
		clientMoney = 0;
		System.out.println("장바구니가 초기화 되었습니다.");
		delay();
	}

	public void server() {
		while (true) {
			System.out.println("===== 납품업체 ======");
			System.out.println("1. 재고추가");
			System.out.println("2. 남품가능재고");
			System.out.println("3. 재고요청확인");
			System.out.println("0. 이전으로");
			System.out.print("선택 > ");

			try {
				int sel = Integer.parseInt(br.readLine());
				switch (sel) {
				case 1:
					delivery();
					break;
				case 2:
					printCoffee(c2);
					printJuice(j2);
					printDessert(d2);
					printEtc(etc2);
					delay();
					break;
				case 3:
					requestCoffee();
					break;
				default:
					return;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void delivery() {
		while (true) {
			System.out.println("===== 납품 추가 ======");
			System.out.println("1. 커피 추가");
			System.out.println("2. 과일 주스 추가");
			System.out.println("3. 디저트 추가");
			System.out.println("4. 기타 추가");
			System.out.println("0. 이전으로");
			System.out.print("선택 > ");

			try {

				int sel = Integer.parseInt(br.readLine());
				switch (sel) {
				case 1:
					printCoffee(c2);
					insertProduct(c);
					break;
				case 2:
					printJuice(j2);
					insertProduct(j);
					break;
				case 3:
					printDessert(d2);
					insertProduct(d);
					break;
				case 4:
					printEtc(etc2);
					insertProduct(etc);
					break;
				default:
					return;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void insertProduct(Goods[] product) {

		try {
			System.out.println("===== 물품 추가=====");

			System.out.print("추가할 제품 번호 입력 : ");
			int index = Integer.parseInt(br.readLine()) - 1;
			System.out.print("추가할 수 입력 : ");
			int count = Integer.parseInt(br.readLine());
			System.out.println("[" + (c2[index].getTemp() ? "아이스" : "뜨거운") + " " + c2[index].getName() + " "
					+ (c2[index].getSize() ? "Large" : "Small") + "]제품 " + count + "개를 선택하셨습니다.");
			System.out.print("해당 물품을 추가하시겠습니까[y/n]?");
			char ch = br.readLine().charAt(0);
			if (ch == 'y') {
				count += c2[index].getStock();
				c2[index].setStock(count);
			}
		} catch (NumberFormatException ne) {
			System.err.println("숫자를 입력해 주세요.");
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public void requestCoffee() {
		System.out.println("===== 커피 =====");
		System.out.println("No.\t이름\t\t\t가격\t재고");

		int count = 1;
		int requestPrice = 0;
		boolean requestCheck = false;

		for (int i = 0; i < cIndex; i++) {
			if (c1[i].getStock() != 0) {
				String name = (c1[i].getTemp() ? "아이스" : "뜨거운") + " " + c1[i].getName() + " "
						+ (c1[i].getSize() ? "Large" : "Small") + "\t";
				for (int k = 0; k < (23 - name.length()) / 8; k++) {
					name += "\t";
				}
				System.out.println((count++) + "\t" + name + c1[i].getPrice() + "\t" + c1[i].getStock());
				requestPrice += c1[i].getPrice() * c1[i].getStock();
				requestCheck = true;
			}
		}

		System.out.println("===== 과일 주스 =====");
		System.out.println("No.\t이름\t\t가격\t재고");

		count = 1;

		for (int i = 0; i < jIndex; i++) {
			if (j1[i].getStock() != 0) {
				String name = j1[i].getName() + " " + (j1[i].getSize() ? "Large" : "Small") + "\t";
				for (int k = 0; k < (15 - name.length()) / 8; k++) {
					name += "\t";
				}
				System.out.println((count++) + "\t" + name + j1[i].getPrice() + "\t" + j1[i].getStock());
				requestPrice += j1[i].getPrice() * j1[i].getStock();
				requestCheck = true;
			}
		}

		System.out.println("===== 디저트 =====");
		System.out.println("No.\t이름\t\t가격\t재고\t유통기한");

		count = 1;

		for (int i = 0; i < dIndex; i++) {
			if (d1[i].getStock() != 0) {
				String name = d1[i].getName() + " " + (d1[i].getSize() ? "Large" : "Small") + "\t";
				for (int k = 0; k < (15 - name.length()) / 8; k++) {
					name += "\t";
				}
				System.out.println((count++) + "\t" + name + d1[i].getPrice() + "\t" + d1[i].getStock() + "\t"
						+ d1[i].getExpired());
				requestPrice += d1[i].getPrice() * d1[i].getStock();
				requestCheck = true;
			}
		}

		System.out.println("===== 기타 =====");
		System.out.println("No.\t이름\t가격\t재고");

		count = 1;

		for (int i = 0; i < eIndex; i++) {
			if (etc1[i].getStock() != 0) {
				System.out.println(
						(count++) + "\t" + etc1[i].getName() + "\t" + etc1[i].getPrice() + "\t" + etc1[i].getStock());
				requestPrice += etc1[i].getPrice() * etc1[i].getStock();
				requestCheck = true;
			}
		}

		if (requestCheck) {

			System.out.print("재고요청을 승낙하겠습니까[y/n]? : ");

			try {
				char ch = br.readLine().charAt(0);

				if (ch == 'y') {
					for (int i = 0; i < cIndex; i++) {
						if (c1[i].getStock() != 0) {
							c[i].setStock(c[i].getStock() + c1[i].getStock());
							c2[i].setStock(c2[i].getStock() - c1[i].getStock());
							c1[i].setStock(0);
						}
					}

					for (int i = 0; i < jIndex; i++) {
						if (j1[i].getStock() != 0) {
							j[i].setStock(j[i].getStock() + j1[i].getStock());
							j2[i].setStock(j2[i].getStock() - j1[i].getStock());
							j1[i].setStock(0);
						}
					}

					for (int i = 0; i < dIndex; i++) {
						if (d1[i].getStock() != 0) {
							d[i].setStock(d[i].getStock() + d1[i].getStock());
							d2[i].setStock(d2[i].getStock() - d1[i].getStock());
							d1[i].setStock(0);
						}
					}

					for (int i = 0; i < eIndex; i++) {
						if (etc1[i].getStock() != 0) {
							etc[i].setStock(etc[i].getStock() + etc1[i].getStock());
							etc2[i].setStock(etc2[i].getStock() - etc1[i].getStock());
							etc1[i].setStock(0);
						}
					}

					totalPrice -= requestPrice;
					System.out.println("재고 추가가 완료되었습니다.");
					System.out.println("총 금액 : " + requestPrice);
				} else {
					System.out.println("취소하였습니다.");
					System.out.print("재고 요청을 삭제하시겠습니까[y/n]? : ");
					ch = br.readLine().charAt(0);

					if (ch == 'y') {
						for (int i = 0; i < cIndex; i++) {
							if (c1[i].getStock() != 0) {
								c1[i].setStock(0);
							}
						}

						for (int i = 0; i < jIndex; i++) {
							if (j1[i].getStock() != 0) {
								j1[i].setStock(0);
							}
						}

						for (int i = 0; i < dIndex; i++) {
							if (d1[i].getStock() != 0) {
								d1[i].setStock(0);
							}
						}

						for (int i = 0; i < eIndex; i++) {
							if (etc1[i].getStock() != 0) {
								etc1[i].setStock(0);
							}
						}

						System.out.println("재고 요청을 삭제하였습니다.");
					}
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		} else {
			System.out.println("재고 요청이 없습니다.");
		}

		delay();
	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
