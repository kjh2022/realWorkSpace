package co.edu.homework0727;

public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void getInformation() {
		System.out.printf("이름: %s, 연봉: %d", name, salary);
	}

	public void print() {
		System.out.println("수퍼클래스");
	}
}
