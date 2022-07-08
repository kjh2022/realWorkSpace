package co.edu.interfaces0708;

public interface Flyer {
	//필드, 생성자 없음
	//메소드도 규칙(이름)만 정함 리턴타입이 없는 void
	public void takeOff(); //구현 부분이 없는 메소드 = <<추상 메소드>> / 이륙하는 기능 정의
	public void fly(); //비행 기능 정의
	public void land(); //착륙 기능 정

}
