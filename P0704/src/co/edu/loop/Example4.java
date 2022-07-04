package co.edu.loop;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		// while 반복문의 종료조건.
		// 1~100 임의의 수 생성
		Scanner scan = new Scanner(System.in);

		int temp = (int) (Math.random() * 100) + 1;
		System.out.println("값을 입력하세요.");
		while (true) {
			int inputVal = scan.nextInt();

			if (inputVal == temp) {
				System.out.println("맞췄습니다.");
				break;
			} else if (inputVal > temp) {
				System.out.println(inputVal + "보다 작습니다.");

			} else if (inputVal < temp) {
				System.out.println(inputVal + "보다 큽니다.");
			}
		}
		System.out.println("end of pregram.");
		scan.close();
	}
}
