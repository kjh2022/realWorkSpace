package co.edu.collect0712;

import java.util.Stack;

//push로 요소를 하나씩 담는다
public class StackExample {
	public static void main(String[] args) {
//	Last In First Out
		Stack<String> stack = new Stack();
		stack.push("홍길동");
		stack.push("김연수");
		stack.push("박찬호");

		String elem = stack.pop(); // 요소를 하나씩 꺼냄
		System.out.println(elem);

		elem = stack.pop();
		System.out.println(elem);

		elem = stack.pop();
		System.out.println(elem);

		if (stack.isEmpty()) {
			System.out.println("스택된 것이 더 이상 없습니다.");
		}
	}
}
