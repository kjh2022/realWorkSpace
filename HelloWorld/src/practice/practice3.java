package practice;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = scnr.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String num1 = scnr.nextLine();
		System.out.print("3. 전화번호: ");
		String num2 = scnr.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(num1);
		System.out.println(num2);

		
		scnr.close();
	}

}
