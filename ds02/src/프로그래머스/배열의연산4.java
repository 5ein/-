package 프로그래머스;

import java.util.Arrays;

public class 배열의연산4 {
	
	//프로그래머스 최댓값구하기1 문제
	//두 수를 뽑아 곱 했을 때 가장 큰 결과를 구해보세요.
	//{4, 3, 2, 7, 5, 10, 8, 9}
	//배열 정렬이 되어 있지않은 상태
	//음수는 없는상태

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int[] numbers = {4, 3, 2, 7, 5, 10, 8, 9};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution6 {
	public int solution(int[] numbers) {		
		
		Arrays.sort(numbers); //정렬하자! (파괴형)
		int answer = numbers[numbers.length - 2] 
					* numbers[numbers.length - 1];
		return answer;
	}
}