package co.edu.reference;

public class ForExample포문01 {
	public static void main(String[] args) {
		// 정수를 담을 수 있는 배열을 하나 만든다.
		int[] tempAry = new int[5];
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 50) + 1;
		}
//		가장 큰 값을 max라는 변수에 구해보기. "가장 큰 값입니다"라는 문구도 출력되게
		for (int num : tempAry) {
			System.out.println(num);
		}
		int max = 0;
		for (int i = 0; i < tempAry.length; i++) {

			if (tempAry[i] > max) {
				max = tempAry[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
	}
}
