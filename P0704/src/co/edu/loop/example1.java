package co.edu.loop;

public class example1 {
	public static void main(String[] args) {

		// 10번 반복
		// 변수 num <- 1~10까지의 임의의 정수 .Math.radnom();생성하여
		// 변수 sum <- 2의 배수.
		int num, sum2, sum3;
		sum2 = sum3 = 0; //초기화 하는 내용은 반복문 밖에서 초기화(픽스) 되어야 한다
		
		for (int i = 1; i <= 10; i++) {
			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) { // 2의 배수를 sum2에 누적
				sum2 += num;
		}
			if (num % 3 == 0) {// 3의 배수를 sum3에 누적
				sum3 += num;
			}
		}
  
		System.out.println("2의 배수의 합계:" + sum2);
		System.out.println("3의 배수의 합계:" + sum3);
			}
		
		
/*		for (int i = 1; i <= 10; i++) {

			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) {
				sum += num;
				System.out.println(num + ", " + sum);
			}
		}
		System.out.println("2의 배수의 합계:" + sum); 
		for (int i =1; i <= 10; i++) {
			num =(int) (Math.random() * 10) + 1;
			if (num % 2 == 0 || num % 3 == 0){
				sum += num; // = sum = sum + num; 같은 의미다
				System.out.println(num + ", " + sum);
			}
		}
		System.out.println("2와 3의 배수의 합계:" + sum);*/
}
