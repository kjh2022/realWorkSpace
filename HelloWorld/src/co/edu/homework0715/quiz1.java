package co.edu.homework0715;
/*
 * 문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라.
 * 출력예시) "변수명1: 변수값, 변수명2: 변수값"
 */
public class quiz1 {
	public static void main(String[] args) {
		int num1 = 37, num2 = 91;
		double result = 0;
		System.out.printf("num1: %d, num2: %d", num1, num2);
		System.out.println();

/*문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.*/
//		2.1) 91 더하기 37
		result = num2 + num1;
		System.out.println("문제2.1 결과: " + result);
//		2.2) 91 빼기 37
		result = num2 - num1;
		System.out.println("문제2.2 결과: " + result);
//		2.3) 91 곱하기 37
		result = num2 * num1;
		System.out.println("문제2.3 결과: " + result);
//		2.4) 91 나누기 37
		result = (double) num2 / num1;
		System.out.printf("문제2.3 결과: %.1f", result);
	}

}
