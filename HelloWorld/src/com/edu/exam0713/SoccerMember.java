package com.edu.exam0713;

// 축구반의 코치이름.
// 락커룸의 이름.(A, B, C, D)

// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
public class SoccerMember extends Member {
	private String cochN;
	private String lockN;

	public SoccerMember(int memberId, String memberName, String phone, String cochN, String lockN) {
		super(memberId, memberName, phone);
		this.cochN = cochN;
		this.lockN = lockN;
	}

	public String toString() {
		return "축구부 회원 [회원 아이디= " + getMemberId() + "이름=" + getMemberName() + //
				", 연락처= " + getPhone() + ", 코치 이름=" + cochN + ", 락커룸=" + lockN + "]";
	}

}
