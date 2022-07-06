package co.edu.compound;
//게시글, 제목, 내용, 작성자, 작성일시, 조회수 확인 가능해야함.
//Board: 정보저장 클랙스
//게시글 1건의 정보를 담고싶을떼
import java.util.Date;

public class Board {
	private String title;
	private String content; //alt + shift + s, r 누르고 모두선택후 완료
	private String writer;
	private Date createDate;
	private int hitCount;
	//생성자, getter, setter
	
	public Board() {
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

}
