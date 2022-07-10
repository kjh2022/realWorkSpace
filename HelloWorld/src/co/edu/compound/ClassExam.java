package co.edu.compound;

public class ClassExam {
	public static void main(String[] args) {
		String name = "고길동";
		int age = 20;

		String[] names = { "고길동", "박민수", "김익수" };
		int[] scores = { 80, 85, 90 };
		int[] ages = { 11, 15, 19 };
		// ㄴ이런 식으로 하면 하나만 잘못 입력해도 관리가 힘들어지고 헷갈릴 수 있다.
		// 배열 하나에 다양한 변수를 담을 수 있는 방법은 클래스가 있다.
		Student s1 = new Student();
		// s1이라는 변수를 선언하였는데 초기값으로 student라는 클래스를 사용
		// 클래스 하나에 (나이 점수 이름 등을 저장하여 사용할 수 있음)
		s1.name = "고길동";
		s1.age = 11;
		s1.score = 80;
		s1.height = 177.7;

		Student s2 = new Student(); // new로 초기화 해야함
		s2.name = "박민수";
		s2.score = 85;
		s2.age = 15;
		s2.height = 172.8;

		Student s3 = new Student();
		s3.name = "김익수";
		s3.score = 90;
		s3.age = 19;
		s3.height = 167.7;

		Student[] students = { s1, s2, s3 };
		
//		System.out.print(" 이름  | 나이 | 점수 |   키\n");
//		for (int i = 0; i < students.length; i++) {
//			if (students[i].name.equals("김익수")) {
//				System.out.println("나이 : " + students[i].age);
//			}
//		}
		//
		Car c1 = new Car("911", 220); //합 메모리 인스턴스 생성, '인스턴스화'라고 부름
//		c1.model = "k5"; //필드에 값만 담아두는것, sysou로 담긴 필드를 출력 따로 해야함.
		c1.price = 22000000;
		c1.speed = 30;
		System.out.println("최고속도 : " + c1.maxSpeed + "km/h");
		c1.setSpeed(60);
		c1.start(); //실제 기능
		c1.run();
		c1.stop();
		c1.showSpeed();
		
		System.out.println();
		Car c2 = new Car("펠리세이드", 200);
		c2.price = 25000000;
		c2.speed = 80;
		c2.setSpeed(75);
		c2.start();
		c2.run();
		c2.start();
		c2.showSpeed();
//		{System.out.println(students[i].name +",   " + students[i].age +",  " +
//		students[i].score + ",   "+ students[i].height);
//		}
	}

}
