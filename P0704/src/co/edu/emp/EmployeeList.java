package co.edu.emp;

import java.util.Scanner;

/*
 * 저장, 등록, 조회, 리스트 싱글톤방식
 */
public class EmployeeList {
	private static EmployeeList instance = new EmployeeList();

	private EmployeeList() {
	}

	public static EmployeeList getInstance() {
		return instance;
	}

	// 정보를 담기위한 배열도 하나 선언하기
	Employee[] list; // 사원 배열
	int empNum; // 사원 수를 담기위한 empNum선언
	Scanner scan = new Scanner(System.in);

	// 리스트 초기화하는 생성자 하나 맨들기
//	private EmployeeList(Employee[] list) {
//		this.list = list;
//		this.empNum = list.length;// list라는 배열의 크기
//	}

	// 배열객체 선언
	public void init() {
		System.out.println("사원 수 입력. > ");
		int num = Integer.parseInt(scan.nextLine());
		list = new Employee[num];
	}

	// 사원정보 입력 -> 배열에 추가
	public void input() {
		// 배열의 크기보다 더 많이 입력하지 못하게 수정하는 작업 필요
		if (empNum >= list.length) {
			System.out.println("사원 수를 초과했습니다.");
			return;
		}
		System.out.printf("%d 사번>> ", empNum);
		int no = Integer.parseInt(scan.nextLine());

		System.out.println("이름 입력>> ");
		String name = scan.nextLine();

		System.out.println("급여>>");
		String sal = scan.nextLine();
		list[empNum++] = new Employee(no, name, sal); // 사원 인스턴스 ->>배열에 저장
	}

	public void printList() {
		for (int i = 0; i < empNum; i++) {
			System.out.printf("%5d %10s %7s\n", //
					list[i].getEmployeedId(), list[i].getName(), list[i].getSalary()); //
		}
	}

//상세조회, 사원에 상세정보를 보여주는 기능을 Employee에 추가
	public void search() {
		System.out.println("사원번호 입력>");
		int employeeId = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < empNum; i++) {
			if (employeeId == list[i].getEmployeedId()) {
				System.out.println(list[i].getDetailInfo());
				break;
			}
//			else {
//				System.out.println("올바르지 않은 입력입니다. 다시 입력해 주세요.");
//				continue;
//			}
		}
	}

	// 말일 정보
	private int getLastDate(int mon) {
		switch (mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
		default:
			return 28;
		}
	}

	// 1일의 요일정보
	private int getDayInfo(int mon) {
		switch (mon) {
		case 1:
		case 10:
			return 6;
		case 2:
		case 3:
		case 11:
			return 2;
		case 4:
		case 7:
			return 5;
		case 5:
			return 0;
		case 6:
			return 3; // 첫째날의 요일정보
		case 8:
			return 1;
		case 9:
			return 4;
		case 12:
			return 4;
		}
		return 0;
	}
	// 달력

//	캘린더 클래스 or반복문만 사용해서 달력만들기. 요일정보, 1일의 위치, 말일의 날짜가 며칠까지인지가 나오게
	// 월 정보 입력시
	public void showCalendar() {
		System.out.println("보고자 하는 월을 입력하세요");
		int month = Integer.parseInt(scan.nextLine());
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int firstDay = getDayInfo(month); // 일:0, 월:1, 화:2, 수:3, 목:4, 금:5, 토:6
		int lastDate = getLastDate(month);

		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		for (int i = 0; i < firstDay; i++) {
			System.out.printf("%4s", " ");
		}
		for (int i = 1; i < lastDate; i++) {
			System.out.printf("%4s", i);
			if ((i + firstDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
