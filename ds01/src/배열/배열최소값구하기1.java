package 배열;

import java.util.Random;

public class 배열최소값구하기1 {
	
	public static void main(String[] args) {
		
		// min 변수를 만들어서 하나씩 비교해서 변수 값을 바꾸기 ==> O(n)
		
		int[] s = {90, 80, 20, 60, 70};
		
		int min = s[0];
		
		for (int x : s) {
			if (x < min) min = x;
		}//for
		
		System.out.println("최소값은 " + min);
		
	}
	
}
