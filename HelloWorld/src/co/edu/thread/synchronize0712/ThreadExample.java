package co.edu.thread.synchronize0712;

/*
 * 0.8초의 간격을두고 경고음을 내는 스레드
 */
import java.awt.Toolkit;

public class ThreadExample {
	public static void main(String[] args) {// 메인 스레드

//		Thread의 생성자 매개값 (Runnable 구현객체)
		Thread beep = new Thread(new BeepTask());

//		Thread 클래스 상속 받은 하위 클래스 생성자.
		beep = new BeepWorkerThread();
		beep.start();

//		콘솔 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
