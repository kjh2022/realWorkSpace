package co.edu.collect.Board0712;

/*
 * 글 제목, 작성자, 내용을 담을수있도록 필드 선언
 * Board 클래스 : 데이터를 담아주는 용도
 * BoardDAO : 데이터의 입출력 담당
 * BoardApp : main 메소드를 담고있는 클래스
 * 			<1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료>
 * 변수 저장 -> 배열(클래스) 저장 -> 컬렉션(클래스)저장 -> 파일 시스템 저장 -> DBMS저장(개인프로젝트)
 */
public class Board {
	private String title;
	private String writer;
	private String content;

	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
