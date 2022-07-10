package co.edu.compound;

import java.util.Date;
import java.util.Scanner;

/* BoardApp 
 * 게시글 등록 / 조회/ 수정/ 삭제/ 리스트/ 종료 => 배열에 저장
 * id : user1. passwd:1212 로그인되었습니다.
 * id, pw가 틀리면 ->아이디와 비밀번호를 확인하세요 라는 메시지가 뜨도록
 */
public class BoardApp {

	public static void main(String[] args) {
		Board[] Boards = new Board[100];
		Scanner scan = new Scanner(System.in);

		// 로그인 처리 기능
		String ID = "user1";
		String Password = "1212";
		boolean log = true;

		while (log) {

			System.out.println("아이디를 입력하세요.");
			String id = scan.nextLine();

			System.out.println("비밀번호를 입력하세요.");
			String pw = scan.nextLine();

			if (id.equals(ID) && pw.equals(Password)) {
				System.out.println("정상적으로 로그인 되었습니다.");
				break;
			} else if (id != ID || pw != Password) {
				System.out.println("로그인에 실패했습니다. 아이디와 비밀번호를 확인해 주세요.");
			} 
		}

		boolean run = true;
		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.게시글 등록 2.조회 3.수정 4.삭제 5.리스트 6.종료");
			System.out.println("선택 >>> ");

			int selectNo = Integer.parseInt(scan.nextLine());
//		게시글 제목, 내용, 작성자, 작성일시, 조회수까지 다 나오게 민그리

			if (selectNo == 1) {
				System.out.println("글 제목을 입력하세요.");
				String title = scan.nextLine();

				System.out.println("글 내용을 입력하세요.");
				String content = scan.nextLine();

				System.out.println("글 작성자를 입력하세요.");
				String writer = scan.nextLine();

				Board board = new Board();
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(selectNo);

				// 비어있는 위치에 저장
				for (int i = 0; i < Boards.length; i++) {
					if (Boards[i] == null) {
						Boards[i] = board;
						break;
					}
				}

			} else if (selectNo == 2) { // 조회기준 : 제목조회
				System.out.println("조회할 제목을 입력하세요.> ");
				String findTitle = scan.nextLine();
				for (int i = 0; i < Boards.length; i++) {
					if (Boards[i] != null && Boards[i].getTitle().equals(findTitle)) {
						System.out.printf("제목은 %s, 내용은 %s, 작성자는 %s, 작성일시 %s, 조회수%d 입니다.\n", //
								Boards[i].getTitle(), Boards[i].getContent(), //
								Boards[i].getWriter(), Boards[i].getCreateDate(), //
								Boards[i].getHitCount());

						// 카운트 증가 기능 추가
						int cnt = Boards[i].getHitCount();
						Boards[i].setHitCount(++cnt);
					}
				}

			} else if (selectNo == 3) {
				System.out.println("수정할 게시글 제목을 검색하세요.> ");
				String findTitle = scan.nextLine();
				for (int i = 0; i < Boards.length; i++) {
					if (Boards[i] != null && Boards[i].getTitle().equals(findTitle)) {
						System.out.println("수정할 내용을 입력해 주세요.>");
						String fixContent = scan.nextLine();
						Boards[i].setContent(fixContent);
						System.out.println("수정이 완료되었습니다.");
					}
				}

			} else if (selectNo == 4) {
				System.out.println("삭제할 게시글 제목을 입력하세요.> ");
				String findTitle = scan.nextLine();
				for (int i = 0; i < Boards.length; i++) {
					if (Boards[i] != null && Boards[i].getTitle().equals(findTitle)) {
						Boards[i] = null;
						System.out.println("삭제되었습니다.");
					}
				}
			} else if (selectNo == 5) {
//				전체 리스트 보는 기능
				System.out.println("게시글 목록");
				for (int i = 0; i < Boards.length; i++) {
					if (Boards[i] != null) {
						System.out.printf("제목 : %s, 내용 : %s, 작성자 : %s, 작성일시 : %s, 조회수 : %d\n", //
								Boards[i].getTitle(), Boards[i].getContent(), //
								Boards[i].getWriter(), Boards[i].getCreateDate(), //
								Boards[i].getHitCount());

					}
				}
			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다,");
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 선택해 주세요.");
				continue;
			}
		}
		System.out.println("프로그램 종료.");
		scan.close();
	}
}