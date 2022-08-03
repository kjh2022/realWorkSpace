package co.edu.homework0727;
//하나의 메소드로 여러가지 결과를 도출해내는것 = 다형성
public class EmpApp {
	public static void main(String[] args) {
		Employee emp = new EmpDept("이지나", 30000, "교육부");
		emp.getInformation();
	}

}
