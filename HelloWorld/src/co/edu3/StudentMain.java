package co.edu3;

public class StudentMain { //(스태틱)필드?
	public static void main(String[] args) { //스태틱(정적)메소드
		System.out.println(args[0]);
		System.out.println(args[1]);
		Student kim = new Student(); // 생성자(클래스) 호출
		kim.setSno("22-002");
		kim.setName("곽재원");
		kim.setScore(50);

//		System.out.println("이름: " + kim.getName());
//		kim.showInfo();
//		
		Student gim = new Student("22-003", "김준형", 74);
		Student park = new Student("22-001", "박재원", 92);
//		park.showInfo();

		Course course = new Course("김수철", "1 - 3", 25);
		System.out.println("선생님: " + course.getTname());
		System.out.println("반 정보: " + course.getBname());

		// 학생등록
		course.addStudent(kim);
		course.addStudent(park);
		course.addStudent(gim);
		// 학생리스트 보기
		course.getStudents();
		//최조검 학생정보 보기
		System.out.println("<< 최고 점수 학생 >>");
//		course.getMaxScore().showInfo();
		Student maxStudent = course.getMaxScore();
		maxStudent.showInfo();
		
		double j = course.getAvgScore();
		System.out.printf("평균점수 : %.1f ", j);
	}

}
