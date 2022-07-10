package co.edu.reference;

public class ArrayExample배열메소드 {
	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++)
			sum += ary[i];
		return sum; // 메소드를 호출한 영역으로 sum값을 다시 반환.
	}
	public static void main(String[] args) {

	}

}

//public static int sumAry(int num) { //<-메소드 사용 예시, 메소드가 있으면 중복구문 작성필요 없다.
//	return num * 2;