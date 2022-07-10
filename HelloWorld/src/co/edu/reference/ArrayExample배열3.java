package co.edu.reference;

public class ArrayExample배열3 {
	public static void main(String[] args) {
		// 배열 선언
		int[] intAry = { 22, 33 };
		intAry = new int[] { 24, 56, 77, 43, 99 };
//변수에 배열을 재할당 할 때는 옆의 모양inAry = new int[]{재할당 할 변수}으로 사용해야한다.
		int sum = 0; // sum의 값을 배열의 크기로 나눠보아라.
		for (int i = 0; i < intAry.length; i++) {
			
			sum += intAry[i];
		}
		double avg = (double) sum / intAry.length;
		System.out.printf("합계: %d, 평균: %.1f 입니다.\n", sum, avg);
		// 배열 선언
		int[][] nestAry = new int[2][3];
		nestAry[0][0] = 10; // 첫번째 배열의 첫번째 자리에 10이라는 숫자를 담는것
		nestAry[0][2] = 30;// 첫번째 배열의 세번째 자리에 30담기
		nestAry[1][1] = 40; // 두번째 배열의 첫번째 자리에 40
		System.out.println("1.nestAry 첫번째 배열.");
		for (int i = 0; i < nestAry[0].length; i++) {
			System.out.print(nestAry[0][i] + " ");// 첫 번째 배열의 인덱스 값(3칸)을 돌며 출력한다는 뜻.
		}

		System.out.println("\n2.nestAry 두번째 배열.");
		for (int i = 0; i < nestAry[0].length; i++) {
			System.out.print(nestAry[1][i] + " ");
		}
		
		nestAry = new int[][] {{1, 2}, {3, 4, 5}, {6, 7, 8}};
		
		System.out.println("\n3.중첩 배열.");
		for (int i = 0; i < nestAry.length; i++) {
			for (int j = 0; j < nestAry[i].length; j++) {
				System.out.println("(" + i + ", " + j + ") => " + nestAry[i][j]);
			}
		}

	}
}
