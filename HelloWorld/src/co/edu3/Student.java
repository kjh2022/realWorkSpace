package co.edu3;
//클래스 연습, studentMain에 사용될 클래스 생성
public class Student {
	// 필드

	private String sno;
	private String name;
	private int score;

	// 생성자 선언 안할 시 기본 생성자가 만들어짐
	public Student() {} //기본 생성자 선언, 중복가능
	//생성자 오버링
	public Student(String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	//전체 정보를 보여주는 showInfo() 하나 생성
	public void showInfo() {
		System.out.printf("학번: %s, 이름: %s, 점수: %d\n", sno, name, score);
	}

}
