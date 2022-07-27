package co.edu.homework0727;

public class EmpDept extends Employee {

	public static void main(String[] args) {
		EmpDept dept = new EmpDept("이지나", 3000, "교육부");
		dept.getInformation();
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
		System.out.printf(", 부서: %s", getDeptName());
//		super.getInformation();
//		this.getDeptName();

	}

	@Override
	public void print() {
		System.out.println("\n서브 클래스");
		// super.print();

	}

}
