package co.edu;

public class Variable {

	public static void main(String[] args) {
		byte b1 = 10; // -128 < byte < 127
		short b2 = 32767; // -32,768 < short < 32,767
		int n1 = 0; // -2,147,483,648 < int < 2,147,483,647
		long l1 = 8; // -9,223,372,036,854,775,808 < long < 9,223,372,036,854,775,807
		
		int result = b1 + 20; //정수끼리의 연산 기준은 int이므로 선언이 byte로 되면 계산이 안된다
		long result1 = l1 + 20; //데이터 타입 변환 : 자동형변환(promotion) -제목 왼쪽에 선언
		result = (int) l1 + 20; //데이터타입 변환 : 강제형변환(casting) - 수식에 선언
//		System.out.println(result);
		
		char c1 = 'A';
//		c1 = c1 + 1;//정수연산은 기본int타입, 현재는 캐릭터 타입이라서 안된다
		c1++;
//		for (int i=0 ; i < 27; i++) {
			System.out.println((int) c1++);
			for (int i=0; i < 4; i++) {
				for (int j=0; j <= i; j++) {
					System.out.print("*");					
				}
			System.out.println();
		}
	}
}