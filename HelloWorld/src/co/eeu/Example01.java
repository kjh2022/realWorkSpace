package co.eeu;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("임의의 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		
		boolean idEven = num1 % 3 == 0;
		if(idEven) {
			System.out.println( num1 + "은 3의 배수입니다.");
		}else{
			System.out.println( num1 +  "은(는) 3의 배수가 아닙니다.");
		}
		//if구문 사용하여 임의의 값이 3의 배수가 맞다면 => 입력값 6은 3의 배수입니다. 라는 문구가 나오게 만들기
		
		
		
		scan.close();
	}

}
