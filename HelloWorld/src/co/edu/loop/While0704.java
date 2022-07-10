package co.edu.loop;

import java.util.Scanner;

public class While0704 {
	public static void main(String[] args) {
//while문과 Scanner를 이용하여 키보드로 입력된 데이터로 예금~ 출금 조회 종료 기능 제공하는 코드 작성하기
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.입금 : 2.출금 : 3.잔액 조회 : 4.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택> ");

			int menu = scan.nextInt();
			if (menu == 1) { // 입금
				System.out.println("입금하실 금액을 입력하세요>>>>");
				int amt = scan.nextInt();
				if (amt < 1000) {
					System.out.println("최소 입금 금액은 1,000원입니다.");
					continue;
				}
				balance += amt;
				System.out.println("입금이 완료되었습니다.");
			} else if (menu == 2) { // 출금
				System.out.println("출금하실 금액을 입력하세요>>>> 잔액 : " + balance);
				int amt = scan.nextInt();
				if (balance < amt) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				balance -= amt;
				System.out.println("출금이 완료되었습니다. 남은 잔액 : " + balance);
			} else if (menu == 3) { // 잔액
				System.out.println("현재 잔액 : " + balance);
				continue;
			} else if (menu == 4) { // 종료
				break;
			} else { // 나가기
				System.out.println("올바르지않은 입력 값 입니다. 다시 선택해주세요");
				continue;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}
