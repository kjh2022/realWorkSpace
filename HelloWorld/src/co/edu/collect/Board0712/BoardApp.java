package co.edu.collect.Board0712;

import java.util.List;
import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardDAO boardDao = BoardDAO.getInstance();

		while (true) {
//					메뉴 선택 => 선택값 =>구현
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.목록 | 2.등록 | 3.조회(작성자) | 4.삭제 | 5.종료");
			System.out.print("선택> ");
			int selNo = Integer.parseInt(scan.nextLine());

			if (selNo == 1) {
				List<Board> list = boardDao.boardList();
//				for(int i=0; i < list.size(); i++){
//					System.out.println(list.get(i).getTitle());
//					System.out.println(list.get(i).getContent());
//					System.out.println(list.get(i).getWriter());
//					System.out.println();
//				}

				for (Board board : list) {
					System.out.println("제목: " + board.getTitle());
					System.out.println("내용: " + board.getContent());
					System.out.println("작성자: " + board.getWriter());
					System.out.println();
				}
				System.out.println("조회완료");

			} else if (selNo == 2) {
				System.out.println("글 제목을 입력하세요.");
				String title = scan.nextLine();

				System.out.println("글 내용을 입력하세요.");
				String content = scan.nextLine();

				System.out.println("작성자 이름을 입력하세요.");
				String writer = scan.nextLine();

				Board board = new Board(title, writer, content);
				boardDao.add(board);

			} else if (selNo == 3) {
				System.out.println("조회할 작성자 이름을 입력하세요> ");
				String findWriter = scan.nextLine();
				List<Board> list = boardDao.search(findWriter);
				for (Board board : list) {
					System.out.println("제목: " + board.getTitle());
					System.out.println("내용: " + board.getContent());
					System.out.println("작성자: " + board.getWriter());
					System.out.println();
				}
				System.out.println("조회가 완료되었습니다.");

			} else if (selNo == 4) {
				System.out.println("삭제할 제목을 입력해 주세요> ");
				String DelTit = scan.nextLine();
				boardDao.remove(DelTit);

			} else if (selNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바르지 않은 입력입니다. 다시 선턱해 주세요");
				continue;
			}

		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
