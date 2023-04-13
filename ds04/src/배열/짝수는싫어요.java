package 배열;

import java.util.Arrays;

public class 짝수는싫어요 {

	// 프로그래머스 짝수는 싫어요
	public static void main(String[] args) {
		int n = 10;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution3 {
	public int[] solution(int n) {
		// 1. 반복문을 돌면서
		// 숫자 하나씩을 꺼내어
		// if문으로 홀수인지 판단
		// 2로 나누어서 나머지가 0이 아니면! 로 판단
		// 2. answer배열 0번 인덱스부터 차례대로 넣어준다.
		// answer배열 0번 인덱스를 카운트할 변수가 필요
		// j = 0 시작, 반복문 돌때마나 j++; 해주어야함

		int size = 0; // 정답이 들어갈 배열의 길이 계산 해주어야 함.
		if (n % 2 == 0) size = n / 2;
		else size = n / 2 + 1;
		int[] answer = new int[size];
		int j = 0; // answer에 홀수값을 넣 때 indx로 사용할 변수
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				answer[j] = i;
				j++;
			}
		}
		return answer;
	}
}