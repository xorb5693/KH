package kh.java.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public void bufferTest() {
		StringBuffer sb = new StringBuffer();
		//저장된 문자열의 길이 출력
		System.out.println(sb.length());
		
		//현재 문자열 끝에 추가
		sb.append("안녕하세요 ");
		System.out.println(sb);
		
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		
		//3번 자리에 문자열 삽입
		sb.insert(3, "ㅇㅇㅇ");
		System.out.println(sb);
		
		//0번째부터 3번째 앞까지 hi로 변경
		sb.replace(0, 3, "hi");
		System.out.println(sb);
		
		//버퍼를 거꾸로
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//버퍼 삭제
		sb.delete(2, 5);
		System.out.println(sb);
		
		//초기화
		sb.setLength(0);
		System.out.println(sb);
		
		System.out.println(sb.capacity());
	}
	
	public void tokenTest() {
		
		String str = "박태규/27/서울";
		
		StringTokenizer st = new StringTokenizer(str, "/");	//str을 "/"을 기준으로 자르는 것
		System.out.println(st.countTokens());	//현재 Token의 개수를 출력
		
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());		
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
		
		//남아있는 토큰이 있는지 확인(true/false)
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	public void stringTest() {
		String str = "J a v a P r o g r a m";
		//문자열 값을 공백단위로 Tocken처리하여 char[] 저장하여 출력
		//모두 대문자로 변환하여 문자열 저장 후 출력
		
		StringTokenizer st = new StringTokenizer(str, " ");
		char[] chars = new char[st.countTokens()];
		int i = 0;
		StringBuffer sb = new StringBuffer();
		
		while(st.hasMoreTokens()) {
			chars[i++] = st.nextToken().charAt(0);
		}
		
		for (i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			if (chars[i] >= 97 && chars[i] <= 122) {
				sb.append((char)(chars[i] ^ 32));
			} else {
				sb.append(chars[i]);
			}
		}
		
		System.out.println();
		
		System.out.println(sb);
	}

	public void mathTest() {
		System.out.println(Math.abs(-20));		//절대값 출력
		System.out.println(Math.ceil(3.14));	//소수점 아래 올림
		System.out.println(Math.floor(3.9));	//소수점 아래 내림
		System.out.println(Math.round(3.5));	//소수점 아래 반올림
		System.out.println(Math.random());		//0.0 ~ 1.0 범위의 임의의 값 추출
		System.out.println(Math.max(1, 2));		//두 수를 비교 후 큰 값 리턴
		System.out.println(Math.min(1, 2));		//두 수를 비교 후 작은 값 리턴	
	}

	public void calendarTest() {
		Calendar today = Calendar.getInstance();
		//GregorianCalendar 객체 생성
		
		System.out.println(today.get(Calendar.YEAR));		//연도 출력
		System.out.println(today.get(Calendar.MONTH));		//월 출력(0월부터 출력한다)
		System.out.println(today.get(Calendar.DATE));		//일 출력
		System.out.println(today.get(Calendar.AM_PM));		//오전 오후 출력(오전 : 0, 오후 : 1)
		System.out.println(today.get(Calendar.HOUR));		//시 출력
		System.out.println(today.get(Calendar.MINUTE));		//분 출력
		System.out.println(today.get(Calendar.SECOND));		//초 출력
		System.out.println(today.get(Calendar.DAY_OF_WEEK));//일주일의 몇번째 요일인지 출력(1 : 일요일, 7 : 토요일)
		
		//set 메소드를 통해 날짜를 편집하여 사용 가능
		today.set(Calendar.YEAR, 2050);
		System.out.println(today.get(Calendar.YEAR));
		
		System.out.println(today.getTimeInMillis());		//현재 시간, 기준점 : 1970년 1월 1일 9시 0분 00초부터 지금까지 지난 시간을 ms단위로 계산
	}
	
	public void calendarTest2() {

		Calendar day1 = Calendar.getInstance();
		Calendar day2 = Calendar.getInstance();
		
		day2.set(Calendar.YEAR, 2021);
		long day11 = day1.getTimeInMillis();
		long day22 = day2.getTimeInMillis();
		long day = day22 - day11;
		day /= (1000 * 86400);
		System.out.println(day);
	}
	
	public void dateTest() {
		//Date
		Date date1 = new Date();
		Calendar today = Calendar.getInstance();
		today.set(Calendar.YEAR, 2021);
		long testDate = today.getTimeInMillis();
		Date date2 = new Date(testDate);
		
		System.out.println(date1);
		System.out.println(date2);
	}

	public void dateFormatTest() {
		
		Date today = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		System.out.println(sdf2.format(today));
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = 0;
		String str = sc.next();
		
		//int number = (int)str; => 참조형이기에 불가능
		//str = 100
		//문자열 길이 측정 = 3
		//문자형 배열 생성하여 한글자씩 입력 
		//char[] arr = new char[3];
		//{'1', '0', '0'}
		//'1'- > 49, '0' -> 48
		//(arr[0] - 48) * 100 + (arr[1] - 48) * 10 + (arr[2] - 48)
		
		char[] arr = new char[str.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (arr[i] < '0' || arr[i] > '9') {
				System.out.println("숫자가 아닙니다.");
				return;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			num *= 10;
			num += (arr[i] - 48);
		}
		
		System.out.println(num);
		System.out.println(Integer.parseInt(str));
	}
	
}
