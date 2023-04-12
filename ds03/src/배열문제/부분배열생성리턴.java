package 배열문제;

import java.util.*;

public class 부분배열생성리턴 {
	
	//프로그래머스 배열 자르기 문제
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int start = 2;
		int end = 4;

		Solution6 sol = new Solution6();
		int[] answer = sol.solution(array, start, end);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution6 {
	public int[] solution(int[] array, int start, int end) { 
		int size = end - start + 1;
		int[] answer = new int[size];
		
		for(int i = 0; i < size; i++) {
			answer[i] = array[start];
			start++;
		}
		
		return answer;

//		이렇게 풀수도 있음
//		int[] answer = Arrays.copyOfRange(array, start, end + 1);
//		return answer;
	}
}