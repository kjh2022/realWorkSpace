package co.edu;

public class Example01 {
	
	public static void main(String[] args) {
		boolean isTrue = false;
		
		int myAge = 20;
		int yourAge = 25;
		myAge = 23;
		
		isTrue = myAge > yourAge; //false
		if (isTrue) {
			System.out.println("나의 나이가 더 많다.");
		} else {
			System.out.println("나의 나이가 더 적다.");
		}
				
		//float, double : double default
		float f1 = 23.4f; //4byte
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		double d1 =23.4; //8byte
		
		// 0~10 정수는 정확한 값이 나오지만
		//0~1사이의 실수는 무한히 많다
		double result = 1.1 + 2.2;
		System.out.println(result);
		
		//long(8byte, 넣을 수 있는 범위가 크다) float(4byte, 표현할 수 있는 범위가 넓다)
		float sum = 2345L + 22.3F;
		
		

	}

}
