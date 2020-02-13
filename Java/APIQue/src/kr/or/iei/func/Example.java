package kr.or.iei.func;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Example {

	public void exam1() {
		Calendar today = Calendar.getInstance();

		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		int dayWeek = today.get(Calendar.DAY_OF_WEEK);

		StringBuffer sb = new StringBuffer();
		sb.append(year);
		sb.append("년 ");
		sb.append(month + 1);
		sb.append("월 ");
		sb.append(day);
		sb.append("일 ");

		switch (dayWeek) {
		case 1:
			sb.append("일요일");
			break;
		case 2:
			sb.append("월요일");
			break;
		case 3:
			sb.append("화요일");
			break;
		case 4:
			sb.append("수요일");
			break;
		case 5:
			sb.append("목요일");
			break;
		case 6:
			sb.append("금요일");
			break;
		case 7:
			sb.append("토요일");
			break;
		}

		System.out.println(sb);
	}

	public void exam2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year, month, day;
		
		System.out.println("========== D-Day 계산기 ==========");
		
		while (true) {
			try {
				System.out.print("D-Day [년도] 입력 : ");
				year = Integer.parseInt(br.readLine());

				break;
				
			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		while (true) {
			try {
				System.out.print("D-Day [월] 입력 : ");
				month = Integer.parseInt(br.readLine());

				if (month > 0 && month < 13) {
					break;
				} else {
					System.out.println("1~12 사이의 숫자를 입력해 주세요.");
				}

			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		
		while (true) {
			try {
				System.out.print("D-Day [일] 입력 : ");
				day = Integer.parseInt(br.readLine());

				if (day > 0 && day < 32) {
					break;
				} else {
					System.out.println("1~31 사이의 숫자를 입력해 주세요.");
				}

			} catch (NumberFormatException ne) {
				System.err.println("숫자를 입력해 주세요.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		Calendar today = Calendar.getInstance();
		Calendar dDay = Calendar.getInstance();
		dDay.set(Calendar.YEAR, year);
		dDay.set(Calendar.MONTH, month - 1);
		dDay.set(Calendar.DATE, day);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일");
		
		System.out.println("오늘 날짜 : " + sdf.format(today.getTime()));
		System.out.println("D-Day 날짜 : " + sdf.format(dDay.getTime()));
		
		//오차를 없애기 위해 먼저 1000을 나눈다.
		long check = dDay.getTimeInMillis() / 1000 - today.getTimeInMillis() / 1000;
		check /= 86400;
		
		if (check < 0) {
			System.out.println(Math.abs(check) + "일 지났습니다.");
		} else if (check == 0) {
			System.out.println("D-Day 입니다.");
		} else {
			System.out.println(check + "일 남았습니다.");
		}
	}

}
