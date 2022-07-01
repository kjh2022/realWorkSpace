package co.edu;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String n1 = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String n2 = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String n3 = scanner.nextLine();
		
		System.out.println("");
		System.out.println("[입력한 내용]");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		scanner.close();

	}

}

