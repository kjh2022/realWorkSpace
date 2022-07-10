package co.edu.reference;

public class DataTypeExample2 {
	public static void main(String[] args) {
//	기본 데이터 타입.
		int num1 = 100;
		int num2 = 100;

		System.out.println(num1 == num2);

//	참조 데이터 타입. 주소값이 담김. 참조 타입은 변수 초기화를 할때 null을 사용한다.
		String str1 = new String("고길동"); // 고길동이라는 객체 주소값을 가지고 있다
		String str2 = new String("고길동");// 이것도 고길동이라는 객체 주소값을 갖고 있으나 str1과 다르게 취급함
		System.out.println(str1 == str2); // 변수의 주소를 비교하는것. 값은 같아도 주소가 다르므로 false
		System.out.println(str1.equals(str2));// equals는 값을 비교하는것. 주소는 다르지만 값이 같아서 true

//		int result = 0; //
//		String str3 = null; // 위아래 둘 다 같으나 string 타입에서는 0을 null로 사용, 자주 접하는 오류라고 한다.

		System.out.println(str1.equals(str2));
	}
}
