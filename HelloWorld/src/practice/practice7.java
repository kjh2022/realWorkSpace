package practice;
//		double va = 3.14;
//		float va2 = 3.14159f;
import java.util.Scanner;

public class practice7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력:");
		String nu1 = scan.nextLine();
		
		System.out.println("사용할 사칙연산 기호 입력:");
		String kiho = scan.nextLine();
		
		System.out.println("두번째 수 입력:");
		String nu2 = scan.nextLine();
		
		double num1 = Integer.parseInt(nu1);
		double num2 = Integer.parseInt(nu2);
		double num3;
		
			if(kiho.equals("+")) {
				num3 = num1 + num2;	
			}
			else if (kiho.equals("-")) {
				num3 = num1 - num2;
			}
			else if (kiho.equals("*")) {
				num3 = num1 * num2;
			}
			else num3 = num1 / num2;
			System.out.println("계산 결과 = " + num3);
		scan.close();		

	}

}
