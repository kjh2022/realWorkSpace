package co.yedam.exam0712;

/*
 * 문제1: 정수형 변수 num1, num2를 선언하세요.
 * 두변수에 각각 임의 수를 저장한 후 num1 의 값은 num2로 num2의 값은 num1으로 변경하는 기능을 작성하세요.
 * 출력 예) num1=35, num2=27 => 변경 후 num1=27, num2=35
 */
//class Student{
//	private String name;
//	private int age;
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//}

public class Exam01 {
	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 27;
		int temp = 0;

		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.printf("num1: %d, num2: %d\n", num1, num2);

//		System.out.println("num1의 값: " + num1);
//		System.out.println("num2의 값: " + num2);
	}
}
