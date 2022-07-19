package com.edu.exam0713;

// 도서반의 반장이름. toString 메서드를 오버라이딩 하기
// 도서반의 강의실정보.(지혜실, 지식실, 모험실)

// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
public class BookMember extends Member {
	private String headN;
	private String roomN;

	public BookMember(int memberId, String memberName, String phone, String headN, String roomN) {
		super(memberId, memberName, phone);
		this.headN = headN;
		this.roomN = roomN;
	}

	@Override
	public String toString() {
		return "도서부 회원 [회원 아이디" + getMemberId() + "이름=" + getMemberName() + //
				", 연락처= " + getPhone() + ", 반장 이름=" + headN + ", 강의실=" + roomN + "]";
	}

}