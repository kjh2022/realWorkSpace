package co.yedam.exam0712;

import java.util.Scanner;

/*
 * 문제 5: 배열.
 * members 배열에서 회원의 아이디를 조회하는 기능을 작성하세요.
 * 사용자의 입력값을 배열에서 조회하고 입력한 값의 회원아이디가 존재할 경우에 출력.
 * 예) 사용자 입력값 : white => "입력한 회원아이디가 존재합니다."
 *    사용자 입력값 : black => "입력한 회원아이디가 없습니다."
 */
public class Exam05 {
	public static void main(String[] args) {
		boolean isIn = false;
		Scanner scn = new Scanner(System.in);
		String[] members = { "green", "blue", "white", "red", "bluesky" };
		System.out.println("찾는 회원 아이디를 입력하세요.");
		String id = scn.nextLine();

		for (int i = 0; i < members.length; i++) {
			if (members[i].equals(id)) {
				isIn = true;
			}
		}
		if (isIn) {
			System.out.println("입력한 아이디가 존재합니다.");
		}else {
			System.out.println("입력한 아이디가 없습니다.");
		}
	}
}
