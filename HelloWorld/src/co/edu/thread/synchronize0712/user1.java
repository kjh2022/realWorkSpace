package co.edu.thread.synchronize0712;

public class user1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		setName("user-1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
