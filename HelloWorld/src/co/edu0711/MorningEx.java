package co.edu0711;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] fruits = { "딸기", "바나나", "오렌지", "파인애플" };

		boolean isExist = false;
		System.out.println("찾는 괴일을 입력하세요> ");
		String fruit = scan.nextLine();

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(fruit)) {
				System.out.println((i + 1) + "번째 위치에 있습니다.");
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			System.out.println("찾는 과일이 없습니다.");
		}
		scan.close();
	}

}
