package co.edu.reference;

import java.util.Scanner;

public class MorningEx201p6번 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 학생 수
		int[] scores = null; // 참조변수 초기화

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택 >> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				System.out.println("학생 수 입력 >>> ");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
				if (studentNum < 1) {
					System.out.println("error : 학생 수를 1명 이상 입력해야 합니다.");
					continue;
				}
				System.out.println("정상적으로 처리되었습니다.");

			} else if (selectNo == 2) {
				System.out.println("점수 입력 >>> ");
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >>");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >> " + scores[i]);
				}

			} else if (selectNo == 4) {
				System.out.println("분석 >>> ");
				int sum = 0;
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + sum / scores.length);

			} else if (selectNo == 5) {
				run = false;
				break;
			} else {
				System.out.println("올바르지 않은 입력입니다. 다시 선택해 주세요.");
				continue;
			}

		}
		System.out.println("프로그램 종료.");
		scan.close();
	}

}
