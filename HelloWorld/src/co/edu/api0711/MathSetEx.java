package co.edu.api0711;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 데이터 저장 = 배열
 * 컬렉션 ArrayList = 인덱스 값 지정, 동일한 ㄱ밧 다른 인덱스
 * 컬렉션 HashSet = 인덱스 값 지정X, 동일한 값 저장 X
 */
public class MathSetEx {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("고길동");
		set.add("홍길동");
//		set컬렉션은 중복된 값을 받아들이지 않는다.
		System.out.println(set.size());
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) { //hasNext : 컬렉션에서 가지고 올 요소가 있는지 체크하는것
			System.out.println(iter.next()); //next : 실제 요소 선택
		}
		
		System.out.println("=== ArrayList ===");
//		Array리스트는 값을 저장하기때문에 중복값도 받아들임
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("고길동");
		list.add("홍길동");
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
