package T20220719R.src.com.edu;

public class HighStudent extends Student {
//	고등학생정보 : 담임교사, 학년 정보 추가.
	private String hProf;
	private String grade;
	
	public HighStudent (String studNo, String studName, int score, String hProf, String grade) {
		this.hProf = hProf;
		this.grade = grade;
	}
	// 생성자.
	public HighStudent() {}
	@Override
	public String toString() {
		return "고등학생 [담임 교사=" + hProf + ", 학년=" + grade + "]";
	}
	
}
