package co.edu.reference;

public class Method구구든 {
	public static void main(String[] args) {

		printGu();
	}
	public static void printGu() {
		for (int i = 1; i <= 9; i++) {
			for (int d = 2; d <= 9; d++) {
				System.out.printf("%d * %d = %d \t", d, i, (d * i));
			}
			System.out.println();
		}
	}

}
