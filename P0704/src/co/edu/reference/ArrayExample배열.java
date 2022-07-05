package co.edu.reference;

public class ArrayExample배열 {
	public static void main(String[] args) {
		// 배열의 저장공간 선언하기
		int[] intAry = new int[10];
		// 정수를 담고 다룰 수 있는 10개의 공간을 선언하는것, 저장공간이 10개인 객체
		// byte, short, int, long
		intAry[0] = 10; // index값은 0부터 시작한다. 지금은 첫 번째 값에 10이라는 수를 할당해준것
		intAry[4] = 50;

		System.out.println(intAry.length); // length - 읽기 전용 속성 인덱스 배열 총 갯수를 알려줌

		for (int i = 0; i < intAry.length; i++)
			System.out.print(intAry[i] + " ");
		System.out.println();
		double[] dblAry = new double[5]; // double 데이터 값을 담을 수 있는 공간 5개 선언
		for (int i = 0; i < dblAry.length; i++) {
			System.out.print(dblAry[i] + " ");
		}
		System.out.println();

		boolean[] boolAry = new boolean[3];
		boolAry[1] = true;
//		boolAry[2] = "true" boolAry에는 boolean형을 대입하여야 한다 문자열을 담을 수 없다.
		for (int i = 0; i < boolAry.length; i++) {
			System.out.print(boolAry[i]);
		}
		System.out.println();

		String[] strAry = { "홍길동", "김명수", "허언기" }; // 초기값으로 3개의 값을 할당했다.
		strAry[0] = "이경영"; // 실행오류 발생
		for (int i = 0; i < strAry.length; i++) {
			System.out.print(strAry[i] + " ");

		}

	}
}