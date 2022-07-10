package co.edu3;
/*
 * 상수 vs 변수
 */

/*
 * 클래스 선언은 파일 하나당 클래스 하나만 선언하는것이 규칙이며 그게 구분하기 쉽고 편하다. 
 * 하지만, 파일 하나당 여러개의 클래스 선언이 가능은 함
 * import (패키지파일명.클래스파일명) 으로 다른 패키지에 있는 클래스 파일을 접근할 수 있따. 
 */

class Person {
	final String ssn; // ssn : 주민등록번호
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class FinalExample {
	public static void main(String[] args) {
		// 변수 - 변경 가능함
		String name = "웰시코기";
		name = "김성수";

		// 상수 - 항상 그 값으로 존재함, 바꿀 수 없음.
		final int num = 10;
//		num = 580;  final local variable num cannot be assigned
//					새로운 값을 더 할당할 수 없다는 뜻ㅎ.

		Person person = new Person("200307-3790614", "고곽김");
		person.name = "홍성민";
//		person.ssn = "200827 - 3790614"; //바꿀 수 없는 값이므로 변경 불가.

	}

}
