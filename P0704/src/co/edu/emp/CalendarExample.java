package co.edu.emp;

import java.util.Calendar;

/*
 * 캘린더 클래스 연습
 */
public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		실행되는 시점의 날짜정보 cal에 입력해야함

//		System.out.println(cal.get(Calendar.YEAR) + "년");
//		System.out.println(cal.get(Calendar.MONTH) + 1 + "월");
		// 캘린더 클래스에는 1월달이 0으로 나온다
//		System.out.println(cal.get(Calendar.DATE) + "일");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");
//		일요일(1)~토요일(7)
//		System.out.println("말일은 " + cal.getActualMaximum(Calendar.DATE) + "일");
//		말일이 며칠인지 표현함

//		cal.set(2022, 5, 1); // 2022년 6월 1일로 날짜 지정
//		System.out.println(cal.get(Calendar.YEAR) + "년");
//		System.out.println(cal.get(Calendar.MONTH) + 1 + "월"); 
//		System.out.println(cal.get(Calendar.DATE) + "일");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");
//		System.out.println( "말일은 " +cal.getActualMaximum(Calendar.DATE) + "일");

		int year = 2023;
		int month = 9;
		System.out.printf("%d년 %d월의 마지막 날짜는 %d일\n", year, month, getLastDate(year, month));
		System.out.printf("%d년 %d월 1일은 %d요일", year, month, getDayInfo(year, month));
	}

//	년,월 정보를 주면 =>해당 년, 월의 요일정보를 가져오는 메소드, 2022년 9월 -> 9월1일의 요일정보
	public static int getDayInfo(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		return cal.get(Calendar.DAY_OF_WEEK);
	}

//	연, 월 정보를 주면 => 해당 연, 월의 말일 정보를 가져오는 메소드, 2022년 9월 =>30일 말일
	public static int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		
		return cal.getActualMaximum(Calendar.DATE);

	}
}
