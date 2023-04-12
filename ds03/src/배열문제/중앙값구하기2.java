package 배열문제;

import java.util.*; //배열문제(Arrays) 나오면 일단 임포트 하기

public class 중앙값구하기2 {

	public static void main(String[] args) {
		int[] s = {5, 2, 1, 9, 11, 15, 17, 21};
		//배열에 들어간 하나의 값: element, 엘리먼트
		//array의 길이가 짝수
		//중앙에 있는 2개의 값을 더해서 프린트해보세요.
		System.out.println(Arrays.toString(s));
		
		//1. 정렬을 먼저 하자
		Arrays.sort(s); //파괴!
		System.out.println(Arrays.toString(s));
		
		//2. 중앙위치를 구하자
		int center1 = s.length / 2;
		int center2 = s.length / 2 - 1;
		
		//3. 배열의 중앙값 2개를 더하기
		int answer = s[center1] + s[center2];
		System.out.println(answer);
	}
}
