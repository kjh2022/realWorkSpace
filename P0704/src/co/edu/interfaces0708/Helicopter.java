package co.edu.interfaces0708;
/*
 * Flyer 인터페이스를 구현하는 클래스.
 */
public class Helicopter implements Flyer{

	public void takeOff() {
		System.out.println("헬리콥터가 이륙합니다");
	}

	public void fly() {
		System.out.println("헬리콥터가 날아갑니다");
	}

	public void land() {
		System.out.println("헬기 착륙합니다.");
	}
	

}
