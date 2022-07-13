package co.edu.io.memo0713;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		MemoManager memoApp = MemoManager.getInstance();
		Scanner scan = new Scanner(System.in);
		int selNo;
		boolean run = true;

		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.등록 | 2.검색 | 3.삭제 | 4.종료");
			System.out.print("메뉴 선택> ");
			selNo = Integer.parseInt(scan.nextLine());

			switch (selNo) {
			case 1:
				memoApp.InputData();
				break;
			case 2:
				memoApp.search();
				break;
			case 3:
				memoApp.deleteData();
				break;
			case 4:
				memoApp.storeToFile();
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
