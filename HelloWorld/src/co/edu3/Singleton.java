package co.edu3;
//싱글벙글톤을 만드는 이유는 instance를 여러개 생성하지 않고 하나만 존재하도록 하게 만들기 위해
public class Singleton {
	
	private static Singleton instance = new Singleton(); 
	private Singleton() {	
	}
	public static Singleton getInstance() {
		return instance;
	}

}
