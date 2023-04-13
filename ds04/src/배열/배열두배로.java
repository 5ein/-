package 배열;

import java.util.*; //코테를 하게되면 임포트 먼저 하기! 
					//(Date, Random, Collections, Arrays 등)

//import java.lang.*; //얘는 기본적으로 임포트 되어있기 때문에 따로 적지 말기!
					//(System, Integer, String 등)

public class 배열두배로 {

	// 프로그래머스 배열두배만들기
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 100, -99, 1, 2, 3 };
		Solution1 sol = new Solution1();
		int[] answer = sol.solution(numbers);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution1 {
	public int[] solution(int[] numbers) {
		//답안을 작성해서 집어넣을 배열을 만들었음.
		int[] answer = new int[numbers.length];
		//1. 반복문을 이용해서
		//2. numbers배열 민덱스 0부터 하나씩 꺼내와
		//3. 2배로 곱한 후,
		//4. answer배열의 같은 위치에 넣는다.
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}
		return answer;
	}
}