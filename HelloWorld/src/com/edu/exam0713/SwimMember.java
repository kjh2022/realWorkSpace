package com.edu.exam0713;

// 강습반의 강사이름.
// 수영등급(A,B,C,D)

// 정보출력시 => 강사이름: 홍길동, 등급: A 
public class SwimMember extends Member {
	private String teacher;
	private String swimLv;

	public SwimMember(int memberId, String memberName, String phone, String teacher, String swimLv) {
		super(memberId, memberName, phone);
		this.teacher = teacher;
		this.swimLv = swimLv;
	}

	public String toString() {
		return "BookMember [회원 아이디=" + getMemberId() + "이름=" + getMemberName() + //
				", 연락처= " + getPhone() + ", 강사 이름=" + teacher + ", 수영 등급=" + swimLv + "]";
	}

}
