package practice;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		String str1 = scan.nextLine();
		
		System.out.println("사칙연산 기호 중 하나를 입력하세요.");
		String ob = scan.nextLine();
		
		System.out.println("두번째 숫자를 입력하세요.");
		String str2 = scan.nextLine();
		
		double num1 = Integer.parseInt(str1);
		double num2 = Integer.parseInt(str2);
		double num3; 
				
			if(ob.equals("+")){
				num3 = num1 = num2;
			}
			else if (ob.equals("-")) {
				num3 = num1 - num2;
			}
			else if (ob.equals("*")) {
				num3 = num1 * num2;
			}
			else{
				 num3 = num1 / num2;
			System.out.print("계산 결과 :" + num3);
			}
			scan.close();
	}
}
