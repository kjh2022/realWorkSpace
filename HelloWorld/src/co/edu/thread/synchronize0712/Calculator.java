package co.edu.thread.synchronize0712;

public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
//	1개 메소드가 처리를 끝내는 동안 다른 스레드가 메서드에 접근하지 못하게 하는 명령어가
//	synchronized다
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
