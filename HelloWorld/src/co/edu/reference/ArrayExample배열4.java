package co.edu.reference;

public class ArrayExample배열4 {
	public static void main(String[] args) {
//		A반 80 85 83
//		B반 79 84 90(점)

		int[][] banAry = new int[2][3];// 첫번째 행은 반이 2개라서 2, 열은 학생이 3명이라 3이 들어감
//		int[][] banAry = new int[][] { {80, 85, 83}, {79, 84, 90} };// 으로도 표현 가능
		banAry[0][0] = 80;
		banAry[0][1] = 85;
		banAry[0][2] = 83;
		banAry[1][0] = 79;
		banAry[1][1] = 84;
		banAry[1][2] = 90;

		int sum = 0;
		for (int i = 0; i < banAry[0].length; i++) {
			sum += banAry[0][i];
		}
		System.out.printf("A반의 총점은 : %d점, 평균 점수는 : %.1f점 입니다.", sum, (double) sum / banAry[0].length);

		sum = 0;
		for (int i = 0; i < banAry[1].length; i++) {
			sum += banAry[1][i];
		}
		System.out.printf("\nB반의 총점은 : %d점, 평균 점수는 : %.1f점 입니다.", sum, (double) sum / banAry[1].length);
	}

}
