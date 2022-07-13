package com.edu.exam0713;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {
	Scanner scan = new Scanner(System.in);
	List<Member> members = new ArrayList<Member>();

	public void execute() {
		int selNo;
		boolean run = true;

		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반=>기본정보+도서반장,강의실이름 <기본 정보(도서반)에 추가정보(도서반장, 강의실이름) 저장
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급
		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.등록 | 2.수정 | 3.전체 리스트 | 9.종료");
			System.out.print("기능 선택> ");
			selNo = Integer.parseInt(scan.nextLine());

			if (selNo == 1) {
				System.out.println("아이디> ");
				int id = Integer.parseInt(scan.nextLine());
				System.out.print("이름> ");
				String name = scan.nextLine();
				System.out.println("연락처> ");
				String phone = scan.nextLine();

				int choice = 0;
				System.out.println("등록 할 동아리를 선택하세요");
				System.out.println("1.독서부 | 2.수영부 | 3.축구부");
				choice = Integer.parseInt(scan.nextLine());

				if (choice == 1) {
					System.out.println("반장 이름 입력> ");
					String head = scan.nextLine();
					System.out.println("강의실 입력> ");
					String room = scan.nextLine();

					Member bClub = new BookMember(id, name, phone, head, room);
					addMember(bClub);
				} else if (choice == 2) {
					System.out.println("강사 이름 입력> ");
					String tName = scan.nextLine();
					System.out.println("수영 등급 입력> ");
					String swimGrade = scan.nextLine();

					Member swClub = new SwimMember(id, name, phone, tName, swimGrade);
					addMember(swClub);
				} else if (choice == 3) {
					System.out.println("코치 이름 입력> ");
					String cName = scan.nextLine();
					System.out.println("라커룸 번호 입력> ");
					String lNum = scan.nextLine();

					Member soClub = new SoccerMember(id, name, phone, cName, lNum);
					addMember(soClub);
				}

			} else if (selNo == 2) {
				System.out.println("수정할 회원 아이디를 입력하세요");
				int id = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < members.size(); i++) {
					if(members.get(i).getMemberId() == id) {
						modifyMember(members.get(i));
						
						System.out.print("수정할 연락처를 입력해 주세요>");
					}
				}

			} else if (selNo == 3) {
			} else if (selNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 선택해 주세요");
			}

		}
		System.out.println("프로그램 종료");
		scan.close();
	}

	@Override
	public void addMember(Member member) {
		members.add(member);
	}// 등록

	@Override
	public void modifyMember(Member member) {
		for (int i = 0; i < members.size(); i++) {
			if (member.getMemberId() == members.get(i).getMemberId()) {
				members.get(i).setPhone(member.getPhone());
			}
		}
	}// 수정

	@Override
	public List<Member> memberList() {
		return members;
	}// 목록
}
