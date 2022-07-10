package practice;

public class practice8배열매소드포문 {
	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++)
			sum += ary[i];
		return sum;
	}

	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int[] intAry = { 34, 23, 56, 22, 99, 28 };
		sum = sumAry(intAry);
		System.out.printf("배열의 합은 %d 이고, 평균은 %.1f 입니다. \n", sum, (double) sum / intAry.length);

	}

}
