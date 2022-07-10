package co.eeu;

public class SwitchCondition {
	public static void main(String[] args) {

		int result = (int) (Math.random() * 6) + 1; // 0<= temp < 1 0보다는 크거나 같고 1보다는 작은 실수를 만들어주는 메소드
		//
/*		if (result == 1) {
			System.out.println("1번 출력.");
		} else if (result == 2) {
			System.out.println("2번 출력.");
		} else if (result == 3) {
			System.out.println("3번 출력.");
		} else if (result == 4) {
			System.out.println("4번 출력.");
		} else if (result == 5) {
			System.out.println("5번 출력.");
		} else if (result == 6) {
			System.out.println("6번 출력.");
		}
		System.out.println(result);
*/ 
		//switch 구문 활용 스위치의 특징은 case에 만나지면 그 아래에 있는 case모두 출력하게 만들어짐
		// 결과값을 멈추게 하고싶으면 braek; 구문을 추가해야 한다.
		switch(result) {
		case 1: 
			System.out.println("1번 출력."); break;
		case 2:
			System.out.println("2번 출력."); break;
		case 3:
			System.out.println("3번 출력."); break;
		case 4:
			System.out.println("4번 출력."); break;
		case 5:
			System.out.println("5번 출력."); break;
		case 6:
			System.out.println("6번 출력.");
			
		}

		}
}
