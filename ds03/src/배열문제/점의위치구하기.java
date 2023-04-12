package 배열문제;

public class 점의위치구하기 {

	public static void main(String[] args) {
		int[] dot = {-7, 9};
		Solution2 sol = new Solution2();
		int answer = sol.solution(dot);
		System.out.println(answer);
	}
}
class Solution2 {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		}else if (dot[0] > 0 && dot[1] < 0) {
			answer = 2;
		}else if (dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		}else if (dot[0] < 0 && dot[1] > 0) {
			answer = 4;
		}
        return answer;
    }
}