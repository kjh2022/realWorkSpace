package co.edu.io.memo0713;

import java.io.Serializable;

//아무 가능은 없고 직렬화,역직렬화를 할 수 있는 클래스임을 알려준다.
/*
 * 메모번호, 날짜와 시간, 메모내용
 */
public class Memo implements Serializable { // 알아서 객체를 byte 타입으로 변경시켜줌
	private int no; // 필드 선언부
	private String date;
	private String content;

	public Memo(int no, String date, String content) { // 생성자 선언 이 생성자가 없으면 실행 못함
		this.no = no;
		this.date = date;
		this.content = content;
	}

	public Memo() {
	} // 기본 생성자

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Memo [번호=" + no + ", 날짜=" + date + ", 내용=" + content + "]";
	}

}
