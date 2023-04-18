package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 제일작은수제거하기_stack {

	//프로그래머스 제일 작은 수 제거하기
	//관련해서 간단하게 테스트만 함 이걸로 저 문제를 풀지는 마래
	public static void main(String[] args) {
		int[] n = {4, 3, 2, 1};
		//Arrays.sort(n);
		Stack<Integer> stack = new Stack<>();
		for (int item : n) {
			stack.push(item);
		}
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		int[] answer = new int[stack.size()];
		for (int i = answer.length; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}

}
