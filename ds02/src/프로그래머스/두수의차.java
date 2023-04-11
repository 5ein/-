package 프로그래머스;

import java.util.Scanner;

public class 두수의차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Solution sol = new Solution();
		int answer = sol.solution(num1, num2); //int
		System.out.println(answer);
		sc.close();
	}
}

//원래는 하나의 파일에 하나의 클래스만 넣는데 여러개 넣어도 가능은 하다 (권장하지는 않음)
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}