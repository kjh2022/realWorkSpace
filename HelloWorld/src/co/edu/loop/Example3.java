package co.edu.loop;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0; // sum의 값이 100을 넘어서면 종료
		do {
			System.out.println("임의의 값을 입력하세요.");
			int num = scan.nextInt();
			sum += num;
			// 추가
			// 누적값이 100을 초과하기 전의 값을 출력

			if (sum > 100) {
				sum -= num;
				System.out.println("반복문을 종료합니다.");
				isTrue = false;// or break;
			}

		} while (isTrue);
		// 누적값이 100을 초과하기 전의 값을 출력해보자
		System.out.println("sum의 누적값: " + sum);
		System.out.println("end of program.");

		scan.close();
	}

}
