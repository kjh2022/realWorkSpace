package co.edu.interit.friend0708;

/*
 * 
 */
public class ComFriend extends Friend {
	private String company;
	private String department;

	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	@Override
	public String toString() {
		return "회사 [이름: " + getName() + ", 연락처: " + getPhone() + ", 회사: " + company //
				+ ", 부서: " + department + "]";
	}
	public void showInfo() {
		System.out.printf("이름: %s, 연락처: %s, 회사: %s, 부서: %s"
				,getName(), getPhone(), company, department);
	}

}