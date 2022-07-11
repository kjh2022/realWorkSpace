package co.edu.interfaces.emp0708;

import java.util.Scanner;

public class EmployeeListApp {

	public static void main(String[] args) {
		
		EmployeeList app = EmployeeArray.getInstance();
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.사원 수(초기화) | 2.사원입력 | 3.사원 리스트 | 4.상세 검색 | 9.종료");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			if(selectNo == 1) {
				
			}else if(selectNo == 2) {
				app.input();
				
			}else if(selectNo == 3) {
				app.printList();
				
			}else if(selectNo == 4) {
				System.out.println("검색할 사번 입력> ");
				int empId = Integer.parseInt(scn.nextLine());
				Employee emp = app.search(empId);
				System.out.println(emp.getDetailInfo());
				
			}else if(selectNo == 9) {
				
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 선택해 주세요.");
			}
			
		}
	}

}
