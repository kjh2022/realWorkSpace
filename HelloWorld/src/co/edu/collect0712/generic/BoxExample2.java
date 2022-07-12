package co.edu.collect0712.generic;

public class BoxExample2 {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("기합문자열");
		String result = box.get(); //타입을 작성하는 시점에 에러가 발생함을 알려주는것이 제네릭
//		Integer result1 = box.get(); String -> Integer 
		System.out.println(result);
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); // int => Integer(boxing)
		int result1 = intBox.get(); //Integer => int (nuboxing)
	}

}
