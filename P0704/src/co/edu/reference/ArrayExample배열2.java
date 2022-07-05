package co.edu.reference;

public class ArrayExample배열2 {
	public static void main(String[] args) {
		int[] intAry = { 20, 27, 15, 33, 29 };
		// 배열의 크기 5, intAry.length
		
		//세번째에 있는 15를 30으로 변경해보기
		intAry[2] = 30;
		
		//0번과 1번의 위치를 바꾸기
		int temp = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = temp;
		
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
//			if (intAry[i] % 2 == 0)
//			if(i % 2 ==0) {
//				System.out.print(intAry[i] + " ");
//			}
			sum += intAry[i];
		}
		System.out.println("합계: " + sum);
	}

}
