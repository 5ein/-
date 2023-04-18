package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어_stack {

	//프로그래머스 같은 숫자는 싫어 문제
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		for (int x : arr) {
			if(x != stack.peek()) {
				stack.push(x);
			}
		}
		System.out.println(stack);
		
		int[] answer = new int[stack.size()];
		//1. get 사용방법
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.get(i);
		}
		//2. pop 사용방법
		for (int i = answer.length - 1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}

}
