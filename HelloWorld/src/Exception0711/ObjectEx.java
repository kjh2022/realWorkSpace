package Exception0711;

/*
 * 
 */
class Member {
	String id;
	int age;

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member) {
			boolean b1 = this.id.equals(((Member) obj).id);
			boolean b2 = this.age ==((Member) obj).age;
			return b1 && b2;
		}
		return false;
	}

	@Override
	public String toString() {
		return "아이디: " + id + ", 나이: " + age;
	}

}

public class ObjectEx {
	public static void main(String[] args) {
		
		

		Object objt1 = new Object(); // instance => 주소값 각자 주소값이 다름
		Object objt2 = new Object(); // instance => 주소값 그래서 비교하면 false가 나옴

		System.out.println(objt1.equals(objt2));
		System.out.println(objt1.toString());// Object.toString();오브젝트가 갖고있는 toString 불러

		String name1 = new String("고길동"); //
		String name2 = new String("고길동"); //

		System.out.println(name1.equals(name2));
		System.out.println(name1.toString());

		Member member1 = new Member();
		member1.id = "user1";
		member1.age = 10;

		Member member2 = new Member();
		member2.id = "user1";
		member2.age = 10;

		System.out.println(member1.equals(member2));
		
		System.out.println(member1.equals(member2));//물리적으로 다른 개체가 논리적으로 동일한 개체로 인식할 수 있게 바꿈
		System.out.println(member1.toString()); //Object.toString(); 이것도 오브젝트가 갖고있는 toString
	}
}
