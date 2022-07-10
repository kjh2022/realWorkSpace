package co.edu3;
//static 정적메소드, 정적필드를 사용 
public class StaticMain {
	public static void main(String[] args) {
		//정적(static)기능
		
		System.out.println(Calculator.pi);
		int result = Calculator.sum(10, 20);
		System.out.println(result);
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);
	}

}
