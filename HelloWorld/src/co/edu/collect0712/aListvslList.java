package co.edu.collect0712;

import java.util.ArrayList;
import java.util.LinkedList;

public class aListvslList {
	public static void main(String[] args) {

//	ArrayList vs LinkedList의 차이

		ArrayList<String> aList = new ArrayList<String>();

		LinkedList<String> lList = new LinkedList<String>();
		long start = System.currentTimeMillis(); // 현재시점의 시간을 변수에 담음
		for (int i = 0; i < 1000000; i++) {
			aList.add(0, Integer.toString(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			lList.add(0, Integer.toString(i));
			lList.add(0, Integer.toString(i));
		}
		end = System.currentTimeMillis();
		System.out.println("걸린 시간: " + (end - start));
	}
}