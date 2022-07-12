package co.edu.collect0712;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set (인터페이스) => HashSet, FreeSet
 */
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("딸기");
		set.add("수박");
		set.add("딸기");
		System.out.println("크기: " + set.size());
		
		set.remove("딸기");
		System.out.println(set.contains("딸기"));
		
		if(set.isEmpty()) {
			System.out.println("컬렉션이 비어있습니다.");
		}
//		반복요소 처리.
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.print(val + " ");
		}
		System.out.println();
//		반복처리.
		iter = set.iterator(); //반복자 틀 획득
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.print(val + " ");
		}
		System.out.println();
//		확장 for 구문
		for (String val : set) {
			System.out.print(val + " ");
		}
	}
}
