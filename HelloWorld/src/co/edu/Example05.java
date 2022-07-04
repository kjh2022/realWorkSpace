package co.edu;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		
//		String name = new String("홍길동"); //<-원래 스트링도 이게 정석
		Scanner sn = new Scanner(System.in);
		
//		String input = sn.nextLine();
//		sn.nextLine();//사용자 입력값을 문자열로 읽는 메소드
//		sn.nextInt();//사용자 입력값 정수로 읽는 메소드
//		int Input = sn.nextInt();
//		System.out.printf("입력값은 %d", Input);

		System.out.println("첫 번째 값을 입력.");
		int num1 = sn.nextInt();
		System.out.println("두 번째 값을 입력.");
		int num2 = sn.nextInt();
		
		int result = num1 - num2; //입력한 두 수의 합을 결과 변수에 담아보고
		if (num1 > num2) {
			result = num1 - num2;
			System.out.printf("입력값 %d와 %d의 차이는 %d 입니다.", num1, num2, result);
		} else {
			result = num2 - num1;	
			System.out.printf("입력값 %d와 %d의 차이는 %d 입니다.", num1, num2, result);
		sn.close();
		}
	}
}