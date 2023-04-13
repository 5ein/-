package 문자열;

public class 편지 {

	//프로그래머스 편지 문제
	public static void main(String[] args) {
		String message = "happy birthday!";
		Solution1 sol = new Solution1();
		int answer = sol.solution(message);
		System.out.println(answer);
	}
}
class Solution1 {
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}