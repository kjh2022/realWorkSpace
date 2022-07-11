package Exception0711;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 */
public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("숫자를 입력해>");
		int num = scan.nextInt(); //정수가 입력되어야 하는 자리에 문자열이 입력될 경우 InputMisMatch오류가 뜬다
		System.out.println("입력한 숫자" + num);

		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해 주세요");
			
		}
		
		System.out.println("프로그램 종료");
	}

}
