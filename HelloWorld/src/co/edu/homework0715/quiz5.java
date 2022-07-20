package co.edu.homework0715;
/* 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다.
힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요. */
public class quiz5 {
	public static void main(String[] args) {
		int value = 485;
		int n1 =4, n2 =8, n3 = 5;
		double result = 0;
		
		result = n1 * n2 * n3;
		System.out.println(result);
		
		result = (double) n1 / n2 / n3;
		System.out.println(result);
		
		result = n1 - n2 - n3;
		System.out.println((int)result);
		
		// 문제2) 아래와 같이 각 변수를 초기화하였을 때 다음 결과를 차례대로 false 와 true로 출력하도록 수정하세요.
				int m = 10;
				int n = 5;

				System.out.println( ( m*2 == n*4 ) || ( n<=5 ) );		
				System.out.println( ( m/2 > 5) && ( n%2 < 1) );
	}

}
