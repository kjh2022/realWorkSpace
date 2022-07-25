package com.edu;

public class CollegeStudent extends Student {
//	대학생정보 : 담당교수, 전공과목 정보 추가.
	private String uProf;
	private String major;

	public CollegeStudent (String studNo, String studName, int score, String uProf, String major) {
		this.uProf = uProf;
		this.major = major;
	}

	
	
	// 생성자.
	public CollegeStudent() {}

	// toString()
	@Override
	public String toString() {
		return "대학생 [담당 교수=" + uProf + ", 전공=" + major + "]";
	}
}
