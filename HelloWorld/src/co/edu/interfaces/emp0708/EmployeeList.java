package co.edu.interfaces.emp0708;
/*
 * 기능 정의(선언) 부분
 */
public interface EmployeeList {

	//배열 초기화
	public void init();
	
	//사원 정보 입력
	public void input();
	
	//사번에 해당하는 정보 조회
	public Employee search(String empId);
	
	//전체 출력
	public void printList();

	Employee search(int empId);

	
}
