package 프로그래머스기본;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		int n = 15;
		Solution3 sol = new Solution3();
		int answer = sol.solution(n); 
		System.out.println(answer);
	}
}
class Solution3 {
    public int solution(int n) {
    	int answer = 0; //주문한 피자수
    	if (n % 7 > 0) answer = n / 7 +1;
    	else answer = n / 7;
        return answer;
    }
}