package co.edu.interit.friend0708;

import java.util.Scanner;

public class FriendApp {
	// 생성자, 기본생성자 사용
	Friend[] friends = new Friend[10];
	int friendNum;
	Scanner scn = new Scanner(System.in);

	public void start() {
		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//			System.out.println("1.등록 2.조회 3.목록 9.종료");
			timerShow("1.등록 2.조회 3.목록 9.종료");
			System.out.print("선택> ");
			int selectNo = 0;
			try {
				selectNo = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다. 다시 한 번 입력해 주세요.");
				continue;
			}

			if (selectNo == 1) {
				add();
			} else if (selectNo == 2) {
				search();
			} else if (selectNo == 3) {
				list();
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바르지 않은 입력입니다. 다시 선택해 주세요.");
				continue;
			}
		}
		System.out.println("프로그램 종료");
		scn.close();
	} // end of start

	private void add() {
		int choice = 0;

		while (true) {
			System.out.println("1.학교 2.회사 3.친구");
			System.out.print("선택> ");
			try {
				choice = Integer.parseInt(scn.nextLine());
			if (!(choice ==1 || choice == 2 || choice == 3)) {
				System.out.println("1, 2, 3번중에 선택하세요.");
				continue;
			}
				break;
			} catch (Exception e) {
			}
		}
		System.out.print("이름> ");
		String name = scn.nextLine();
		System.out.print("연락처> ");
		String phone = scn.nextLine();

		if (choice == 1) {
			System.out.print("학교 이름>");
			String univ = scn.nextLine();
			System.out.print("전공> ");
			String major = scn.nextLine();

			friends[friendNum++] = new UniFriend(name, phone, univ, major);

		} else if (choice == 2) {
			System.out.print("회사 이름>");
			String com = scn.nextLine();
			System.out.print("부서> ");
			String dept = scn.nextLine();

			friends[friendNum++] = new ComFriend(name, phone, com, dept);

		} else if (choice == 3) {
			friends[friendNum++] = new Friend(name, phone);
		} else {
			System.out.println("올바르지 않은 입력입니다. 다시 선택해 주세요.");
		}

	}

	private void search() {
		// 친구이름 입력시, 친구의 상세정보가 나오게. showInfo()호출하여 정보를 볼 수 있도록.
		System.out.print("검색할 친구의 이름 입력> ");
		String ffn = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(ffn)) {
				friends[i].showInfo();
				System.out.println("\n조회 완료");
				return;
			} else if (friends[i] == null) {
			}
		}
		System.out.println("없는 친구입니다.");

	}

	private void list() {
		for (int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
		}

	}
	private void timerShow(String msg) {
		String[] message = msg.split("");
		for (int i = 0; i < message.length; i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(75);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}