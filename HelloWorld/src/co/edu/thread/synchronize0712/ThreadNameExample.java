package co.edu.thread.synchronize0712;

/*
 * Thread 상속받아 클래스를 2개 생성 ThreadA, ThreadB
 */
class ThreadA extends Thread {
	public ThreadA() {
		setName("Thread-A");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread 명 = " + getName());
		}
	}

}

class ThreadB extends Thread {
	public ThreadB() {
		setName("Thread-B");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread 명 = " + getName());
		}
	}

}

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread threadA = new ThreadA();
		threadA.start();

		Thread threadB = new ThreadB();
		threadB.start();

	}

}
