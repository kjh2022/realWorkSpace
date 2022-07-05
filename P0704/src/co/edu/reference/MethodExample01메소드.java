package co.edu.reference;

public class MethodExample01메소드 {
	public static void main(String[] args) {
		// 메소드의 실행구문
		long sum = sum(20); // arguments(매개값), 실제 값이 들어가야하는 자리
//					  ㄴint number 이 자리에는 이런식의 숫자가 들어가야함
		showInfo("고길동", 20);
		showInfo("부처", 20050);
		prs(5, "♥");
		for (int i = 2; i <= 6; i++) {
			printGugu(i);
		}
	}

	public static void printGugu(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n ", dan, i, (dan * i));
//						dan + " * " + i + " = " + (dan * i));
		}
		System.out.println();
	}

	public static void prs(int times, String shape) {
		for (int i = 1; i <= times; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i + j < times) {
					System.out.print(shape);
				} else {
					System.out.println(" ");
				}
			}
		}
	}

	// 메소드의 정의구문
	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name + "입니다. 나이는 " + age + "살 입니다.");
	}

	public static long sum(int num) { // parameter(매개변수)
		int result = num * 2;
		return result; // int result를 long값으로 자동형변환(promotion)
	}

}
