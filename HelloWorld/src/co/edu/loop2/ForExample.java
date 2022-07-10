package co.edu.loop2;

public class ForExample {
	public static void main(String[] args) {

		int sum = 0;
/*		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println("i의 값: " + i + ", sum의 값:" + sum);
			}
		}
		System.out.println("결과값: " + sum);

		// 1~10까지의 값 반복, result라는 변수에 값을 누적시키도록
		// 1, 3, 5, 7, 9 -> 누적
		// 1, 4, 7, 10 -> 누적
		int result = 0;
		for (int i = 1; i <= 10; i += 2) {
			result += i;
		}
		System.out.println("1~10까지 누계:" + result);
*/
		// 1~10까지 출력
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		//10~1까지 출력
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
/*
 * 반복문 for (초기화식; 조건식; 증감식) {엄준식 조건식이 만족될때까지 반복수행한다
 * 
 * 
 */
