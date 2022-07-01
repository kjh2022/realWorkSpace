package co.edu;

public class example02 {
	//나의 키 나누기 친구의 키 두개 변수 선언 변수 이름은 규칙 지어서
	public static void main(String[] args) {

		double myHeight = 175.3;
		double yourHeight = 170.8;
		
		double theDifference = 0;
		//큰것에서 작은것을 빼고싶을때 사용하는 용도(변수)
		 
		boolean isTrue = myHeight > yourHeight;
		if (isTrue ) {
			theDifference = myHeight - yourHeight;
			System.out.println( "나의 키가 " +theDifference +"cm 만큼 더 큽니다." );
		} else {
			theDifference = yourHeight - myHeight;
			System.out.println("나의 키가" + theDifference + "cm 더 작습니다.");
		}

	}

}
