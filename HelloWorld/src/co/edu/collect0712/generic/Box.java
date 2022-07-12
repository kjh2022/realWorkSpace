package co.edu.collect0712.generic;
/*
 * 제네릭 : 타입을 클래스 정의 시점이 아닌, 사용 시점에 지정하는것
 */
public class Box<T> {
	private Object obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return (T) obj;
	}
}
