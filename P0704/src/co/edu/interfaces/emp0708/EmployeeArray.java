package co.edu.interfaces.emp0708;

import java.util.Scanner;

/*
 * 배열기반 기능 구현(implement)
 */
public class EmployeeArray implements EmployeeList {
	//싱글톤 기반
	private static EmployeeArray instance = new EmployeeArray();
	private EmployeeArray() {}
	public static EmployeeArray getInstance() {
		return instance;
	}
	//데이터를 저장할 수 있는 배열 생성
	Employee[] list; //사원정보 담는 배열
	int empNum;
	Scanner scn = new Scanner(System.in);
	
	@Override
	public void init() {
		System.out.println("사원 수 >> ");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}

	@Override
	public void input() {
		System.out.printf("%d 사번 입력> ", empNum);
		int no = Integer.parseInt(scn.nextLine());
		
		System.out.println("이름> ");
		String name = scn.nextLine();
		
		System.out.println("급여> ");
		String sal = scn.nextLine();
		
		list[empNum++] = new Employee(no, name, sal);
	}

	@Override
	public Employee search(int empId) {
		for (int i = 0; i < empNum; i++) {
			if(list[i].getEmployeedId() == empId) {
				return list[i];
			}
		}
		return null;
	}

	@Override
	public void printList() {
		for(int i = 0; i < empNum; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getEmployeedId(), list[i].getName(), list[i].getSalary());
		}
		
	}
	@Override
	public Employee search(String empId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
