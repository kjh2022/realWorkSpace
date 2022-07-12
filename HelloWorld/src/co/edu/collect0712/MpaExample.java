package co.edu.collect0712;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 학생의 이름과 점수를 Map타입에 저장.
 * 김민수80/황현욱75/이승현88/
 * Scanner class사용하여 학생의 이름 입력받아서 그 학생의 점수가 반환될 수 있도록
 */
public class MpaExample {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean isFind = false;

		Map<String, Integer> students = new HashMap<String, Integer>();
		students.put("김민수", 80);
		students.put("황현욱", 75);
		students.put("이승현", 88);

		// 출력결과 : , 평균점수. 최고점수: , 최고점수 학생의 이름 : "김홍철"이 나오게
		int sum = 0,
			avg = 0,
			max = 0;
		String name = "";
		Set<Entry<String, Integer>> set = students.entrySet();
		for (Entry<String, Integer> ent : set) {
			if (ent.getValue() > max) {
				max = ent.getValue();
				name = ent.getKey(); 
			}
			sum += ent.getValue();
		}
		System.out.println("평균 점수: " + sum / students.size());
		System.out.println("최고 점수: " + max);
		System.out.println("최고점 학생: " + name);
		
		

//		for (int i = 0; i < )	
//		System.out.println("평균점수: " + avg);

//		System.out.println("점수를 출력할 학생의 이름 입력>> ");
//		String name = scan.nextLine();
//
//		Set<Entry<String, Integer>> set = students.entrySet();
//
//		for (Entry<String, Integer> ent : set) {
//			if (ent.getKey().equals(name)) {
//				System.out.println("학생의 점수: " + ent.getValue());
//			}
//		}
		if (!isFind) {
			System.out.println("없는 학생입니다.");
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}
