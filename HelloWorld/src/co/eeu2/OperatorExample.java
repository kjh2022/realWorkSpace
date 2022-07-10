package co.eeu2;

import java.util.Scanner;
//연산자
public class OperatorExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2;
			result = num1 - num2;
			result = num1 * num2;
			result = num1 / num2;
			result = num1 % num2;//나머지 연산자 1의 값을 2로 나눈 나머지를 구한다는 뜻
		
		//result = num1 % num2; //나머지가 있으면 홀수 나머지가 없으면 짝수
		
/*	System.out.println("임의의 값을 입력: ");
		num1 = scan.nextInt();

		if(num1 % 2 == 0) {
			System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
		}
		int result1 = 20 + (2 * 3);
		System.out.println(result1);
		
		num1++; // num1 = num1 + 1; num1에 1을 증가시킨다는 뜻
		System.out.println(num1);
		num1--;
		System.out.println(num1);
 */	
		System.out.println(++num1); //++가 왼쪽, 오른쪽 위치에 따라서 결과 값이 달라진다
	 
		result = ++num1 + ++num2;//num1 = 11, num2 = 21
		System.out.println(result); // result : 31, num1 : 12, num2 : 21
		
		result = num1 + num2;
		System.out.println(result);
		
		//논리 부정 연산자: !
		boolean idEven = result % 2 == 0;
		if(!idEven) {
			System.out.println("결과 값이 홀수입니다.");
		} 
		
	scan.close();	
	}
	
}
