package co.edu.interit.friend0708;

/*
 *학교친구 
 */
public class UniFriend extends Friend {
	private String univ;
	private String major;

	public UniFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	@Override
	public String toString() {
		return "학교 [이름: " + getName() + ", 연락처: " + getPhone() + ", 학교: " + univ + ", 전공: " + major + "]";
	}

	public void showInfo() {
		// 친구이름, 연락처, 회사이름, 부서
		System.out.printf("이름: %s, 연락처: %s, 학교: %s, 전공: %s", getName(), getPhone(), univ, major);

	}

}
