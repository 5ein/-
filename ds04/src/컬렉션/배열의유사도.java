package 컬렉션;

import java.util.Arrays;
import java.util.List;

public class 배열의유사도 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		Solution5 sol = new Solution5();
		int answer = sol.solution(s1,s2);
		System.out.println(answer);
	}
}

class Solution5 {
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		
		//(1) list로 변경해서 해결
		List<String> list2 = Arrays.asList(s2);
		for(String x: s1) {
			if(list2.contains(x)) answer++;
		}
		
		//(2) 이중 for문 이용해서 배열 상태로 해결
//		for(int i = 0; i < s1.length; i++) {
//			for (int j = 0; j < s2.length; j++) {
//				if(s1[i] == s2[j])answer++;
//			}
//		}
		
		return answer;
	}
}