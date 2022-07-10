package co.edu.loop;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.입금, 2.출금, 3.잔액조회, 4.종료
		int valance = 0;

		while (true) {
			System.out.println("1.입금, 2.출금, 3.잔액조회, 4.종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("입금액을 입력하세요>>>> ");
				int amt = sc.nextInt();
				if (valance + amt > 100000) {
					System.out.println("입금액이 100,000원을 초과하였습니다.");
					continue;
				}
				if(amt < 0)
					System.out.println("입금액은 0원 이상이어야 합니다.");
					continue;
				}
/*				if (valance += amt);
				System.out.println("정상적으로 처리되었습니다.");

			} else if (menu == 2) {
				System.out.println("출금액을 입력하세요>>>>");
				int amt = sc.nextInt();
				valance -= amt;
				System.out.println("정상적으로 처리되었습니다.");
				if (valance + amt < 100000) {
					System.out.println("잔액이 부족합니다.");
				}

			} else if (menu == 3) {
				System.out.println("현재 잔액은 : " + valance + "원 입니다.");

			} else if (menu == 4) {
				System.out.println("사용을 종료하겠습니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 입력하셨습니다.");
*/
				sc.close();
			}
		}
}
