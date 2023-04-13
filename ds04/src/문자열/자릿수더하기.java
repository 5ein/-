package 문자열;

public class 자릿수더하기 {

	//프로그래머스 자릿수더하기 문제
	public static void main(String[] args) {
		int n = 930211;
		Solution3 sol = new Solution3();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}
class Solution3 {
    public int solution(int n) {
        int answer = 0;
        
        //방법1)
//        String s = Integer.toString(n);
//        String[] ss = s.split("");
//        
//        for (int i = 0; i < ss.length; i++) {
//			answer = answer + Integer.parseInt(ss[i]);
//		}
        
        //방법2) 10으로 나눠주면서 뒤 자리수부터 더해줌
        while(n > 0) {
        	answer += n % 10;
        	n /= 10;
        }
        
        return answer;
    }
}