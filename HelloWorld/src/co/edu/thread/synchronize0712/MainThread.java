package co.edu.thread.synchronize0712;

public class MainThread {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		user1 user1 = new user1();
		user1.setCalculator(calculator);
		user1.start();
		
		user2 user2 = new user2();
		user2.setCalculator(calculator);
		user2.start();
	}

}
