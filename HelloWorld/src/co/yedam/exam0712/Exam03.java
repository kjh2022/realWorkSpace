package co.yedam.exam0712;

import java.util.Scanner;

/*
 * 문제 3: 배열사용.
 * 정수(int)를 저장할 수 있는 배열(크기 3)을 선언하고 Scanner 클래스를 이용하여 사용자의 입력값을 저장 후
 * 저장 된 값중에서 합과 평균을 구하는 기능을 작성하세요.
 * 출력 예 : [12, 21, 17] 합: 50, 평균: 16.7
 */
public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] intAry = new int[3];
		
		System.out.println("첫번째 값을 입력하세요.");
		intAry[0] = scn.nextInt();
		
		System.out.println("두번째 값을 입력하세요.");
		intAry[1] = scn.nextInt();
		
		System.out.println("세번째 값을 입력하세요.");
		intAry[2] = scn.nextInt();
		
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		double avg = (double) sum / intAry.length;
		System.out.printf("합은 %d, 평균은 %.1f 입니다.", sum, avg);
	}
}
