package 문자열;

import java.util.Arrays;

public class A로B만들기 {

	//프로그래머스 A로 B만들기 문제
	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int answer = 0;
		
		String[] b = before.split("");
		String[] a = after.split("");
		
		Arrays.sort(b);
		Arrays.sort(a);
		
		if(Arrays.equals(a, b)) answer = 1;
		
		System.out.println(answer);
	}

}
