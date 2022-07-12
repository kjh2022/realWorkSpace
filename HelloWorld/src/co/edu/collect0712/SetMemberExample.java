package co.edu.collect0712;

import java.util.HashSet;
import java.util.Set;

/*
 * 중복요소 제거
 * set컬렉션의 중복여부를 체크 => hashCode
 */
class Member {
	private int id;
	private String name;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name= " + name + "]";
	}

	@Override
	public int hashCode() { // 해시코드의 역할은 각 인스턴스마다 고유한 값을 가지고
		return this.id;

	}

	@Override
	public boolean equals(Object obj) {
//		id와 이름이 같으면 => 논리적으로 동등한 객체이다.
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return this.id == mem.id && this.name.equals(mem.name);
		}
		return false;
	}

}

public class SetMemberExample {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();
		members.add(new Member(10, "홍길동"));
		members.add(new Member(20, "김민수"));
		members.add(new Member(30, "홍길동"));
		members.add(new Member(10, "홍길동")); // 중복 제거위해 hashCode, equals 메소드를 정의했다.

		members.clear(); //모든 요소 제거 메소드
		System.out.println("컬렉션이 비어있습니다.");
		for (Member member : members) {
			System.out.println(member.toString());
		}
	}
}
