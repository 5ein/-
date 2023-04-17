package 문자열;

import java.util.Arrays;

public class 수박수박수박수박수 {

	//프로그래머스 수박수박수박수박수? 문제
	public static void main(String[] args) {
		int n = 4;
		String answer = "";
		
		// 방법1
//		for (int i = 0; i < n; i++) {
//			if(i % 2 == 0) {
//				answer = answer + "수";
//			}else if(i % 2 == 1){
//				answer = answer + "박";
//			}
//		}
//		System.out.println(answer);
		
		//방법2 내가 생각한대로 해봄
//		char[] c = new char[n];
//		for (int i = 0; i < c.length; i++) {
//			if(i % 2 == 0) {
//				c[i] = '수';
//			}else {
//				c[i] = '박';
//			}
//		}
//		for (int i = 0; i < c.length; i++) {
//			answer = answer + c[i];
//		}
//		System.out.println(answer);
		
		//방법3 좋은것 같은 또다른 방법
		char[] ch = {'수', '박'};
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) answer += ch[0];
			else answer += ch[1];
		}
		System.out.println(answer);
	}

}
