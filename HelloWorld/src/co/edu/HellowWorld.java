package co.edu;

public class HellowWorld {
	public static void main(String[] args) {
// 변수의 종류: int(정수), double(실수),
//boolean(논리값) String(문자열)
//int(4byte) < double(8byte)
//정수: byte(1byet) < short(20byte) < int(4byte) <long(8byte)
		String name = "김준형";
		/*my_age나 2, 3번째 단어의 첫 번째 글자는 대문자로 해서
		단어의 조합임을 알린다.*/
		int myAge = 25; //선언하면서 값을 할당 =>초기화.
		int yourAge; //선언만 한것, 초기화X 초기화는 이후에 해도O
		yourAge = 24;
		double height = 167.7;
		boolean isMarried = false;
		String myAddress = "경산시";
		
		myAge = 28;
		height = 170;
		
		int result = myAge + yourAge;
		double result1 = (double) myAge + height;
		System.out.println(result);
		
		
		System.out.println("반가워요 " + name + "입니다. ");
	}
}
