package co.yedam;

import java.util.Scanner;

/*
 * 문제 5: 배열.
 * Scanner 클래스를 사용하여 사용자가 입력한 값을 다음의 배열에서 찾아서 값이 있을 경우에는 해당 값의 저장위치를, 값이 없을 경우에는
 * 찾는 값이 없습니다는 메세지를 보여주도록 기능을 작성하세요.
 */
public class Exam05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] fruits = { "사과", "딸기", "감", "수박", "포도", "복숭아" };

		System.out.println("찾으시는 과일은 입력해 주세요.> ");
		String fru = scn.nextLine();

		for (int i = 0; i < fruits.length; i++) {

			if (fruits[i].equals(fru)) {
				System.out.println("찾으시는 과일은 fruits[" + i + "]");
				break;
			} else {
				if (i == fruits.length - 1) {
					System.out.println("찾는 값이 없습니다.");
				}
			}
		}

	}
}
//}
//boolean run = true;
//int result = 0;
//while (run){