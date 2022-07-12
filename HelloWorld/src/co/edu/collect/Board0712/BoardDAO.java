package co.edu.collect.Board0712;

import java.util.ArrayList;
import java.util.List;

/*
 * 목록 등록 조회(작성자) 삭제 기능
 */
public class BoardDAO {
//	싱글톤
	private static BoardDAO instance = new BoardDAO();
	List<Board> list;

	private BoardDAO() {
		list = new ArrayList<>();
	} // 생성자의 외부접근을 막음

	public static BoardDAO getInstance() {
		return instance;
	}

//	1.목록
	public List<Board> boardList() {
		return list;
	}

//	2.등록
	public void add(Board board) {
		list.add(board);
		System.out.println("등록이 완료되었습니다.");
	}

//	3.조회(작성자)
	public List<Board> search(String writer) {
		List<Board> list = new ArrayList<>(); // 찾고자 하는 이름 => 리스트
		boolean isIn = false;
		for (Board board : this.list) {
			if (board.getWriter().equals(writer)) {
				list.add(board);
				isIn = true;
			}

		}
		if (!isIn) {
			System.out.println("없는 작성자명입니다.");
		}
		return list;
	}

//	4.삭제(제목을 입력하면 삭제되도록)
	public void remove(String title) {
		boolean isIn = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				System.out.println("삭제 완료되었습니다.");
				isIn = true;
			}
		}
		if (!isIn) {
			System.out.println("제목이 일치하지 않아 삭제할 수 없습니다.");
		}
	}
}
