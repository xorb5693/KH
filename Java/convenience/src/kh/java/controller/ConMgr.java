package kh.java.controller;

import java.util.Scanner;
import kh.java.ve.Drink;
import kh.java.ve.Goods;
import kh.java.ve.InstantFood;
import kh.java.ve.Medicine;
import kh.java.ve.Snack;

public class ConMgr {

	Scanner sc = new Scanner(System.in);

	Drink[] d = new Drink[10];
	int dIndex;

	InstantFood[] iFood = new InstantFood[10];
	int iIndex;

	Snack[] s = new Snack[10];
	int sIndex;

	Medicine[] m = new Medicine[10];
	int mIndex;

	Goods[] etc = new Goods[10];
	int eIndex;

	// 장바구니
	Goods[] cart = new Goods[10];
	int cIndex;

	public ConMgr() {
		d[dIndex++] = new Drink(2000, 100, "스프라이트", false, 550, 300);
		d[dIndex++] = new Drink(3000, 50, "게토레이", false, 500, 250);
		d[dIndex++] = new Drink(3000, 35, "클라우드", true, 350, 400);

		iFood[iIndex++] = new InstantFood(4000, 5, "헤리도시락", false, "2020-02-12", 550);
		iFood[iIndex++] = new InstantFood(1500, 20, "틈새라면", false, "2021-02-12", 450);
		iFood[iIndex++] = new InstantFood(3000, 10, "틈새라면", false, "2020-02-19", 400);

		s[sIndex++] = new Snack(1500, 26, "꼬북칩", false, 340, 80);
		s[sIndex++] = new Snack(2000, 17, "홈런볼", false, 240, 50);
		s[sIndex++] = new Snack(1300, 15, "썬칩", false, 315, 75);

		m[mIndex++] = new Medicine(3500, 10, "타이레놀", false, "2020-07-05");
		m[mIndex++] = new Medicine(1200, 20, "부채표!", false, "2020-05-05");

		etc[eIndex++] = new Goods(5000, 27, "우산", false);
		etc[eIndex++] = new Goods(2000, 30, "물티슈", false);
	}

	public void main() {
		while (true) {
			System.out.println("===== GS25 =====");
			System.out.println("1. 알바");
			System.out.println("2. 손님");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();

			System.out.println();

			switch (select) {
			case 1:
				alba();
				break;
			case 2:
				client();
				break;
			case 0:
				return;
			default:
				System.out.println("0~2 사이의 숫자를 입력해 주세요.");
			}
		}
	}

	public void alba() {
		while(true) {
			System.out.println("===== 일해라 알바야 =====");
			System.out.println("1. 새 제품 등록");
			System.out.println("2. 현재 재고 현황 보기");
			System.out.println("3. 재고 변경");
			System.out.println("4. 제품 삭제");
			System.out.println("0. 뒤로가기");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			switch(select) { 
			case 1 : 
				insertProduct();
				break;
			case 2 :
				System.out.println("\n===== 음료 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부\t용량\t칼로리");
				printArr(d, dIndex);
				
				System.out.println("\n===== 즉석 식품 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부\t유통기한\t\t칼로리");
				printArr(iFood, iIndex);
				
				System.out.println("\n===== 과자 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부\t칼로리\t무게");
				printArr(s, sIndex);
				
				System.out.println("\n===== 즉석 식품 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부\t유통기한");
				printArr(m, mIndex);
				
				System.out.println("\n===== 기타 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부");
				printArr(etc, eIndex);
//				printDrink();
//				printInstantFood();
//				printSnack();
//				printMedicine();
//				printEtc();
				delay();
				break;
			case 3 :
				updateProduct();
				break;
			case 4 :
				deleteProduct();
				break;
			case 0 :
				return;
			default :
				System.out.println("0~4 사이의 숫자를 입력해 주세요.");
			}
		}
	}
	
	public void insertProduct() {
		while(true) {
			System.out.println("===== 제품 등록 ======");
			System.out.println("1. 음료 등록");
			System.out.println("2. 즉석 식품 등록");
			System.out.println("3. 과자 등록");
			System.out.println("4. 의약품 등록");
			System.out.println("5. 기타 등록");
			System.out.println("0. 이전으로");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			if (select == 0) {
				return;
			} else if (select > 0 && select < 6) {
				System.out.print("상품명을 입력하세요. : ");
				String name = sc.next();
				
				System.out.print("상품 가격을 입력하세요 : ");
				int price = sc.nextInt();
				
				System.out.print("수량을 입력하세요 : ");
				int stock = sc.nextInt();
				
				System.out.print("술입니까[y/n]? : ");
				char ch = sc.next().charAt(0);
				boolean adult = (ch == 'y')? true : false;
				
				switch(select) {
				case 1 :
					System.out.print("음료의 용량을 입력하세요(ml) : ");
					int amount = sc.nextInt();
					
					System.out.print("칼로리를 입력하세요(kcal) : ");
					int kcal = sc.nextInt();
					
					d[dIndex++] = new Drink(price, stock, name, adult, amount, kcal);
					break;
				case 2 :
					System.out.print("유통기한을 입력하세요(yyyy-mm-dd) : ");
					String expired = sc.next();
					
					System.out.print("칼로리를 입력하세요(kcal) : ");
					kcal = sc.nextInt();
					
					iFood[iIndex++] = new InstantFood(price, stock, name, adult, expired, kcal);
					break;
				case 3 :
					System.out.print("칼로리를 입력하세요(kcal) : ");
					kcal = sc.nextInt();
					
					System.out.print("무게를 입력하세요(g) : ");
					int weight = sc.nextInt();
					
					s[sIndex++] = new Snack(price, stock, name, adult, kcal, weight);
					break;
				case 4 :
					System.out.print("유통기한을 입력하세요(yyyy-mm-dd) : ");
					expired = sc.next();
					
					m[mIndex++] = new Medicine(price, stock, name, adult, expired);
					break;
				case 5 :
					etc[eIndex++] = new Goods(price, stock, name, adult);
					break;
				}
				
				System.out.println("상품이 등록되었습니다.");
				delay();
			} else {
				System.out.println("0~5 사이의 숫자를 입력해 주세요.");
				delay();
			}
			
		}
	}
	
	//다양성을 이용한 모든 물품 출력 가능 메소드
	public void printArr(Goods[] product, int index) {
		for (int i = 0; i < index; i++) {
			System.out.println((i + 1) + "\t" + product[i]);
		}
	}
	
	public void printDrink() {

		System.out.println("\n===== 음료 =====");
		System.out.println("No.\t제품명\t가격\t재고\t성인여부\t용량\t칼로리");
		
		for (int i = 0; i < dIndex; i++) {
//			System.out.println((i + 1) + "\t" + d[i].getName() + "\t" + d[i].getPrice() + "\t" + d[i].getStock() + "\t" + (d[i].getAdult() ? "O" : "X") + "\t" + d[i].getAmount() + "\t" + d[i].getKcal());
			//toString을 이용한 출력
			System.out.println((i + 1) + "\t" + d[i]);
		}
	}
	
	public void printInstantFood() {
		
		System.out.println("\n===== 즉석 식품 =====");
		System.out.println("No.\t제품명\t가격\t재고\t성인여부\t유통기한\t\t칼로리");
		
		for (int i = 0; i < iIndex; i++) {
			System.out.println((i + 1) + "\t" + iFood[i].getName() + "\t" + iFood[i].getPrice() + "\t" + iFood[i].getStock() + "\t" + (iFood[i].getAdult() ? "O" : "X") + "\t" + iFood[i].getExpired() + "\t" + iFood[i].getKcal());
		}
	}
	
	public void printSnack() {

		System.out.println("\n===== 과자 =====");
		System.out.println("No.\t제품명\t가격\t재고\t성인여부\t칼로리\t무게");
		
		for (int i = 0; i < sIndex; i++) {
			System.out.println((i + 1) + "\t" + s[i].getName() + "\t" + s[i].getPrice() + "\t" + s[i].getStock() + "\t" + (s[i].getAdult() ? "O" : "X") + "\t" + s[i].getKcal() + "\t" + s[i].getWeight());
		}
	}
	
	public void printMedicine() {

		System.out.println("\n===== 즉석 식품 =====");
		System.out.println("No.\t제품명\t가격\t재고\t성인여부\t유통기한");
		
		for (int i = 0; i < mIndex; i++) {
			System.out.println((i + 1) + "\t" + m[i].getName() + "\t" + m[i].getPrice() + "\t" + m[i].getStock() + "\t" + (m[i].getAdult() ? "O" : "X") + "\t" + m[i].getExpired());
		}
	}
	
	public void printEtc() {

		System.out.println("\n===== 기타 =====");
		System.out.println("No.\t제품명\t가격\t재고\t성인여부");
		
		for (int i = 0; i < eIndex; i++) {
			System.out.println((i + 1) + "\t" + etc[i].getName() + "\t" + etc[i].getPrice() + "\t" + etc[i].getStock() + "\t" + (etc[i].getAdult() ? "O" : "X"));
		}
	}
	
	public void updateProduct() {
		System.out.println("===== 재고 변경 ======");
		System.out.println("1. 음료 재고 변경");
		System.out.println("2. 즉석 식품 재고 변경");
		System.out.println("3. 과자 재고 변경");
		System.out.println("4. 의약품 재고 변경");
		System.out.println("5. 기타 상품 재고 변경");
		System.out.println("0. 뒤로가기");
		System.out.print("선택 > ");
		int select = sc.nextInt();
		
		switch(select) {
		case 1 :
			printDrink();
			updateProduct(d);
			break;
		case 2 :
			printInstantFood();
			updateProduct(iFood);
			break;
		case 3 :
			printSnack();
			updateProduct(s);
			break;
		case 4 :
			printMedicine();
			updateProduct(m);
			break;
		case 5 :
			printEtc();
			updateProduct(etc);
			break;
		case 0 :
			return;
		default :
			System.out.println("0~5 사이의 숫자를 입력해 주세요.");
		}
		
		delay();
	}
	
	//오버로딩 + 다양성
	public void updateProduct(Goods[] product) {
		
		System.out.print("재고를 변경할 상품의 No.를 선택해주세요 > ");
		int select = sc.nextInt() - 1;
		System.out.println("[" + product[select].getName() + "]을(를) 선택하셨습니다.");
		System.out.println("현재 재고는 " + product[select].getStock() + "개 입니다.");
		System.out.print("수정할 재고량을 입력해주세요 > ");
		int stock = sc.nextInt();
		
		product[select].setStock(stock);
		
		System.out.println("수정이 완료되었습니다.");
	}
	
	public void deleteProduct() {
		while(true) {
			System.out.println("===== 제품 삭제 =====");
			System.out.println("1. 음료");
			System.out.println("2. 즉석식품");
			System.out.println("3. 과자");
			System.out.println("4. 의약품");
			System.out.println("5. 기타");
			System.out.println("0. 뒤로가기");
			System.out.print("삭제할 제품 카테고리를 선택하세요 > ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.println("\n===== 음료 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부\t용량\t칼로리");
				printArr(d, dIndex);
				dIndex = deleteProduct(d, dIndex);
				break;
			case 2 :
				System.out.println("\n===== 즉석 식품 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부\t유통기한\t\t칼로리");
				printArr(iFood, iIndex);
				iIndex = deleteProduct(iFood, iIndex);
				break;
			case 3 :
				System.out.println("\n===== 과자 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부\t칼로리\t무게");
				printArr(s, sIndex);
				sIndex = deleteProduct(s, sIndex);
				break;
			case 4 :
				System.out.println("\n===== 즉석 식품 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부\t유통기한");
				printArr(m, mIndex);
				mIndex = deleteProduct(m, mIndex);
				break;
			case 5 :
				System.out.println("\n===== 기타 =====");
				System.out.println("No.\t제품명\t가격\t재고\t성인여부");
				printArr(etc, eIndex);
				eIndex = deleteProduct(etc, eIndex);
				break;
			case 0 :
				return;
			}
			
			delay();
		}
	}
	
	//오버로딩 + 다양성
	public int deleteProduct(Goods[] product, int index) {
		System.out.print("삭제할 제품의 No.를 입력하세요 > ");
		int seleIndex = sc.nextInt() - 1;

		System.out.println("[" + product[seleIndex].getName() + "]을(를) 선택하셨습니다.");
		
		System.out.print("해당 제품을 삭제하시겠습니까[y/n]? > ");
		char real = sc.next().charAt(0);
		
		if (real == 'y') {
			for (int i = seleIndex; i < index - 1; i++) {
				product[i] = product[i + 1];
			}
			
			product[--index] = null;
			
			System.out.println("삭제하였습니다.");
		} else {
			System.out.println("삭제작업을 취소하였습니다.");
		}
		
		return index;
	}
	
	public void client() {
		while(true) {
			System.out.println("===== 손님용 창이옵니다 =====");
			System.out.println("1. 쇼핑하기");
			System.out.println("2. 장바구니 보기");
			System.out.println("0. 뒤로가기");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				shopping();
				break;
			case 2 :
				shoppingList();
				break;
			case 0 :
				return;
			default :
				System.out.println("0~2 사이의 숫자를 입력해 주세요.");
			}
		}
	}

	public void shopping() {
		while(true) {
			System.out.println("===== 쇼핑하기 =====");
			System.out.println("1. 음료");
			System.out.println("2. 즉석식품");
			System.out.println("3. 과자");
			System.out.println("4. 의약품");
			System.out.println("5. 기타");
			System.out.println("0. 이전으로");
			System.out.print("구매할 제품 카테고리를 선택하세요 > ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				printDrink();
				buing(d, dIndex);
				break;
			case 2 :
				printInstantFood();
				buing(iFood, iIndex);
				break;
			case 3 :
				printSnack();
				buing(s, sIndex);
				break;
			case 4 :
				printMedicine();
				buing(m, mIndex);
				break;
			case 5 :
				printEtc();
				buing(etc, eIndex);
				break;
			case 0 :
				return;
			default :
				System.out.println("0~5 사이의 숫자를 입력해 주세요.");
			}
			
			delay();
		}
	}
	
	//오버로딩 + 다양성
	private void buing(Goods[] product, int getIndex) {
		System.out.print("구매할 제품 번호 입력 > ");
		int index = sc.nextInt() - 1;

		if (index >= getIndex) {
			System.out.println("해당 제품은 존재하지 않습니다.");
			return;
		}
		
		System.out.print("구매 개수를 입력 > ");
		int count = sc.nextInt();
		
		if (product[index].getStock() < count) {
			System.out.println("재고가 부족합니다.");
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		}
		
		System.out.println("[" + product[index].getName() + "]을(를) " + count + "개 선택하셨습니다.");
		System.out.print("장바구니에 담으시겠습니까[y/n]? > ");
		char sel = sc.next().charAt(0);
		
		if (sel == 'y') {
			//가격, 재고, 상품이름, 성인인증 필요 유뮤
			cart[cIndex++] = new Goods(product[index].getPrice(), count, product[index].getName(), product[index].getAdult());
			product[index].setStock(product[index].getStock() - count);
			System.out.println("장바구니에 담았습니다.");
		} else {
			System.out.println("취소하셨습니다.");
		}
		
		System.out.println("이전 메뉴로 돌아갑니다.");
	}

	private void shoppingList() {
		System.out.println("===== 장바구니 =====");
		System.out.println("No.\t제품명\t가격\t수량");
		int totalPrice = 0;
		for (int i = 0; i < cIndex; i++) {
			System.out.println((i + 1) + "\t" + cart[i].getName() + "\t" + cart[i].getPrice() + "\t" + cart[i].getStock());
			
			totalPrice += cart[i].getPrice() * cart[i].getStock();
		}
		
		System.out.println("=================");
		System.out.println("총액 : " + totalPrice);
		
		delay();
	}
	public void delay() {
		try {
			Thread.sleep(500);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
