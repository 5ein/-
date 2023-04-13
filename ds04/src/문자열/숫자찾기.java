package 문자열;

public class 숫자찾기 {

	//프로그래머스 숫자찾기 문제
	public static void main(String[] args) {
		int num = 232443;
		int k = 4;
		Solution2 sol = new Solution2();
		int answer = sol.solution(num, k);
		System.out.println(answer);
	}
}
class Solution2 {
    public int solution(int num, int k) {
        
        //1. .valueOf() 이용
//    	int answer = 0;
//        String num2 = String.valueOf(num);
//        String k2 = String.valueOf(k);
//        
//        if (num2.contains(k2)) {
//			answer = num2.indexOf(k2) + 1;
//		}else {
//			answer = -1;
//		}
//        return answer;
        
        //2. .toString() , 삼항연산자 이용
        int answer = Integer.toString(num).indexOf(Integer.toString(k));
        return (answer == -1) ? -1 : (answer + 1);
        //indexOf는 입력값이 문자열에 없다면 리턴값이 -1이다!!!
        
    }
}