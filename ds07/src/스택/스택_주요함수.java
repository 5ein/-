package 스택;

import java.util.Stack;

public class 스택_주요함수 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		//선입후출(FILO, First Input Last Output)
		stack.add("홍길동");
		stack.add("김길동");
		stack.add("송길동");
		stack.push("정길동"); //push와 add는 똑같다
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.get(1));
		System.out.println(stack.get(2));
		System.out.println(stack.get(3));
		System.out.println(stack.pop()); //pop해서 제일위에있는거 빼줘
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.get(1));
		System.out.println(stack.get(2));
		System.out.println(stack.empty()); //스택이 비어있니?
		System.out.println(stack.contains("홍길동")); //홍길동 가지고 있니?
		System.out.println(stack.peek());//제일 위에 있는애 출력해줘
	}
}
