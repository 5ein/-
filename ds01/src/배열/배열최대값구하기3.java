package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최대값구하기3 {

	public static void main(String[] args) {

		Random r = new Random(100);
		int[] s = new int[10];
		int[] s2 = new int[10];

		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000); // 0~999
			s2[i] = r.nextInt(1000); // 0~999
		}

		// 오름차순으로 정렬한 다음 맨앞(최소값),맨끝(최대값)
		Arrays.sort(s); // sort는 정렬을 함 <원본을 바꿔버림(파괴형 함수)>

		System.out.println("최소값은 " + s[0]);
		System.out.println("최대값은 " + s[9]);

		// Arrays.equals( , ) 사용해보기
		if (Arrays.equals(s, s2)) {
			System.out.println("2개의 배열이 같다.");
		} else {
			System.out.println("2개의 배열이 다르다.");
		}

		// Arrays.toString() 사용해보기 <원본을 바꿔버림(파괴형 함수)>
		String result = Arrays.toString(s);
		System.out.println(result);
		
		// 스트링으로 바뀐 result를 다시 배열로 뽑아오고 싶다면 어떻게 해야할까?
		// 배열로 바꿔주는 함수는 없다.. 아쉽게도 다른방법을 찾자!
		String result1 = result.replace(" ", ""); //공백 없애주고
		String result2 = result1.replace("[", "");
		String result3 = result2.replace("]", "");
		System.out.println(result3);
		
		//스트링의 글자수을 체크하는것과 배열의 개수를 체크하는것의 차이 보기!
		System.out.println("스트링의 글자수: " + result.length());
		System.out.println("배열의 개수: " + s.length);

	}// main
}
