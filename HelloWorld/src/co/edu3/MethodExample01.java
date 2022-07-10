package co.edu3;
//메소드 연습용, 메소드는 입력값(매개변수), 출력값(반환값) 두 가지를 생각해야한다.
public class MethodExample01 {
	public static void main(String[] args) {
		sum(10, 20); //sum의 경우 void(반환하지않음)라서 결과값을 반환할 수 없음

		int result = sum2(5, 10);//(sum2 메소드를 호출한 영역으로 결과를 반환함)
		System.out.println("결과 : " + result);
		
		result = sum2(sum2(3, 5), sum2(5, 7));
		System.out.println("결과 : " + result);
						//42 + 93
		double weight =  proWeight(175);
		System.out.println("적정 몸무게는 " + weight + "kg 입니다.");
		
		double Tryangle = getTryangle(23.4, 12.2);
		System.out.println("결과는 " + Tryangle);
		
	}
//메소드 : 입력값 -> 처리 -> 출력값
	public static void sum (int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		System.out.println("결과 : " + result);
	}
	
	public static int sum2(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		return result;
	}
	//키 입력 -> 처리 -> 적정 몸무게 반환식 구성 ((키 - 100)  *  0.9);
	public static double proWeight(double height) {
		double weight = (height - 100) * 0.9;
		return weight;
		
	}
	//삼각형의 넓이 구하는 메소드 (밑변, 높이) => 넓이 (밑면x높이 / 0.5) 밑뱐 23.4 높이 12.2 = 결과는?
	public static double getTryangle (double fo, double hi) {
		double Tryangle = (fo * hi / 2);
		return Tryangle;
	}
	
	
}
