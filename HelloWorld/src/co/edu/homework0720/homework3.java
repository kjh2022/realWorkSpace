package co.edu.homework0720;

import java.util.Scanner;

public class homework3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		System.out.println("x의 값 입력");
		int x = scan.nextInt();
		System.out.println("y의 값 입력");
		int y = scan.nextInt();

		if (x > 0) {
			if (y > 0) {
				System.out.println("제 1사분면");
			} else {
				System.out.println("제 4사분면");
			}
		} else {
			if (y > 0) {
				System.out.println("제 2사분면");
			} else {
				System.out.println("제 3사분면");
			}
		}
		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
		int year = 0;
		System.out.println("년도 입력");
		year = Integer.parseInt(scan.nextLine());
		if (year % 4 == 0 && year != 0 || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
		System.out.println("가위,바위,보 중에 하나를 입력하세요.");
		String rsp = scan.nextLine();
		int bot = (int) (Math.random() * 3) + 1;

		if (bot == 1) {
			System.out.println("컴퓨터 : 가위");
		} else if (bot == 2) {
			System.out.println("컴퓨터 : 바위");
		} else {
			System.out.println("컴퓨터 : 보");
		}

		switch (rsp) {
		case "가위":
			if (bot == 1) {
				System.out.println("컴퓨터가 가위를 냈습니다."
						+ "이기기 위해서 바위를 내야합니다.");
			} else if (bot == 2) {
				System.out.println("컴퓨터가 바위를 냈습니다."
						+ "이기기 위해서 보를 내야합니다.");
			} else {
				System.out.println("당신이 이겼습니다.");
			}
			break;

		case "바위":
			if (bot == 1) {
				System.out.println("당신이 이겼습니다.");
			} else if (bot == 2) {
				System.out.println("컴퓨터가 바위를 냈습니다."
						+ "이기기 위해서 보를 내야합니다.");
			} else {
				System.out.println("컴퓨터가 보를 냈습니다."
						+ "이기기 위해서 가위를 내야합니다.");
			}
			break;

		case "보":
			if (bot == 1) {
				System.out.println("컴퓨터가 가위를 냈습니다."
						+ "이기기 위해서 바위를 내야합니다.");
			} else if (bot == 2) {
				System.out.println("당신이 이겼습니다.");
			} else {
				System.out.println("컴퓨터가 보를 냈습니다."
						+ "이기기 위해서 가위를 내야합니다.");
			}
			break;

		default:
			System.out.println("다시 입력 하세요.");
		}

		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		int m;
		int n;
		

		System.out.println("단을 입력해 주세요.");
		m = scan.nextInt();

		System.out.println("얼마까지 곱해볼까요?");
		n = scan.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println(m + "*" + i + " = " + m * i);
		}
	}
}
