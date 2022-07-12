package co.edu.collect0712;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<>();
		
		que.offer("홍길동");
		que.offer("김민수");
		que.offer("박찬호");
		que.offer("김승환");
		
		while (!que.isEmpty()) {
		String result = que.poll();
		System.out.println(result);
		}if (que.isEmpty()) {
			System.out.println("입력된 값이 더이상 없습니다.");
		}
		
		
		
		

	}

}
