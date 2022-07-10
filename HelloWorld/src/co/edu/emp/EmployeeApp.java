package co.edu.emp;

import java.util.Scanner;

/*
 * 실행 클래스, 이걸 위해 두가지 employee 파일을 만들었음.
 */
public class EmployeeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeList app = EmployeeList.getInstance();

		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.초기화(사원 수) | 2.사원 압력 | 3.리스트 |" //
					+ " 4.상세조회 | 5.달력보기 | 9.종료"); //
			System.out.println("선택 >>");
			int selectNo = Integer.parseInt(scan.nextLine());
			if (selectNo == 1) {
				app.init();
			} else if (selectNo == 2) {
				app.input();
			} else if (selectNo == 3) {
				app.printList();
			} else if (selectNo == 4) {
				app.search();
				
			} else if (selectNo == 5) {
				app.showCalendar();
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바르지 않은 입력입니다. 다시 선택해 주세요.");
				continue;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}
//월 정보를 넣으면 알아서 마지막날까지 보여주는 기초달력 요일은 안맞아도 된다