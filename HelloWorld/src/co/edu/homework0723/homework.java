package co.edu.homework0723;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				int idxNo = i;
				System.out.println("60인곳의 인덱스는" + (idxNo+1) + "번 입니다.");
				break;
			}
		}

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (i != 3) {
				System.out.print(arr1[i] + " ");
			}
		}
		System.out.println();
		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		System.out.println("바꾸려는 인덱스 번호 입력");
		int selNo = Integer.parseInt(scan.nextLine());//숫자 외 문자값을 넣으면 변환이 안된다 넘버포멧오류
		arr1[selNo] = 1000;

		System.out.print("변경하고 싶은 인덱스 번호 " + selNo + "번의 입력 결과 :");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\n");
		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자. 
//		최솟값을 선언할때는 아래처럼 배열의 0번을 min으로 하는게 더 낫다
		int max = 0, min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
			if (arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.print("최대값: " + max + ", 최소값: " + min);
		System.out.println("\n");
		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] myArr = new int[10];
		System.out.println("10개의 정수를 입력하세요");
		for (int i = 0; i < myArr.length; i++) {
			System.out.println((int) (i + 1) + "번 정수 입력:");
			myArr[i] = Integer.parseInt(scan.nextLine());
		}
		System.out.print("배열에 담긴 3의 배수: ");
		for (int i = 0; i < 10; i++) {
			if (myArr[i] % 3 == 0) {
				System.out.print(myArr[i] + " ");
			}
		}
		System.out.println("\n");
		// 문제) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
		// 실행결과를 보고, 알맞게 작성해보세요.
		// 문제출처, 이것이 자바다 183페이지 9번

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(scan.nextLine());

			switch (selectNo) {
			case 1:
				System.out.println("학생 수를 입력하세요>> ");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
				if (studentNum < 1) {
					System.out.println("학생 수를 1명 이상 입력해 주세요.");
					continue;
				}
				System.out.println("정상적으로 입력되었습니다.");
				break;

			case 2:
				System.out.println("점수를 입력하세요>>");
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores [" + i + "] >>");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
				System.out.println("정상적으로 입력되었습니다.");
				break;

			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}

				break;
			case 4:
				int sum = 0;
				max = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수 : " + max);
				System.out.printf("평균 점수 : %.1f", (double) sum / scores.length);
				System.out.println();
				break;
			case 5:
				run = false;
				break;

			default:
				System.out.println("올바르지 않은 입력입니다. 다시 선택해 주세요.");
			}
		}
		System.out.println("프로그램 종료.");
		scan.close();
	}
}
