package co.eeu;

public class BitOperator {

	public static void main(String[] args) {
		int num =10;
		int result = ~num; // -11이된다 비트 반전 연산자
		result++;
		System.out.println(result);

		//대입 연산자 (오른쪽에 있는 항목을 왼쪽으로 담는다) : =, +=, -=, *=, /2 .....
		String names = "홍길동";
		names = names + " 김민수";
		names += " 박의지"; //+=는 윗 값의 누적
		
		System.out.println(names);
		
		result = result - 2;
		result -= 2; //윗 값에 -2를 누적시킴
		System.out.println(result);
	}

}
