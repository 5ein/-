package 프로그래머스;

public class 배열의연산2 {
	
	//강사님이 내주신 문제
	//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}  27
	//{1, 2, 3, 4, 5, 9, 10} 		   24
	//세 수를 더했을 때 가장 큰 숫자를 구해보세요.
	//배열이 이미 오름차순으로 정렬이 되어 있는 상태!

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		//int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numbers = {1, 2, 3, 4, 5, 9, 10};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution4 {
	public int solution(int[] numbers) {
		int answer = numbers[numbers.length - 3] + numbers[numbers.length - 2] + numbers[numbers.length - 1];
		return answer;
	}
}