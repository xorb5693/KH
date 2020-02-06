package kr.or.iei.func;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Adoption {

	ArrayList<Animal> list = new ArrayList<Animal>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Random rand = new Random();

	public Adoption() {
		int select;

		while (true) {
			System.out.println("========== 동물 입양하기 ==========");
			System.out.println("1. 입양하기");
			System.out.println("2. 관리하기");
			System.out.println("3. 파양하기");
			System.out.println("4. 프로그램 종료");

			while (true) {
				System.out.print("선택 > ");

				try {
					select = Integer.parseInt(br.readLine());

					if (select < 1 || select > 4) {
						System.out.println("1~4 사이의 숫자를 입력해 주세요.");
					} else {
						break;
					}
				} catch (NumberFormatException ne) {
					System.err.println("숫자를 입력해 주세요.");
				} catch (IOException ie) {
					ie.printStackTrace();
				}
			}

			switch (select) {
			case 1:
				selectAnimal();
				break;
			case 2:
				animalCare();
				break;
			case 3:
				abandonment();
				break;
			case 4:
				return;
			}
		}
	}

	public void selectAnimal() {

		String animal[] = { "강아지", "고양이", "햄스터", "새" };
		int select;

		while (true) {
			System.out.println("========== 동물 선택하기 =========");

			for (int i = 0; i < animal.length; i++) {
				System.out.println((i + 1) + ". " + animal[i]);
			}

			System.out.println("5. 취소하기");

			System.out.print("선택 > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > 5) {
					System.out.println("1~4 사이의 숫자를 입력해 주세요.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		switch (select) {
		case 1:
			selectDog();
			break;
		case 2:
			selectCat();
			break;
		case 3:
			selectHamster();
			break;
		case 4:
			selectBird();
			break;
		case 5:
			return;
		}
	}

	public void selectDog() {

		String dog[] = { "포메라니안", "치와와", "파피용", "닥스훈트", "웰시코기", "골든 리트리버", "레브라도 리트리버", "그레이트 피레니즈" };
		int select;

		String name;
		String species = "강아지";
		String category;
		int age;
		String sex;

		while (true) {
			System.out.println("========== 동물 선택하기 =========");

			for (int i = 0; i < dog.length; i++) {
				System.out.println((i + 1) + ". " + dog[i]);
			}

			System.out.println((dog.length + 1) + ". 취소하기");

			System.out.print("선택 > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > dog.length + 1) {
					System.out.println("1~" + (dog.length + 1) + " 사이의 숫자를 입력해 주세요.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		if (select == dog.length + 1) {
			return;
		} else {
			category = dog[select - 1];
		}

		age = rand.nextInt(5) + 1;

		sex = (rand.nextInt(2) == 0) ? "남" : "여";

		System.out.println("=====" + species + "입양하기 =====");
		System.out.println("종류 : " + category);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);

		while (true) {
			try {
				System.out.print("입양하시겠습니까? [1. yes / 2. no] ");
				select = Integer.parseInt(br.readLine());

				if (select != 1 && select != 2) {
					System.out.println("1~2 사이의 숫자를 입력해 주세요.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (select == 1) {
			System.out.print("이름을 입력하세요 : ");
			try {
				name = br.readLine();
				Animal animal = new Animal(name, species, category, age, sex);
				list.add(animal);
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(".");
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.println("입양해주셔서 감사합니다!");

		} else {
			return;
		}
	}

	public void selectCat() {

		String cat[] = { "페르시안", "러시안 블루", "먼치킨", "시베리안 고양이", "시암 고양이", "아메리칸 쇼트 헤어", "맹크스" };
		int select;

		String name;
		String species = "고양이";
		String category;
		int age;
		String sex;

		while (true) {
			System.out.println("========== 동물 선택하기 =========");

			for (int i = 0; i < cat.length; i++) {
				System.out.println((i + 1) + ". " + cat[i]);
			}

			System.out.println((cat.length + 1) + ". 취소하기");

			System.out.print("선택 > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > cat.length + 1) {
					System.out.println("1~" + (cat.length + 1) + " 사이의 숫자를 입력해 주세요.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		if (select == cat.length + 1) {
			return;
		} else {
			category = cat[select - 1];
		}

		age = rand.nextInt(5) + 1;

		sex = (rand.nextInt(2) == 0) ? "남" : "여";

		System.out.println("=====" + species + "입양하기 =====");
		System.out.println("종류 : " + category);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);

		while (true) {
			System.out.print("입양하시겠습니까? [1. yes / 2. no] ");
			try {
				select = Integer.parseInt(br.readLine());

				if (select != 1 && select != 2) {
					System.out.println("1~2 사이의 숫자를 입력해 주세요.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (select == 1) {
			System.out.print("이름을 입력하세요 : ");
			try {
				name = br.readLine();
				Animal animal = new Animal(name, species, category, age, sex);
				list.add(animal);
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(".");
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.println("입양해주셔서 감사합니다!");

		} else {
			return;
		}
	}

	public void selectHamster() {

		String hamster[] = { "골든 햄스터", "드워프 햄스터", "로보로브스키 햄스터", "캠벨 햄스터", "차이니즈 햄스터" };
		int select;

		String name;
		String species = "햄스터";
		String category;
		int age;
		String sex;

		while (true) {
			System.out.println("========== 동물 선택하기 =========");

			for (int i = 0; i < hamster.length; i++) {
				System.out.println((i + 1) + ". " + hamster[i]);
			}

			System.out.println((hamster.length + 1) + ". 취소하기");

			System.out.print("선택 > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > hamster.length + 1) {
					System.out.println("1~" + (hamster.length + 1) + " 사이의 숫자를 입력해 주세요.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		if (select == hamster.length + 1) {
			return;
		} else {
			category = hamster[select - 1];
		}

		age = rand.nextInt(5) + 1;

		sex = (rand.nextInt(2) == 0) ? "남" : "여";

		System.out.println("=====" + species + "입양하기 =====");
		System.out.println("종류 : " + category);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);

		while (true) {
			try {
				System.out.print("입양하시겠습니까? [1. yes / 2. no] ");
				select = Integer.parseInt(br.readLine());

				if (select != 1 && select != 2) {
					System.out.println("1~2 사이의 숫자를 입력해 주세요.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (select == 1) {
			System.out.print("이름을 입력하세요 : ");
			try {
				name = br.readLine();
				Animal animal = new Animal(name, species, category, age, sex);
				list.add(animal);
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(".");
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.println("입양해주셔서 감사합니다!");

		} else {
			return;
		}
	}

	public void selectBird() {

		String bird[] = { "비둘기", "카나리아", "패럿", "코카투", "파라킷" };
		int select;

		String name;
		String species = "새";
		String category;
		int age;
		String sex;

		while (true) {
			System.out.println("========== 동물 선택하기 =========");

			for (int i = 0; i < bird.length; i++) {
				System.out.println((i + 1) + ". " + bird[i]);
			}

			System.out.println((bird.length + 1) + ". 취소하기");

			System.out.print("선택 > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > bird.length + 1) {
					System.out.println("1~" + (bird.length + 1) + " 사이의 숫자를 입력해 주세요.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		if (select == bird.length + 1) {
			return;
		} else {
			category = bird[select - 1];
		}

		age = rand.nextInt(5) + 1;

		sex = (rand.nextInt(2) == 0) ? "남" : "여";

		System.out.println("=====" + species + "입양하기 =====");
		System.out.println("종류 : " + category);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);

		while (true) {
			System.out.print("입양하시겠습니까? [1. yes / 2. no] ");
			try {
				select = Integer.parseInt(br.readLine());

				if (select != 1 && select != 2) {
					System.out.println("1~2 사이의 숫자를 입력해 주세요.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (select == 1) {
			System.out.print("이름을 입력하세요 : ");
			try {
				name = br.readLine();
				Animal animal = new Animal(name, species, category, age, sex);
				list.add(animal);
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(".");
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.println("입양해주셔서 감사합니다!");

		} else {
			return;
		}
	}

	public void animalCare() {
		
		int select;
		Animal animal;

		while (true) {

			while (true) {
				System.out.println("========== 동물 관리하기 =========");
				
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". " + list.get(i).getName() + " - " + list.get(i).getCategory());
				}
				
				System.out.println((list.size() + 1) + ". 취소하기");
				
				while (true) {
					System.out.print("선택 > ");
					try {
						select = Integer.parseInt(br.readLine());

						if (select < 1 || select > list.size() + 1) {
							System.out.println("1~" + (list.size() + 1) + " 사이의 숫자를 입력해 주세요.");
						} else {
							break;
						}
					} catch (NumberFormatException ne) {
						System.err.println("숫자를 입력해 주세요.");
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}
				
				if (select == list.size() + 1) {
					return;
				} else {
					animal = list.get(select);
				}
				
				careSelect(animal);
			}
		}
	}
	
	public void careSelect(Animal animal) {
		int select;
		
		while (true) {
			System.out.println("===== 관리항목 선택하기 =====");
			System.out.println("1. 먹이주기");
			System.out.println("2. 샤워하기");
			System.out.println("3. 잠자기");
			System.out.println("4. 놀아주기기");
			System.out.println("5. 동물정보");
			System.out.println("6. 취소");
			
			while (true) {
				System.out.print("선택 > ");
				try {
					select = Integer.parseInt(br.readLine());

					if (select < 1 || select > 6) {
						System.out.println("1~6 사이의 숫자를 입력해 주세요.");
					} else {
						break;
					}
				} catch (NumberFormatException ne) {
					System.err.println("숫자를 입력해 주세요.");
				} catch (IOException ie) {
					ie.printStackTrace();
				}
			}
			
			switch(select) {
			case 1 :
				animal.eat();
				break;
			case 2 :
				animal.bath();
				break;
			case 3 :
				animal.sleep();
				break;
			case 4 :
				animal.play();
				break;
			case 5 :
				animal.getInfo();
				break;
			case 6 :
				return;
			}
		}
	}

	public void abandonment() {
		int select;
		int abandSelect;
		Animal animal;

		while (true) {

			while (true) {
				System.out.println("========== 동물 파양하기 =========");
				
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". " + list.get(i).getName() + " - " + list.get(i).getCategory());
				}
				
				System.out.println((list.size() + 1) + ". 취소하기");
				
				while (true) {
					System.out.print("선택 > ");
					try {
						select = Integer.parseInt(br.readLine());

						if (select < 1 || select > list.size() + 1) {
							System.out.println("1~" + (list.size() + 1) + " 사이의 숫자를 입력해 주세요.");
						} else {
							break;
						}
					} catch (NumberFormatException ne) {
						System.err.println("숫자를 입력해 주세요.");
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}
				
				if (select == list.size() + 1) {
					return;
				} else {
					animal = list.get(select - 1);
				}
				
				System.out.println(animal.getName() + "을(를) 버립니다.");
				
				while (true) {
					System.out.print("정말로 버리실건가요? [1. yes / 2. no] ");

					try {
						abandSelect = Integer.parseInt(br.readLine());
						
						if (abandSelect != 1 && abandSelect != 2) {
							System.out.println("1~2 사이의 숫자를 입력해 주세요.");
						} else {
							break;
						}
					}catch (NumberFormatException ne) {
						System.err.println("숫자를 입력해 주세요.");
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}
				
				if (abandSelect == 1) {
					while (true) {
						System.out.print("정말 정말로 버리실건가요? [1. yes / 2. no] ");

						try {
							abandSelect = Integer.parseInt(br.readLine());
							
							if (abandSelect != 1 && abandSelect != 2) {
								System.out.println("1~2 사이의 숫자를 입력해 주세요.");
							} else {
								break;
							}
						}catch (NumberFormatException ne) {
							System.err.println("숫자를 입력해 주세요.");
						} catch (IOException ie) {
							ie.printStackTrace();
						}
					}
				} else {
					System.out.println("잘생각하셨어요!");
					return;
				}
				
				if (abandSelect == 1) {
					while (true) {
						System.out.print("정말 정말 정말로 버리실건가요? [1. yes / 2. no] ");

						try {
							abandSelect = Integer.parseInt(br.readLine());
							
							if (abandSelect != 1 && abandSelect != 2) {
								System.out.println("1~2 사이의 숫자를 입력해 주세요.");
							} else {
								break;
							}
						}catch (NumberFormatException ne) {
							System.err.println("숫자를 입력해 주세요.");
						} catch (IOException ie) {
							ie.printStackTrace();
						}
					}
				} else {
					System.out.println("잘생각하셨어요!");
					return;
				}
				
				if (abandSelect == 1) {
					
					try {
						for (int i = 0; i < 5; i++) {
							System.out.println(".");
							Thread.sleep(500);
						}
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
					
					System.out.println(animal.getName() + "을(를) 버리셨습니다.");
					list.remove(select - 1);
				} else {
					System.out.println("잘생각하셨어요!");
					return;
				}
			}
		}
	}
}
