package co.edu.api0711;

import java.util.ArrayList;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer("100"); //오류는 아니지만 이런 방식으로 사용하지말라는 표현
		System.out.println(i);
		
		int i2 = 100;
				
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // 100(int) -> 100(Integer) 박싱
		list.add(200);
		list.add(new Integer(300)); //deprecated  차후에 사용을 중지할것이니 더이상 사용하지 마세요
		
		for(int num : list) {
			System.out.println(num);
		}
//		문자열 => 숫자로 변환
		int n1 = Integer.parseInt("1000");
		double n2 = Double.parseDouble("23.3");
	}
}
