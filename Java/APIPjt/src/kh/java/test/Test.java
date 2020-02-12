package kh.java.test;

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
}
