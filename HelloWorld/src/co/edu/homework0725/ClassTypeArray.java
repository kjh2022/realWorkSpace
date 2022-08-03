package co.edu.homework0725;

import java.util.HashMap;
import java.util.Scanner;

public class ClassTypeArray {

	public static void main(String[] args) {
//		클래스 타입 배열
//		1.Product라는 클래스를 만들 생각을 했으면 좋았다, 배열이나 리스트를 관리하기 위해서. 
//		배열에 있는 데이터를 가져와서 프로그램을 만들기 위해
//		2.만든 클래스에는 가격이나 수량이 들어갈 수 있다고 생각 가능...
//		3.Product[] proArr; 생성
//		4.각 인덱스 호출하고 최고 가격, 제품 골라내기, 제품을 제외한 총합계산
//		5.코딩 실행
		Product[] pro = null;
		pro = new Product[10];
		pro[0] = new Product();

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int item = 0;
		HashMap<String, Integer> product = new HashMap<>();
		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택>> ");
			
		
		}
	}
}
