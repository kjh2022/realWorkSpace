package co.edu.reference;

import java.util.Scanner;

public class ForExample포문02 {
	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int i = 0; i < ary.length; i++)
			sum += ary[i];
		return sum; //메소드를 호출한 영역으로 sum값을 다시 반환.	
	}
	public static void main(String[] args) {
		// 메소드 호출구문
//		int result = sumAry(intAry);
//		System.out.println("결과값 : " + result);
		// 문제 - 정수 배열의 합계와 평균.
		int sum = 0;
		int avg = 0;
		int[] intAry = { 34, 23, 56, 22, 99, 28 };
		// 1. intAry배열의 합과 평균
		sum = sumAry(intAry);
//		avg = (double) sum / intAry.length;
		System.out.printf("배열의 합은 %d 이고, 평균은 %.1f 입니다. \n", sum, (double) sum / intAry.length);
		
		sum = 0;
		int[] intArray = new int[6];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100) + 1;
		}
		
		sum = sumAry(intArray);
		System.out.printf("배열의 합은 %d 이고, 평균은 %.1f 입니다. \n", sum, (double) sum / intArray.length);
		// 2. intArray배열의 합과 평균
	
		sum = 0;
		int[] scanArray = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < scanArray.length; i++) {
			System.out.println("임의의 수를 입력>>>>");
			scanArray[i] = scan.nextInt();
		}
		sum = sumAry(scanArray);
		System.out.printf("배열의 합은 %d 이고, 평균은 %.1f 입니다. \n", sum, (double) sum / scanArray.length);
		scan.close();
		//3. scanArray배열의 합과 평균.
	}

}
