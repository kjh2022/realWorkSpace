package co.edu.reference;

public class Example01 {
	public static void main(String[] args) {
//	1~100까지 수를 출력(for 반복문 사용)
//	짝수만 출력하는 조건문, sum 이라는 변수에 값을 누적시키기		
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				result += i;
			}
		}
		System.out.println(result);

	}

}
