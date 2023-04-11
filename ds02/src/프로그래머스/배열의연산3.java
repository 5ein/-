package 프로그래머스;

public class 배열의연산3 {
	
	//강사님이 내주신 문제
	//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}  90
	//{1, 2, 3, 4, 5, 9, 10} 		   90
	//{-20, -30, 3, 4, 5, 9, 10} 	   600
	//두 수를 뽑아 곱 했을 때 가장 큰 결과를 구해보세요.
	//배열 정렬이 오름차순으로 되어 있는 상태

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		//int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numbers = {-20, -30, 3, 4, 5, 9, 10};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution5 {
	public int solution(int[] numbers) {
		//내 풀이
//		int max = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers.length; j++) {
//				if (numbers[i] * numbers[j] > max) {
//					if (i != j) {
//						max = numbers[i] * numbers[j];
//					}
//				}
//			}
//		}
//		int answer = max;
		
		//강사님 풀이
		int post = numbers[numbers.length - 2] 
					* numbers[numbers.length - 1];
		int pre = numbers[0] * numbers[1];
		int answer = 0;
		if (post > pre) {
			answer = post;
		}else {
			answer = pre;
		}
		return answer;
	}
}