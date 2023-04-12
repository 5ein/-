package 프로그래머스기본;

public class 옷가게할인받기 {

	public static void main(String[] args) {
		int price = 150000;
		Solution6 sol = new Solution6();
		int answer = sol.solution(price); 
		System.out.println(answer);
	}
}
class Solution6 {
    public int solution(int price) {
    	int answer = 0;
        if(price >= 500000) answer = (int)(price * 0.8);
        else if(price >= 300000) answer = (int)(price * 0.9);
        else if(price >= 100000) answer = (int)(price * 0.95);
        else answer = price;
        return answer;
    }
}