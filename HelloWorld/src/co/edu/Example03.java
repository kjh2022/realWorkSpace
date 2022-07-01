package co.edu;

public class Example03 {

	public static void main(String[] args) {
		//10+20 => 30, "10" + "20"=>1020 문자열이 된다
	/*	System.out.println(10 + 20);
		System.out.println("10" + "20");
		String 홍길동 = "hong";
		//내 이름은 "홍길동"입니다. 문자열이 아니고 변수
		System.out.println("내 이름은 \"홍길동\" 입니다.");
		// {"name" : "홍길동" , "age" : 20} ->제이슨 데이터타입
		System.out.println("{\"name\":\"홍길동\", \"age\":20}");
	 */
		//문자열 -> 정수, 실수.
		int num1 = Integer.parseInt("100");
		double num2 = Double.parseDouble("127.99");
		double num3 = Double.parseDouble("122.01");	
		
		double result = sum(num1, num2);
		result = minus (num2, num3);
		System.out.println("합 결과: " + result);
		System.out.printf("차이는 %.2f입니다.", result);
		
		System.out.printf("\n저의 이름은 %s이고 나이는 %d살 입니다.\n", "홍길동", 14);	
		
		//어떤 변수에 이름, 나이, 몸무게(소수점) 세개의 변수를 선언하라
		//나의 이름은 홍길동이고
		//나이는 16살이고
		//몸무게는 65.4kg입니다. 를 프린트F를 이용하여 표기하라
		String name = "김준형";
		int age = Integer.parseInt("28");
		double weight = Double.parseDouble("61.4");
		System.out.printf("저희 이름은 %s이고 \n나이는 %d살이고\n몸무게는 %.1f 입니다.", name, age, weight);
	}
	//2개의 숫자를 더한 결과를 반환하는 메소드를 만들기
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static double sum(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	public static double minus(double n1, double n2) {
		double sum = n1 - n2;
		return sum;
	}

}