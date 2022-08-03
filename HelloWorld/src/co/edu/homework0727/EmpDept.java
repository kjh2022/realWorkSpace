package co.edu.homework0727;

/*오버라이딩 - 부모가 정의해둔 메소드를 자식이 가져와서 쓸 수 있는것.
 * 			자식이 마음대로 메소드 안의 내용을 바꿔 사용할수도 있다.*/
public class EmpDept extends Employee {

	public static void main(String[] args) {
		EmpDept dept = new EmpDept("이지나", 3000, "교육부");
		dept.getInformation();

		dept.print();
	}

//	필드
	private String deptName;

//	생성자
	public EmpDept(String name, int salary, String deptName) {
		super(name, salary);
		this.deptName = deptName;
	}

//	메소드
	public String getDeptName() {
		return deptName;
	}

	@Override
	public void getInformation() {
		System.out.printf("이름: %s, 연봉: %d, 부서:%s\n", name, getSalary(), deptName);
	}

	@Override
	public void print() {
		super.print(); // 부모클래스의 print를 super.print로 한번 출력해줌
		System.out.println("서브클래스");

	}

}
