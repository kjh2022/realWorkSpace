package co.edu.reference;

class Person {
	String name;
	int age;
}

public class DataTypeExample {
	public static void main(String[] args) {

		int num1 = 100;
		int num2 = num1;
		num1 = 200;

		System.out.println("num1:" + num1); // 메모리상 stack 값이 100에서 200으로 바뀌었다.
		System.out.println("num2:" + num2); // stack값 100 그대로 유지

		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		Person p2 = p1;
		
		p1.name = "고길동";
		p1.age = 24;
		
		p2.name = "둘리";
		p2.age = 100000007;
		
		System.out.println("이름 : " + p1.name +", 나이 : " + p1.age);
		System.out.println("이름 : " + p2.name +", 나이 : " + p2.age);

//		String name1 = "고길동";
//		String name2 = "고길동";
//		name1 = "홍길동";
//		System.out.println(name1 == name2);
//		
//		System.out.println("name1 : " + name1);
//		System.out.println("name2 : " + name2);
	}

}
