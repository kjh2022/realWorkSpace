package co.edu.emp;

/*클래스 사원번호, 이름, 부서번호, 부서명, 급여
 * 이메일, 
 */
public class Employee {
	private int employeeId; // 사번
	private String name; // 아이디
	private int departmentId; // 부서번호 10번 : 인사 20:개발 30:영업(기본값)
	private String departmentName;// 부서명
	private String salary; // 급여
	private String email; // 이메일
	

	// 생성자;
	public Employee() {
	} // 기본 생성자

	public Employee(int employeeId, String name, String salary, int departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		if (departmentId == 10) {
			departmentName = "인사";
		} else if (departmentId == 20) {
			departmentName = "개발";
		} else
			departmentName = "영업";
	}

	// 사번, 이름 초기화
	public Employee(int employeeId, String name) {
		this(employeeId, name, "100", 30); //
	}

	// 사번, 이름, 급여 초기화
	public Employee(int employeeId, String name, String salary) {
		this(employeeId, name, salary, 30);
	}

//	상세정보를 반환해주는 메소드
	public String getDetailInfo() {
//		사원번호, 이름, 급여정보, 부서정보
		String info = "사원번호: " + employeeId + ", 이름: " + name + ", 급여" + salary;
		info += ", 부서정보" + departmentName;
		return info;
	}

//	get, set메소드
	public int getEmployeedId() {
		return employeeId;
	}

	public void setEmployeedId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
