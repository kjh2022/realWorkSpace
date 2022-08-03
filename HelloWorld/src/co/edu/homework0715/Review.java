package co.edu.homework0715;

public class Review {
	public static void main(String[] args) {
		//문제1
		int val = 373; 
		int val2 = 373 / 100; //3
		int val3 = (373 - (val2 * 100) / 10);
		//1.  val2*100 = 3*100
		//2. 373 - val2
		//(373 - (300)) / 10 = 73 / 10 = 7.3(0.3 생략됨)
		int val4 = (373 - (val2*100) - (val3*10));
		//1.val2*100 = 3*100
		//2.373 - val2*100 = 373 - 300
		//3.73 - val3*10 = 73-70 = 3
		
	}
	

}
