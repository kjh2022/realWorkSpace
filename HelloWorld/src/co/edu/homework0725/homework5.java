package co.edu.homework0725;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class homework5 {
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int item = 0;
		HashMap<String, Integer> product = new HashMap<>();
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택>> ");
			int selNo = Integer.parseInt(scan.nextLine());

			switch (selNo) {
			case 1:
				System.out.println("상품 갯수를 입력하세요>> ");
				item = Integer.parseInt(scan.nextLine());
				if (item < 1) {
					System.out.println("상품 갯수를 1개 이상 입력하세요");
					continue;
				}
				System.out.println("입력되었습니다.");
				break;

			case 2:
				if (product.size() == item) {
					System.out.println("더이상 입력할 수 없습니다.");
					continue;
				}
				for (int i = 0; i < item; i++) {
					System.out.println("상품명을 입력하세요>> ");
					String name = scan.nextLine();
					System.out.println("가격을 입력하세요>> ");
					int pric = Integer.parseInt(scan.nextLine());
					product.put(name, pric);
				}
				break;
			case 3:
				Set<String> keySet = product.keySet();
				for (String key : keySet) {
					System.out.println("상품명: " + key + ", 가격: " + product.get(key));
				}
				break;
			case 4:
//				4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				int max = 0, sum = 0;
				for (String key : product.keySet()) {
					if (max < product.get(key)) {
						max = product.get(key);
					}
					sum += product.get(key);
				}
				System.out.println("최고 가격 상품: " + max);
				System.out.println("최고 가격 상품 제외한 제품들의 총 합: " + (sum - max));
				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("올바르지 않은 입력입니다. 다시 선택해 주세요.");
			}

		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}
