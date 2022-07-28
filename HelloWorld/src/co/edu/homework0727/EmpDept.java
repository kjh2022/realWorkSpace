package co.edu.homework0727;

public class EmpDept extends Employee {

	public static void main(String[] args) {
		EmpDept dept = new EmpDept("이지나", 3000, "교육부");
		dept.getInformation();
		
		dept.print();
	}

	private String deptName;

	public EmpDept(String name, int salary, String deptName) {
		super(name, salary);
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public void getInformation() {
		System.out.printf("이름: %s, 연봉: %d, 부서:%s\n", getName(), getSalary(), deptName);
	}

	@Override
	public void print() {
		System.out.print("수퍼클래스\n서브 클래스");

	}

}
