package co.eeu2;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
//		사용자 입력값을 읽어서(스캐너 활용) 100점~90점 : A, ~80 : B, ~70 :C, 그 외 모두 D가 되도록
//		출력값은 : 점수 78은 C등급입니다! 가 나오도록
		Scanner scan = new Scanner(System.in);

		System.out.println("점수 입력");
		int sco = scan.nextInt();
		String grade = "";
// if구문을 만족하는 구문이 오면 if를 또 사용할 수 있다(ex.만약의 만약의 만약), 하지만 if를 많이 사용하지 않는 방향으로 가는것이 좋다.
		if (sco >= 90 && sco <= 100) {
			if (sco >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (sco >= 80) {
			if (sco >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (sco >= 70) {
			if (sco > 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "D";
		}
		System.out.println("점수 " + sco + "은(는)" + grade + "등급입니다!");
	}
}