# KH 정보교육원 훈련

## 0. 목차
**[1. 개요](#1-개요)**  
**[2. 교육 일정](#2-교육-일정)**  
**[3. 이클립스 기능](#3-이클립스-기능)**  
**[4. Java](#4-Java)**  
**[5. DB 명령어](#5-db-명령어)**  
**[6. 테이블 설계](#6-테이블-설계)**  
**[7. DB 연결 단계](#7-DB-연결-단계)**  
**[8. 사이트](#8-사이트)**  

<details>
<summary>교육 일정 상세보기</summary>
<div markdown="1">
	
| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |  
| :-----: | :-----: | :-----: | :-----: | :-----: | :-----: | :-----: | :-----: | :-----: | :-----: |  
| [2.1](#21-1일차2020-01-28) | [2.2](#22-2일차2020-01-29) | [2.3](#23-3일차2020-01-30) | [2.4](#24-4일차2020-01-31) | [2.5](#25-5일차2020-02-03) | [2.6](#26-6일차2020-02-04) | [2.7](#27-7일차2020-02-05) | [2.8](#28-8일차2020-02-06) | [2.9](#29-9일차2020-02-07) | [2.10](#210-10일차2020-02-10) |
| [2.11](#211-11일차2020-02-11) | [2.12](#212-12일차2020-02-12) | [2.13](#213-13일차2020-02-13) | [2.14](#214-14일차2020-02-14) | [2.15](#215-15일차2020-02-17) | [2.16](#216-16일차2020-02-18) | [2.17](#217-17일차2020-02-19) | [2.18](#218-18일차2020-02-20) | [2.19](#219-19일차2020-02-21) | [2.20](#220-20일차2020-02-24) |
| [2.21](#221-21일차2020-02-25) | [2.22](#222-22일차2020-03-09) | [2.23](#223-23일차2020-03-10) | [2.24](#224-24일차2020-03-11) | [2.25](#225-25일차2020-03-12) | [2.26](#226-26일차2020-03-13) | [2.27](#227-27일차2020-03-16) | [2.28](#228-28일차2020-03-17) | [2.29](#229-29일차2020-03-18) | [2.30](#230-30일차2020-03-19) |
| [2.31](#231-31일차2020-03-20) | [2.32](#232-32일차2020-03-23) | [2.33](#233-33일차2020-03-24) | [2.34](#234-34일차2020-03-25) | [2.35](#235-35일차2020-03-26) | [2.36](#236-36일차2020-03-27) | [2.37](#) | [2.38](#) | [2.39](#) | [2.40](#) |

</div>
</details>  

## 1. 개요
- 이 문서는 KH 정보교육원 교육 중 만들어지는 문서들을 저장하기 위한 Repository입니다.
- 교육명은 「디바이스&웹 콘텐츠 융합 디지털 컨버전스 양성과정」입니다.
- 이번 교육의 Java 버전은 1.8.0_144입니다.
- 이번 교육에서 사용하는 ojdbc 버전은 ojdbc6입니다.
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
    ```
    [접근제어 지시자] 반환형 메소드명 (매개변수) {  
    　　실행코드;  
    }  
    ```
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
    ```  
    Integer num = new Integer(10);
    Double dd = new Double(3.14);
    ```
  - UnBoxing : Wrapper 클래스에 있는 기본 자료형을 꺼내는 것  
    ```  
    int n = num.intValue();
    double d = dd.doubleValue();
    ```
  - Auto Boxing : Boxing을 생성자를 이용하지 않고 바로 사용 가능  
    ```
    Integer num = 10;
    Double dd = 3.14;
    ```
  - Auto UnBoxing : UnBoxing을 value 메소드를 사용하지 않고 바로 가져오는 것  
    ```  
    int n = num;
    double d = dd;
    ```
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
    - for-each문을 이용해 코드를 단축해 for문 내에서 get 메소드를 호출할 필요 없이 알아서 원하는 객체를 순회가 가능하다
      ```
      for (T t : list) {  
      　　control문  
      }
      ```
    - ArrayList가 가지고 있는 forEach() 메소드를 이용해 람다식으로 객체의 순회가 가능하다
      ```
      list.forEach(t -> {  
      　　control문  
      });
      ```
    - Iterator를 이용한 반복문 순회가 가능하다
      ```
      Iterator iter = list.iterator();  
      while(iter.hasNext()) {  
      　　control문  
      　　iter.next();  
      }
      ```
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
      ```
      try {  
      　　에러가 발생할 가능성이 있는 소스 코드 작성  
      } catch(Exception e) {  
      　　try 블록의 소스코드를 실행하다 에러가 발생하면 즉시 중단하고 catch 구문이 실행  
      } finally {  
      　　정상 실행이 되던지, 예외가 발생하던지 무조건 실행해야 하는 코드  
      }
      
      ※ 일반적으로 코드에서 사용한 자원을 반납하는 코드를 finally에 작성
      ```
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
    ```
    try (FileInputStream fis = new FileInputStream("test.txt")) {
    　　코드  
    } catch (Exception) {  
    　　Exception 처리     
    }
    ```
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
      - 사용법
      ```
      FileOutputStream fos = new FileOutputStream(String filename);
      ```
      - write(byte[] bytes) 메소드를 사용하여 데이터를 전송하며, 데이터를 전송할 때 byte가 매개변수로 입력되므로 문자열을 getBytes() 메소드를 사용해 byte 배열로 만들어 전송한다.
      - \r\n : 윈도우에서 개행을 하기 위해서는 해당 문자열을 입력해야 함(str = sc.readLine() + "\r\n")
    - DataOutputStream
      - 보조 스트림으로 홀로 사용은 불가능하다.
      - 사용법
      ```
      DataOutputStream dos = new DataOutputStream(new FileOutputStream(String filename));
      DataOutputStream dos = new DataOutputStream(OutputStream os);
      ```
      - 데이터를 전송할 때 개행 처리가 필요 없고, write() 메소드가 아닌 writeChars(String str)를 사용하여 byte 배열로 변환이 필요 없다.
      - writeUTF(Sring str) 메소드를 사용하면 byte 배열로 변환이 필요 없이 한글의 깨짐을 방지한 채 데이터를 보낼 수 있다.
    - DataInputStream
      - 사용법
      ```
      DataInputStream dis = new DataInputStream(InputStream is);
      ```
      - readUTF(String str) 메소드를 사용하여 byte 배열로 변환이 필요 없이 한글의 깨짐을 방지한 채 데이터를 보낼 수 있다.
    - ObjectOutputStream
      - 객체를 출력하기 위한 보조 스트림
      - 사용법
      ```
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(String filename));
      ```
      - writeObejct(Object ojt) 메소드를 통해 객체를 파일로 출력할 수 있다.
      - 17일차에 배우는 직렬화와 함께 사용한다
    - ObjectInputStream
      - 외부로 출력한 객체를 읽어오기 위한 보조 스트림
      - 사용법
      ```
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream(String filename));
      ```
      - readObject() 메소드를 통해 객체를 읽어올 수 있으며 리턴하는 타입이 Object 클래스이므로 down-casting이 필요하다.  
        ex) User user = (User)ois.readObject();
      - 17일차에 배우는 직렬화와 함께 사용한다
  - 문자 스트림
    - FileWriter
      - 사용법
      ```
      FileWriter fw = new FileWriter(String filename);
      ```
      - FileOutputStream과 동일하게 사용 가능하다. 단, FileWrite는 문자 스트림이므로 byte 배열로의 변환이 필요 없다.
    - BufferedWriter
      - 사용법
      ```
      BufferedWriter bw = new BufferedWriter(new FileWriter(String filename));
      ```
      - FileWriter와 마찬가지로 write 메소드를 사용해 출력을 한다.
      - bw.newLine() 메소드를 통해 개행이 가능하다.
    - BufferedReader
      - 사용법
      ```
      BufferedReader br = new BufferedReader(new FileReader(String filename))
      ```
      - readLine() 메소드를 사용해 파일에서 1줄씩 읽어온다.
      - readLine()을 할 때 더 이상 읽어올 문자열이 없으면 null을 리턴한다.
- File Class
  - 사용법
  ```
  File file = new File(String filename);
  ```
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
      ex) 
      ```
      private static final long serialVersionUID = 11111111111L;
      ```
  - transient
    - 객체 직렬화 시 제외할 필드 앞에 붙여 해당 필드의 직렬화를 예외하는 키워드  
      ex)
      ```
      private transient String pw; -> 해당 변수를 직렬화에서 예외로 처리하게 한다.
      ```
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
      ```
      - Socket client = server.accept();
      ```
      2. 클라이언트의 접속 요청을 기다림
		  3. 요청이 오면 수락
			4. 클라이언트 정보를 저장 
      ```
      - Socket client = server.accept();
      ```
      5. 클라이언트 정보를 통해서 OutputStream 생성
      ```
      - DataOutputStream dos = new DataOutputStream(client.getOutputStream());
      ```
      6. 클라이언트 정보를 통해서 InputStream 생성
      ```
      - DataInputStream dis = new DataInputStream(client.getInputStream());
      ```
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
    2. 데이터 조작(Manipulation)
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
- Table
  - 데이터를 담고 있는 객체
  - 테이블은 기본적으로 행과 열을 이용하여 데이터를 표현
  - Table 용어
    1. Relation : 테이블의 이름을 Relation이라고 부름.
    2. Column(Attribute, Domain) : 특정한 단순 자료형과 데이터의 열
    3. Row : 테이블에서 한 객체의 대한 전체 정보를 표현한 행(가로)
    4. Field : 어떠한 단일 값 자체를 의미
  - 데이터 타입
    - 숫자
      1. NUMBER([P, S])  
        - 표현할 수 있는 전체 숫자 자리 수(1 ~ 38)
        - 소수점 이하 자리 수(-84 ~ 127)  
        ex) 1234.678 => NUMBER(7, 3) : 1234.678, NUMBER(7) : 1234, NUMBER : 1234.678, NUMBER(7, 1) : 1234.7, NUMBER(4, -2) : 1200
    - 문자
      1. CHAR(SIZE) : 고정 길이 문자(최대 2000byte) - 데이터의 공백을 빈 칸으로 채워 넣는다. but, 데이터 처리 속도가 빠르다.
          - SIZE : 포함될 문자(열) 크기
          - 지정한 크기보다 작은 문자(열)이 입력되고 남은 공간은 공백으로 채움
          - 데이터는 ''를 이용하여 표기하고 대/소문자를 구분
          - 한글의 경우 무료판에서는 1글자당 3바이트  
          ex) ORACLE => CHAR(3) : 에러, CHAR(6) : ORACLE, CHAR(9) : ORACLE, 공백 3개  
          ex) 오라클 => CHAR(3) : 에러, CHAR(6) : 에러, CHAR(9) : 오라클
      2. VARCHAR2 : 가변 길이 문자(최대 4000byte) - 데이터의 공백은 버린다.
      3. NCHAR : CHAR과 동일하며 유니코드 문자
      4. NVARCHAR2 : VARCHAR2와 동일하며 유니코드 문자
      5. Long : 가변길이 문자(최대 2GB)
    - 날짜
      1. DATE
        - 일자(세기/년/월/일) 및 시간(시/분/초) 정보를 관리
        - 기본적으로 화면에 년/월/일 정보만 표기
        - 날짜의 연산 및 비교가 가능
          1. 날짜 + 숫자 : DATE - 더한 숫자만큼 며칠 후
          2. 날짜 - 숫자 : DATE - 더한 숫자만큼 며칠 전
          3. 날짜 - 날짜 : NUMBER - 두 날짜의 차이(일 수)
          4. 날짜 + 날짜 / 24 : DATE - 날짜 + 시간
    - 데이터
      1. CLOB : 가변길이 문자(최대 4GByte)
      2. BLOB : Binary Data
- DQL(Select)
  - 데이터를 검색(추출)하기 위해 사용되는 언어
  - DQL은 DML에 속해 있으며 DML중 SELECT만을 따로 의미
  - 데이터를 조회한 결과를 ResultSet이라고 함
  - Result Set은 0개 이상의 행을 포함
  - Result Set은 특정한 열을 기준으로 정렬이 가능함
  - 사용법  
  ```
  SELECT 컬럼명[, 컬럼명, ...] FROM 테이블명 WHERE 조건식;
  ```
  - as를 이용해 컬럼명을 변경할 때 특수문자가 들어가면 " "를 사용한다.
  - 리터럴
    - select를 할 때 컬럼명으로 문자열을 넣을 수 있다.
    ```
    SELECT EMP_NAME, SALARY, '원' AS 단위 FROM EMPLOYEE
    ```
  - 현재 시간 출력
  ```
  SELECT SYSDATE FROM DUAL;
  ```
    - DUAL 테이블 : 오라클에서 테스트를 위해 가상으로 만들어진 테이블
  - 중복 제거
  ```
  SELECT DISTINCT 컬럼명[, 컬럼명, ...] FROM 테이블명 WHERE 조건식;
  ```
  - 연산자 - 연결 연산자
    - 연결 연산자인 '||'를 사용하여 여러 컬럼을 하나의 컬럼처럼 합칠 수 있다.
  - 연산자 - 논리 연산자
    - 여러 개의 제한 조건 결과를 하나의 논리 결과로 만들어준다.
    - 종류
      1. AND : 여러 조건이 동시에 TRUE일 경우 TRUE
      2. OR : 여러 조건들 중 하나라도 TRUE일 경우 TRUE
      3. NOT : 조건에 대한 반대로 반환(NULL은 예외)
  - 연산자 - 비교 연산자
    - 표현식 사이의 관계를 비교하기 위해 사용하고, 비교 결과는 논리 결과(TRUE, FALSE, NULL)를 리턴한다.
    - 종류
      1. = : 같다
      2. <, > : 크다, 작다
      3. =<, >= : 크거나 같다, 작거나 같다
      4. <>, != ^= : 다르다
      5. BETWEEN AND : 비교하려는 값이 지정한 범위(경계 포함 -> 이상/이하)에 포함되면 TRUE 리턴
      6. LIKE : 비교하려는 값이 특정 패턴을 만족시키면 TRUE를 리턴하는 연산자 '%'와 '_'를 와일드카드로 사용할 수 있다.
        - %는 글자 길이에 제한이 없고(다른 글자와 동일한 들어가면 무조건 TRUE), _는 제한이 있다.('_'의 칸 수만큼만 임의의 글자가 들어갈 수 있다.)
        - 입력받은 _ 혹은 %가 실제 문자인지 와일드카드인지 알아보기 위해 ESCAPE 기능을 사용한다.
        ```
        SELECT EMP_NAME, EMAIL FROM EMPLOYEE
        WHERE EMAIL LIKE'___#_%' ESCAPE '#';
        ```
        - ESCAPE 문자는 다른 것이 들어와도 상관 없다.
      7. NOT LIKE : 해당 문자가 들어가지 않는 경우에만 TRUE를 리턴한다.
      8. IS NULL/IS NOT NULL : NULL 여부를 비교하는 연산자
      9. IN, NOT IN : 비교하려는 값 목록에 일치하는 값이 있으면 TRUE를 반환하는 연산자
      ```
      SELECT EMP_NAME, DEPT_CODE FROM EMPLOYEE
      WHERE DEPT_CODE IN ('D6', 'D9', 'D1');
      ```
      
      | 우선순위 | 연산자 |  
      | :-----: | :-----: |
      | 1 | 산술 연산자 |
      | 2 | 연결 연산자 |
      | 3 | 비교 연산자 |
      | 4 | IS NULL/IS NOT NULL, LIKE/NOT LIKE, IN/NOT IN |
      | 5 | BETWEEN AND |
      | 6 | 논리 연산자 - NOT |
      | 7 | 논리 연산자 - AND |
      | 8 | 논리 연산자 - OR |
      
  - 정렬
    - ORDER BY
    - SELECT한 컬럼에 대해 정렬할 때 사용
    - SELECT문 가장 마지막에 작성하며, 실행 순서도 가장 마지막
    - 정렬 방법 : 기본적으로 오름차순이다.
      - ASC : 오름차순
        1. NUMBER : 작은수 -> 큰수
        2. CHARCATER : 사전순
        3. DATE : 빠른날 -> 늦은날
        4. NULL이 가장 아래로
      - DESC : 내림차순
        1. NUMBER : 큰수 -> 작은수
        2. CHARACTER : 사전역순
        3. DATE : 늦은날 -> 빠른날
        4. NULL이 가장 위로
      - 숫자로 입력할 경우 해당번째 컬럼을 기준으로 정렬한다.
      ```
      SELECT EMP_NAME, EMAIL, DEPT_CODE, SALARY 급여, SALARY * 12 연봉
      FROM EMPLOYEE ORDER BY 1;
      ```
- 제작 프로그램
  - DB : kh.sql, admin.sql
  
### 2.21 21일차(2020-02-25)
- 함수
  - 함수의 유형
    1. 단일 행 함수 : 각 행마다 반복적으로 적용. 입력받은 행의 개수만큼 결과 반환
    2. 그룹 함수 : 특정한 행들의 집합으로 그룹을 형성. 그룹당 1개의 결과를 반환
  - 문자 처리 함수
    - CHARACTER -> NUMBER
      1. LENGTH : 문자열의 길이를 반환
      2. LENGTHB : 문자열의 바이트 크기를 반환
      3. INSTR : 특정 문자의 위치를 반환
      ```
      INSTR(STRING, STR, [POSITION], [OCCURRENCE])
      
      - STRING 문자열에서 [POSITION]부터 시작해서 [OCCURRENCE]번째에 위치한 문자열의 위치를 찾는 함수
      - POSITION에 -를 붙이면 방향을 반대로 한다. ex) -1이면 가장 뒤에서부터 앞으로 진행한다.
      ```
    - CHARACTER -> CHARACTER
      1. LPAD/RPAD : 주어진 컬럼 문자열에 임의의 문자열을 왼쪽/오른쪽에 덧붙여 길이 N의 문자열을 반환하는 함수
      ```
      LPAD(STRING, NUMBER, STR)
      RPAD(STRING, NUMBER, STR)
      
      - NUMBER 길이의 공간을 확보하고 STRING에서 남은 공간을 STR로 채워 넣는다.
      - 만약 NUMBER의 크기가 STRING의 길이보다 작으면 NUMBER만큼 출력하고 자른다.
      ```
      2. LTRIM/RTRIM : 주어진 문자열의 왼쪽(LTRIM), 오른쪽(RTRIM)부터 시작해서 해당 문자열을 자르고 문자열을 반환한다.
      ```
      LTRIM(STRING, STR)
      RTRIM(STRING, STR)
      
      - LTRIM은 왼쪽에서부터, RTRIM은 오른쪽에서부터 시작해 CHAR을 자르을 자른다.
      - 만약 STR이 여러개의 문자면 해당하는 문자 모두를 제거한다.
      ```
      3. TRIM : 주어진 컬럼 문자열의 앞/뒤/양쪽에 있는 지정한 문자를 제거한 나머지를 반환
      ```
      TRIM(OPTION CHAR FROM STRING)
      
      - STRING에서 CHAR에 해당하는 문자들을 양 옆에서 제거한다.
      - OPTION에 따라 어디부터 제거할지 선택할 수 있다.
      - BOTH는 양끝, LEADING는 왼쪽, TRAILING은 오른쪽의 문자를 제거한다.
      - OPTION이 없으면 기본적으로 BOTH이다.
      - TRIM은 1개의 문자만 제거가 가능하다.
      ```
      4. SUBSTR : 컬럼이나 문자열에서 지정한 위치부터 지정한 개수의 문자열을 잘라내어 리턴
      ```
      SUBSTR(STRIN, POSTION, [LENGTH])
      
      - STRING을 PSTION부터 LENGTH만큼 잘라 리턴한다.
      - LENGTH를 생략하면 POSTION부터 끝까지 잘라낸다.
      - POSTION을 -로 하면 뒤에서부터 POSTION를 계산한다.
      ```
      5. LOWER/UPPER/INITCAP : 해당 문장을 대문자, 소문자, 첫글자만 대문자 변환
      ```
      LOWER(STRING)
      UPPER(STRING)
      INITCAP(STRING)
      
      - LOWER는 STRING의 모든 문자를 소문자로 바꾼다.
      - UPPER는 STRING의 모든 문자를 대문자로 바꾼다.
      - INITCAP은 STRING의 각 단어의 첫글자를 대문자로 바꾼다.
      ```
      6. CONCAT : 컬럼의 문자 혹은 문자열을 두 개 전달받아 하나로 합친 후 리턴
      ```
      CONCAT(STRING, STRING)
      
      - 입력받은 2개의 문자열을 합쳐 리턴한다.
      ```
      7. REPLACE : 전달받은 문자열 중 지정한 문자를 전달받은 문자로 변환하여 리턴
      ```
      REPLACE(STRING, STR1, STR2)
      
      - STRING의 STR1을 STR2로 변환
      ```
  - 숫자 처리 
    - NUMBER -> NUMBER
      1. ABS : 절대값을 구하여 리턴
      ```
      ABS(NUMBER)
      ```
      2. MOD : 입력 받은 수를 나눈 나머지 값을 리턴
      ```
      MOD(NUMBER, DIVISION)
      
      - 나눠지는 수(NUMBER)와 나누는 수(DIVISION)를 입력한다.
      ```
      3. ROUND : 인자로 전달받은 숫자 혹은 컬럼의 소수점 반올림을 한다.
      ```
      ROUND(NUMBER, [POSITION])
      
      - 소수점 반올림을 할 위치를 입력한다. 입력받은 위치만큼 출력한다.
      - 입력을 안할경우 정수로 반올림한다.
      - POSITON이 음수가 되면 소수점 위로 올라간다.
      ```
      4. FLOOR : 인자로 전달받은 숫자 혹은 컬럼의 소수점 아래를 버린다.
      ```
      FLOOR(NUMBER)
      ```
      5. CEIL : 인자로 전달받은 숫자 혹은 컬럼의 소수점 아래를 올린다.
      ```
      CEIL(NUMBER]
      ```
      6. TRUNC : 인자로 전달받은 숫자 혹은 컬럼의 소수점 아래를 버린다.
      ```
      TRUNC(NUMBER, [POSITION])
      
      - 소수점 버림을 할 위치를 입력한다.
      - 입력을 안할경우 정수로 버린다.
      - FLOOR와는 다르게 POSITION에 음수가 올 수 있다.
      - 음수가 오면 1의 자리부터 차례대로 올라간다.
      ```
  - 날짜 처리 함수
    - NULL -> DATE
      1. SYSDATE : 시스템에 저장된 현재 날짜를 리턴
      ```
      SYSDATE
      
      - 매개 변수가 따로 없다.
      ```
    - DATE -> NUMBER
      1. MONTHS_BETWEEN : 두 날짜를 전달받아 몇개월 차이인지 계산하여 리턴
      ```
      MONTHS_BETWEEN(DATE1, DATE2)
      
      - 기준이 되는 날짜와 개월 수를 구하려는 날짜를 입력한다.
      ```
    - DATE -> DATE
      1. ADD_MONTH : 특정 날짜에 개월 수를 더하여 리턴하는 함수
      ```
      ADD_MONTHS(DATE, NUMBER)
      
      - 기준이 되는 날짜에 더하려는 개월 수를 입력하면 해당 개월만큼 더한 날짜가 리턴된다.
      ```
      2. NEXT_DAY : 특정 날짜에서 최초로 다가오는 인자로 받은 요일의 날짜 리턴
      ```
      NEXT_DAY(DATE, STRING|NUMBER)
      
      - 기준이 되는 날짜와 구하려는 요일을 입력한다.
      - 입력받은 요일의 가장 최초로 오는 날짜를 리턴한다.
      - NUMBER로 입력할 경우 1 = 일요일, 2 = 월요일, ... 7 = 토요일이다.
      ```
      3. LAST_DAY : 해당 달의 마지막 날짜를 리턴
      ```
      LAST_DAY(DATE)
      
      - 입력받은 날짜에서 해당 달의 가장 마지막 날짜를 리턴한다.
      ```
      4. EXTRACT : 년, 월, 일 정보를 추출하여 리턴
      ```
      EXTRACT(YEAR FROM DATE)
      EXTRACT(MONTH FROM DATE)
      EXTRACT(DAY FROM DATE)
      
      - 옵션에 따라 각각 년, 월, 일에 해당하는 값이 리턴된다.
      ```
  - 형변환 함수
    - DATE, NUMBER -> CHARACTE
      1. TO_CHAR : 날짜형 데이터 또는 숫자형 데이터를 문자형 데이터로 변환하여 리턴
      ```
      TO_CHAR(DATE, [FORMAT])
      TO_CHAR(NUMBER, [FORMAT])
      
      - 옵션에 따라 문자열로 변환되는 형식이 달라진다. 
      ```  
      - DATE Format  
      
      | 형식 | 설명 | 형식 | 설명 |  
      | :-----: | :-----: | :-----: | :-----: |  
      | YYYY | 년도표현 4자리 | YY | 년도표현 2자리 |  
      | RR | 년도표현 2자리 | MONTH | 월 표시 |  
      | MM | 월을 숫자로 표현 | MON | 월을 알파벳으로 |  
      | DD | 날짜 표현 | DAY | 요일 표현 |  
      | DY | 요일을 약어로 | D | 요일을 숫자로 |  
      | HH, HH12 | 시간(12시간) | HH24 | 시간(24시간) |  
      | MI | 분 | SS | 초 |  
      | AM, PM | 오전, 오후 표기 | FM | 앞자리 0을 제거 |  
        
      - RR의 경우 50보다 작은 경우 20xx로 변환하고 50보다 큰 경우 19XX로 변환한다.  
          ex) 20 -> 2020 / 95 -> 1995
      - NUMBER Format  
      
      | 형식 | 예시 | 설명 |  
      | :-----: | :-----: | :-----: |  
      | ,(comma) | 9,999 | 콤마 형식으로 변환 |  
      | .(period) | 99.99 | 소수점 형식으로 변환 |  
      | 0 | 0999 | 왼쪽에 0을 삽입 |  
      | $ | $9999 | $ 통화로 표시 |  
      | L | L9999 | Local 통화로 표시(한국은 ￦) |
      | XXXX | XXXX | 16진수로 표시 |
      
      - 숫자 표시 단위는 충분한 크기를 주어야 하며, 변환될 숫자보다 format이 작을 경우 오류가 발생한다.
      - 9와 0으로 최대 개수를 표현해야 한다.
    - CHARACTER -> DATE
      1. TO_DATE : 숫자형 데이터 또는 문자형 데이터를 날짜형 데이터로 변환하여 리턴
      ```
      TO_DATE(CHARCTER, [FORMAT])
      TO_DATE(NUMBER, [FORMAT])
      
      - 옵션은 TO_CHAR의 DATE Format 참조
      ```
    - CHARACTER -> NUMBER
      1. TO_NUMBER : 문자형 데이터를 숫자형 데이터로 변환하여 리턴
      ```
      TO_NUMBER(CHARACTER, [FORMAT])
      
      - 입력받은 문자형 데이터를 옵션에 맞춰 숫자형 데이터로 변환하여 출력한다.
      ```
      - 오라클에서 +는 산술연산이기에 자동 형변환이 이루어진다.
  - NULL 처리 함수
    - NULL -> 다른 타입
      1. NVL : 해당 값이 NULL인 경우 값을 대체한다.
      ```
      NVL(COLUMN, DATA)
      
      - COLUMN의 Field값 중 NULL인 것을 DATA로 바꾼다.
      - 옵션은 TO_CHAR의 NUMBER Format 참조
      ```
  - 선택함수
    - 단일값
      1. DECODE : 여러가지 경우에 선택할 수 있는 기능을 제공(일치하는 값)
      ```
      DECODE(조건식, 조건1, 결과1, 조건2, 결과2)
      ```
    - 범위값
      1. CASE : 여러가지 경우에 선택할 수 있는 기능을 제공(범위 값 가능)
      ```
      CASE WHEN 조건식1 THEN 결과1
      WHEN 조건식2 THEN 결과2
      ELSE 결과3 END
      
      - CASE문이 끝날 때 그것을 알리기 위해 END를 가장 끝에 입력한다.
      ```
  - 그룹함수
    - 하나 이상의 행을 그룹으로 묶어 하나의 값을 출력하는 함수
    - 종류
      1. SUM : 입력한 행의 합계를 리턴한다.
      ```
      SUM(COLUMN)
      ```
      2. AVG : 입력한 행의 평균을 리턴한다.
      ```
      AVG(COLUMN)
      ```
      3. COUNT : 입력한 행의 갯수를 리턴한다.
      ```
      COUNT(COLUMN)
      ```
      4. MAX, MIN : 최대값, 최소값
      ```
      MAX(COLUMN)
      MIN(COLUMN)
      
      - MAX와 MIN의 경우 NUMBER뿐 아니라 DATE도 가능하다.
      ```
    - 그룹 함수의 경우 NULL은 연산에 안들어간다.
    - 그룹 함수의 경우 출력이 1줄인데 만약 서로 다른 ROW 수를 가진 두개의 COLUMN을 출력할 경우 에러가 뜬다.
    ```
    EMP_NAME => 25줄일 때
    SELECT EMP_NAME, COUNT(EMP_NAME) FROM EMPLOYEE
    
    - 에러가 발생한다.
    ```
    
### 2.22 22일차(2020-03-09)
- GROUP BY
  - 그룹함수를 사용하는 경우 일반적인 컬럼과 함께 사용하면 에러가 나오는데 이를 방지하기 위해 사용한다.
  - 혹은 한 개의 결과값만을 산출하는 그룹함수에서 여러 개의 결과값을 산출하기 위해서는 그룹함수가 적용될 그룹의 기준을 지정하는데 사용한다.
  - 사용법
    ```
    SELECT 컬럼 FROM 테이블명
    [WHERE 조건문]
    GROUP BY 컬럼;
    ```
- HAVING
  - GROUP BY가 끝난경우 조건을 사용하는 경우 WHERE가 아닌 HAVING으로 사용한다.
  - WEHRE는 GROUP BY가 진행하기 전에 검색하는 경우이기에 연산에 오류가 생긴다.
  - 사용법
    ```
    SELECT 컬럼 FROM 테이블명
    [WHERE 조건문]
    GROUP BY 컬럼
    HAVING 조건문;
    ```
- JOIN
  - 오라클 전용 구문
    - 사용법
    ```
    SELECT 컬럼
    FROM 테이블명1, 테이블명2, ...
    WHERE 조건문;
    ```
  - ANSI JOIN 표준 문법
    - FROM절 이후에 JOIN절을 기입하고 JOIN할 테이블 명 명시
    - 서로 다른 테이블의 서로 다른 컬럼명일 때
      - 사용법
      ```
      SELECT 컬럼 
      FROM 테이블명1
      JOIN 테이블명2 ON (조건문);
      ```
    - 서로 다른 테이블의 동일한 컬럼명일 때
      - 사용법
      ```
      SELECT 컬럼
      FROM 테이블명1
      JOIN 테이블명2 USING(컬럼명);
      
      - 동일한 테이블명인 경우 USING을 사용하여 컬럼명 하나만 입력하면 된다.
      ```
  - INNER JOIN
    - 두 개 이상의 테이블을 조인할 때 일치하는 값이 없는 행이 조인에서 제외되는 것
    - 기본적으로 INNER JOIN이다.
  - OUTER JOIN
    - 두개 이상의 테이블을 조인할 때, 일치하는 값이 없는 행도 조인에 포함시키는 것
    - JOIN 앞에 LEFT, RIGHT, FULL을 붙인다.
      - LEFT는 먼저 온 테이블(FROM)은 출력을 하고, 나중에 온 테이블(JOIN)은 출력하지 않는다.
      - RIGHT는 나중에 온 테이블(JOIN)은 출력을 하고, 먼저 온 테이블(FROM)은 출력하지 않는다.
      - FULL은 양쪽 모두 출력을 한다.
  - CROSS JOIN
    - 카테이션 곱(Ccarensian prjuct)라고도 하며, 조인되는 테이블의 각 행들이 모두 매핑된 데이터가 검색되는 조인
    - 사용법
    ```
    SELECT 컬럼명
    FROM 테이블명1
    CROSS JOIN 테이블명2;
    ```
  - SELF JOIN
    - 같은 테이블 내에서 JOIN이 필요한 경우 사용을 한다.
    - 테이블 이름에 별칭을 입력하여 JOIN을 사용한다.
    - 사용법
    ```
    SELECT 별칭1.컬럼명1, 별칭2.컬럼명2...
    FROM 테이블 별칭1
    JOIN 테이블 별칭2 ON (조건문);
    ```
  - 다중 JOIN
    - 여러개의 테이블을 JOIN을 하고 싶다면 먼저 JOIN을 한 뒤 뒤에 JOIN을 추가로 진행하면 된다.
    - JOIN은 위에서부터 차례대로 진행하게 되므로 JOIN의 순서가 중요하다.
    - 사용법
    ```
    SELECT 컬럼명1, 컬럼명2...
    FROM 테이블1
    JOIN 테이블2 ON (조건문)
    [JOIN 테이블2 USING(컬럼명)]
    JOIN 테이블3 ON (조건문)
    [JOIN 테이블3 USING(컬럼명)]
    ...
    ```
- SET OPERATOR
  - 두개 이상의 테이블에서 조인을 사용하지 않고 연관된 데이터를 조회하는 방법
  - 여러 개의 질의 결과를 연결하여 하나로 결합하는 방식
  - JOIN은 컬럼을 추가하여 추가 데이터를 표현했지만, 집합 연산자는 ROW를 추가하여 추가 데이터 표현
  - 집합 연산자 성립 조건
    1. SELECT 질의 컬럼수가 동일해야
  - UNION
    - 중복된 영역을 제외하고 하나로 합치는 연산(합집합)
    - 정렬까지 자동으로 해준다.
    - 사용법
    ```
    SELECT 컬럼명1, 컬럼명2...
    FROM 테이블
    WHERE 조건문1
    UNION
    SELECT 컬럼명1, 컬럼명2...
    FROM 테이블
    WHERE 조건문2
    ```
  - UNION ALL
    - UNION과 마찬가지로 합집합이지만, 중복된 데이터 모두 포함
    - 정렬은 해주지 않는다.
    - 사용법
    ```
    SELECT 컬럼명1, 컬럼명2...
    FROM 테이블
    WHERE 조건문1
    UNION ALL
    SELECT 컬럼명1, 컬럼명2...
    FROM 테이블
    WHERE 조건문2
    ```
  - INTERSECT
    - 두 SELECT문에서 중복된 데이터만을 출력한다.(교집합)
    - 사용법
    ```
    SELECT 컬럼명1, 컬럼명2...
    FROM 테이블
    WHERE 조건문1
    INTERSECT
    SELECT 컬럼명1, 컬럼명2...
    FROM 테이블
    WHERE 조건문2
    ```
  - MINUS
    - 1번째 SELECT문에서 2번째 SELECT문과 중복된 데이터를 제거하고 출력한다.(차집합)
    - 사용법
    ```
    SELECT 컬럼명1, 컬럼명2...
    FROM 테이블
    WHERE 조건문1
    MINUS
    SELECT 컬럼명1, 컬럼명2...
    FROM 테이블
    WHERE 조건문2
    ```
- SUBQUERY
  - 하나의 SELECT 문장 안에 포함된 또 하나의 SELECT 문장
  - 서브쿼리는 메인쿼리 실행 전 한번만 실행
  - 서브쿼리 조건
    1. 서브쿼리는 반드시 소괄호로 묶어야 함
    2. 서브쿼리는 연산자의 오른쪽에 위치해야 함
    3. 서브쿼리 내에서 ORDER BY 문법은 지원되지 않음
    4. 서브쿼리와 비교할 항목은 서브쿼리의 SELECT한 항목의 개수와 자료형이 일치해야함
  - 서브쿼리 유형
    1. 단일행 서브쿼리
      - 서브쿼리의 SELECT문의 결과가 1행만으로 존재하는 경우(1행 1열)  
      ex)
      ```
      SELECT EMP_NAME
      FROM EMPLOYEE
      WHERE EMP_ID = (SELECT MANAGER_ID FROM EMPLOYEE WHERE EMP_NAME = '전지연');
      ```
    2. 다중행 서브쿼리
      - 서브쿼리의 SELECT문의 결과가 2행 이상으로 존재하는 경우(N행 1열)  
      ex)
      ```
      SELECT * FROM EMPLOYEE
      WHERE DEPT_CODE IN(SELECT DEPT_CODE FROM EMPLOYEE 
      WHERE EMP_NAME IN('박나라', '송종기'));
      ```
      - 다중행 서브쿼리의 경우 비교 연산자(=, !=, >, < 등)의 사용이 불가능하다
      - IN/NOT IN, ANY, ALL, EXIST만 사용 가능하다.
        - ANY 사용법
        ```
        SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
        FROM EMPLOYEE
        WHERE SALARY > ANY(2000000, 5000000);
        [WHERE SALARY > 2000000 OR SALARY > 5000000과 동일하다.]

        SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
        FROM EMPLOYEE
        WHERE SALARY < ANY(2000000, 5000000);
        [WHERE SALARY < 2000000 OR SALARY < 5000000과 동일하다.]

        SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
        FROM EMPLOYEE
        WHERE SALARY = ANY(2000000, 5000000);
        [WHERE SALARY IN(2000000, 5000000)과 동일하다.]
        ```
        - ALL 사용법
        ```
        SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
        FROM EMPLOYEE
        WHERE SALARY > ALL(2000000, 5000000);
        [WHERE SALARY > 2000000 AND SALARY > 5000000과 동일하다.]

        SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
        FROM EMPLOYEE
        WHERE SALARY < ALL(2000000, 5000000);
        [WHERE SALARY < 2000000 AND SALARY < 5000000과 동일하다.]
        ```
        - EXIST 사용법
        ```
        SELECT EMP_NAME, MANAGER_ID, BONUS FROM EMPLOYEE E
        WHERE EXISTS(SELECT EMP_NAME FROM EMPLOYEE M
        WHERE NVL(M.BONUS, 0) >= 0.3);
        
        - EXIST는 괄호 안의 수행 결과의 내용은 중요하지 않다.
        - 해당 결과가 존재하면 TRUE, 없으면 FALSE를 리턴한다.
        ```
    3. 다중열 서브쿼리
      - 서브쿼리의 조회 결과 컬럼의 개수가 여러개인 경우(1행 N열)
      - 다중행과 다르게 일부 등호 계열 비교 연산자(=, !=, <> 등)는 가능하다.
      ex)
      ```
      - 퇴사한 여직원과 같은 부서, 같은 직급에 해당하는 사원의 이름, 직급 부서, 입사일을 조회
      
      SELECT EMP_NAME, JOB_CODE, DEPT_CODE, HIRE_DATE
      FROM EMPLOYEE
      WHERE (DEPT_CODE, JOB_CODE) IN
      (SELECT DEPT_CODE, JOB_CODE FROM EMPLOYEE
      WHERE SUBSTR(EMP_NO, 8, 1) = 2 AND ENT_YN = 'Y');
      
      - 다중열 서브쿼리의 경우 비교하는 컬럼을 괄호로 묶는다.
      - 비교하는 컬럼과 서브쿼리에서 수행한 결과의 컬럼이 동일해야 한다.
      ```
    4. 다중행 다중열 서브쿼리
      - 서브쿼리의 조회 결과 컬럼의 개수와 행의 개수가 여러개인 경우(M행 N열)  
      ex)
      ```
      -직급별로 최소급여를 받는 직원의 사번, 이름, 직급, 급여
      
      SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
      FROM EMPLOYEE
      WHERE (JOB_CODE, SALARY) IN(SELECT JOB_CODE, MIN(SALARY) 
      FROM EMPLOYEE GROUP BY JOB_CODE);
      
      - 다중열과 마찬가지로 비교하는 컬럼을 괄호로 묶는다.
      - 다중행과 마찬가지로 비교 연산자의 사용이 블가능하다.
      ```
    5. 상관 서브쿼리(상호연관 서브쿼리)
      - 서브쿼리가 만든 결과 값을 메인쿼리가 비교 연산할 때, 메인 쿼리 테이블의 값이 변경되면 서브쿼리의 결과값도 바뀌는 경우  
      ex)
      ```
      - 관리자가 있는 사원들 중 관리자 사번이 EMPLOYEE 테이블에 존재하는 직원의 사번인  
      직원의 사번, 이름, 소속부소, 관리자 사번을 출력
      
      SELECT EMP_ID, EMP_NAME, DEPT_CODE, MANAGER_ID
      FROM EMPLOYEE E
      WHERE EXISTS (SELECT EMP_ID FROM EMPLOYEE M
      WHERE E.MANAGER_ID = M.EMP_ID);
      
      - 서브쿼리 내에서 메인쿼리의 컬럼(E.MANAGER_ID)을 호출한다.      
      ```
    6. 스칼라 서브쿼리
      - 상관쿼리이면서 결과값이 1개인 경우  
      ex)
      ```
      - 모든 사원의 사번, 이름, 관리자 사번, 관리자 이름
      - 관리자 이름이 없는 경우 없음으로 표현
      
      SELECT E1.EMP_ID, E1.EMP_NAME, E1.MANAGER_ID, 
        NVL((SELECT E2.EMP_NAME FROM EMPLOYEE E2
        WHERE E1.MANAGER_ID = E2.EMP_ID), '없음') AS "관리자 이름"
      FROM EMPLOYEE E1;
      
      --------------------------------------------------
      - 스칼라 서브쿼리 WHERE절
      - 자신이 속한 직급의 평균 급여보다 많이받는 직원의 이름, 직급코드, 급여
      
      SELECT EMP_NAME, JOB_CODE, SALARY
      FROM EMPLOYEE E
      WHERE SALARY >= (
        SELECT AVG(SALARY) 
        FROM EMPLOYEE M
        WHERE E.JOB_CODE = M.JOB_CODE
      )
      ORDER BY 2;
      
      --------------------------------------------------
      - 스칼라 서브쿼리 ORDER BY 절
      - 전 사원의 사원번호, 이름, 부서코드 출력
      - 단, 부서 이름 순으로 정렬
      
      SELECT EMP_ID, EMP_NAME, DEPT_CODE
      FROM EMPLOYEE
      ORDER BY(
        SELECT DEPT_TITLE
        FROM DEPARTMENT
        WHERE DEPT_CODE = DEPT_ID)
      DESC NULLS LAST;
      
      --------------------------------------------------
      - 스칼라 서브쿼리 FROM절(인라인 뷰)
      - 직원들 중 급여를 가장 많이받는 사원을 순서대로 5명

      SELECT ROWNUM, EMP_NAME, SALARY
      FROM (
        SELECT * FROM EMPLOYEE 
        ORDER BY SALARY DESC)
      WHERE ROWNUM <= 5;
      
      - FROM 안에 가상의 테이블을 만들어 외부에서 사용을 한다.
      - 가상 테이블 안에는 해당 컬럼이 존재해야 한다.
      ```
      
### 2.23 23일차(2020-03-10)
- 순번 매기기
  - ROWNUM
    - 각 행에 순서번호를 매겨 출력한다.
    - 사용법
    ```
    SELECT ROWNUM, EMP_NAME FROM EMPLOYEE
    ```
    - ORDERBY와 마찬가지로 계산이 완료된 이후에 순서번호가 매겨진다.
  - RANK() OVER
    - 순위를 매기는데 동일한 값이 존재하면 해당 값을 동순위로 매긴다.
    - 동순위 뒤에 오는 순위는 해당 순위를 건너 뛴 숫자로 계산된다.  
      ex) 3등에 위치한 사람이 2명이면 다음 등수는 5등이다.
    - 사용법
    ```
    SELECT 순위, EMP_NAME, SALARY
    FROM (
      SELECT EMP_NAME, SALARY,
      RANK() OVER(ORDER BY SALARY DESC) AS 순위
      FROM EMPLOYEE
    );
    ```
  - DENSE_RANK() OVER
    - RANK() OVER와 마찬가지로 동일한 값이 존재하면 동순위로 매긴다.
    - 동순위 뒤에 오는 순위는 해당 순위 바로 다음 순위로 계산된다.  
      ex) 3등에 위치한 사람이 2명이면 다음 등수는 4등이다.
    - 사용법
    ```
    SELECT 순위, EMP_NAME, SALARY
    FROM (
      SELECT EMP_NAME, SALARY,
      DENSE_RANK() OVER(ORDER BY SALARY DESC) AS 순위
      FROM EMPLOYEE
    );
    ```
  - ROW_NUMBER() OVER
    - ROWNUM과 마찬가지로 동점자 처리를 안한다.
    - 사용법
    ```
    SELECT 순위, EMP_NAME, SALARY
    FROM (
      SELECT EMP_NAME, SALARY,
      ROW_NUMBER() OVER(ORDER BY SALARY DESC) AS 순위
      FROM EMPLOYEE
    );
    ```
- DDL
  - 데이터 정의 언어
  - 객체를 만들고, 수정하고, 삭제하는 구문
  - CREATE(생성), ALTER(수정), DROP(삭제)
  - 오라클 객체 종류
    - USER, TABLE, VIEW, SEQUENCE, INDEX, PACKAGE, PROCEDUAL, FUNCTION, TRIGGER, SYNONYM
- CREATE
  - DDL의 한 종류로 테이블이나 인덱스, 유저 등 다양한 데이터베이스를 객체를 생성하는 구문
  - 관리자 계정과 사용자 계정
    - 관리자 계정 : 데이터베이스의 생성과 관리를 담당하는 계정이며, 모든 권한과 책임을 가지는 계정
    - 사용자 계정 : 데이터베이스에 대하여 질의, 갱신, 보고서 작성 등을 수행할 수 있는 계정으로 업무에 필요한 최소한의 권한만 가지는 것을 원칙으로 한다.
  - 사용자 만들기
    - USER를 생성하는 것은 관리자 계정으로만 가능
    - 사용법
    ```
    CREATE USER 사용자 이름 IDENTIFIED BY 비밀번호;
    ```
    - 관리자 계정에서 USER를 생성하게 되면 계정은 생성되지만 권한이 없어서 접속이 불가능하므로 권한을 부여해 주어야 함
    - 권한을 부여하거나 회수하는 것을 통해 DATABASE에 접근을 제어함
    - 이 때 사용하는 구문이 DCL(Data Control Language) GRANT(권한부여), REVOKE(권한해제)가 존재
    - 일반적으로 ROLE을 통해서 권한을 부여하고 해제함
    - 오라클 ROLE
      1. CONNECT : 사용자가 데이터베이스 접속 가능하도록 하기 위한 CREATE SESSION 권한이 있는 ROLE
      2. RESOURCE : CREATE 구문을 통해 객체를 생성할 수 있는 권한과 INSERT, UPDATE, DELETE 구문을 사용할 수 있는 권한을 모아둔 ROLE
      3. 사용법
      ```
      GRANT CONNECT, RESOURCE TO 사용자 이름;
      
      REVOKE CONNECT, RESOURCE TO 사용자 이름;
      ```
  - 테이블 만들기
    - 기본 테이블 생성
    - 사용법
    ```
    CREATE TABLE 테이블명(
      컬럼명 자료형(크기),
      컬럼명 자료형(크기)...
    );
    
    CREATE TABLE MEMBER(
      MEMBER_ID VARCHAR2(20),
      MEMBER_PW VARCHAR2(20),
      MEMBER_NAME VARCHAR2(20),
      MEMBER_AGE NUMBER
    );
    ```
    - 테이블에 코멘트 달기
      - 사용법
      ```
      COMMENT ON COLUMN 테이블명.컬럼명 IS '코멘트';
      
      COMMENT ON COLUMN MEMBER.MEMBER_ID IS '회원아이디';
      ```
    - 제약조건
      - 테이블 작성시 각 컬럼에 대한 기록에 대해 제약 조건 설정 가능
      - 데이터 무결성을 지키기 위해 제한된 조건
      - 제약 조건의 종류  
      
      | 제약조건 | 설명 |  
      | :-----: | :-----: |  
      | NOT NULL | 데이터에 NULL을 허용하지 않는다. |  
      | UNIQUE | 중복된 값을 허용하지 않는다. |  
      | PRIMARY KEY | NULL을 허용하지 않고, 중복을 허용하지 않는다.<br>컬럼의 고유 식별자로 사용하기 위함. |  
      | FOREIGN KEY | 참조되는 테이블의 컬럼 값이 존재하면 허용한다. |  
      | CHECK | 저장 가능한 데이터 값의 범위나 조건을 지정하여 설정한 값만 허용한다. |
      
      - 제약조건 입력방법
      ```
      CREATE TABLE 테이블명(
        컬럼명1 자료형(크기) 제약조건,
        컬럼명2 자료형(크기) 제약조건,
        ...,
        제약조건 (컬럼명1, 컬럼명2, ...)
      );
      
      - 제약조건 입력은 컬럼에서 하는 것과 컬럼에서 모두 쓰고 마지막 테이블단에서 쓰는 2가지가 있다.
      - 테이블단의 경우 1가지씩 체크하는 것이 아닌 전체가 동일한 제약조건에 위배할 때만 오류가 발생.
      - PRIMARY KEY의 경우 테이블당 1개만 가능하다.
      ```
      - PRIMARY KEY
        - 테이블에서 한 행의 정보를 구분하기 위한 고유 식별자(Identifier) 역할
        - NOT NULL의 의미와 UNIQUE의 의미를 둘 다 가지고 있음
        - 한 테이블 당 한개만 설정 가능
        - 컬럼 레벨과 테이블 레벨에서 설정 가능
      - FOREIGN KEY
        - 참조 무결성을 유지하기 위한 제약조건
        - 참조된 다른 테이블이 제공하는 값만 사용할 수 있도록 제한하는 것
        - 참조되는 컬럼과 참조된 컬럼을 통해 테이블간 관계가 형성
        - 해당 컬럼은 참조되는 테이블의 컬럼 값 중 하나와 일치하거나 NULL을 가질 수 있음.
        - 참조되는 테이블의 참조되는 컬럼은 PRIMARY KEY 또는 UNIQUE 제약 조건 중에 하나를 가져야 함
        - 외래키를 사용시 부모 테이블에서 삭제를 하는 경우 데이터의 무결성에 위배가 되서 삭제가 되지 않는다.
        - 이를 방지하기 위해 부모 테이블에서 데이터 삭제 시 자식 테이블의 데이터를 어떠한 방식으로 처리할지 결정이 가능하다.
          1. ON DELETE RESTRICTED : 아무것도 지정하지 않는 경우 설정되는 기본 삭제 옵션으로 자식 테이블에서 부모 테이블의 데이터를 참조하고 있는 경우 데이터의 삭제가 불가능하다.
          2. ON DELETE SET NULL : 부모 테이블의 데이터 삭제 시 해당 데이터를 참조하고 있던 자식 테이블의 컬럼 값을 NULL로 변경하는 옵션
          3. ON DELETE CASCADE : 부모 테이블의 데이터 삭제 시 해당 테이터를 참조하고 있던 자식 테이블의 데이터까지 모두 삭제하는 옵션
        - 사용법
        ```
        - 테이블 레벨에서 설정
        
        CREATE TABLE 테이블명1(
          컬럼명1 자료형(크기),
          컬럼명2 자료형(크기),
          ...,
          FOREIGN KEY(컬럼명) REFERCENCES 테이블명2(컬럼명)
          ON DELETE CASCADE
          [ON DELETE SET NULL]
        );
        --------------------------------------------------
        - 컬럼 레벨에서 설정
        
        CREATE TABLE 테이블명1(
          컬럼명1 자료형(크기) REFERCENCES 테이블명2(컬럼명),
          컬럼명2 자료형(크기),
          ...
          ON DELETE CASCADE
          [ON DELETE SET NULL]
        );
        ```
      - CHECK
        - 해당 컬럼에 입력되거나 수정되는 값을 체크하여, 설정된 값 이외의 값이면 에러 발생
        - 비교 연산자를 이용하여 설정하며 비교값은 리터럴만 사용 가능
        - 사용법
        ```
        CREATE TABLE 테이블명(
          컬럼명1 자료형(크기) CHECK (컬럼명1 IN (필드1, 필드2...)
          ...
        );
        ```
      - 제약조건 확인
      ```
      SELECT 
      UC.CONSTRAINT_NAME, -- 제약조건 이름
      UC.CONSTRAINT_TYPE, -- 제약조건 타입
      UC.TABLE_NAME,      -- 테이블 이름
      UCC.COLUMN_NAME,    -- 컬럼 이름
      UC.SEARCH_CONDITION -- 제약조건 설명
      FROM USER_CONSTRAINTS UC
      JOIN USER_CONS_COLUMNS UCC
      ON (UC.CONSTRAINT_NAME = UCC.CONSTRAINT_NAME)
      WHERE UC.TABLE_NAME = 테이블명; -- 테이블명은 반드시 대문자
      
      - CONSTRAINT_TYPE
        1. C : CHECK OR NOT NULL
        2. P : PRIMARY KEY
        3. R : FROEIGN KEY
        4. U : UNIQUE
      ```
    - 테이블 카피
      - 사용법
      ```
      CREATE TABLE 테이블명
      AS
      SELECT 컬럼명1, 컬럼명2... FROM 테이블명2 WHERE 조건문
      
      - SELECT문 결과 그대로를 복사한다.
      ```

### 2.24 24일차(2020-03-11)
- ALTER
  - 컬럼 추가
  ```
  ALTER TABLE 테이블명
  ADD (컬럼명1, 자료형(크기) [DEFAULT 초기값])
  ADD (컬럼명2, 자료형(크기) [DEFAULT 초기값]);
  
  ALTER TABLE DEPT_COPY
  ADD (KNAME VARCHAR2(20));
  
  - 컬럼을 추가할 때 DEFAULT를 추가하지 않으면 모두 NULL로 초기화된다.
  ```
  - 컬럼 수정
  ```
  ALTER TABLE 테이블명
  MODIFY (컬럼명1, 자료형(크기) [DEFAULT 초기값])
  MODIFY (컬럼명2, 자료형(크기) [DEFAULT 초기값])
  ...;
  
  ALTER TABLE DEPT_COPY
  MODIFY DEPT_ID CHAR(3)
  MODIFY DEPT_TITLE VARCHAR2(40);
  ```
  - 제약조건 추가
  ```
  ALTER TABLE 테이블명
  ADD CONSTRAINT 제약조건 이름1 제약조건(컬럼명1)
  ADD CONSTRAINT 제약조건 이름2 제약조건(컬럼명2)
  ...
  MODIFY 컬럼명 제약조건 제약조건 이름 3 NOT NULL;
  
  ALTER TABLE DEPT_COPY
  ADD CONSTRAINT DCOPY_ID_PK PRIMARY KEY(DEPT_ID)
  ADD CONSTRAINT DCOPY_TITLE_UNQ UNIQUE(DEPT_TITLE)
  MODIFY HNAME CONSTRAINT DCOPY_HNAME_NN NOT NULL;
  
  - NOT NULL의 경우는 다른 제약조건과는 다르게 ADD COSNTRAINT가 아닌 MODIFY로 해야 한다.
  - NOT NULL 제약조건을 추가할 때 만약 해당 필드에 이미 NULL이 있다면 제약조건이 추가되지 않는다.
  ```
  - 컬럼 삭제
  ```
  ALTER TABLE 테이블명
  DROP COLUMN 컬럼;
  
  ALTER TABLE DEPT_COPY
  DROP COLUMN KNAME;
  
  - 만약 해당 컬럼이 외래키로 참조가 된 상태면 삭제가 불가능하다.
  ```
  - 제약조건 삭제
  ```
  ALTER TABLE 테이블명
  DROP CONSTRAINT 제약조건 이름1
  DROP CONSTRAINT 제약조건 이름2
  ...
  MODIFY 컬럼명 NULL;
  
  ALTER TABLE DEPT_COPY
  DROP CONSTRAINT DCOPY_ID_PK
  DROP CONSTRAINT DCOPY_TITLE_UNQ
  MODIFY HNAME NULL;
  
  - NOT NULL에 해당하는 제약조건은 삭제 또한 MODIFY로 해야 한다.
  ```
  - 컬럼 이름 변경
  ```
  ALTER TABLE 테이블명
  RENAME COLUMN 기존 컬럼명 TO 수정 컬럼명;
  
  ALTER TABLE DEPT_COPY
  RENAME COLUMN HNAME TO KHNAME;
  ```
  - 제약조건 이름 변경
  ```
  ALTER TABLE 테이블명
  RENAME CONSTRAINT 기존 제약조건명 TO 수정 제약조건명;
  
  ALTER TABLE DEPT_COPY
  RENAME CONSTRAINT SYS_C007059 TO DCOPY_ID_NN;
  ```
  - 테이블 이름 변경
  ```
  ALTER TABLE 테이블명
  RENAME TO 수정할 테이블명;
  
  ALTER TABLE DEPT_COPY
  RENAME TO ALTER_TEST;
  ```
- DROP
  - DDL의 한 종류로 CREATE로 정의 된 객체를 삭제할 때 사용
  - 사용법
  ```
  DROP 객체타입 객체명 [CASCADE CONSTRAINT];
  
  DROP USER ddlexam;
  DROP TABLE ALTER_TEST;
  
  - 만약 삭제하려는 테이블을 참조하는 테이블이 존재한다면 삭제 불가능
  - 해당 테이블을 삭제하기 위해서는 CASCADE CONSTRAINT를 추가하여 강제 삭제를 진행한다.
  - 계정 삭제의 경우 해당 계정에 테이블이 남아 있다면 삭제 불가능
  ```
- DML
  - 데이터 조작 언어
  - 테이블에 값을 삽입, 수정, 삭제하는 역할
  - INSERT(삽입), UPDATE(수정), DELETE(삭제)
- INSERT
  - 테이블에 새로운 행을 추가하는 구문
  - 추가할 때마다 테이블 행 개수가 증가
  - 사용법
  ```
  - 선택적 입력
  
  INSERT INTO 테이블명(컬럼명1, 컬렴명2...) VALUES(값1, 값2...);
  
  - 값을 넣을 컬럼명을 입력하고 입력한 순서에 맞춰서 값을 입력
  - 명시한 컬럼에만 값이 들어가고 명시되지 않은 컬럼은 NULL
  --------------------------------------------------
  - 전체 입력
  
  INSERT INTO 테이블명 VALUES(값1, 값2...);
  
  - 테이블 생성시 만든 컬럼 순서대로 모든 값을 입력(NULL도 값으로 입력)
  - 컬럼 수와 입력한 값의 수가 맞지 않는 경우 에러 발생
  ```
  - INSERT시에 VALUES 대신 서브쿼리로 사용이 가능하다.  
  ex)
  ```
  INSERT INTO EMP_01(
    SELECT EMP_ID, EMP_NAME, DEPT_TITLE
    FROM EMPLOYEE
    LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
  );
  
  - 사원 번호, 사원 이름, 소속 부서를 서브쿼리로 다중으로 입력한다.
  ```
  - INSERT ALL
    - INSERT시 사용하는 서브쿼리의 테이블이 동일한 경우, 2개 이상의 테이블에 INSERT ALL을 이용하여 한 번에 삽입이 가능하다.
    - 단, 서브쿼리의 조건절이 같아야 한다.
    - 사용법
    ```
    INSERT ALL
    INTO 테이블명1 VALUES(컬럼명1, 컬럼명2...)
    INTO 테이블명2 VALUES(컬럼명3, 컬럼명4...)
    SELECT 컬럼명1, 컬럼명2, 컬럼명3, 컬럼명4
    FROM 테이블명3
    [WHERE 조건문]
    
    INSERT ALL
    WHEN 조건문1 THEN
    INTO 테이블명1 VALUES(컬럼명1, 컬럼명2...)
    WHEN 조건문2 THEN
    INTO 테이블명2 VALUES(컬럼명3, 컬럼명4...)
    SELECT 컬럼명1, 컬럼명2, 컬럼명3, 컬럼명4
    FROM 테이블명3
    [WHERE 조건문]
    ```
- UPDATE
  - 테이블에 기록된 컬럼의 값을 수정하는 구문
  - 테이블의 전체 행 개수 변화 없음
  - 사용법
  ```
  UPDATE 테이블명
  SET 수정할 컬럼 = 수정할 값
  [WHERE 조건문];
  
  - 조건문을 작성하지 않으면 모든 데이터를 일괄 변경한다.
  --------------------------------------------------
  - 서브쿼리를 이용한 UPDATE
  UPDATE 테이블명
  SET 
  컬럼명1 = 서브쿼리1
  컬럼명2 = 서브쿼리2
  [WHERE 조건문];
  ```
- MERGE
  - 구조가 같은 두 개의 테이블을 하나로 합치는 기능
  - 두 테이블에서 지정하는 조건의 값이 존재하면 UPDATE, 조건의 값이 없으면 INSERT가 된다.
  - 사용법
  ```
  MERGE INTO
  ```
- DELETE
  - 테이블의 행을 삭제하는 구문
  - 테이블의 전체 행 개수 감소
  - 사용법
  ```
  DELET FROM 테이블명
  [WHERE 조건문]
  
  - 조건문을 생략하는 경우 테이블 전체가 삭제된다.
  ```
  - DELETE의 경우 제약조건이 설정되어 있는 경우 삭제가 불가능하다.
  - 삭제를 하기 위해서는 ON DELETE CASCADE나 ON DELETE SET NULL을 설정하거나 제약조건을 비활성화 후 삭제가 가능하다.
  - 제약조건 비활성화
  ```
  ALTER TABLE 테이블명
  DISABLE CONSTRAINT 제약조건명 CASCADE;
  ```
  - 제약조건 활성화
  ```
  ALTER TABLE 테이블명
  ENABLE CONSTRAINT 제약조건명;
  ```
- ROLLBACK
  - 이전 상태로 복구한다.
  - 복구 시점은 마지막 COMMIT이 된 시점이다.
- SAVEPOINT
  - 임시 저장 지점을 만든다.
  - 사용법
  ```
  - SAVEPOINT 생성
  
  SAVEPOINT 세이브포인트명

  --------------------------------------------------
  - SAVEPOINT 사용
  
  ROLLBACK TO 
  ```
- TRUNCATE
  - DELETE보다 수행 속도가 빠르다.
  - ROLLBACK을 통한 복구가 불가능하다.
  - DDL이다. 
- TRANSACTION
  - 한꺼번에 수행되어야 할 최소의 작업단위
  - 하나의 트랜잭션으로 이루어진 작업들은 반드시 한꺼번에 완료가 되어야 하며, 그렇지 않은 경우 한꺼번에 취소 되어야 함
  - TRANSACTION - ATM 기기 업무처리
    1. 카드 삽입
    2. 메뉴 선택(인출)
    3. 금액 확인 및 인증
    4. 은행 계좌에서 금액만큼 인출
    5. 실제 현금 인출
    6. 완료
- TCL
  - 트랜잭션 제어 언어
  - 트랜잭션 작업을 적용, 취소할 때 사용하는 SQL
  - TCL 종류  
  
  | 구문 | 설명 |  
  | :-----: | :-----: |  
  | COMMIT | 트랜잭션 작업이 정상 완료되면 변경내용을 저장<br>-> 모든 SAVEPOINT 삭제 |  
  | ROLLBACK | 트랜잭션 작업을 모두 취소하고 최근 COMMIT 시점으로 이동 |  
  | SAVEPOINT | 현재 트랜잭션 작업 시점의 이름을 지정<br>하나의 트랜잭션 안에서 구역을 나눌 수 있음 |  
  | ROLLBACK TO | 트랜잭션 작업을 취소하고 SAVEPOINT 시점으로 이동 |  
  
### 2.25 25일차(2020-03-12)
- VEIW
  - SELECT 쿼리의 실행 결과를 화면에 저장한 논리적인 가상 테이블
  - 테이블과 다르게 실질적으로 데이터를 저장하고 있지 않지만, 사용자는 테이블을 사용하는 것과 동일하게 사용 가능
  - 물리적인 실제 테이블과의 링크 개념
  - 테이블 복사와의 큰 차이점은 VIEW에서 데이터 수정시 실제 테이블에 수정 데이터 반영(테이블 복사 시에는 원본 테이블에 영향 없음)
    - COPY인 경우 값의 테이블을 UPDATE를 하면 원본 테이블에 변화가 없음(VALUE)
    - VIEW인 경우 값의 뷰테이블을 IPDATE를 하면 원본 테이블도 변경이 됨(REFERENCE)
  - VIEW를 만들기 위해서는 추가적인 권한이 필요
  ```
  - 관리자 계정에서 권한 부여
  
  GRANT CREATE VIEW TO 사용자 계정;
  ```
  - 사용법
  ```
  CREATE VIEW 뷰이름
  AS
  SELECT문;
  ```
  - 다른 계정이 VIEW의 접근이 허용되게 할 수 있다.
  ```
  - 관리자 계정에서 권한 부여
  
  GRANT SELECT ON 계정명.뷰이름 TO 타계정명;
  ```
  - DML 명령어 조작이 불가능한 경우
    1. 뷰 정의에 포함되지 않은 컬럼을 조작하는 경우
    2. 뷰에 포함되지 않은 컬럼 중에 베이스가 되는 테이블 컬럼이 NOT NULL 제약조건이 지정된 경우 INSERT가 불가능
    3. 산술 표현식으로 정의된 경우
    4. JOIN을 이용해 여러 테이블을 연결한 경우
    5. DISTINCT를 포함한 경우
    6. 그룹함수나 GROUP BY 절을 포함한 경우
  - 옵션
    1. CREATE OR REPLACE : 생성한 뷰가 없으면 새로 생성하고, 이미 존재하면 갱신
    ```
    CREATE [OR REPLACE] 뷰이름
    AS
    SELECT문;
    ```
    2. FROCE/NOFOCE : FORCE 옵션은 기본 테이블이 존재하지 않더라도 뷰를 생성. 기본값은 NOFORCE로 지정.
    ```
    CREATE 뷰이름
    AS
    SELECT 컬럼명1, 컬럼명2... FORCE FROM 테이블명;
    
    - 테이블을 뷰 생성 이후 생성을 해도 가능하다.
    ```
    3. WITH CHECK OPTION : 옵션을 설정한 컬럼의 값은 수정 불가
    4. WITH READ ONLY : 뷰에 대해 조회만 가능하고 삽입, 수정, 삭제 등을 하지 못하게 함  
    ※ CHECK OPTION과 READONLY의 차이점은 해당 컬럼인지 뷰 전체인지의 차이
- SEQUENCE
  - 순차적으로 정수 값을 자동으로 생성하는 객체로, 자동 번호 발생기의 역할
  - SEQUENCE 생성
  ```
  CREATE SEQUENCE 시퀀스 이름
  ```
  - 옵션
    1. START WITH 숫자 : 처음 발생시킬 시작값(기본 1)
    2. INCREMENT BY 숫자 : 다음 값에 대한 증가치(기본 1)
    3. MAXVALUE 숫자/NOMAXVALUE : 최대값 지정
    4. MINVALUE 숫자/NOMINVALUE : 최소값 지정
    5. CYCLE/NOCYCLE : 시퀀스 최대값 도달 시 CYCLE은 START WITH 값으로 되돌아가고 NOCYCLE은 에러
    6. CAHCE/NOCACHE : 메모리상에서 시퀀스값 관리(기본 20)
  - SEQUENCE 사용법
  ```
  시퀀스명.CURRAVL
  - 시퀀스가 현재 몇번까지 됐는지 확인 가능하다.
  - CURRVAL은 NEXTVAL을 무조건 1번은 실행해야 한다.
  
  시퀀스명.NEXTVAL
  - 시퀀스의 다음 값으로 넘어간다.
  
  --------------------------------------------------
  INSERT INTO 테이블명 VALUES(
  시퀀스명.NEXTVAL, 값1, 값2...);
  
  - INSERT에 실패하더라도 시퀀스 값 자체는 바뀐다.
  ```
  - 시퀀스도 테이블과 마찬가지로 수정이 가능하다.
  ```
  ALTER SEQUENCE 시퀀스명
  옵션1
  옵션2
  
  - SEQUENCE 수정의 경우 초기값(START)은 수정이 불가능하다.
  ```
  - NEXTVAL, CURRAVL 사용 가능 경우
    1. 서브쿼리가 아닌 SELECT문
    2. INSERT문의 SELECT절
    3. INSERT문의 VALUE절
    4. UPDATE문의 SET절
  - NEXTVAL, CURRVAL 사용 불가능한 경우
    1. VIEW의 SELECT절
    2. DISTINCT 키워드가 있는 SELECT절
    3. GROUP BY, HAVING, ORDER BY 절이 있는 SELECT문
    4. SELECT, DELETE, UPDATE의 서브쿼리
    5. CREATE TABLE, ALTER TABLE의 DEFAULT값
- INDEX
  - SQL명령문의 처리 속도를 향상시키기 위해서 컬럼에 대해 생성하는 오라클 객체로 내부구조는 B-트리 형식으로 구성
  - INDEX 장점
    - 검색 속도가 빨라지고 시스템에 걸리는 부하를 줄여서 시스템 전체 성능 향상
  - INDEX 단점
    - 인덱스를 위한 추가 저장공간 필요
    - 인덱스 생성 시간 필요
    - 데이터 변경작업(INSERT, UPDATE, DELETE)이 자주 일어나는 경우 오히려 성능 저하 발생
  - INDEX 효율적인 사용 예
    - 전체 데이터중 10~15% 이내의 데이터를 검색하는 경우
    - 두 개이상의 컬럼이 WHERE절이나 JOIN 조건으로 자주 사용되는 경우
    - 한 번 입력된 데이터의 변경이 자주 일어나지 않는 경우
    - 한 테이블에 저장된 데이터의 용량이 매우 클 경우
  - INDEX 생성
  ```
  CREATE INDEX 인덱스명 ON 테이블명
  (컬럼명1, 컬럼명2, 컬럼명3...);
  ```
- SYNONYM
  - 사용자가 다른 사용자의 객체를 참조할 때 [사용자ID].[테이블명]으로 표기
  - 길게 표현되는 것을 동의어(SYNONYM)으로 설정하고 간단하게 사용 가능
  - 동의어 종류
    1. 비공개 동의어
        - 객체에 대한 접근 권한을 부여받은 사용자가 정의한 동의어
        - 해당 사용자만 사용할 수 있음
        ```
        - 사용자 계정에서 생성
        
        CREATE SYNONYM 동의어 FOR 테이블명;
        ```
    2. 공개 동의어
        - 권한을 주는 사용자(DBA)가 정한 동의어
        - 모든 사용자가 사용할 수 있음
        ```
        - 관리자 계정에서 생성
        
        CREATE PUBLIC SYNONYM 동의어 FOR 테이블명;
        ```
  - SYNONYM을 사용하기 위해서는 관리자 계정에서 권한을 부여해야 함.
  ```
  GRANT CREATE SYNONYM TO 사용자 계정;
  ```
- PL/SQL
  - Procedural Language extension to SQL의 약자
  - 오라클 자체에 내장되어 있는 절차적 언어
  - SQL의 단점을 보완하여 SQL 문장 내에서 변수의 정의, 조건처리, 반복처리 등을 지원
  - 사용법
  ```
  - PL/SQL을 이용한 출력문을 출력하기 위한 설정이 필요함
  SET SERVEROUTPUT ON;
  
  - PL/SQL문
  DECLARE         - 선언부는 선택사항,
    [선언부]       - 변수나 상수를 선언
  BEGIN           - 
    [실행부]       - 
  EXCEPTION       - 
    [예외처리부]   -
  END;
  /
  
  - ORACLE에서는 데이터를 삽입할 때 ':='을 사용한다.
  
  MSG := 'TEST';
  
  - 출력문 사용하는 함수
  DBMS_OUTPUT.PUT_LINE(문자열);
  
  - 키보드로 입력을 하기 위해서는 '&'를 사용한다.
  - &뒤에 온 단어가 입력창에 출력된다.
  
  MSG := '&입력';
  
  - 내부 주석이 제대로 작동을 안함.
  - SELECT문으로 DB에서 읽어올 수 있음
  
  DECLARE
    변수1 타입;
    변수2 타입;
  BEGIN
    SELECT 컬럼1, 컬럼2
    INTO 변수1, 변수2
    FROM 테이블명
    WHERE 조건문;
  ...
  END;
  /
  ```
  - PLSQL 변수의 종류
    1. 일반(스칼라) 변수 : 기존 SQL 자료형과 유사값을 대입(:=)하고 변경하여 사용이 가능
    2. 상수 : 일반변수와 유사하나 CONSTANT 키워드가 자료형 앞에 붙고 선언시 값을 할당해주어야 하며 변경불가
    ```
    DECLARE
      변수 CONSTANT 타입 := 값;
    ...
    END;
    /
    
    - 상수는 DECLARE에서 초기화를 해야 한다.
    - 초기화된 이후에는 변경 불가
    ```
    3. %TYPE : 이전에 선언 된 다른 변수 또는 테이블의 컬럼 자료형에 맞추어
    ```
    DECLARE
      변수 테이블명.컬럼명%TYPE
    ...
    END;
    /
    ```
    4. %ROWTYPE : %TYPE과 유사하게 참조할 테이블의 컬럼데이터 타입을 자동으로 가져오나 1개의 컬럼이 아니라 여러개의 컬럼 값을 자동으로 가져옴
    ```
    DECLARE
      변수 테이블명%ROWTYPE
    ...
    END;
    /
    
    - 참조는 변수.컬럼명으로 참조가 가능하다.
    ```
    5. RECORD : %ROWTYPE이 참조할 테이블의 컬럼 데이터 타입을 자동으로 가져오는 반면 레코드는 직접적으로 컬럼타입 지정
    ```
    DECRALE
      TYPE 레코드타입명 IS RECORD(
        변수명1 타입1,
        변수명2 타입2,
        ...
      )
      레코드변수명 레코드타입명;
    BEGIN
      SELECT 컬럼1, 컬럼2...
      INTO 레코드변수명
      ...
      DBMS_OUTPUT.PUTLINE(레코드변수명.변수명1);
    ...
    END;
    /
    
    - SELECT하는 컬럼의 개수와 레코드 타입의 변수 개수가 같은 경우 INTO를 레코드변수만으로 가능하다.
    ```
- PL/SQL 선택문
  - PL/SQL의 모든 문장들은 기술한 순서대로 순차적으로 수행
  - 문장을 선택적으로 수행하려면 선택문을 사용
  - 종류
    1. IF ~ THEN ~ END IF문(JAVA의 if문)
    ```
    DECLARE
      ...
    BEGIN
    
      ...
      
      IF (조건문) THEN ...
      END IF;
      
      ...
      
    END;
    /
    ```
    2. IF ~ THEN ~ ELSE ~ END IF문(JAVA의 if~else문)
    ```
    DECLARE
      ...
    BEGIN
    
      ...
      
      IF (조건문) THEN ...
      ELSE ...
      END IF;
      
      ...
      
    END;
    /
    ```
    3. IF ~ THEN ~ ELSIF ~ ELSE ~ END IF문(JAVA의 if~else if문)
    ```
    DECLARE
      ...
    BEGIN
    
      ...
      
      IF (조건문1) THEN ...
      ELSIF (조건문2) THEN ...
      ELSIF (조건문3) THEN ...
      ...
      ELSE ...
      END IF;
      
      ...
      
    END;
    /
    ```
    4. CASE
    - JAVA의 switch문(JAVA의 switch)
    ```
    DECLARE
      ...
    BEGIN
    
      ...
      
      CASE 변수
        WHEN 값1 THEN ...;
        WHEN 값2 THEN ...;
        WHEN 값3 THEN ...;
        ...
        ELSE ...;
      END CASE;
      
      ...
      
    END;
    /
    ```
### 2.26 26일차(2020-03-13)
- 반복문
  - BASIC LOOP
    - 조건 없이 무한 반복
    - EXIT문으로 빠져 나온다.
    ```
    DECLARE
      ...
    BEGIN
      ...
      
      LOOP
        루프문;
        IF 조건문 
          THEN EXIT;
        END IF;
      END LOOP;
      
      ...
    END;
    /
    ```
  - FOR LOOP
    - 변수를 DECLARE 안에서 선언을 하지 않아도 된다.
    - 반복문에서 선언된 변수는 자동으로 증가
    ```
    DECLARE
      ...
    BEGIN
      ...
      
      FOR 변수 IN [REVERSE] 범위 LOOP
        루프문;
      END LOOP;
      
      ...
    END;
    /
    
    - REVERSE가 있으면 범위를 반대로 진행한다.
    ```
  - WHILE
    - JAVA와 마찬가지로 조건이 TRUE이면 반복
    ```
    DECLARE
      ...
    BEGIN
      ...
    
      WHILE 조건문 LOOP
        루프문;
      END LOOP;
    END;
    /
    ```
- PL/SQL의 예외처리
  - JAVA의 예외처리와 동일하게 예외상황에 대한 처리
  - 예외의 이름을 아는 경우와 모르는 경우에 대하여 사용 방법이 다름
  - 사용법
  ```
  - 예외 종류를 알 때
  
  DECLARE
    ...
  BEGIN
    ...
  EXCEPTION
    WHEN 예외종류
    THEN 예외처리
  END;
  /
  
  --------------------------------------------------
  - 예외 종류를 모를 때
  
  DECLARE
    ...
  BEGIN
    ...
  EXCEPTION
    WHEN NO_DATA
    THEN 예외처리
  END;
  /
  ```
- TRIGGER
  - 데이터베이스가 미리 정해놓은 조건을 만족하거나 어떠한 동작이 수행되면 자동적으로 수행되는 행동
  - 트리거는 테이블이나 뷰가 INSERT, UPDATE, DELETE 등의 DML문에 의해 데이터가 입력, 수정, 삭제 될 경우 자동으로 실행
  - 사용법
  ```
  CREATE [OR REPLACE] TRIGGER 트리거명
  (AFTER/BEFORE) 동작시점
  ON 트리거와 엮이는 테이블명
  [FOR EACH ROW]
  BEGIN
    [INSERT INTO 테이블명 VALUES(
      :OLD.컬럼명1, :OLD.컬럼명2...
    );]
  END;
  /
  
  - 트리거 동작 시점 : INSERT, UPDATE, DELETE
  - ':OLD.'를 통해 삭제되는 테이블의 정보 혹은 갱신되기 전 테이블의 정보를 가리킨다.
  - ':NEW.'를 통해 삽입혹은 갱신되는 테이블의 정보를 가져올 수 있다.
  - ':OLD.', ':NEW.'를 사용하면 FOR EACH ROW가 필수
  - FOR EACH ROW : TRIGGER를 여러번(행단위로) 동작하게 하는 옵션
  ```
  
### 2.27 27일차(2020-03-16)
- 데이터 딕셔너리
  - 자원을 효율적으로 관리하기 위한 다양한 정보를 저장하는 시스템 테이블
  - 사용자가 테이블을 생성하거나 사용자 변경 등의 작업을 할 때 마다 데이터베이스 서버에 의해 자동으로 갱신되는 테이블
  - 서버가 자동으로 동작하기에 직접적으로 해당 데이터를 변경하는 것은 매우 위험하다.
  - 그렇기에 직접적인 변경이 아닌 VIEW를 이용하여 관리를 한다.
  - 종류
    1. DBA_XXXXX : 데이터베이스 관리자만 접근이 가능한 객체 등의 정보를 조회
    2. ALL_XXXXX : 자신의 계정이 소유하거나 권한을 부여받은 객체 등에 관한 정보 조회
    3. USER_XXXXX : 자신의 계정이 소유한 객체 등에 관한 정보 조회
        - USER_TABLES : 자신의 계정이 소유한 테이블들 목록
        - USER_VIEWS : 자신의 계정이 소유한 뷰들 목록
        - USER_SEQUENCES : 자신의 계정이 소유한 시퀀스들 목록
        - USER_CONS_COLUMNS : 자신의 계정이 소유한 컬럼들의 제약조건들 목록
        - USER_CONSTRAINTS : 자신의 계정이 소유한 제약조건들의 타입 목록
        - USER_COL_COMMENTS : 자신의 계정이 소유한 컬럼에 달린 코멘트 목록
        
### 2.28 28일차(2020-03-17)
- JDBC(Java DataBase Connectivity)
  - 자바 언어에서 DB에 접근할 수 있게 해주는 Programming API
  - Java에서 DBMS 연동에 필요한 메소드를 Connection 인터페이스로 제공
  - 각 DBMS 제조사별 구현하여(jar파일) DBMS 접속
  - java.sql 패키지에서 관리
- ojdbc
  - 오라클에서 제공하는 오라클 DBMS와 자바를 연결하기 위한 라이브러리
  - ojdbc 사용하기 위한 사전 작업
    1. C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib 폴더 밑에 ojdbc6 파일 복사
    2. C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext 폴더 밑에 붙여넣기
    3. 이클립스 셋팅 : 문자 set 인코딩
        - 기존 Java : 유니코드, Oracle : UTF-8
        - 프로젝트 생성 -> Properties -> Java Build Path -> Libraries -> Add External JARs -> 위의 경로 따라가 ojdbc6 선택
        - Referenced Libraries에 ojdbc6 추가 확인
        - Windows -> Preferences
          1. General -> Workspace -> Text file Encoding -> Other -> UTF-8
          2. General -> Editors -> Text Editors -> Spelling -> Encoding -> Other -> UTF-8
          3. JSON -> JSON Files -> Encoding -> UTF-8
          4. Web -> CSS Files -> Encoding -> UTF-8
          5. Web -> HTML Files -> Encoding -> UTF-8
          6. Web -> JSP Files -> Encoding -> UTF-8
- JDBC
  - 종류
    1. DriverManager
        - 데이터 원본에 JDBC 드라이버를 통하여 커넥션을 만드는 역할
        - Class.forName() 메소드를 통해 생성되며, 반드시 예외처리를 해야 함
        - 직접 객체 생성이 불가능하고, getConnection() 메소드로 객체 생성
    2. Connecttion
        - 특정 데이터 원본과 연결된 커넥션
        - Statement 객체를 생성할 때도 Connection 객체를 이용해야 함
        - SQL 문장을 실행시키기 전 우선 Connection 객체가 필요
    3. Statement
        - Connection 객체에 의해 프로그램에 리턴되는 객체에 의해 구현되는 일종의 메소드 집합
        - Connection 클래스의 createStatement() 메소드를 호출하여 객체 생성
        - Statement 객체로 SQL문을 String 객체에 담아 인자로 전달하여 질의를 수행
    4. PreferenceStatement
        - Statement 클래스를 상속하여 만들어진 클래스로 기본적인 수행역할은 동일
        - SQL 문장이 미리 컴파일 되고, 실행시간동안 인수값을 위한 공간을 확보할 수 있다는 점에서 Statement와 다름
        - 각각의 인수에 대해 위치홀더를 사용하여 SQL문장을 정의할 수 있음
        - Connection 클래스의 preparedStatement() 메소드를 호출하여 객체 생성
    5. ResultSet
        - SELECT문을 사용한 질의 성공시 반환되는 객체
        - ResultSet은 SQL 질의에 의해 생성된 결과를 담고 있으며 '커서(cursor)'를 이용하여 특정 행에 대한 참조를 조작
  - 사용법
    1. 드라이버 등록
    ```
    Class.forName("oracle.jdbc.driver.OracleDriver");
    
    - 예외처리가 필요하다.
    - ClassNotFoundException
    ```
    2. Connection 객체 생성
    ```
    Connection conn = DriverManager.getConnection("DB주소", "DB 계정명", "DB 패스워드");
    
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "kh", "kh");
    conn.setAutoCommit(false);
    
    - 예외처리가 필요하다.
    - SQLException
    - 1521은 ORALE의 기본 포트번호
    - setAutoCommit(false)를 하면 오토 Commit을 해제한다.
    - false로 하지 않으면 자동으로 Commit이 됨.
    ```
    3. Statemnt 객체 생성
    ```
    Statement stmt = conn.createStatement;
    ```
    4. 쿼리문 요청 후 결과 받기
    ```
    - SELECT의 경우
    
    String query = "select * from employee";
    ResultSet rset = stmt.executeQuery(query);
    --------------------------------------------------
    - INSERT, DELETE, UPDATE의 경우
    
    String query = "delete from employee where emp_name = '" + fireName + "'";
    int result = stmt.executUpdate(query);
    
    - DB에서 사용할 때와는 다르게 ;을 입력하지 않는다.
    - SELECT문에서 사용하는 메소드는 executeQuery이다. 리턴 타입은 ResultSet
    - INSERT, DELETE, UPDATE의 경우 삽입, 갱신, 삭제된 행의 개수를 리턴한다.
    ```
    5. 결과처리
    ```
    - SELECT의 경우
    
    while(rset.next()) {
      String name = rset.getString(2);
      int salary = rset.getInt("salary");
      System.out.println(name + " : " + salary);
    }
    
    --------------------------------------------------
    - INSERT, DELETE, UPDATE의 경우
    
    if (result > 0) {
      conn.commit();
      System.out.println("삭제완료");
    } else {
      conn.rollback();
      System.out.println("삭제실패");
    }
    
    - 숫자를 입력하면 해당 숫자번째 컬럼을 가져온다.
    - 쿼리문에서 별칭(as)으로 했다면 꺼내올 때도 별칭으로 가져와야 한다.
    - INSERT, DELETE, UPDATE의 경우 삭제 쿼리 요청 후 ROLLBACK과 COMMIT을 해야 한다.
    - 처리가 제대로 된 경우 Connection 객체에서 commit() 메소드를 호출
    - 처리가 잘못된 경우 Connection 객체에서 rollback() 메소드를 호출
    ```
    6. 자원 반환
    ```
    rset.close();
    stmt.close();
    conn.close();
    
    - 반환은 객체 생성 순서의 반대로 반환한다.
    - ResultSet -> Statement -> Connection
    ```
  - DB에서 Date를 가져올 때는 java.sql 밑에 있는 Date 타입을 가져온다.
  ```
  import java.sql.Date;
  
  Date enrollDate = rset.getDate("enroll_date");
  ```

### 2.29 29일차(2020-03-18)
- Statment
  - 캐시를 사용하지 않음
    1. select * from member where member_id = 'user01'
    2. select * from member where member_id = 'user02'  
    => 구문의 검사를 하기에 검색 시간이 걸림
  - 보안성이 낮다
    - member_id로 ' or '1' = '1'이 들어오면 무조건 true가 되기에 보안성이 낮다.
- PreparedStatement
  - 캐시를 사용한다.
    1. select * from member where member_id = ?를 먼저 검사를 한다.
    2. user01을 검색한다.
    3. 검사를 하지 않고 user02를 바로 검색한다.
    => 캐시를 하기에 검사를 안하고 바로 검색하기에 빠르게 검색이 가능하다.
  - 보안성이 뛰어나다
    - member_id로 무조건 값이 들어와야 하기에 ' or '1' = '1'은 잘못된 정보라 판단하고 막는다.
  - 사용법
  ```
  String query = "update member set member_pw = ?, phone = ?, hobby = ? where member_id = ?";
  
  //1. 드라이버 등록
  //2. Connection 객체 생성
  //3. PreparedStatement 객체 생성
  pstmt = conn.prepareStatement(query);
  
  //위치홀더에 값을 대입하여 쿼리문 완성
  pstmt.setString(1, m.getMemberPw());
  pstmt.setString(2, m.getPhone());
  pstmt.setString(3, m.getHobby());
  pstmt.setStrign(4, m.getMemberId());
  
  //4. 쿼리문 실행 후 결과를 받는다.
  result = pstmt.executeUpdate();
  
  //5. 결과 처리
  //6. 자원 반환
  
  - 값을 넣을 자리에 직접 값을 넣는 것이 아닌 ?를 넣는다.
  - ?를 컬럼 자리에 넣지 못한다.
  ```
- MVC 패턴
  - Model
    - 데이터 형태(Member.java) : VO(Value Object)
    - DAO(Data Access Object)
  - View
    - 사용자 화면
  - Controller
    - 데이터 처리
    
### 2.30 30일차(2020-03-19)
- 싱글톤(SingleTon) 패턴
  - 클래스에 대한 객체가 프로그램 구동 내내 한개만 작성되어 사용되게 하는 디자인 패턴
  - static을 이용하여 유일하게 만든다.
  - 사용법
  ```
  public class 클래스명 {
    public static Connection 함수명() {
    
      Connection conn = null;
      
      try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
			
        conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "jdbc", "1234");
			
        conn.setAutoCommit(false);
			
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (SQLException e) {
        e.printStackTrace();
      }
		
      return conn;
    }
    ...
  }
  ```

### 2.31 31일차(2020-03-20)

### 2.32 32일차(2020-03-23)
- 데이터 모델링 정의
  - 정보 구조의 실체(Entity)와 관계(Realtion)를 중심으로 명확하고 체계적으로 표현하여 문서화 하는 기법
  - ERD(Entity Relation Diagram)
    - 논리 데이터 모델링에서 제1정규화로 이루어지는 3가지
      1. 반복되는 속성이나 Group 속성 제거
      2. 새로운 실체와 1: N관계가 이루어짐
      3. 모든 속성은 반드시 하나의 값을 가져야함(원자성)
- 화면구현
  - 종류
    1. HTML5
    2. CSS
    3. JavaScript
    4. jQuery
- HTML5
  - 인터넷(Internet)
    - 전 세계의 커퓨터들이 네트워크를 통해 연결되어 정보를 공유하는데 목적을 두며, 푸로토콜을 이용하여 통신한다.
    - 초기에는 군사용과 민간용으로 구분되었고, 민간용이 지금의 인터넷
  - Web
    - 인터넷에 연결된 컴퓨터를 통해 사람들이 정보를 공유할 수 있는 공간으로 인터넷의 통신망 위에서 작동하는 서비스
  - Web Version
    - Web 1.0
      1. 정적인 검색 서비스 제공(초기 서비스 버전)
      2. 동적인 검색 서비스 제공(현재 가장 많이 사용되는 버전) -> 동적인 검색 및 사용자의 참여, 공유, 개방
    - Web 2.0
      - 지능형 웹서비스
        1. 사용자의 패턴을 분석하여 개인별 맞춤 정보 검색 서비스 제공
        2. youtube, facebook, Instagram 등등
  - Web 처리 과정
    1. Client가 브라우저에 www.google.com을 입력
    2. www.google.com의 IP 주소를 DNS에 질의
    3. DNS는 www.google.com을 IP로 변경
- HTML(Hyper Text Markup Language)
  - 웹에서 정보를 표현할 목적으로 만든 마크업 언어
  - Hyper Text : Hyper Link를 통해 구성된 다른 정보로 쉽게 연결시켜주는 구조화된 문서
  - Markup Text : 태그 등을 이용하여
  - HTML5의 특징
    1. 구조적 설계 지원(시멘틱 태그)
        - tlapsxlr : 이름만 보고도 역할을 짐작할 수 있는 것
    2. 그래픽 및 멀티미디어 기능 강화
    3. CSS3/JavaScript 지원
    4. 다양한 API 제공
    5. 모바일 웹 지원/장치 접근 가능(배터리 정보, 카메라, GPS 등)
    6. 인터넷이 연결되지 않은 상태에서도 애플리케이션 동작
  - HTML의 구성 요서
  
  | 구성 요소 | 설명 |  
  | :-----: | :-----: |  
  | 태그(tag) | '<'와 '>'로 묶인 명령어<br>시작 태그(<태그>)와 종료태그(</태그>)가 한쌍으로 이용 |  
  | 요소(Element) | 시작태그와 종료태그로 이루어진 모든 명령어<br>하나의 HTML문서는 요소들의 집합 |  
  | 속성(Attribute) | 요소의 시작태그에만 사용/명령어 구체화 역할<br>여러개의 속성을 사용할 수 있으며 공백으로 구분 |  
  | 속성 값 | 속성이 가지는 값, 입력 시 "" 또는 ''를 이용 |  
  | 내부문자 | 태그와 속성을 이용하여 표현할 문자 |  
  
  - HTML 주의사항
    1. 태그는 대소문자를 구분하지 않음(소문자 권장)
    2. 시작태그로 시작하면 반드시 종료태그로 종료 -> 종료태그가 없는 일부 태그를 제외하고는 반드시 종료해야 함
    3. 파일 확장자는 반드시 html, htm으로 설정
    4. 문자의 공백은 한 개만 인식 -> 공백을 추가로 더 주기 위해서는 특수기호를 사용해야 한다(&nsbp;)
- HTML 태그
  - meta
    - 헤더 내부에 사용하는 태그로 메타 데이터로 html문서가 가지고 있는 유용한 
    ```
    <meta ~>
    ```
  - title
    - 페이지의 제목을 나타내는 태그
    ```
    <title> 타이틀 내용 </title>
    ```
  - script
    - sda
    ```
    <script> 스크립트 내용 <script>
    ```
  - link
    - 문서를 외부 문서와 연결하기 위해 사용
    - CSS 파일이나 웹 폰트 사용할 때 주로 연결
    ```
    <link rel = "관련속성"/>
    ```
  - base
    - 페이지의 링크가 상대 경로로 되었을 때 그 기준이 될 경로를 지정
    - 링크를 어떻게 오픈할 것인지 결정
    ```
    <base href ="경로" [target = "키워드"]>
    ```
- 글자 태그
  - h 태그
    - 제목을 입력할 때 사용하는 태그, 폰트의 크기가 태그에 따라 정해져 있음
    - h태그 뒤 숫자로 크기 구분
    ```
    <h?> 제목 내용 </h?>
    
    - ? 위치에 숫자가 온다.
    ```
  - 개행
    - 문장의 줄 바꾸기(개행) 할 때 사용
    ```
    <br>
    ```
    - 페이지에서 가로로 밑줄을 만들 때 사용
    ```
    <hr>
    ```
  - p 태그
    - 한개의 단락을 만들 때 사용
    - 자동으로 문장 개행 후 한줄 공백을 만듬
    ```
    <p> 내용 </p>
    ```
  - pre 태그
    - 입력한 그대로 출력할 때 사용
    - 띄어쓰기, 들여쓰기, 줄 바꿈이 입력된 그대로 출력
    ```
    <pre> 내용 </pre>
    ```
  - strong 태그, b 태그
    - 문장에서 문자를 강조하여 굵게 표시할 경우 사용
    ```
    <string> 강조구문 </strong>
    <b> 강조구문 </b>
    ```
  - em 태그, i 태그
    - 문장에서 문자에 기울임을 주는 태그
    ```
    <em> 강조구문 </em>
    <i> 강조구문 </i>
    ```
  - blockquote 태그
    - 다른 블로그나 사이트 글을 인용할 경우 사용
    - 자동 들여쓰기가 되어 다른 텍스트와 구별 가능
    ```
    <blokqoute> 인용문구 </blockqoute>
    ```
  - q 태그
    - 기본적으로 blockquote와 동일
    - 인용 문구에 ""를 표시
    ```
    <q> 인용문구 </q>
    ```
  - mark 태그
    - 배경부분이 노란색이 되며 형광펜 표시가 된듯하게 출력
    ```
    <mark> 강조구문 </mark>
    ```
- 목록 태그
  - ul 태그
    - 순서가 필요하지 않은 목록을 만들 때 사용
    - 리스트 앞에 특정 모양이 출력(기본 모양 : ·)
    - 모양은 CSS를 이용하여 수정 가능
    ```
    <ul>
      <li>내용1</li>
      <li>내용2</li>
      <li>내용3</li>
    </ul>
    ```
  - ol 태그
    - 순서가 있는 목록을 만들 때 사용
    - 속성으로 문자, 숫자, 로마자, 설정이 가능
    - CSS로 순서를 설정 가능
    ```
    <ol type = "문자지정" start = "순서지정">
      <li>내용1</li>
      <li>내용2</li>
      <li>내용3</li>
    </ol>
    ```
  - dl 태그
    - 용어나 문장에 대한 정의(definition) 리스트
    - 자동으로 들여쓰기
    ```
    <dl>
      <dt>정의 제목</dt>
      <dd>정의 내용</dd>
      <dd>정의 내용</dd>
    </
    ```
- 테이블 그리기
  - 웹 문서에서 자료를 정리할 때 자주 사용
  - 행과 열로 이루어져 있고, 행과 열이 만나는 지점을 셀이라고 함
  ```
  <table>
    <tr>
    </tr>
    
    <tr>
      <td> 내용 <td>
      <td> 내용 <td>
      ...
    </tr>
    
    <tr>
      <td> 내용 <td>
      <td> 내용 <td>
      ...
    </tr>
    
    ...
  </table>
  
  - 열에 대한 제목을 표시하는 태그로 <th></th>로 표시 가능하다.
  - 테이블에 대한 이름을 표시하기 위해 <caption></catpion>으로 표현한다.
  ```
  
  | 속성 | 설명 |  
  | :-----: | :-----: |  
  | border | table 태그의 속성으로 표의 테두리 두께를 지정 |  
  | rowspan | td 태그의 속성으로 지정한 행만큼 행을 병합 |  
  | colspan | td 태그의 속성으로 지정한 열만큼 열 병합 |  
  
  ```
  <table border="두께">
    <tr>
      <td colspan = '2'> 내용 </td>
    </tr>
    
    <tr>
      <td> 내용1 </td>
      <td> 내용2 </td>
    </tr>
    
    <tr>
      <td> 내용3 </td>
      <td> 내용4 </td>
    </tr>
  </table>
  
  - column을 2개 합쳐 표현
  ```
  
  ```
  <table>
    <tr>
      <td rowspan = '2'> 내용 </td>
    </tr>
    
    <tr>
      <td> 내용1 </td>
      <td> 내용2 </td>
    </tr>
    
    <tr>
      <td> 내용3 </td>
      <td> 내용4 </td>
    </tr>
  </table>
  
  - row를 2개 합쳐 표현
  ```
  - 테이블의 내용이 길어지면 자동으로 테이블의 크기가 커진다.
  - width와 height를 사용하면 테이블의 크기를 고정시킬 수 있다.
  ```
  <table>
    <tr>
    </tr>
    
    <tr>
      <td width = "100px" height = "30px"> 내용 <td>
      <td> 내용 <td>
      ...
    </tr>
    ...
  </table>
  ```
  
### 2.33 33일차(2020-03-24)
- 영역분할 태그
  - iframe 태그
    - 웹 문서 안에 다른 웹페이지를 추가하는 태그
    ```
    <iframe width = "길이" height = "높이 src = "주소" [seamless]></iframe>
    
    - seamless를 넣으면 윤곽선이 사라진다
    ```
  - 블록요소
    - 한 줄 전체를 차지하는 요소로 한 줄에 여러 요소가 올 수 없음
    - 기본적으로 가로폭 전체의 넓이를 가지는 직사각형 형태의 요소
    - 자동으로 줄이 개행 되며 크기 조절이 가능
    - 블록요소는 모든 인라인 요소를 포함할 수 있고 다른 블록 요소도 포함이 가능
    - 제목태그(h1~h6), 목록 태그, 테이블 태그, body 태그 등
  - 인라인요소
    - 내부의 컨텐츠가 끝나는 지점까지를 넓이로 가지게 되며, 한 줄에 여러 요소가 올 수 있음
    - 자동으로 줄이 개행되지 않으며, 한줄에 여러 요소가 오기 때문에 크기 조절이 불가능
    - 반드시 블록요소 안에 포함되어 있음
    - 글자 형식 태그 등
  - div 태그
    - block 형식의 공간을 분할(수직으로 공간 분할)
    ```
    <div>
      ...
    </div>
    ```
  - span 태그
    - inline 형식의 공간을 분할(수평으로 공간 분할)
    ```
    <span>
    ...
    </span>
    ```
  - html4 페이지 구조
    - div, span 태그를 이용하여 구역을 설정하고 id값을 부여하여 구분
    - 개발자마다 id를 부여하는 방식이 달라 구조를 이해하기 어려움
    - 구조 파악이 어려워 유지보수가 어렵고, 검색 엔진이 확인할 때에도 구별이 어려움
    ![20200324010805](./Image/20200324010805.PNG)
    ```
    <div id = 'header'>
      헤더 내용
    </div>
    <div id = 'content'>
      <div id = 'article1'>
        본문내용1
      </div>
      <div id = 'article2'>
        본문내용2
      </div>
    </div>
    <div id = 'aside'>
      사이드 내용
    </div>
    <div id 'footer'>
      회사 정보
    </div>
    ```
  - html5 페이지 구조
    - 시멘틱 태그를 사용
    - 웹 접근성 용이 -> 장애인, 고령자 등이 웹 사이트에서 제공하는 정보에 비장애인과 동등하게 접근하고 이해할 수 있도록 보장하는 것
- 시멘틱 태그
  - 페이지 구조를 특정 기능에 맞는 태그를 사용하여 구분
  - 페이지 구조를 쉽게 파악하고 좀 더 정확한 정보를 검색할 수 있게 함
  - header
    - 특정 부분의 머리말로 주로 검색어, 메뉴를 넣는다
  - nav
    - 다른 사이트나 페이지로 이동하는 태그를 모아놓은 태그(네비게이션)
    - 특정 태그에 종속되지 않고 어느 곳에서나 사용할 수 있음
    - 주로 메뉴, footer의 사이트 링크 모음에 많이 쓰임
  - section
    - 웹 문서에서 컨텐츠가 들어가는 영역, 컨텐츠를 주제별로 묶을 때 사용
    - section 태그 안에 section 태그를 넣을 수 있음
    - 주제별로 article을 묶어주는 태그
  - article
    - 웹 페이지의 내용이 들어가는 영역
    - 이 태그 영역은 다른 곳으로 배포하거나 재사용 가능
    - 검색 로봇은 이 태그가 사용된 컨텐츠는 배포할 수 있는 컨텐츠로 인식
  - aside
    - 사이드바라고 불림
    - 본문 외의 기타 내용을 담고 있는 영역
    - 주로 광고를 달거나 링크모음 등을 표현
  - footer
    - 웹페이지의 맨 아래쪽에 위치하며, 회사소개, 저작권, 연락처 등의 정보 표시
    - footer에는 header, section, article 등 다른 레이아웃 사용 가능
  ![20200324010832](./Image/20200324010832.PNG)
  ```
  <header>
    헤더 내용
  </header>
  <section>
    <article>
      본문내용1
    </article>
    <article>
      본문내용2
    </article>
  </section>
  <aside>
    사이드 내용
  </aside>
  <footer>
    회사 정보
  </footer>
  ```
- 멀티미디어 태그
  - img 태그
    - 웹 페이지에 사진이나 그림을 삽입할 때 사용하는 태그
    - 닫는 태그가 존재하지 않음
    ```
    <img width = >
    ```
    - img 확장자  
    
    | 이미지 확장자 | 설명 |  
    | :-----: | :-----: |  
    | GIF | 파일 크기가 작아 작은 아이콘이나 블릿 기호에 많이 사용<br>투명한 배경이나 움직이는 이미지를 만들 수 있음 |  
    | JPG/JPEG | 사진을 위해 개발<br>저장을 반복하다 보면 화질이 떨어질 수 있음 |  
    | PNG | 네트워크용으로 개발되어 최근 많이 이용 |  
    | SVG | 벡터 이미지로 최근 활용이 많이 된다. |  
    
  - map, area 태그
    - 이미지를 구역별로 나누어 링크를 걸어주는 태그
    - img 트개에 usemap 속성을 지정해야 사용 가능
    - 사용법
    ```
    <img src='경로' usemap='#tt'>
    <map name='tt'>
      <area shape='모양' cords='00,00(시작),00,00(끝)' href='링크경로' target='위치'>
      <area shape='모양' cords='00,00(시작),00,00(끝)' href='링크경로' target='위치'>
    </map>
    ```
  - audio 태그
    - 웹 브라우저에서 플러그인의 도움 없이 음악을 재생할 수 있게 만들어주는 태그
  - video
    - 웹 브라우저에서 플러그인의 도움 없이 미디어를 재생할 수 있게 만들어주는 태그
- 하이퍼링크 태그
  - a 태그
    - 웹 페이지에서 해당 부분을 클릭하면 지정된 페이지로 이동하는 태그
    - 외부 사이트 연결, 문서 내부에서 이동 가능  
    
    | 속성 | 설명 |  
    | :-----: | :-----: |  
    | href | 링크한 페이지의 id값이나 사이트 주소 지정 |  
    | target | 링크 페이지가 표시될 위치 지정(새창, 현재창) |  
    | download | 링크한 페이지를 표시하지 않고 다운로드 하는 것 |  
    | rel | 현재 페이지와의 관계지정 |  
    | hreflang | 링크한 페이지의 언어를 지정 |  
    | type | 페이지의 파일 유형 지정 |  
    
    ```
    <a href = '이동할 페이지 경로'>링크 표시 문구</a>
    
    <a href = '이동할 페이지 경로'><img src = '이미지경로'></a>
    
    <a href = '#이동할 태그 id'>링크 표시 문구</a>
    
    <a href = '이동할 페이지 경로' target = '창선택 옵션'>링크 표시 문구</a>
    ```
- 폼 태그
  - 사용자가 입력한 data를 보내는 방식과 처리할 프로그램을 정하는 태그
  
  <table>
    <tr align="center">
      <th>속성</th>
      <th>설명</th>
    </tr>
    <tr>
      <th align="center">method</th>
      <td>get : URL 창에 데이터를 보내는 방식. 보내는 데이터 크기에 제한이 있음(256~4096byte) 보내는 데이터가 눈으로 보임.<br>post : http 헤더에 데이터를 넣어 보내는 방식. 보내는 데이터의 크기에 제한이 없음. 보내는 데이터를 볼 수 없음.</td>
    </tr>
    <tr>
      <th align="center">name</th>
      <td>form 태그의 고유 이름 지정</td>
    </tr>
    <tr>
      <th align="center">action</th>
      <td>데이터를 처리할 프로그램(페이지) 지정</td>
    </tr>
    <tr>
      <th align="center">target</th>
      <td>action 속성을 어떻게 열것인지 결정</td>
    </tr>
    <tr>
      <th align="center">autocomplete</th>
      <td>이전 입력내용 출력하는 기능(생략하면 자동으로 on)</td>
    </tr>
  </table>
  
  - 사용법
  ```
  <form action = "보내지는 페이지" method = "메소드 타입" name = "form 이름" target = "창선택 옵션">
    ...
  </form>
  ```
- fieldset, legend 태그
  - 폼 요소를 그룹으로 묶는 태그, 묶은 폼 요소에 명칭을 붙이는 태그
  ```
  <form action='처리할프로그램(페이지)' method='전송방식'>
    <fieldset>
      <legend>명칭</legend>
      <input type……>
      …
    </fieldset>
  </form>
  ```
- input 태그
  - 사용자로부터 데이터를 입력받기 위한 태그
  - form 태그를 통해서 데이터 전송 시 해당 form 태그 내부에 있는 input 태그에 작성된 내용만 전송
  <table>
    <tr>
      <th>속성</th>
      <th>설명</th>
    </tr>
    <tr>
      <th>type</th>
      <td>입력창의 타입을 결정하는 속성(text, checkbox, radio 등)</td>
    </tr>
    <tr>
      <th>value</th>
      <td>input 요소의 기본값 입력(사용자 입력 값이 value가 됨)</td>
    </tr>
    <tr>
      <th>name</th>
      <td>input을 구별 할 수 있는 명칭(데이터를 받는 곳에서 name속성의 값으로 구분)</td>
    </tr>
    <tr>
      <th>min/max/step</th>
      <td>허용하는 범위 최소값/최대값/값의 증감값</td>
    </tr>
    <tr>
      <th>autocomplete</th>
      <td>자동완성기능</td>
    </tr>
    <tr>
      <th>height/width</th>
      <td>입력창의 높이와 넓이</td>
    </tr>
    <tr>
      <th>readonly</th>
      <td>읽기전용필드</td>
    </tr>
    <tr>
      <th>accept</th>
      <td>파일타입에 대해 사용자에게 알려주는 기능</td>
    </tr>
    <tr>
      <th>multiple</th>
      <td>여러 개의 값을 입력 가능</td>
    </tr>
    <tr>
      <th>placeholder</th>
      <td>사용자 입력전 입력창 표시글(사용자 입력 시 사라짐</td>
    </tr>
    <tr>
      <th>autofocus</th>
      <td>입력창 커서 표시</td>
    </tr>
    <tr>
      <th>required</th>
      <td>필수입력 필드 지정</td>
    </tr>
    <tr>
      <th>size</th>
      <td>화면에서 표현하는 글자 수</td>
    </tr>
    <tr>
      <th>maxlength</th>
      <td>사용자가 입력할 수 있는 글자 수의 제한</td>
    </tr>
    <tr>
      <th>minlength</th>
      <td>최소입력 글자 지정</td>
    </tr>
    <tr>
      <th>list</th>
      <td><datalist>의 옵션값을 <input>안에 나열</td>
    </tr>
  </table>
  
  - type 속성의 기본값
  <table>
    <tr align = "center">
      <th>속성</th>
      <th>설명</th>
    </tr>
    <tr>
      <th>text</th>
      <td>한 줄 짜리 텍스트 입력창이 생김</td>
    </tr>
    <tr>
      <th>password</th>
      <td>비밀번호 입력창, 입력 시 •••로 표시됨</td>
    </tr>
    <tr>
      <th>hidden</th>
      <td>사용자에게 보이지는 않지만 값을 넣을 수 있는 창, 데이터를 숨겨서 전송할 때 사용</td>
    </tr>
    <tr>
      <th>button</th>
      <td>버튼 생성, 자체기능은 없고, script를 통해 함수 연결 가능</td>
    </tr>
    <tr>
      <th>checkbox</th>
      <td>체크박스생성(다중 항목 선택)</td>
    </tr>
    <tr>
      <th>radio</th>
      <td>라디오버튼생성(단일 항목 선택)</td>
    </tr>
    <tr>
      <th>file</th>
      <td>파일입력 양식</td>
    </tr>
    <tr>
      <th>submit</th>
      <td>입력한 데이터를 <form>태그의 action의 페이지로 전송</td>
    </tr>
    <tr>
      <th>reset</th>
      <td>입력한 내용을 지우는 기능</td>
    </tr>
    <tr>
      <th>image</th>
      <td>이미지 형태 생성</td>
    </tr>
    <tr>
      <th>name</th>
      <td>input의 구분자/명칭</td>
    </tr>
    <tr>
      <th>size</th>
      <td>사용자 화면에 보여줄 문자 수</td>
    </tr>
    <tr>
      <th>value</th>
      <td>input요소에 들어가 값(설정하지 않으면 빈값)</td>
    </tr>
    <tr>
      <th>maxlength</th>
      <td>최대 입력 갯수</td>
    </tr>
    <tr>
      <th>minlength</th>
      <td>최소 입력 갯수</td>
    </tr>
  </table>
  
### 2.34 34일차(2020-03-25)
- CSS
  - 웹페이지 구성
    - 문서 내용 작성과 꾸미는 부분을 분리하여 내용과 디자인 수정 시 서로 영향을 최소화
    - 다양한 기기에서도 디자인만 따로 적용하여 구동 가능
  - style과 stylesheet
    - style은 정해진 속성을 입력하여 웹페이지를 꾸미는 것
    - stylesheet는 웹페이지에서 반복적으로 쓰는 stle을 모아놓은 것
    ```
    선택자 { 
      속성1 : 값1; 
      속성2 : 값2;
    }
    
    p {
      color : red;
    }
    
    - p 태그의 색을 모두 red로 변경
    ```
  - stylesheet 종류
    1. 내부 스타일 시트
        - html문서 내부의 <style></style>에 스타일 정보를 저장하는 방법
    2. 외부 스타일 시트
        - html문서 외부에 css 파일을 작성하고 link 태그를 이용하여 읽어와서 스타일 적용
        ```
        <link href="css 파일" rel="stylesheet" type="text/css">
        ```
    3. 인라인 스타일 시트
        - 태그 내부에 스타일 정보를 지정하는 방법
        ```
        <p style="color:red">test</p>
        ```
- CSS 선택자
  - 선택자
    - html 문서 내부에서 스타일을 적용하기 위한 요소를 선택하는 것
    - html 문서를 꾸미기 위해서는 각 요소별로 스타일을 적용하기 위해 선택자를 이용하여 요소를 선택
  - 선택자의 종류
  <table>
    <tr alight="center">
      <th>구분</th>
      <th>내용</th>
    </tr>
    <tr>
      <th alight="center">전체 선택자</th>
      <td>*</td>
    </tr>
    <tr>
      <th alight="center">태그 선택자</th>
      <td>태그 이름(h1, p1, li 등등)</td>
    </tr>
    <tr>
      <th alight="center">아이디 선택자</th>
      <td>#아이디명</td>
    </tr>
    <tr>
      <th alight="center">클래스 선택자</th>
      <td>.클래스명</td>
    </tr>
    <tr>
      <th alight="center">후손 선택자</th>
      <td>선택자 선택자</td>
    </tr>
    <tr>
      <th alight="center">자손 선택자</th>
      <td>선택자 > 선택자</td>
    </tr>
    <tr>
      <th rowspan = "3" alight="center">속성 선택자</th>
      <td>선택자[속성=값] / 선택자[속성~=값]</td>
    </tr>
    <tr>
      <td>선택자[속성|=값] / 선택자[속성^=값]</td>
    </tr>
    <tr>
      <td>선택자[속성$=값] / 선택자[속성*=값]</td>
    </tr>
    <tr>
      <th alight="center">동위 선택자</th>
      <td>선택자 + 선택자 / 선택자 ~ 선택자</td>
    </tr>
    <tr>
      <th rowspan="4" alight="center">구조 선택자</th>
      <td>선택자:first-child / 선택자:last-child</td>
    </tr>
    <tr>
      <td>선택자:nht-child(수열) / 선택자:nth-last-child(수열)</td>
    </tr>
    <tr>
      <td>선택자:first-of-type / 선택자:last-of-type</td>
    </tr>
    <tr>
      <td>선택자:nth-of-type(수열) / 선택자:nth-last-of-type(수열)</td>
    </tr>
    <tr>
      <th alight="center">반응 선택자</th>
      <td>선택자:active / 선택자:hover</td>
    </tr>
    <tr>
      <th alight="center">상태 선택자</th>
      <td>:checked / :focus</td>
    </tr>
    <tr>
      <th alight="center">속성 선택자</th>
      <td>:enabled / :disbled</td>
    </tr>
    <tr>
      <th alight="center">링크 선택자</th>
      <td>:link / :vis</td>
    </tr>
    <tr>
      <th rowspan="2" alight="center">문자 선택자</th>
      <td>::first-letter / ::first-line</td>
    </tr>
    <tr>
      <td>::after / ::before / ::selection</td>
    </tr>
    <tr>
      <th alight="center">부정 선택자</th>
      <td>선택자:not(선택자)</td>
    </tr>
  </table>
  
  - 전체 선택자
    ```
    * { 
      속성1 : 값1;
      속성2 : 값2;
    }
    ```
  - 태그 선택자
    ```
    태그 { 
      속성1 : 값1;
      속성2 : 값2;
    }
    ```
  - 아이디 선택자
    ```
    #아이디{ 
      속성1 : 값1;
      속성2 : 값2;
    }

    <태그 id="아이디">내용</태그>
    ```
  - 클래스 선택자
    ```
    .클래스명{ 
      속성1 : 값1;
      속성2 : 값2;
    }

    <태그 class="클래스명">내용</태그>

    - 클래스명 여러개를 적을 수 있다.
    ```
  - 문자열 속성 선택자
    - 특정 문자열을 확인하여 스타일을 적용하는 방식으로 특별한 경우에만 사용
    ```
    태그[속성=값]{ 
      속성1 : 값1;
      속성2 : 값2;
    }

    <태그 속성=값>내용</태그>
    ```
    - 자손 선택자
    ```
    태그1>태그2{ 
      속성1 : 값1;
      속성2 : 값2;
    }

    <태그2>내용1</태그2>
    <태그1>
      <태그2>내용2</태그2>
    </태그1>

    - 자손 선택자는 태그1에 대하여 자손만이 선택되기에 내용1은 선택되지 않는다.
    ```
  - 후손 선택자
    ```
    태그1 태그3{ 
      속성1 : 값1;
      속성2 : 값2;
    }

    <태그3>내용1</태그3>
    <태그1>
      <태그2>
        <태그3>내용2</태그3>
      </태그2>
      <태그3>내용3</태그3>
    </태그1>

    - 후손 선택자는 태그1에 대하여 몇개의 후대에 있는지 상관 없이 후손 전부 선택된다.
    - 내용2, 내용3이 후손관계
    ```
  - 형제 선택자
    ```
    태그1>태그2 +(~) 태그3{ 
      속성1 : 값1;
      속성2 : 값2;
    }

    <태그3>내용1</태그3>
    <태그1>
      <태그2>
        <태그3>내용2</태그3>
      </태그2>
      <태그3>내용3</태그3>
    </태그1>

    - +는 형제 1개만, ~는 형제 전체를 포함한다.
    ```
  - 반응형 선택자
    - hover : 마우스를 해당 영역에 올리면 반응
    - active : 마우스를 해당 영역을 클릭하고 있는 동안 반응
    ```
    속성:반응타입{ 
      속성1 : 값1;
      속성2 : 값2;
    }
    ```
  - 상태 선택자
    - input:focus : input 타입에서 선택이 된 경우 반응
    - input:checked : 라디오버튼처럼 선택이 된 경우 반응
    - input:enabled : 활성화된 input들을 변경
    - input:disabled : 비활성화된 input들을 변경
    ```
    input:상태{ 
      속성1 : 값1;
      속성2 : 값2;
    }
    ```
  - 일반구조 선택자
    - 특정한 위치에 있는 태그 선택(위치구분)
    - 서로 다른 태그의 형제더라도 전부 체크한다.
    - first-child : 형제 관계 태그 중 첫번째 태그 선택
    - last-child : 형제 관계 태그 중 마지막 태그 선택
    - nth-child(수식) : 앞에서부터 수열번째 태그
    - nth-last-child(수식) : 뒤에서부터 수열번째 태그
    ```
    태그1 태그2:일반구조타입 {
      속성1 : 값1;
      속성2 : 값2;
    }
    ```
  - 형태구조 선택자
    - 특정한 위치에 있는 태그 선택(태그별로 구분)
    - first-of-type : 형제 관계 태그 중 관련된 첫번째 태그 선택
    - last-of-type : 형제 관계 태그 중 관련된 마지막 태그 선택
    - nth-of-type(수식) : 형제 관계 태그 중 앞에서부터 관련된 수열번째 태그 선택
    - nth-last-of-type(수식) : 형제 관계 태그 중 뒤에서부터 관련된 수열번째 태그 선택
    ```
    태그1 태그2:형태구조타입 {
      속성1 : 값1;
      속성2 : 값2;
    }
    ```
  - 문자 선택자
    - 특정한 글자를 선택
    - first-letter : 첫번째 글자 선택
    - first-line : 첫번째 줄 선택을 하며 웹 페이지의 크기에 맞춰 1줄로 고정된다.
    - after : 앞에 '::'가 입력이 되며 뒤에 추가가 된다.
    - selection : 앞에 '::'가 입력이 되며 드래그를 했을 때 반응한다.
  - 부정 선택자
    - 선택자의 반대
    ```
    태그1 태그2:not(:구조타입) {
      속성1 : 값1;
      속성2 : 값2;
    }
    ```

### 2.35 35일차(2020-03-26)
- CSS 단위 구성
  <table>
    <tr>
      <th>구분</th>
      <th>단위</th>
      <th>내용</th>
    </tr>
    <tr>
      <th rowspan="3">상대 크기</th>
      <th>em</th>
      <td>부모 요소의 크기가 기준<br>배수를 의미<br>1배 = 1em = 100%(부모요소 크기 기준)</td>
    </tr>
    <tr>
      <th>rem</th>
      <td>최상이 부모 요소의 크기가 기준으로 배수</td>
    </tr>
    <tr>
      <th>%</th>
      <td>기본 설정된 크기에서 상대적으로 크기 설정<br>초기 설정 100%</td>
    </tr>
    <tr>
      <th rowspan="2">절대 크기</th>
      <th>px</th>
      <td rowspan="2">기본 지정된 크기</td>
    </tr>
    <tr>
      <th>pt</th>
    </tr>
  </table>  
- CSS 색상 표현
  <table>
    <tr>
      <th>표현방법</th>
      <th>내용</th>
    </tr>
    <tr>
      <th>영문색 이름</th>
      <td>영문으로 색 이름 작성<br>red, blue, white...</td>
    </tr>
    <tr>
      <th>16진수</th>
      <td>rgb값을 기준으로 16진수로 작성<br>#ff0000(빨간색), #000000(흰색), #0000ff(파란색)...</td>
    </tr>
    <tr>
      <th>rgb</th>
      <td>rgb값을 0~255의 숫자로 표현<br>rgb(255, 0, 0), rgb(0, 0, 0), rgb(0, 0, 255)...</td>
    </tr>
    <tr>
      <th>rgba</th>
      <td>rgb 방식과 동일하며 맨 마지막에 투명도를 0~1로 표현<br>rgba(255, 0, 0, 0.5)<br>0~1로 갈수록 투명->불투명</td>
    </tr>
  </table>  
- 텍스트 스타일
  - front-family
    - 폰트의 글꼴을 설정해주는 속성
    - 글꼴 이름1이 없으면 글꼴2, 글꼴 3으로 선택되어 설정
    - 글꼴이 모두 없으면 브라우저 기본 글꼴로 적용
    ```
    선택자 {
      font-family : 글꼴1[, 글꼴2, 글꼴3];
    }
    ```
  - font-size
    - 글자의 크기를 조절하는 속성
    - 단위 : em, px, pt, ex  
      ※ex : 현재 소문자 x의 크기의 배수(잘 사용하지 않음)
    ```
    선택자 {
      font-size : 숫자단위;
    }
    ```
  - font-weight
    - 글자의 굵기를 설정  
    ```
    선택자 {
      font-weight : 속성 값;
    }
    ```
    <table>
      <tr align="center">
        <th>속성 값</th>
        <th>내용</th>
      </tr>
      <tr>
        <th align="center">normal</th>
        <td>기본형태</td>
      </tr>
      <tr>
        <th align="center">bold</th>
        <td>굵게 표시</td>
      </tr>
      <tr>
        <th align="center">bolder</th>
        <td>더 굵게 표시</td>
      </tr>
      <tr>
        <th align="center">lighter</th>
        <td>더 가늘게 표시</td>
      </tr>
      <tr>
        <th align="center">100~900</th>
        <td>400:normal / 700:bold / 세밀한 조절 가능</td>
      </tr>
    </table>  
  - font-variant
    - 영어를 작은 대문자로 표시해주는 속성
    ```
    선택자 {
      font-variant : normal 또는 small-caps;
    }
    ```
  - font-style
    - 글자를 이텔릭체로 표시하는 속성
    ```
    선택자 {
      font-style : normal 또는 italic 또는 oblique;
    }
    
    - italic : 처음부터 기울어진 글자가 존재
    - oblique : 기본 글자를 기울여서 표시
    - italic을 주로 사용
    ```
  - font
    - 글꼴 속성을 모아서 표현할 수 있는 스타일 속성
    ```
    선택자 {
      font : font-style font-variant font-weight font-size/line-height font-family;
    }
    ```
  - color
    - 글자색을 정하는 속서
    - 색 지정방법(영문명, rgb, rgba, 16진수 모두 가능)
    ```
    선택자 {
      color : 색상;
    }
    ```
  - text-decoration
    - 글자에 밑줄을 긋거나, 취소선을 긋거나, 윗선을 긋거나 밑줄을 표시하지 안않 속성
    ```
    선택자 {
      text-decoration : 속성;
    }
    
    - none : 줄 삭제
    - underline : 밑줄 표시
    - overline : 윗줄 표시
    - line-through : 취소선 표시
    ```
  - text-trnasform
    - 영문자를 표시할 때 대소문자를 바꿀 수 있는 속성
    ```
    선택자 {
      text-transfrom: 속성값;
    }
    
    - none : 변환 없이 표시
    - capitalize : 시작하는 첫번째 글자를 대문자로 변환
    - uppercase : 모든 글자를 대문자로 변환
    - lowercase : 모든 글자를 소문자로 변환
    ```
  - text-shadow
    - 텍스트에 그림자 효과를 주는 속성
    ```
    선택자 {
      text-shadow: non 또는 (가로 세로 번짐 색상);
    }
    
    - 인자를 여러개 사용하여 콤마로 구분하여 여러 개의 그림자 효과 활용 가능
    ```
  - white-space
    - 공백을 처리해 주는 속성  
    <table>
      <tr align="center">
        <th>속성 값</th>
        <th>공백 여러개</th>
        <th>개행 처리</th>
        <th>영역 이탈</th>
      </tr>
      <tr align="center">
        <th>normal</th>
        <td>하나로 처리</td>
        <td>개행하지 않음</td>
        <td>자동 줄 바꿈</td>
      </tr>
      <tr align="center">
        <th>nowrap</th>
        <td>하나로 처리</td>
        <td>개행하지 않음</td>
        <td>한줄로 표시</td>
      </tr>
      <tr align="center">
        <th>pre</th>
        <td>여러 개로 처리</td>
        <td>개행 처리 함</td>
        <td>한줄로 바꿈</td>
      </tr>
      <tr align="center">
        <th>pre-line</th>
        <td>하나로 처리</td>
        <td>개행 처리 함</td>
        <td>자동 줄 바꿈</td>
      </tr>
      <tr align="center">
        <th>pre-wrap</th>
        <td>여러 개로 처리</td>
        <td>개행 처리 함</td>
        <td>자동 줄 바꿈</td>
      </tr>
    </table>  
  - letter-spacing / word-spacing
    - letter-spacing : 낱개 글자의 간격을 조정하는 속성
    - word-spacing : 단어와 단어 사이 간격을 조정하는 속성
    ```
    선택자 {
      letter-spacing : 숫자(단위);
      word-spacing : 숫자(단위);
    }
    ```
- 문단 스타일
  - direction
    - 글자 쓰기의 방향 지속 속성
    ```
    선택자 {
      direction : ltr 또는 rtl;
    }
    
    - ltr : 왼쪽에서 오른쪽으로 텍스트 표시
    - rtl : 오른쪽에서 왼족으로 텍스트 표시
    ```
  - text-align
    - 문자 위치를 조정(정렬)하는 속성
    - 참고 : https://www.w3schools.com/cssref/playit.asp?filename=playcss_text-align&preval=histify
    <table>
      <tr align="center">
        <th>속성 값</th>
        <th>내용</th>
      </tr>
      <tr>
        <th align="center">left</th>
        <td>왼쪽에 맞추어 정렬</td>
      </tr>
      <tr>
        <th align="center">right</th>
        <td>오른쪽에 맞추어 정렬</td>
      </tr>
      <tr>
        <th align="center">center</th>
        <td>가운데 맞추어 정렬</td>
      </tr>
      <tr>
        <th align="center">justify</th>
        <td>양쪽에 맞추어 정렬</td>
      </tr>
    </table>  
  - text-indent
    - 문장을 들여쓰기 하는 속성
    ```
    선택자 {
      text-indent : 숫자(단위);
    }
    ```
  - text-height
    - 문장끼리의 줄 간격을 조정하는 속성
    ```
    선택자 {
      line-height: 숫자(단위);
    }
    
    - 글자의 상하 가운데 정렬을 할 때 사용(요소의 높이만큼 line-height를 주면 상하 가운데 정렬
    ```
  - text-overflow
    - 영역을 벗어나는 텍스트 표시 속성
    ```
    선택자 {
      text-overflow : clip 또는 eclipsis;
    }
    
    - clip : 넘어가는 부분은 잘림
    - eclipsis : 넘어가는 부분은 ...으로 표시
    ```
- 목록/링크 스타일
  - list-style-type
    - 목록의 기호의 스타일을 지정하는 속성  
    <table>
      <tr align="center">
        <th colspan="2">속성 값</th>
        <th>내용</th>
      </tr>
      <tr>
        <th rowspan="4" align="center">ul</th>
        <th align="center">disc</th>
        <td>흑색 원형</td>
      </tr>
      <tr>
        <th align="center">circle</th>
        <td>흰색 원형</td>
      </tr>
      <tr>
        <th align="center">square</th>
        <td>흑색 사각형</td>
      </tr>
      <tr>
        <th align="center">none</th>
        <td>기호 표시 안함</td>
      </tr>
      <tr>
        <th rowspan="5" align="center">ol</th>
        <th align="center">decimal</th>
        <td>1로 시작하는 십진수</td>
      </tr>
      <tr>
        <th align="center">decimal-leading-zero</th>
        <td>앞에 0이 붙은 십진수</td>
      </tr>
      <tr>
        <th align="center">lower-roman/upper-roman</th>
        <td>로마자 소문자 / 로마자 대문자</td>
      </tr>
      <tr>
        <th align="center">lower-alpha/lower-latin</th>
        <td>알파벳 소문자</td>
      </tr>
      <tr>
        <th align="center">upper-alpha/upper-latin</th>
        <td>알파벳 대문자</td>
      </tr>
    </table>  
  - list-style-image
    - 기호 대신 이미지 삽입
    ```
    선택자 {
      list-style-image: url(이미지 경로);
    }
    ```
  - list-style-position
    - 목록 기호 들여쓰기
    ```
    선택자 {
      list-style-position: inside 또는 outside;
    }
    
    - inside : 블릿이나 숫자를 안쪽으로 들여 씀
    - outside : 블릿이나 숫자를 밖으로 내어 씀(default)
    ```
  - list-style
    - 목록 스타일을 한번에 지정하는 속성
    ```
    선택자 {
      list-style: type값 position값 image값;
    }
    ```
- 배경 스타일
  - background-color
    - 배경색을 지정하는 속성
    ```
    선택자 {
      background-color: 색상표현;
    }
    ```
  - background-clip
    - 배경 범위 조절
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">border-box</th>
        <td>박스 모델의 가장 외곽이 테두리까지 적용</th>
      </tr>
      <tr>
        <th align="center">padding-box</th>
        <td>테두리를 제외한 패딩범위까지 적용</th>
      </tr>
      <tr>
        <th align="center">content-box</th>
        <td>내용 부분만 적용</th>
      </tr>
    </table>  
  - background-img
    - 요소에 배경을 이미지로 지정
    ```
    선택자 {
      background-img : url(경로);
    }
    ```
  - background-repeat
    - 배경 이미지 반복 출력
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">repeat</th>
        <td>브라우저에 가득 찰 때까지 가로/세로 반복</th>
      </tr>
      <tr>
        <th align="center">repeat-x</th>
        <td>넓이만큼 반복(가로)</th>
      </tr>
      <tr>
        <th align="center">repeat-y</th>
        <td>높이만큼 반복(세로)</th>
      </tr>
      <tr>
        <th align="center">no-repeat</th>
        <td>이미지 한번만 출력</th>
      </tr>
    </table>  
  - background-size
    - 배경 이미지의 크기를 조절하는 속성
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">auto</th>
        <td>원래 배경이미지 크기만큼 표시</th>
      </tr>
      <tr>
        <th align="center">contain</th>
        <td>요소 안으로 이미지가 들어올 수 있게 확대/축소</th>
      </tr>
      <tr>
        <th align="center">cover</th>
        <td>요소의 범위를 이미지가 덮을 수 있도록 확대/축소</th>
      </tr>
      <tr>
        <th align="center">크기값(px)/백분율</th>
        <td>수치화된 값으로 표현</th>
      </tr>
    </table>  
  - background-position
    - 배경 이미지의 위치를 조정하는 속성
    ```
    선택자 {
      background-position : 수평위치 수직위치;
      background-position : left center;
      background-position : 50% 50%;
    ```
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">수평위치</th>
        <td>left / center / right</th>
      </tr>
      <tr>
        <th align="center">수직위치</th>
        <td>top / center / bottom</th>
      </tr>
      <tr>
        <th align="center">크기값(px) / 백분율</th>
        <td>수치화된 값으로 표현(가로,세로) -> 왼쪽 모서리 좌표</th>
      </tr>
    </table>  
  - background-origin
    - 배경 이미지 배치할 때 기준을 지정하는 속성
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">border-box</th>
        <td>테두리가 기준</th>
      </tr>
      <tr>
        <th align="center">padding-box</th>
        <td>테두리를 뺀 패딩이 기준</th>
      </tr>
      <tr>
        <th align="center">content-box</th>
        <td>내용부분이 기준</th>
      </tr>
    </table>  
  - background-attachment
    - 웹페이지가 위아래로 움직여도 배경이미지는 움직이지 않게 고정하는 속성
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">scroll</th>
        <td>배경이미지가 움직이게 설정(default)</th>
      </tr>
      <tr>
        <th align="center">fixed</th>
        <td>배경이미지가 움직이지 않게 설정</th>
      </tr>
    </table>  
  - background
    - 배경이미지 한번에 설정하는 속성
    ```
    선택자 {
      background : image값 repeat값 attachment값 position값 clip값 origin값 size값;
    }
    ```
  - linear-gradient
    - 직선 방향으로 그라데이션 색상
    ```
    선택자 {
      background: linear-gradient(방향, 색상1, 색상2[, 색상3, 색상4...]);
    }
    
    - 방향은 to를 써서 bottom, top, left, right로 지정할 수 있다.
    - 숫자deg를 하면 각도로 지정이 된다.
    ```
  - radial-gradient
    - 타원 방향으로 그라데이션 색상
    - 중심을 기준으로 그려진다.
    ```
    선택자 [
      bacground: radial-gradient(색상1, 색상2[, 색상3, 색상4...]);
    }
    ```
    
### 2.36 36일차(2020-03-27)
- 기본 스타일
  - height / wegiht
    - 콘텐츠(내용)이 차지하고 있는 공간을
  - display
    - 화면 배치 방법 변경 속성
    - 블록요소와 인라인 요소를 변경 가능(블록->인라인, 인라인->블록)
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">none</th>
        <td>화면에서 표현되지 않고 공간도 차지하지 않음</th>
      </tr>
      <tr>
        <th align="center">inline</th>
        <td>인라인 요소로 변경</th>
      </tr>
      <tr>
        <th align="center">block</th>
        <td>블록 요소로 변경</th>
      </tr>
      <tr>
        <th align="center">inline-block</th>
        <td>블록 요소와 같이 너비, 높이 지정 등</th>
      </tr>
    </table>  
- 테두리 스타일
  - border-style
    - 테두리 스타일 지정(테두리에 사용할 선의 종류)
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">none</th>
        <td>테두리가 나타나지 않음(기본 값)</th>
      </tr>
      <tr>
        <th align="center">hidden</th>
        <td>테두리가 나타나지 않음</th>
      </tr>
      <tr>
        <th align="center">dashed</th>
        <td></th>
      </tr>
      <tr>
        <th align="center">inline-block</th>
        <td></th>
      </tr>
    </table>  
  - border-width
    - 테두리의 두께를 지정하는 속성
    ```
    선택자 {
      border-width : 숫자(단위);
    }
    ```
  - border-radius
- 여백 스타일
  - margin
    - margin 크기를 0 auto로 하면 자동으로 가운데 정렬이 된다.
- 포지셔닝
  - position
    - 페이지의 요소들을 자유롭게 배치해주는 속성
    - top, left, right, bottm으로 위치 지정
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">static</th>
        <td>요소를 문서의 흐름에 맞춰 배치(default)</th>
      </tr>
      <tr>
        <th align="center">relative</th>
        <td>이전 요소와 자연스럽게 연결해 배치, 위치 지정 가능</th>
      </tr>
      <tr>
        <th align="center">absolute</th>
        <td>원하는 위치를 지정해 배치<br>-> 부모/조상 요소의 position 속성이 반드시 relative<br>-> 가까운 relative 속성인 부모나 조상 요소가 기준점</th>
      </tr>
      <tr>
        <th align="center">fixed</th>
        <td>지정한 위치에 고정 배치</th>
      </tr>
    </table>  
  - visibility
    - 페이지에 특정 속성을 보이거나 보이지 않게 하는 속성
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">visible</th>
        <td>요소가 화면에 보임(default)</th>
      </tr>
      <tr>
        <th align="center">hidden</th>
        <td>요소가 화면에서 안보임</th>
      </tr>
    </table>  
  - float
    <table>
      <tr>
        <th align="center">속성 값</th>
        <th align="center">내용</th>
      </tr>
      <tr>
        <th align="center">left</th>
        <td>요소가 화면에 보임(default)</th>
      </tr>
      <tr>
        <th align="center">right</th>
        <td>요소가 화면에서 안보임</th>
      </tr>
    </table>  
  - clear
    - float 속성을 해제하는 속성
- 애니메이션
  - 애니메이션은 속성을 점차적으로 변화시켜 움직이는 효과를 내는 기법
  - transform 속성
    - 페이지에서 요소들을 변경시키려면 transform 속성과 변형 함수를 이용
    ```
    선택자 {
      transform:변형함수;
    }
    ```
  
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

## 6. 테이블 설계
- 학생들 관리할 테이블
  1. 학생번호 : STU_NO/NUMBER/PRIMARY KEY
  2. 이름 : NAME/VARCHAR2(20)/NN
  3. 나이 : AGE/NUMBER/NN CHECK 0 초과
  4. 성별 : GENDER/CHAR(3)/CHECK '남', '여'
  5. 전화번호 : PHONE/CHAR(13)/DEFAULT '010-0000-0000'
  6. 주소 : ADDR/VARCHAR2(500)/NN
- 게시판
  1. 게시물 번호 : BOARD_NO/NUMBER/PRIMARY KEY
  2. 게시물 제목 : BOARD_TITLE/VARCHAR2(300)/NN
  3. 게시물 내용 : BOARD_CONTENT/VARCHAR2(3000)/NN
  4. 게시물 작성자 : BOARD_WRITER/NUMBER/FORIGN KEY
  5. 작성일 : WIRTE_DATE/DATE/DEFAULT SYSDATE
  
## 7. DB 연결 단계
1. 드라이버 등록
2. Connection 객체 생성
3. Statemnt 객체 생성 -> PreparedStatement 객체 생성 후 위치홀더에 값을 대입
4. 쿼리문 요청 후 결과 받기 -> 쿼리문 실행 및 
5. 결과처리
6. 자원 반환

## 8. 사이트
- 테이블 정의 사이트
  - AQueryTool : https://aquerytool.com/
  - ERDCloud : https://www.erdcloud.com/
- 이미지 맵 제작 사이트
  - Online Image Map Editor : http://maschek.hu/imagemap/imgmap/
- 선택자 테스트 사이트
  - CSS Diner : http://flukeout.github.io/
- 픽셀 크기 계산 사이트
  - PXtoEM.com : http://pxtoem.com/
- 색상 조합 사이트
  - LOL Colors : https://www.webdesignrankings.com/resources/lolcolors/
- 구글 제공 폰트 사이트
  - Google Fonts : https://fonts.google.com/
- 색상 선택 사이트
  - WebFX Color Picker : https://www.webfx.com/web-design/color-picker/
- front-end 코드 사이트
  - W3Schools : https://www.w3schools.com/
  - W3Schools-CSS : https://www.w3schools.com/css/default.asp
  - W3Schools-HTML : https://www.w3schools.com/html/default.asp
  - W3Schools-JavaScript : https://www.w3schools.com/js/default.asp
