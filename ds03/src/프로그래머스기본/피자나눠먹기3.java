package 프로그래머스기본;

public class 피자나눠먹기3 {

	public static void main(String[] args) {
		int slice = 7;
		int n = 10;
		Solution4 sol = new Solution4();
		int answer = sol.solution(slice, n); 
		System.out.println(answer);
	}
}
class Solution4 {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n % slice == 0) answer = n / slice;
        else answer = n / slice + 1;
        return answer;
    }
}