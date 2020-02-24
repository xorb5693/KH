# KH 정보교육원 훈련

## 0. 목차
**[1. 개요](#1-개요)**  
**[2. 교육 일정](#2-교육-일정)**  
**[3. 이클립스 기능](#3-이클립스-기능)**  
**[4. Java](#4-Java)**

<details>
<summary>교육 일정 상세보기</summary>
<div markdown="1">
	
| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |  
| :-----: | :-----: | :-----: | :-----: | :-----: | :-----: | :-----: | :-----: | :-----: | :-----: |  
| [2.1](#21-1일차2020-01-28) | [2.2](#22-2일차2020-01-29) | [2.3](#23-3일차2020-01-30) | [2.4](#24-4일차2020-01-31) | [2.5](#25-5일차2020-02-03) | [2.6](#26-6일차2020-02-04) | [2.7](#27-7일차2020-02-05) | [2.8](#28-8일차2020-02-06) | [2.9](#29-9일차2020-02-07) | [2.10](#210-10일차2020-02-10) |
| [2.11](#211-11일차2020-02-11) | [2.12](#212-12일차2020-02-12) | [2.13](#213-13일차2020-02-13) | [2.14](#214-14일차2020-02-14) | [2.15](#215-15일차2020-02-17) | [2.16](#216-16일차2020-02-18) | [2.17](#217-17일차2020-02-19) | [2.18](#218-18일차2020-02-20) | [2.19](#219-19일차2020-02-21) | [2.20](#220-20일차2020-02-24) |

</div>
</details>  

## 1. 개요
- 이 문서는 KH 정보교육원 교육 중 만들어지는 문서들을 저장하기 위한 Repository입니다.
- 교육명은 「디바이스&웹 콘텐츠 융합 디지털 컨버전스 양성과정」입니다.
- 이번 교육의 Java 버전은 1.8.0_144입니다.
- 교육 내용
  1. 운영체제
  2. 프로그래밍 언어
  3. DB
  4. Front-End
  5. Server
  6. Framwork

## 2. 교육 일정

### 2.1 1일차(2020-01-28)
- 교육 오리엔테이션(학원 소개, 제한 사항, 자기 소개 등)
- 4차 산업이란
- 용량 단위(bit, byte, Kbyte 등)
- 2진수, 8진수, 10진수, 16진수
- ASCII 코드, 유니코드
- 프로그램이란?
- JAVA의 특징 및 설치, 테스트 프로그램
- 제작 프로그램 
  - Java : firstProject

### 2.2 2일차(2020-01-29)
- 표기법
  - 카멜 표기법 : 낙타의 혹이 튀어 나온것처럼 소문자로 시작하여 단어와 단어가 만날 때 뒷 단어의 첫글자를 대문자로 작성하는 방식  
  ex) phoneNumber
  - 파스칼 표기법 : 카멜 표기법과 유사하지만 첫 글자까지 대문자로 작성  
  ex) PhoneNumber
  - 프로젝트명, 변수, 메소드 : 카멜 표기법
  - 패키지명 : 모두 소문자
  - 클래스명 : 파스칼 표기법
- 들여쓰기
  - GUN
    - 블록을 아래에서 들여쓰기 해서 작성
    - 블록의 표시가 분명하여 구조가 절 보임
    - 들여쓰기를 많이 해서 수평으로 많은 코드 작성 불가
  - K&R
    - 여는 블록을 같은 행에 배치
    - 코드 줄 수를 절약하여 한눈에 많은 코드를 볼 수 있고 수평으로 많은 코드 작성 가능
    - 일반적으로 가장 많이 사용됨
  - BSD
    - GUN의 블록표시가 분명한 장점과 K&R의 수평으로 많은 코드를 작성가능한 장점을 가져와 결합한 배치
- 주석
  - 컴파일 시 소스코드를 분석하지 않는 부분
  - 소스 코드의 내용을 설명하기 위한 문구를 넣을 때 사용
  - 한 줄 주석(//)
  - 범위 주석(/**/)
- 실행 클래스와 기능제공 클래스
  - 실행 클래스
    - 메인 메소드(실행 메소드)를 가지고 있는 클래스
    - 메인 메소드가 프로젝트당 1개이기 때문에 실행클래스도 프로젝트당 1개 존재
    - 실행 클래스의 메인 메소드에서는 기능제공 클래스에 작성한 기능을 실행하는 용도로만 사용하며, 기능을 구현하지 않는다.
  - 기능제공 클래스
    - 실제 기능이 구현되어 있는 메소드를 가지고있는 클래스
    - 기능용 메소드는 제한이 없기 때문에 여러 개의 클래스 및 메소드를 작성해도 상관없음
    - 일반적으로 비슷한 기능들을 하나의 기능제공 클래스로 작성
    - 유사한 기능제공 클래스들은 같은 패키지 내부 존재
- 자료형
  - 기본형(Primitive Type)
    - 실제 데이터(값)를 저장
    - 논리형, 문자형, 정수형, 실수형으로 나눠지고, 8개의 자료형이 있음
    - 각 자료형별 데이터의 저장 크기가 다름
    - 종류
      1. 정수 : byte, short, int(기본형), long(초기화 시 뒤에 L을 붙인다)
      2. 실수 : float(초기화 때 뒤에 f를 붙인다), double(기본형)
      3. 문자 : char
      4. 논리형 : boolean
  - 참조형(Reference Type)
    - 데이터가 저장되어 있는 주소를 저장(객체의 주소)
    - 기본형을 제외한 나머지, 사용자 정의 자료형
    - 주소값만 저장하기 때문에 4byte로 저장크기가 일정함
    - 종류
      1. 문자열 : String
      2. 사용자 정의 클래스 타입
      3. 배열
- 변수
  - 메모리 공간(RAM)에 한 개의 값을 기록하기 위한 장소(공간)
  - 변수의 선언
    - 메모리 공간(RAM)에 데이터를 저장할 수 있는 공간을 할당하는 것
    - (저장할 데이터 타입) (변수명);  
    ex) int number;
  - 변수 명명규칙
    1. 대소문자가 구분되며 길이제한이 없다.
    2. 예약어를 사용하면 안된다.
    3. 숫자로 시작하면 안된다.
    4. 특수문자는 '_'와 '$'만을 허용한다.
    5. 카멜 표기법을 사용한다.
    6. 한글입력이 가능하지만 사용을 지양한다.
    7. 의미있는 변수명을 사용하는 것을 권고한다.
- 상수
  - 수학에서 변하지 않는 값, 프로그래밍에서는 한번만 저장할 수 있는 공간으로 다른 변수와의 차이점은 초기화 이후 다른 값을 대입할 수 없음.
  - 상수 선언
    - final double PI = 3.14
    - final : 해당 변수가 상수임을 선언하기 위한 시스템 예약어
    - PI : 변수명은 카멜표기법을 사용하는 것을 규약으로 하지만 상수형 변수는 모두 대문자로 표기한다.
- 형번환
  - 묵시적(자동) 형변환(Promotion)
  - 명시적(강제) 형변환(Casting)
  - 형변환이 필요한 경우
    - 데이터 크기가 작은 자료형에서 큰 자료형으로 바뀔 때는 문제가 없지만 큰 자료형에서 작은 자료형으로 바뀔 때는 에러가 생김.
    - 자바에서 사용하는 정수형 기본 자료형이 int이므로 byte, short로만 연산하게 되면 모두 int로 변환하여 연산하고 int로 반환을 하게 됨.
    - 이 때 결과 값을 byte나 short로 처리하기 위해서는 강제로 형변환을 해줘야 함.
- 입·출력 메소드
  - 출력 메소드
    - System.out.println() : 줄 바꿈 출력.
    - System.out.print() : 줄 바꿈 없는 출력.
    - System.out.printf() : C언어와 마찬가지로 정해져있는 형식에 맞춰서 그 형식에 맞는 값(변수)를 줄바꿈 하지 않고 출력.
  - 입력 메소드
    - Scanner Class를 사용하여 입력.
    - Scanner sc = new Scanner(System.in);
      1. 정수형 : sc.nextByte(), sc.nextShort(), sc.nextInt(), sc.nextLong()
      2. 실수형 : sc.nextFloat(), sc.nextDouble()
      3. 문자열 : sc.next(), sc.nextLine()
      4. 문자 : sc.next().charAt(0), sc.nextLine().charAt(0)
- 제작 프로그램
  - Java : testPjt, printInfomationPjt, shoppingPjt, variable, printQue1, printQue2, printScanQue1, printScanQue2, printScanQue3

### 2.3 3일차(2020-01-30)
- 연산자
  - 연산자 종류 및 우선순위
    - 1순위 : (), [], ., ->
    - 2순위 : 증감(++, --), 부호(+, -), 비트반전(~), 논리부정(!), (자료형)
      - 증감 연산자 
        1. 전위 연산과 후위 연산의 차이
        2. Java에서 연산은 앞에 2개만 먼저 계산을 하기에 앞쪽에 증감 연산자가 후위에 있더라도 앞에 2개가 계산이 끝나면 증감 연산자가 계산이 됨.   
        ex) a = 10, b = 10, c = (a++) + (++b) + a이면 c는 32
      - 비트반전
        1. 각 비트에서 0을 1로, 1을 0으로 반전한다.  
        ex) 1011 -> 0100
    - 3순위 : 산술 연산자(*, /, %)
    - 4순위 : 산술 연산자(+, -)
    - 5순위 : 시프트(>>, <<, >>>)
      - 왼쪽 시프트 연산(<<) : 1칸 옮길 때 마다 2배로 늘어남.  
      ex) 1011 << 1 = 10110 => 11 -> 22
      - 오른쪽 시프트 연산(>>) : 1칸 옮길 때 마다 반으로 줄어듬. 가장 오른쪽 비트는 버림.  
      ex) 1010 >> 1 = 0101 => 10 -> 5
    - 6순위 : 관계(>, <, >=, <=, instanceof : 클래스 동일 여부)
    - 7순위 : 관계(==, !=)
    - 8순위 : 비트논리 AND(&)
    - 9순위 : 비트논리 XOR(^)
      - 영어 소문자 <-> 대문자 변환이 편함.  
      ex) a ^ 32 = A, A ^ 32 = a
    - 10순위 : 비트논리 OR(|)
    - 11순위 : 일반논리(&&)
    - 12순위 : 일반논리(||)
    - 13순위 : 삼항((조건문) ? (true문) : (false문)) - if문
      - if문을 단축하여 사용 가능함.  
      ex) result = a<b ? a : b => a가 b보다 작으면 조건문이 true이므로 result에 a가 들어가고, a가 b보다 크면 조건문이 false이므로 result에 들어가게 된다.
    - 14순위 : 대입(=, +=, -=, *=, /=, %=, ^=, |=, <<=, >>=, >>>=) - 연산 속도가 빨라짐
- 제어문
  - 조건문
    - 조건에 따라서 수행되는 코드가 달라지는 구문
    - 조건문의 종류
      1. if
      2. switch
- 제작 프로그램
  - Java : operatorTest, operatorQue1, operatorQue2, ifTest, switchTest, switchQue1

### 2.4 4일차(2020-01-31)
- 제어문
  - 반복문
    - 반복문의 종류
      1. for
          - 가장 보편적인 반복문으로 가독성이 높고, 초기, 조건, 증감문을 한번에 선언해서 사용
      2. while
          - 특정 조건이 만족되는 동안 명령을 계속해서 반복적으로 수행함
          - for문과 다르게 초기식을 미리 작성하고, 증감문도 실행코드 내부에 직접 작성해야 함
      3. do~while
          - while문과 유사하지만 조건문이 뒤에 위치하기 때문에 조건문에 맞지 않더라도 1번은 무조건 실행
    - 무한 루프
      1. for(;;) { 실행문 }
      2. while(true) { 실행문 }
  - 분기문
    - 분기문의 종류
      1. break
          - 반복문을 빠져 나가는 구문
          - 반복문 수행 중 break;구문을 만나는 경우 곧장 반복문을 빠져 나옴
      2. continue
          - 반복문 수행 중 continue;를 만나는 경우 아래를 실행하지 않고 반복문을 다시 실행
          - for문의 경우 증감식으로 이동
- 제작 프로그램
  - Java : loopTest, loopQue1, loopQue2, loopQue3

### 2.5 5일차(2020-02-03)
- 난수
  - 임의의 값, 무작위로 만들어지는 알 수 없는 값
  - Random rand = new Random(); rand.nextInt();로 사용 가능
  - rand.nextInt(10);으로 0~9 범위의 숫자를 랜덤으로 추출 가능
- 제작 프로그램
  - Java : randomPjt, randomQue

### 2.6 6일차(2020-02-04)
- 배열
  - 동일한 자료형을 가지는 변수들의 집합
  - 사용 방법
    - 자료형[] 변수명 => int[] arr;
    - 자료형 변수명[] => int arr[];
  - 배열의 할당
    - 변수명 = new 자료형[저장할 데이터 개수]; => arr = new int[5]; : 정수 5개를 저장할 수 있는 배열
  - 배열의 초기화
    - 배열을 선언 후 할당하게 되면 각 자료형 별 기본값이 들어감.
    - 숫자형 변수는 0, boolean은 false, char는 ' '
    - 선언과 동시에 값을 기록할 수 있음
      1. int[] arr = {1, 2, 3, 4, 5}; : 길이가 5인 정수형 배열을 생성하면서 각 인덱스에 1, 2, 3, 4, 5 순서대로 저장
      2. String[] arr = {"hi", "hello", "bye"}; : 길이가 3인 문자열 배열을 생성하면서 각 인덱스에 "hi", "hello", "bye"를 순서대로 저장
    - 기본형 변수 8개에 대해서는 자동으로 초기화가 가능하지만 참조형 변수는 자동 초기화가 불가능함
  - 배열의 복사
    1. 얕은 복사
        - 객체의 주소 값만 가져와 참조형 변수에 저장하고 하나의 객체를 두 변수가 참조하고 있는 것  
          ex)   
          int arr1[] = new int[4];  
          int arr2[] = arr1;
    2. 깊은 복사
        - 다른 객체를 생성하여 새로운 객체에 데이터 내용을 복사하는 것
        - 복사 방법
          1. for문을 이용한 깊은 복사
          2. System.arraycopy를 이용한 깊은 복사
          3. clone을 이용한 깊은 복사
- 참조형 변수의 주소값 확인
  - hashcode() 메소드 사용
- 제작 프로그램
  - Java : arrayPjt, arrayQue1, arrayQue2, arrayQue3, arrayQue4, arrayQue5

### 2.7 7일차(2020-02-05)
- 이차원 배열
  - 1차원 배열 안에 다른 배열을 넣는 것
  - 배열은 저장된 값마다  인덱스 번호 두개로 설정되고 앞번호는 행, 뒷번호는 열
  - 선언 방법
    - 자료형[][] 변수명 => int[][] arr;
    - 자료형 변수명[][] => int arr[][];
  - 배열의 할당
    - 변수명 = new 자료형[행의 크기][열의 크기]; => arr = new int[5][6]; : 5X6의 2차원 배열 할당
  - 사용법  
    int arr[][] = new int[5][4];  
    arr.length; => 행의 크기 : 5  
    arr[i].length; => 열의 크기 : 4  
- 제작 프로그램
  - Java : arrayQue6, kakaoQue

### 2.8 8일차(2020-02-06)
- 메소드
  - 수학의 함수와 비슷하며 호출을 통해 사용
  - 타언어에서 함수와 동일한 기능
  - 메소드 호출 시 전달 값이 있거나 없을 수 있으며, 호출하게 되면 내부에 작성된 연산을 수행하게 되며, 연산 후 결과값은 있거나 없을 수 있다.
  - 메소드의 형태  
    [접근제어 지시자] 반환형 메소드명 (매개변수) {  
    　　실행코드;  
    }  
    ex) public void exam() {}
  - 접근제어 지시자  
  
  |구분|해당 클래스 내부|같은 패키지|후손 클래스|전체(프로젝트 단위)|
  | :-----: | :-----: | :-----: | :-----: | :-----: |
  |public|O|O|O|O|
  |protected|O|O|O|X|
  |default|O|O|X|X|
  |private|O|X|X|X|

  - 반환형
    1. void : 반환 값이 없을 경우
    2. 기본자료형 : 반환 값이 8가지 기본 자료형일 경우
    3. 참조자료형 : 반환 값이 참조형 자료형일 경우(String, 사용자 정의)
    4. 배열 : 기본형 배열, 참조형 배열 모두 가능
  - 메소드의 매개변수
    1. () : 매개변수가 없는 것을 의미함
    2. 기본자료형 : 기본형 매개변수 사용 시 값을 복사하여 전달. 메소드에서 해당 값을 변경해도 원래 값은 변경 X => call by value
    3. 참조자료형, 배열 : 참조자료형, 배열을 매개변수로 전달 시에는 데이터의 주소값이 전달. 메소드에서 해당 값을 변경하면 원래 값도 같이 변경 => call by reference
  - 메소드의 오버로딩
    1. 매개변수의 갯수가 다른 메소드는 동일한 이름으로 선언 가능.
    2. 서로 다른 타입의 매개변수로 가진 메소드는 동일한 이름으로 선언 가능.
    3. 매개변수가 동일한 타입이라면 리턴 타입이 다르더라도 동일한 이름으로 선언 불가능.
- 객체지향 프로그래밍
  - 객체지향 언어
    - 현실 세계는 사물이나 개념처럼 독립되고 구분되는 각각의 객체로 이루어져 있으며, 발생하는 모든 사건들은 객체 간의 상호 작용으로 이루어지며, 이 개념을 컴퓨터로 옮겨 놓아 만들어낸 것
- 객체
  - 사전적 의미 : 실체하는 모든 사물
  - 객체지향 언어에서 객체의 개념은 new 연산자를 통해 클래스의 설계대로 데이터를 메모리에 할당한 결과물(instance)
  - 클래스
    - 객체를 정의해 놓은 것. 객체의 설계도, 틀
    - 사물이나 개념의 공통 요소(속성-변수-, 기능-메소드-)를 용도에 맞게 추상화
  - 추상화
    - 사전적 의미 : 구체적 사물들의 공통된 특징
    - 프로그램에서 필요한 기능/속성을 추출하고, 불필요한 것을 제거하는 과정
- 변수의 종류
  1. 지역변수
      - 해당 지역(메소드)에서만 사용 가능한 변수
  2. 전역변수(멤버변수, 인스턴스변수)
      - 해당 클래스 내부에서만 사용이 가능한 변수
      - 객체 생성 시 해당 객체에서만 사용이 가능
      - 값이 자동으로 초기화 됨
  3. 정적변수(클래스 변수)
      - 클래스와 관계없이 사용 가능한 변수
      - static 키워드를 이용해서 선언
- 제작 프로그램
  - Java : methodPjt, OOP, animalAdoption

### 2.9 9일차(2020-02-07)
- 객체지향 3대 원칙
  1. 캡슐화
  2. 상속
  3. 다형성
- 캡슐화
  - 추상화를 통해 정의된 데이터들과 기능을 하나로 묶어 관리하는 기법
  - 클래스의 가장 중요한 목적인 데이터의 접근제한을 원칙으로 하여, 클래스 외부에서 데이터의 직접 접근을 막고, 대신 데이터를 처리하는 함수(메소드)들을 클래스 내부에 작성하여 데이터에 접근하는 방식(getter, setter)
- 생성자
  - 클래스 작성 시 생성자를 작성하지 않는 경우 JVM이 기본 생성자를 자동으로 생성
  - 매개변수가 있는 생성자를 작성하는 경우 JVM이 기본 생성자를 자동으로 생성하지 않음
  - 메소드 오버로딩을 이용하여 여러 개의 생성자 사용 가능
  - 일반적으로 기본생성자, 모든 멤버 변수를 초기화 하는 매개변수가 있는 생성자를 작성하고, 필요에 따라서 추가로 생성자를 작성.
- 소멸자
  - 생성자와 반대로 객체가 소멸할 때 자동으로 호출되는 메소드
  - 타언어에 존재하지만 자바는 언어 특성상 소멸자가 존재하지 않음
- 객체의 할당
  - new 생성자();를 사용하여 객체를 생성하면 heap 메모리 공간에 서로 다른 자료형의 데이터가 연속으로 나열 할당된 객체공간이 만들어지는데 이를 인스턴스라고 한다.
- 클래스 분류
  - 종류
    1. 데이터가 되는 클래스  
      ex) Entity, VO, DTO, Ean Class
    2. 데이터를 운영하는 클래스
      ex) Control Class
- 데이터의 CRUD
  - Create
  - Read
  - Update
  - Delete
  - 데이터의 생성, 읽기, 갱신, 삭제
- 제작 프로그램
  - Java : studnetMgr1, OOP(추가), studnetMgr2

### 2.10 10일차(2020-02-10)
- 상속
  - 다른 클래스가 가지고 있는 멤버(변수와 메소드)들을 새로 작성할 클래스에서 직접 만들지 않고, 상속받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있는 기능
  - 상속의 목적
    - 클래스의 재사용
    - 연관된 일련 클래스들에 대해 공통적인 규약을 정의
  - 상속의 장점
    - 보다 적은 양의 코드로 새로은 클래스를 작성 가능
    - 코드를 공통적으로 관리하기 때문에 코드의 추가 및 변경 용이
    - 코드 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여
  - 상속 방법
    - 클래스간 상속식 extends 키워드 사용
    - [접근제어지시지] class 클래스명B extends 클래스명A {}
  - 단일상속(Single inheritance)
    - 클래스 작성시 한 개 의 클래스만 상속하는 것
    - 명확하고 신뢰성 있는 코드 작성가능
    - 자바에서는 단일상속만 가능(다중상속 지원X)
  - 다중상속(Multiple inheritance)
    - 클래스 작성 시 여러 클래스로부터 상속을 받는것
    - 복합적인 기능을 가진 클래스를 쉽게 작성 가능
    - 서로 다른 클래스로 상속받는 멤버간의 이름이 같을 경우 문제가 생김
  - 상속의 특징
      1. 부모 클래스의 생성자는 상속 안됨  
        - 자식클래스 객체 생성 시, 부모클래스 생성자가 먼저 실행(자동)  
        - 자식클래스 생성자 안에서 부모클래스 생성자 호출을 명시하기 위해서는 super() 활용  
      2. 부모의 private 멤버는 상속은 되지만 직접 접근 불가  
        - 접근제어지시자 private는 해당 클래스에서만 접근이 가능하므로, 자식클래스에서도 변수에 접근이 불가능  
        - private변수의 초기화는 super()를 이용하여 부모생성자를 통해진행  
        - getter, setter 메소드를 이용하여서 접근 가능  
      3. 모든 클래스는 Object클래스의 후손  
        - 클래스 작성 시 아무 클래스도 상속하지 않으면 자동으로 Object클래스를 상속함  
        - 다른 클래스를 상속했더라도 이미 부모클래스가 Object클래스를 상속했기 때문에 모든 클래스는 Object클래스의 후손  
  - super()
    - 부모 객체의 생성자를 호출하는 메소드
    - 자식 객체의 생성자에는 자동으로 부모객체 생성자를 호출하는 코드가 포함되어 있으며, 이를 명시적으로 표현할 때 사용
    - 자식 객체의 생성자보다 먼저 실행되야 하기 때문에 자식객체 생성자의 가장 첫 줄에만 사용이 가능
    - 매개변수가 있는 부모생성자를 호출하는 경우 super(매개변수)를 이용 
  - 오버라이딩(overriding)
    - 자식 클래스가 상속받은 부모 메소드를 재작성하는 것
    - 부모가 제공하는 기능을 후손이 일부 고쳐서 사용하겠다는 의미
    - 자식 객체를 통해 실행 시 후손의 것이 우선권을 가짐(동적 바인딩)
  - Annotation
    - 자바 컴파일러에게 알리는 주석문
    - @Override -> 컴파일러에게 미리 이 메소드는 오버라이딩하는 것을 알려줌.
    - @Override를 붙이면 메소드를 잘못 입력하면 상위 클래스에 해당 메소드가 없다면 에러를 출력해줌.
  - 오버라이딩 성립 조건
    1. 메소드의 이름이 동일해야 한다.
    2. 매개변수의 개수와 타입이 동일해야 한다.
    3. 리턴 타입이 동일해야 한다.
    4. private 메소드의 오버라이딩이 불가능하다.
    5. 접근제어 지시자는 수정이 가능하지만 부모의 것보다 같거나 넓은 범위로 가능하다.
- 제작 프로그램
  - Java : pointManager1, pointManager2, pointManager3

### 2.11 11일차(2020-02-11)
- 다형성(polymorphism)
  - 여러 개의 형태를 갖는다는 의미로, 객체지향 프로그래밍 3대 특징 중 하나
  - 상속을 이용한 기술로, 자식객체를 부모클래스 타입의 변수로 다룰 수 있는 기술  
    ex) TV 클래스를 상속한 LGTV와 SamsungTV가 있는 경우 TV tv = new LGTV()와 같이 부모 클래스로 다룰 수 있음.
  - 클래스 형변환 - up casting
    - 부모 타입의 참조형 변수로 자식타입의 객체 주소를 받은 경우 해당 객체는 원래 부모타입의 멤버(변수, 메소드)만 참조가 가능  
      ex) TV tv = new LGTV();  
      - 이 경우 LGTV에 추가적인 메소드와 변수가 있더라도 tv 참조형 변수는 TV 타입의 변수이기때문에 LGTV에 추가로 작성된 메소드와 변수는 사용할 수 없고 TV객체에 있는 변수와 메소드만 사용이 가능함
  - 클래스 형변환 - down casting
    - 자식객체의 주소를 받은 부모 참조형 변수를 가지고 자식객체에만 존재하는 멤버를 참조해야 하는 경우, 자식클래스 타입으로 참조형 변수를 형변환 해야함.
    - 이러한 형변환을 down casting이라고 하며, 자동으로 처리되지 않기 때문에 명시적으로 형변환해야 함  
      ex) TV tv = new LGTV();  ((LGTV)tv).lgFunc();
- 추상 클래스
  - 몸체가 없는 메소드(추상 메소드)를 포함한 클래스 -> 메소드는 존재하지만 작동을 하지 않음.
  - 추상 클래스일 경우 선언부에 abstract 키워드를 사용
  - 추상 메소드
    - 몸체({})가 없는 메소드
    - 메소드의 선언부만 있고 실행코드가 없는 메소드
    - 추상클래스를 상속한 경우 반드시 구현해야하는 메소드(오버라이딩 강제화)
  - 추상 클래스는 객체의 생성이 불가능.
  - 추상 클래스의 특징
    1. 미완성 클래스(abstract 키워드 사용)로 자체적으로 객체 생성 불가 -> 반드시 상속하여 객체를 생성
    2. abstract 메소드가 포함된 클래스 -> 반드시 abstract 클래스. 단, abstract 메소드가 없어도 abstract 클래스 선언이 가능(객체 생성 방지용)
    3. abstract 메소드 외에 일반 메소드와 변수를 포함할 수 있음
    4. 객체 생성은 안되나 참조형 변수 type으로는 사용 가능(다형성으로는 가능)
- 인터페이스
  - 상수와 abstract 메소드만으로 이루어진 추상클래스의 변형체
  - 메소드의 통일성을 부여하기 위해서 abstract 메소드만 따로 모아놓은 것으로, 상속시 인터페이스에 정의된 모든 메소드를 구현해야 함  
    ex) [접근제어 지시자] interface 인터페이스명{}
  - 추상 클래스와 다르게 모든 메소드가 abstract 메소드이므로 abstract 생략 가능
  - 인터페이스의 특징
    - 인터페이스의 모든 메소드는 묵시적으로 public이고 abstract이다.
    - 변수는 public static final이다.
    - 객체 생성은 안되나, 참조형 변수로는 가능하다.(다형성으로는 가능)
  - 인터페이스의 장점
    - 상위타입의 역할로 다형성을 지원하여 연결해주는 역할 수행
    - 해당 객체가 다양한 기능을 제공시에도 인터페이스에만 해당하는 기능만을 사용하도록 제한 가능
    - 공통 기능상의 일관성 제공/공동 작업을 위한 가이드라인 제공
    
  | 구분 | 인터페이스 | 추상 클래스 |
  | :-----: | :-----: | :-----: |
  | 상속 | 다중상속 | 단일상속 |
  | 구현 | implements 사용 | extends 사용 |
  | 추상 메소드 | 모든 메소드 | 추상 메소드 0개 이상 |
  | abstract | 묵시적으로 abstract | 명시적으로 사용 |
  | 객체 | 객체 생성불가 | 객체 생성불가 |

- 제작 프로그램
  - Java : poly, pointManager4, abstractAndInterface, convenience

### 2.12 12일차(2020-02-12)
- Object
  - 자바에서 상속은 필수
  - 아무것도 상속하지 않더라도 암묵적으로 Object 클래스를 상속
  - 결국 모든 클래스는 Object 클래스의 후손 클래스
  - 아무 내용 없이 클래스를 만든 후 객체를 생성해보면, 작성한 적 없는 메소드들이 있는 것이 확인 가능
  - 작성한 적 없는 메소드들은 모두 Object 클래스의 메소드로 기본상속
  - 클래스가 공통적으로 포함하고 있어야 하는 기능을 포함
  - 주요 메소드
    - toString()  
      ex) kh.java.test.Test1@7852e922  
        1. kh.java.test. : 패키지 이름
        2. Test1 : 클래스명
        3. 7852e922 : 인스턴스 식별 값
    - clone()
      - 객체 자체를 복사하여 다른 객체에 사용할 때 사용하는 메소드
      - clone() 메소드의 접근제어 지시자는 protected이므로 다른 패키지에서는 사용 불가
      - 작성한 클래스에서 clone() 메소드를 사용하기 위해서는 overriding이 필요함
		  - 기존의 clone() 메소드는 protected이기 때문에 바로 사용 불가, 생성한 클래스에서 clone() 메소드의 Override가 필요함.
		  - 리턴 타입이 Object인 clone() 메소드는 Override한 클래스가 자식 클래스이기에 부모 클래스인 Object를 받을 수 없기에 명시적 형변환이 필요함.(down-casting)  
        ex) Test t2 = (Test)t1.clone();
      - Cloneable 인터페이스의 구현이 필요
    - equeals()
      - 두 객체 사이의 내부 값을 비교할 때 사용
- API(Application Programming Interface)
  - 프로그래밍을 할 때 어떠한 특정 기능을 처리할 수 있도록 만들어 놓은 클래스나 메소드의 집합
  - JAVA API
    - 자바 언어를 사용하여 기능 구현을 할 수 있도록 미리 여러가지 기능을 정의해 놓은 API
- String 관련 API
  - String 클래스
    - 문자열 값을 수정 못하는 immutable(불변) 성질을 가짐
    - 수정시 수정된 문자열이 새로 할당되어 새 주소를 저장
    - 문자열을 자주 수정하는 경우 메모리 낭비가 심함
  - StringBuffer 클래스
    - 문자열 값을 수정할 수 있는 mutable(가변) 성질을 가짐
    - 수정시 수정된 기존 문자열이 수정
    - 문자열을 자주 수정하는 경우 String보다 유용
    - Thread Safe 기능 제공(성능저하 요인) : 작업이 진행중인 경우 다른 작업이 들어오면 그 접근을 막아줌
    - 메소드
      - stringBuffer.append(문자열) => 문자열을 버퍼의 끝에 추가
      - stringBuffer.insert(정수, 문자열) => 정수 자리에 문자열 삽입
      - stringBuffer.replace(정수1, 정수2, 문자열) => 정수1부터 정수2 앞까지 문자열로 대체
      - stringBuffer.reverse() => 버퍼를 거꾸로
      - stringBuffer.delete(정수1, 정수2) => 정수1부터 정수2 앞까지 삭제
      - stringBuffer.capacity() => 실제 크기를 출력
  - StringBuilder 클래스
    - StringBuffer 클래스와 동일하지만, Thread Safe 기능이 제공되지 않음
  - StringTokenizer 클래스
    - 문자열을 분석하여 토큰으로 분리시켜주는 기능의 클래스
    - 메소드
      - stringTokenizer(문자열1, 문자열2) : 문자열1을 문자열2를 기준으로 자르는 생성자
      - stirngTokenizer.countTokens() : 남아 있는 토큰의 개수를 출력
      - stringTokenizer.nextToken() : 토큰을 가져옴. countTokens를 호출하면 1이 감소 됨
      - stringTokenizer.hasMoreTokens() : 남아있는 토큰이 있는지 확인(true/false)
- Math 클래스
  - Math 클래스의 메소드는 객체를 선언하지 않고 바로 Math 클래스에서 호출 가능.
  - 메소드
    - Math.abs(num) : 절대값 출력
    - Math.ceil(num) : 소수점 아래 올림
    - Math.floor(num) : 소수점 아래 내림
    - Math.round(num) : 소수점 아래 반올림
    - Math.random() : 0.0 ~ 1.0 범위의 임의의 값 추출
    - Math.max(num1, num2) : 두 수를 비교 후 큰 값 리턴
    - Math.min(num1, num2) : 두 수를 비교 후 작은 값 리턴
    - Math.pow(num1, num2) : num1의 값을 num2번 거듭 제곱
- 시간관련 클래스
  - Calendar 클래스
    - 현재 시간과 관련 있는 클래스
    - Calendar 클래스는 추상클래스로, 생성자의 접근제어 지시자가 protected로 new 생성자()를 통해 객체를 생성할 수 없고, getInstance() 메소드를 이용하여 객체를 생성
    - Calendar.getInstance() 메소드는 GregorianCalendar 객체 생성
    - Calendar 클래스의 출력들은 모두 객체가 만들어지는 시간을 기준으로 만들어진다. 시간이 지난 후 출력을 하면 모두 객체를 만들었던 시간이 출력 된다.
    - 메소드
      - calendar.get(Calendar.YEAR) : 연도 출력
      - calendar.get(Calendar.MONTH) : 월 출력(0월부터 출력한다)
      - calendar.get(Calendar.DATE) : 일 출력
      - calendar.get(Calendar.AM_PM) : 오전 오후 출력(오전 : 0, 오후 : 1)
      - calendar.get(Calendar.HOUR) : 시 출력
      - calendar.get(Calendar.MINUTE) : 분 출력
      - calendar.get(Calendar.SECOND) : 초 출력
      - calendar.get(Calendar.DAY_OF_WEEK) : 일주일의 몇번째 요일인지 출력(1 : 일요일, 7 : 토요일)
      - calendar.set(Calendar.YEAR, 2050) : set 메소드를 통해 날짜를 편집하여 사용 가능
      - calendar.getTimeInMillis() : 현재 시간, 기준점 : 1970년 1월 1일 9시 0분 00초부터 지금까지 지난 시간을 ms단위로 계산
- 제작 프로그램 
  - Java : ObjectTest, APIPjt

### 2.13 13일차(2020-02-13)
- Date 클래스
  - Java.util의 Date 클래스
  - 시스템으로부터 현재 날짜, 시간정보를 가져와서 다룰 수 있게 만들어진 클래스로, 생성자 2개만 사용 가능하고 나머지는 deprecated(삭제 예정)
  - Calendar 또는 GregorianCalendar 클래스 사용을 권장
  - 생성자
    - new Date() : 현재 시간을 기준으로 날짜를 나타내는 생성자
    - new Date(long num) : num을 기준으로 날짜를 나타내는 생성자
- SimpleDateFormat 클래스
  - 보기 힘든 Date 클래스를 쉽게 보기 위해 원하는 format으로 출력 방법을 바꿔주는 클래스
  - 생성자
    - new SimpleDateFormat(String str) : str로 데이터 형식을 바꿔주게 하는 생성자
  - 메소드
    - simple.format(Date date) : date 클래스의 시간을 생성자에서 선언한 방식으로 문자열을 리턴함
- Wrapper Class
  - 기본 자료형을 객체화 해주는 클래스
  - 기본 자료형 데이터를 포장하여 표현하기 때문에 Wrapper라고 부름
  - 객체지향 프로그래밍의 경우 기본 자료형을 객체로 처리해야 하는 상황이 존재하는데 그러한 상황에서 사용하는 클래스  
  
  | 기본 자료형 | Wrapper Class | Wrapper Class로 기본자료형 변환 |  
  | :-----: | :-----: | :-----: |  
  | boolean | Boolean | Boolean wb = new Boolean(true) |  
  | char | Character | Character wc = new Character('A') |  
  | byte | Byte | Byte wb = new Byte((byte)1) |  
  | short | Short | Short ws = new Short((short)2) |  
  | int | Integer | Integer wi = new Integer(4) |  
  | long | Long | Long wl = new Long(8) |  
  | float | Float | Float wf = new Float(0.5f) |  
  | double | Double | Double wd = new Double(0.77) |  
  
  - Integer 클래스
    - 기본 자료형인 int에 매칭되는 클래스
    - 메소드
      - Integer.parsInt(str) : 문자열을 숫자로 변환해 줘서 리턴함
  - Boxing : Wrapper 클래스에 기본 자료형을 넣는 것  
    ex)  
    Integer num = new Integer(10);  
    Double dd = new Double(3.14);  
  - UnBoxing : Wrapper 클래스에 있는 기본 자료형을 꺼내는 것  
    ex)  
    int n = num.intValue();  
    double d = dd.doubleValue();    
  - Auto Boxing : Boxing을 생성자를 이용하지 않고 바로 사용 가능  
    ex)  
    Integer num = 10;  
    Double dd = 3.14;
  - Auto UnBoxing : UnBoxing을 value 메소드를 사용하지 않고 바로 가져오는 것  
    ex)  
    int n = num;  
    double d = dd;
  - Wrapper Class를 이용한 문자열 처리
    - Wrapper 클래스를 이용하면 문자열 -> 기본 자료형, 기본 자료형 -> 문자열의 변환이 쉬움  
      1. Wrapper.parseInt(str), parseDouble(str) 등 : 문자열을 각 타입의 기본 자료형으로 변환, char 제외(charAt 메소드 사용)
      2. Wrapper.valueOf(num).toString : 각 기본 자료형을 문자열로 변환
      3. String.valueOf(num) : String 클래스의 valueOf 메소드로 사용하여 기본 자료형을 문자열로 변환
- 제네릭(Generics)
  - JDK 1.5부터 제공되는 기능으로, 클래스 내부에서 사용할 데이터 타입을 객체 생성 시 지정하는 기법
  - Generics Type
    - 클래스의 객체 생성시 "<>"안에 내부에서 사용할 클래스명을 기입 -> 기본 자료형을 사용할 수 없음
    - 클래스명<타입> 레퍼런스 = new 생성자<타입>();  
  - 제네릭 제한
    - 제네릭은 해당 클래스의 객체가 만들어질 때 내부에서 데이터 타입 지정
    - 이 경우 의도치 않은 데이터 타입이 들어올 수 있음
    - 제네릭 사용시의 데이터 타입을 제한할 수 있음
- Collection
  - 메모리상에서 자료를 구조적으로 처리하는 방법을 자료구조라 함
  - Collection은 자바에서 제공하는 자료구조를 담당하는 Framework
  - 추가, 삭제, 정렬 등의 기능 처리가 간단하게 해결되어 자료구조적 알고리즘을 사용자가 별도로 구현할 필요가 없음
  - 배열의 문제점
    1. 한번 크기를 지정하면 변경할 수 없다.
    2. 배열에 기록된 데이터에 대한 중간 위치의 추가, 삭제가 불편하다.
    3. 한 타입의 데이터만 저장이 가능하다.
  - Collection의 장점
    1. 저장하는 크기의 제약이 없다.
    2. 추가, 삭제, 정렬등의 기능처리가 간단하게 해결된다
    3. 여러 타입을 저장할 수 있다.
  - Collections.sort(List list) 메소드를 사용해 list의 오름차순 정렬
  - Collections.reverse(List list) 메소드를 사용해 list를 반대로 저장
- List
  - 자료들을 순차적으로 나열한 자료구조
  - 인덱스로 관리되며, 중복해서 객체 저장이 가능
  - 배열과 가장 유사한 형태를 띄고 있다.
  - 구현클래스 ArrayList, Vector, LinkedList가 존재
  - 메소드
    - add(T t) 메소드를 사용해 삽입
    - add(int index, T t) 메소드를 사용해 원하는 인덱스에 삽입
    - get(int num) 메소드를 사용해 num번째를 출력
    - size() 메소드를 사용해 인덱스 값 출력
    - remove(int num) 메소드를 사용해 삭제
    - set(int index, T t) 메소드를 사용해 원하는 인덱스의 내용을 수정
    - clear() 메소드를 사용해 ArrayList 내용 전체 삭제  
    - isEmpty() 메소드를 사용해 현재 리스트가 비어있는지 파악 가능
    - for (T t : list) {  
      　　control문  
      } : for-each문을 이용해 코드를 단축해 for문 내에서 get 메소드를 호출할 필요 없이 알아서 원하는 객체를 순회가 가능하다
    - list.forEach(t -> {  
      　　control문  
      }); : ArrayList가 가지고 있는 forEach() 메소드를 이용해 람다식으로 객체의 순회가 가능하다
    - Iterator iter = list.iterator();  
      while(iter.hasNext()) {  
      　　control문  
      　　iter.next();  
      } : Iterator를 이용한 반복문 순회가 가능하다
- 제작 프로그램  
  - Java : APIQue, wrapperClass, generics, collection

### 2.14 14일차(2020-02-14)
- Set
  - 저장 순서가 유지되지 않고, 중복 객체도 저장하지 못하는 자료구조
  - 수학으로 비유하자면 집합
  - null도 중복을 허용하지 않기 때문에 1개의 null만 저장이 가능
  - 구현클래스 HashSet, TreeSet, LinkedSet이 존재
  - 메소드
    - add(T t) 메소드를 이용해 삽입. 리턴 값은 boolean으로, 삽입에 성공하면 true, 실패하면 false가 리턴된다.
    - size() 메소드를 사용해 Set의 크기를 출력.
    - Iterator를 사용하여 데이터를 순회하여 읽는다.(데이터 소멸 X, 데이터 복사 O)
    - for-each를 사용하여 데이터를 순회하여 읽는다.
    - ArrayList<> al = new ArrayList<>(Set data)를 사용하여 ArrayList로 만든 다음 순회하여 출력 가능하다.
- Map
  - 키(key)와 값(value)으로 구성되어 있으며 키와 값 모두 객체 타입
  - 키는 중복 저장 불가(Set의 특성)
  - 값은 중복 저장 가능(List의 특성)
  - 중복된 키가 들어오는 경우 기존의 키에 해당하는 값에 덮어 쓴다.
  - 구현 클래스는 HashMap, HashTable, LinkedHashMap, Properties, TreMap이 존재
  - 키를 중복해서 넣으면 덮어쓰기가 되므로 이전 데이터가 사라짐.
  - 메소드
    - put(Key k, Value v) 메소드를 이용해 삽입한다.
    - get(Key k) 메소드를 사용해 key에 해당하는 value를 출력하며 key가 없다면 null 리턴.
    - map을 메소드 없이 출력(toString)하면 key=value 쌍으로 전체 테이블이 출력된다.
    - remove(Key k) 메소드를 사용해 key에 해당하는 value가 함께 삭제 된다.
    - containsKey(Key k) 메소드를 사용해 해당 key가 있는지 출력한다.
    - keySet() 메소드를 사용해 key값을 뽑아내 Set으로 출력한다.
- 제작 프로그램
  - Java : pointManager5, kakaoQueLRU
  
### 2.15 15일차(2020-02-17)
- MVC 패턴
  - Model : 데이터가 될 클래스
  - View : 사용자 화면
  - Controller : 사용자가 요청을 받고, 처리 후 다시 사용자에게 화면 전달
- 제작 프로그램
  - Java : ieiQue1, studentMgr, pointManager6

### 2.16 16일차(2020-02-18)
- Exception(예외)
  - 프로그래밍 에러의 종류
    - 컴파일 에러(compile-time error) : 소스상의 문법 에러
    - 런타임 에러(runtime error) : 입력값이 틀렸거나 배열의 인덱스 범위를 벗어났거나, 계산식의 오류 등으로 인해 발생하는 에러
    - 논리 에러(logical error) : 문법상 문제가 없고, 런타임 에러도 발생하지 않지만, 개발자의 의도대로 작동하지 않는 경우
    - 시스템 에러(system error) : 컴퓨터의 오작동으로 인한 에러 -> 소스코드로 해결이 불가능
  - 예외라는 뜻을 가지고 있으며, 예외는 예기치 못한 상황
  - 프로그래밍을 하다 보면 수 많은 오류상황을 직면
  - 자바에서 예외(Exception)란 프록그램을 만든 가발자가 예상한 정상적인 처리에서 벗어나는 경우에 이를 처리하기 위한 방법
  - 예측 가능한 에러를 처리하는 것
  - 모든 예외는 Exception 클래스의 하위 클래스
  - 예외 처리의 목적
    - 프로그램의 비정상적인 종료를 막고, 정상적인 실행상태를 유지하기 위함
    - 어떻게 -> 예외 상황이 발생된 경우 어떻게 처리할지에 대한 로직을 구현
  - Exception 처리 구문
    - try ~ catch 구문  
      try {  
      　　에러가 발생할 가능성이 있는 소스 코드 작성  
      } catch(Exception e) {  
      　　try 블록의 소스코드를 실행하다 에러가 발생하면 즉시 중단하고 catch 구문이 실행  
      } finally {  
      　　정상 실행이 되던지, 예외가 발생하던지 무조건 실행해야 하는 코드  
      }  
      ※ 일반적으로 코드에서 사용한 자원을 반납하는 코드를 finally에 작성
  - 예외의 종류
    - Checked Exception : 컴파일 에러에 속하며 예외 처리를 강제화 해야 하며, 처리하지 않는 경우 Eclipse로 컴파일 시 에러가 발생
    - Unchecked Exception : 개발자가 소스 코드에서 처리하지 않아도 컴파일에 아무 문제가 없음
  - RuntimeException 클래스
    - RuntimeException은 Unchecked Exception임
    - 주로 개발자의 부주의로 생기는 오류
    - Exception의 예
      1. ArithmeticException : 숫자를 0으로 나눌 때 생기는 오류
      2. ArrayIndexOutOfBoundsException : 배열 크기 오류(5개의 크기로 선언된 배열 num이 num[-1]이나 num[5]와 같이 범위를 넘어선 경우)
      3. NullPointerException : Null인 레퍼런스의 변수나 메소드 참조 시도시 발생
      4. NegativeArraySizeException : 배열의 크기를 음수 또는 0으로 지정하는 경우 발생
      5. ClasscastException : cast 연산자 사용시 타입 오류일 때 발생(up-casting, down-casting)
      6. InputMismatchException : 정수를 입력해야 하는데 문자가 입력된 경우
  - 예외의 처리
    1. try~catch문을 사용하여 발생한 곳에서 직접 처리
    2. throws를 사용하여 예외를 던질 수 있음
        - 예외가 발생한 곳에서 직접 처리하는 것이 아니라 해당 메소드를 호출한 곳에 예외를 떠넘김
  - 사용자 정의 예외
    - 표준 예외 클래스로 많은 예외상황을 표현할 수 있으나 그렇지 않은 경우도 발생 가능하며 그 경구 사용자 정의 예외를 만들어서 사용이 가능
    - Checked Exception은 Exception 클래스를 상속하여 작성
    - Unchecked Exception은 RuntimeException 클래스를 상속하여 작성
  - try with resource
    - Java SE 7부터 추가된 기능  
    try (FileInputStream fis = new FileInputStream("test.txt")) {
    　　코드  
    } catch (Exception) {  
    　　Exception 처리     
    }
    - file.close와 같이 기존의 try~catch문에서는 자료의 반환이 필요한데 try with resource를 사용하면 자료의 반환이 필요 없이 자동으로 처리를 해준다.
- 입출력(IO)
  - Input과 Output의 약자로, 컴퓨터 내부 또는 외부 장치와 프로그램 간의 데이터를 주고 받는 것
    - 입출력은 프로그램을 기준으로 한다.
    - 프로그램을 기준으로 데이터가 들어오면 Input, 데이터가 나가면 Output이다.
  - 스트림(stream)
    - 데이터를 입출력하기 위한 통로
    - 외부 자원과 입출력을 하기 위해서는 시스템으로부터 스트림을 얻어와 사용하고 난 다음 반드시 시스템에 반환
    - java.io 패키지의 클래스들로 지원함
    - 스트림은 단방향임 -> 입력과 출력이 동시에 일어나야 하는 경우 입력용 스트림과 출력용 스트림 2개가 필요함
  - 입출력 절차
    1. 외부 자원과 스트림 연결
      - 외부 자원과의 데이터 이동 통로를 생성
      - 스트림 클래스에 대한 객체를 생성
    2. 데이터를 읽고 쓰기
      - 레퍼런스.읽기 메소드(); 또는 레퍼런스.쓰기 메소드(); 호출
    3. 데이터를 읽고 쓰기가 끝나면 OS에 스트림 반납
  - 스트림의 분류
    1. 전송 방향에 따른 분류
        - 입력 스트림 : 디바이스로부터 데이터를 읽어오는 스트림 -> InputStream, Reader
        - 출력 스트림 : 디바이스로 데이터를 출력하는 스트림 -> OutputStream, Writer
    2. 전송 단위에 따른 분류
        - 바이트 스트림 : 1byte 단위로 입력/출력하는 스트림 -> InputStream, OutputStream
        - 문자 스트림 : 한문자(2byte) 단위로 입력/출력하는 스트림 -> Reader, Writer
    3. 보조 스트림
        - 스트림의 기능을 향상시키거나 새로운 기능을 추가 시킴
        - 보조 스트림만 단독적으로 사용할 수 없음
  - 바이트 스트림
    - 바이트 단위로 데이터를 전송
    - 바이트 단위로 구성된 파일(동영상, 이미지, 음악 등)을 전송할 때 사용
    - FileOutputStream
      - 사용법 : FileOutputStream fos = new FileOutputStream(String filename)
      - write(byte[] bytes) 메소드를 사용하여 데이터를 전송하며, 데이터를 전송할 때 byte가 매개변수로 입력되므로 문자열을 getBytes() 메소드를 사용해 byte 배열로 만들어 전송한다.
      - \r\n : 윈도우에서 개행을 하기 위해서는 해당 문자열을 입력해야 함(str = sc.readLine() + "\r\n")
    - DataOutputStream
      - 보조 스트림으로 홀로 사용은 불가능하다.
      - 사용법 : DataOutputStream dos = new DataOutputStream(new FileOutputStream(String filename))
      - 사용법 : DataOutputStream dos = new DataOutputStream(OutputStream os)
      - 데이터를 전송할 때 개행 처리가 필요 없고, write() 메소드가 아닌 writeChars(String str)를 사용하여 byte 배열로 변환이 필요 없다.
      - writeUTF(Sring str) 메소드를 사용하면 byte 배열로 변환이 필요 없이 한글의 깨짐을 방지한 채 데이터를 보낼 수 있다.
    - DataInputStream
      - 사용법 : DataInputStream dis = new DataInputStream(InputStream is)
      - readUTF(String str) 메소드를 사용하여 byte 배열로 변환이 필요 없이 한글의 깨짐을 방지한 채 데이터를 보낼 수 있다.
    - ObjectOutputStream
      - 객체를 출력하기 위한 보조 스트림
      - 사용법 : ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(String filename))
      - writeObejct(Object ojt) 메소드를 통해 객체를 파일로 출력할 수 있다.
      - 17일차에 배우는 직렬화와 함께 사용한다
    - ObjectInputStream
      - 외부로 출력한 객체를 읽어오기 위한 보조 스트림
      - 사용법 : ObjectInputStream ois = new ObjectInputStream(new FileInputStream(String filename))
      - readObject() 메소드를 통해 객체를 읽어올 수 있으며 리턴하는 타입이 Object 클래스이므로 down-casting이 필요하다.  
        ex) User user = (User)ois.readObject();
      - 17일차에 배우는 직렬화와 함께 사용한다
  - 문자 스트림
    - FileWriter
      - 사용법 : FileWriter fw = new FileWriter(String filename)
      - FileOutputStream과 동일하게 사용 가능하다. 단, FileWrite는 문자 스트림이므로 byte 배열로의 변환이 필요 없다.
    - BufferedWriter
      - 사용법 : BufferedWriter bw = new BufferedWriter(new FileWriter(String filename))
      - FileWriter와 마찬가지로 write 메소드를 사용해 출력을 한다.
      - bw.newLine() 메소드를 통해 개행이 가능하다.
    - BufferedReader
      - 사용법 : BufferedReader br = new BufferedReader(new FileReader(String filename))
      - readLine() 메소드를 사용해 파일에서 1줄씩 읽어온다.
      - readLine()을 할 때 더 이상 읽어올 문자열이 없으면 null을 리턴한다.
- File Class
  - 사용법 : File file = new File(String filename)
  - 메소드
    - file.exists() : 해당 파일의 존재 여부 확인
    - file.getName() : 파일의 이름 확인
    - file.length() : 파일의 크기 확인(byte)
    - file.getPath() : 파일의 상대 경로 확인(프로젝트 폴더 기준으로 보여준다)
    - file.getAbsolutePath() : 파일의 절대 경로 확인(윈도우 시스템 기준으로 보여준다)
- 제작 프로그램
  - Java : exceptionPjt, inputOutput, inputOutputQue

### 2.17 17일차(2020-02-19)
- 직렬화
  - 객체를 스트림으로 전송하기 위해서 진행해야 하는 작업
  - 객체는 큰 덩어리이므로 바이트단위로 잘라주어야 함
  - java.io.Serializable을 implements하여 구현
  - serialVersionUID
    - 직렬화시에 사용되는 객체의 고유번호
    - 명시하지 않아도 Serializable 인터페이스를 implements하면 JVM이 임의의 번호를 붙여 생성하지만 직접 생성하는 것을 권장  
      ex) private static final long serialVersionUID = 11111111111L;
  - transient
    - 객체 직렬화 시 제외할 필드 앞에 붙여 해당 필드의 직렬화를 예외하는 키워드  
      ex) private transient String pw; -> 해당 변수를 직렬화에서 예외로 처리하게 한다.
  - 역직렬화
    - 직렬화의 반대 과정으로 직렬화 된 데이터를 다시 객체로 합치는 과정
    - 클래스의 이름이 같더라도 클래스 내용이 변경된 경우 실패 
  - 외부로 객체를 직렬화할 때 객체 내부에 Serializable을 구현하지 않은 객체가 있다면 에러가 나온다.
  - 이를 해결하는 방법은 해당 클래스도 Serializable을 구현하거나 transient로 직렬화 제외를 시키면 된다.
  - ArrayList는 직렬화가 자동으로 구현되어 있기에 여러명의 회원을 직렬화를 해야 하는 경우 ArrayList에 저장을 하고 한 번에 직렬화를 하면 된다.
- 제작 프로그램
  - Java : inputOutput 업데이트, questionGame

### 2.18 18일차(2020-02-20)
- 네트워크
	- net + work
	- 네트워크의 목적
		- 여러개의 통신기기(컴퓨터, 핸드폰)들을 연결하여 데이터를 손쉽게 주고 받기 위함
		- java.net.패키지의 클래스들로 지원
	- 서버(Server) : 서비스를 제공하는 컴퓨터
	- 클라이언트(Client) : 서비스를 제공받는 컴퓨터
  - IP 주소 : 네트워크 상에서 통신기기를 구별하기 위한 고유 주소  
    ex) 192.168.10.96 - IP 크기는 42억여개에 불과하기에 NAT 기술을 이용하여 동일한 IP를 여러개로 나눠 사용한다.
  - Port 번호 : 서비스 구분번호
    - 잘 알려진 포트 번호(well-known Port Number)의 경우 생략 가능  
      => 0~1000은 well-known Port Number이므로 사용하지 않는다.
  - ServerScoket
    - 서버에서 클라이언트의 요청을 하면 그 요청을 받을 때 까지 기다리는 클래스
    - 사용법 : ServerSocket server = new ServerScoket(int portNumber)
    - 메소드
      - Socket client = server.accept() 메소드를 통해 클라이언트의 연결을 기다리고 연결이 오면 Socket 객체로 반환을 한다.
    - 서버의 연결 순서  
      1. 서버의 소켓 객체 생성
          - Socket client = server.accept()
      2. 클라이언트의 접속 요청을 기다림
		  3. 요청이 오면 수락
			4. 클라이언트 정보를 저장 
          - Socket client = server.accept()
      5. 클라이언트 정보를 통해서 OutputStream 생성
          - DataOutputStream dos = new DataOutputStream(client.getOutputStream());
      6. 클라이언트 정보를 통해서 InputStream 생성
          - DataInputStream dis = new DataInputStream(client.getInputStream());
      7. 모든 데이터를 주고 받으면 InputStream과 OutputStream, 그리고 클라이언트와 연결된 Scoket을 close()시켜준다.
  - Socket
    - 클라이언트에서 서버에 요청을 하거나, 서버에서 클라이언트의 요청을 받았을 때 사용하는 클래스
    - 사용법 : Socket socket = new Socket(String IPAddress, int portNumber)
    - 메소드
      - OutputStream out = client.getOutputStream() 메소드를 통해 데이터를 내보낼 수 있는 OutputStream을 생성 가능하다.
      - InputStream in = client.getInputStream() 메소드를 통해 데이터를 읽을 수 있는 InputStream을 생성 가능하다.
  - cmd 창에서 netstat -nao | findstr :PortNumber 명령어를 통해 해당 포트 번호가 사용중인지 확인 가능
  - 127.0.0.1
    - 자기 자신의 IP
- 제작 프로그램
  - Java : questionGame 업데이트, networkPjtServer, networkPjtClient, baseballGameServer, baseballGameClient

### 2.19 19일차(2020-02-21)
- 운영체제
  - GUI(Graphic User Interface) : 사용자가 명령을 내릴 때 그래픽을 통해서 작업할 수 있는 환경 -> 마우스를 통해서 클릭하여 프로그램을 사용하는 방식
  - CLI(Command Line Interface) : 명령어 기반의 인터페이스로 키보드로 명령어를 타이핑해서 프로그램을 사용
- Java
  - JVM(Java Virtual Machine) : 제일 작은 영역. 자바 소스 코드로부터 만들어지는 자바 바이너리 파일을 실행할 수 있는 가상머신.
  - JRE(Java Runtime Environment) : 2번째로 작은 영역. 자바 실행 환경. JVM을 포함하고 있으며 자바 프로그램을 실행하기 위한 도구들을 추가적으로 가지고 있다.
  - JDK(Java Development Kit) : 제일 큰 영역. 자바 개발 도구. JRE를 포함하고 있으며 실행을 할 수 있고, 자바 개발 도구(javac, java)들이 포함되어 있어 컴파일 및 실행이 가능하다.
    1. JAVA SE(Standard Edition) : 자바 표준 라이브러리가 제공되는 버전. 일반적으로 가장 많이 사용된다.
    2. JAVA EE(Enterprise Edition) : 자바를 이용해서 서버 개발을 위한 플랫폼으로, 표준 라이브러리 외 서버 동작을 위한 다양한 라이브러리가 추가 제공된다.
    3. JAVA ME(Micro Editon) : 휴대전화, 셋톰박스와 같이 작은 규모에서 자바를 지원하기 위한 플랫폼
  - 자바 설치 -> 환경 변수 설정
  - 웹 서버 구축
    - 종류
      1. 서버 : 서비스를 제공하는 컴퓨터.
      2. 클라인트 : 서비스를 이용하는 컴퓨터.
    - 클라이언트가 서버를 찾아가는 방법
      1. IP 주소 : 네트워크 상에서 통신 기기들이 통신을 위해 사용하는 고유주소(IPv4, IPv6)
      2. 포트 번호 : 네트워크 상에서 특정 서버 프로그램을 지정
    - 프로토콜 : 컴퓨터와 컴퓨터가 정보를 주고 받을 때 통신 방법에 대한 규약
      1. 웹 서비스 프로토콜 : http://
      2. TCP : 연결지향형 통신으로 데이터 전달의 신뢰성을 최대한 보장하는 프로토콜
      3. UDP : 비연결지향형 통신으로 빠른 데이터 전달을 보장하는 프로토콜
- DB
  - Data : 어떠한 자료 또는 실제 값  
    ex) 에베레스트 산의 높이 : 8848m
  - 정보 : 데이터를 기반으로 의미를 부여한 것(데이터를 가공한 것)  
    ex) 에베레스트 산은 세계에서 가장 높은 산이다.
  - DB(Data Base) : 조직에 필요한 정보를 얻기 위해서 논리적으로 연관된 데이터를 모아서 구조적으로 통합해 놓은 것
  - DBMS(Data Base Management System) : 데이터베이스를 관리하기 위한 시스템
  - DB의 특징
    1. 실시간 서비스
    2. 데이터의 값이 시간에 따라 변화
    3. 서로 다른 업무 또는 여러 사용자에게 동시에 공유가 된다.
    4. 저장된 값에 따라 참조가 된다.
  - DBMS의 특징
    1. 데이터간의 관계를 정리하고 처리를 쉽게 해준다.
    2. 하나의 DB가 여러 사용자가 사용할 수 있도록 다양하고 쉬운 인터페이스를 제공
    3. 중복 데이터를 최소화하고, 유지 보수가 편하다.
    4. 데이터 복제본을 저장하는 기능이 존재
    5. 여러 사람이 사용할 때 데이터간 불일치 방지
    6. 접근 제어 가능
- Front end
  - 사용 언어
    - HTML, CSS, JavaScript, jQuery => 정적인 페이지
  - WEB-Server : http 요청을 받아 정적인 페이지를 제공하는 컴퓨터  
    ex : apache
  - 동적인 페이지를 하기 위해서는 WAS(Web Application Server)가 필요하다.
    - WAS : DB 조회나 다양한 로직 처리를 요구하는 동적인 컨텐츠를 제공하기 위해 만들어진 서버(jsp, asp, php)  
      ex) apache-tomcat
- Famework
  - Spring
  
### 2.20 20일차(2020-02-24)
- DataBase
  - DBMS : 데이터베이스에서 데이터를 추출, 조작, 정의, 제어 등을 할 수 있게 해주는 데이터베이스 전용 관리 프로그램
  - DBMS의 기능
    1. 데이터의 추출(Retrieval)
    2. 데이터 조작(MAnipulation)
    3. 데이터 정의(Definition)
    4. 데이터 제어(Controle)
  - DBMS 사용 이점
    1. 데이터 독립화
    2. 데이터 중복 최소화, 데이터 무결성 보장
    3. 데이터 보안 향상
    4. 관리 편의성 향상
  - 객체-관계형 데이터베이스 특징
    1. 사용자 정의 타입을 지원한다.
    2. 참조(reference) 타입을 지원한다.
    3. 중첩 테이블을 지원한다.
    4. 대단위 객체의 저장, 추출이 가능하다.
    5. 객체간 상속관계를 지원한다.
- 개발 환경 구현
  - CMD창에서 sqlplus, 아이디 : system, 비밀번호 입력
  - Oracle SQL Devloper
    - 사용자 이름 : sys as sysdba

## 3. 이클립스 기능
- 단축키
  - ctrl + shift + F : 자동 줄맞춤
  - F3 : 확인하고 싶은 메소드가 있다면 그곳에 커서를 클릭하고 F3키 클릭 => 다른 클래스에 존재하더라도 찾아감
  - ctrl + space : 누르면 자동 완성 기능
  - ctrl + Shift + o : 자동 import
  - (alt + Shift + s) + C : 기본 생성자 등록
  - (alt + Shift + s) + O : 매개변수 생성자 등록
  - (alt + Shift + s) + R : getter, setter 등록
  - F2 : 에러난 곳에서 커서를 올린 후 F2 => 에러 메시지 선택 가능
  
## 4. Java
- 메소드
  - String.toLowerCase() : 문자열 내의 대문자를 소문자로 바꿔주는 메소드
  - String.toUpperCase() : 문자열 내의 소문자를 대문자로 바꿔주는 메소드
- String
  - new를 이용한 경우와 ""를 이용해 넣은 경우는 다르게 작동을 한다.
  - '=='의 경우 다른 클래스는 문제 없지만 String만은 특이한 경우이기에 ""로 입력을 한 경우 같다고 출력이 된다.
- java.lang
  - java.lang 밑에 있는 클래스는 import를 하지 않아도 자동으로 import가 됨
- System.err
  - System.err은 자동으로 멀티 스레드를 만들기에 출력을 할 경우 순서가 바뀌는 경우가 있다.
- Integer.parseInt(String str, int num)
  - num에 따라 각 진수별로 변환이 가능하다. num에 16을 입력하면 16진수로 변환

## 5. DB 명령어
- show user : 현재 접속중인 사용자
