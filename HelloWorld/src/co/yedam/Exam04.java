package co.yedam;

/*
 * 문제 4: 임의의 값 생성.
 * Math.random()을 사용하여 1 ~ 100 의 임의의 값을 생성하여 배열(크기 6)에 저장 후
 * 가장 큰 값과 가장 작은 값을 구해서 출력하는 기능을 작성하세요.
 * 출력 예 : 가장 큰 값 : 97, 가장 작은 값 : 3
 */
public class Exam04 {
	public static void main(String[] args) {
		int[] tempAry = new int[6];
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 100) + 1;
		}
		
		for (int num : tempAry) {
			System.out.println(num);
		}
	
		int max = 0;
		int min = tempAry[0];
		
		for (int i = 0; i < tempAry.length; i++) {
			if (tempAry[i] > max) {
				max = tempAry[i];
			}

			if (tempAry[i] < min) {
				min = tempAry[i];
			}
		}
		System.out.println("가장 큰 값 : " + max + ", 가장 작은 값 : " + min);
	}
}
