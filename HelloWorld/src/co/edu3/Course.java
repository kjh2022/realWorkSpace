package co.edu3;
/*
 * 클래스 연습, StudentMain에 사용하기위해 생성한 클래스.
 */
public class Course {
	// 아래가 필드
	private String tname; // 선생이름
	private String bname; // 반이름
	private Student[] students;

	// 생성자 만들기
	public Course() {
	}

	public Course(String tname) {
		this.tname = tname;
	}

	public Course(String tname, String bname, int studentNum) {
		this.tname = tname;
		this.bname = bname;
		this.students = new Student[studentNum];
	}

	// get, set 메소드 생성
	public String getTname() {
		return tname;
	}

	public String getBname() {
		return bname;
	}

	public void getStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].showInfo();
			}
		}
	}

	// 학생정보 등록
	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	// 점수 제일 높은 학생의 정보 반환
	public Student getMaxScore() {
		int max = 0;
		Student student = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getScore() > max) {
				max = students[i].getScore();
				student = students[i];
			}
		}
		return student;
	}
//		int max = 0;
//		for(int i = 0;  i < students[i].getScore(); i++) {
//			if(max < 0);
//			max = students[i].getScore();
//			System.out.println("최고 점수 학생:" + getMaxScore() + max);
//		}
		//반 평균 반환. getAvgScore()
	public double getAvgScore() {
		double avg = 0;
		int sum = 0;
		int studentNum = 0; //점수 합산된 사람이 몇명인지 카운트 하기위해 변수 선언
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null ) {
				studentNum++;
				sum += students[i].getScore();
			}
		}
		avg = (double) sum /  studentNum;
		return avg;
	}

}
