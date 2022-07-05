package co.edu.reference;

public class NestloopExample중첩반복문1 {
	public static void main(String[] args) {

		for (int j = 1; j <= 5; j++) {
//			System.out.println("j 의 값: " + j);
			for (int i = 1; i <= 5; i++) {
//				System.out.println("i 의 값: " + i);
			}
		}
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d \n", j, i, (j * i));

			}
//			System.out.println();
		}

//* 이렇게 진행되는 반복문 출력해보기
//**
//***
//****
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// *이렇게 진행되는 반복문 출력해보기
//  **
// ***
//****
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i + j < 5) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
