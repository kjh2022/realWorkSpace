package co.edu.homework0727;
/*오버라이딩과 오버로딩의 차이점 잘 알기
 * 오버로딩 = (println처럼 )매개변수가 달라도 같은 생성자를 만들 수 있는것이 오버로딩이다.
 * 
 * 클래스 만들때 필요한 3요소 필드 생성자 메소드*/

public class Employee {
//	필드
	protected String name;
	protected int salary;
//	생성자
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
//		부모 클래스는 상속을 안받으니 super(); 들어갈 필요 없다.
	}
//	메소드 생성자가 이미 setter의 기능을 하고있어서 세터는 필요없다.
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
//	
	public void getInformation() {
		System.out.printf("이름: %s, 연봉: %d", name, salary);
	}

	public void print() {
		System.out.println("수퍼클래스");
	}
}
