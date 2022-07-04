package co.eeu;

public class CompareOperator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		// == 같다, != 논리부정(같지않다), > , >=, <, <=
		// if구문과 함께 쓰이는 것들
		
		if(num1 == num2) {
			System.out.println("두 수가 같습니다.");
		}

		if(num1 != num2) {
				System.out.println("두 수가 다릅니다.");
		}
		 num1 = 20;
		if(num1 >= num2) {
			System.out.println("num1이 num2보다 크거나 같습니다.");
		}
		
//		클래스의 값을 비교하면, String는 문자열을 담기위한 클래스인데
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		System.out.println(name1 + ", " + name2);
		
//		if(name1 == name2) {
		if(name1.equals(name2)) { //문자열을 비교 할 경우에는 equals()라는 메소드를 사용해야 한다.
			System.out.println("두 값이 동일합니다.");
		}else {
			System.out.println("두 값이 동일하지 않습니다.");			
		}
		
		String result = (name1.equals(name2)) ? "두 값이 동일합니다." : "두 값이 동일하지 않습니다.";
			System.out.println(result);

//		삼항연산자.  세 개의 피연산자를 필요로 하는 연산자, if else구문을 대체하기 위해 사용
		boolean isTrue = false; //반환값
		if (num1 > num2) {
			isTrue =  true;
		}else {
			isTrue = false;
		}	System.out.println(isTrue);
//		아래처럼 하면 위의 if else구문처럼 4줄을 쓸 필요가 없다 하지만 반환값이 꼭 있어야 함
		isTrue = (num1 > num2) ? true : false; //변환 타입에 변수 선언
		System.out.println(isTrue);
		
		result = (num1 > num2) ? "true" : "false";
		System.out.println(result); //문자열 변환 => result사용해야함
		
		}

}
