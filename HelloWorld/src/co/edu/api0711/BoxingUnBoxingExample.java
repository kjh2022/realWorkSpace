package co.edu.api0711;

import java.util.HashSet;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {

//		로또번호 생성, 중복 가능성이 있음
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		for (int j=0; j < i; j++) { //현재 값과 동일한 값이 없는지 체크
			if (lotto[j] == lotto[i]) {
				i = i -1;
			}
		}
		}
		
		for (int num : lotto) {
			System.out.print(num + " ");
		}
		System.out.println();
		//중복되지 않는 로또번호 생성
		HashSet<Integer> set = new HashSet<Integer>();

		int cnt = set.size(); // 1, 2, 3, 3 => 3
		while (cnt < 6) {
			int temp = (int) (Math.random() * 45) + 1;
			set.add(temp);
			cnt = set.size();
			System.out.print(temp + " ");

		}
		

//		박싱
//		Integer obj1 = new Integer(100);
//		Integer obj2 = new Integer("200");
//		Integer obj3 = Integer.valueOf("300");

//		언박싱
//		int value1 = obj1.intValue();
//		int value2 = obj2.intValue();
//		int value3 = obj3.intValue();
//		
//		System.out.println(value1);
//		System.out.println(value2);
//		System.out.println(value3);
	}
}
