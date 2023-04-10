package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제_기본 {

	public static void main(String[] args) {

//		1. int값 5개 55, 66, 77, 22, 33 입력받아서, 최소값을 구해 프린트해보세요.
//		콘솔 입력값: 55 66 77 22 33
//			1) 배열 사용해야함.
//			2) Scanner사용해야함.
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		int min = numbers[0];
		for (int x : numbers) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println("최소값: " + min);
		
// --------------------------------------------------------------
		
//		2. 랜덤한 값 20개를 발생시켜, 값의 범위 0~899를 빈 배열에 넣은 후,
//		   최대값을 구해 프린트해보세요.
		Random r = new Random(5);
		int[] numbers2 = new int[20];
		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = r.nextInt(900);
		}
		Arrays.sort(numbers2);
		System.out.println("최대값: " + numbers2[19]);
		
// --------------------------------------------------------------		

//		3. String s1 = "참좋다", String s2 = "진짜좋다" 두 문자열이 동일한지 프린트, 
//		   s1 s2글자수를 비교하여 누가 더 큰지 프린트
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		if (s1 == s2) {
			System.out.println("동일하다.");
		}else {
			System.out.println("동일하지 않다.");
		}
		int n1 = s1.length();
		int n2 = s2.length();
		if (n1 > n2) {
			System.out.println("s1이 글자수가 더 많다.");
		}else if (n1 < n2) {
			System.out.println("s2가 글자수가 더 많다.");
		}else {
			System.out.println("s1과 s2의 글자수가 같다.");
		}
		
// --------------------------------------------------------------		

//		4. String s3 = "나는 진짜 java programmer가 되었어" 에서
//		   "java programmer만 추출하여 모두 대문자로 변경후 프린트
		String s3 = "나는 진짜 java programmer가 되었어";
		int w1 = s3.indexOf("j");
		int w2 = s3.lastIndexOf("r");
		String s33= s3.substring(w1, w2+1);
		System.out.println(s33.toUpperCase());
		
// --------------------------------------------------------------		

//		5. String s4 = "2056521"에서 2를 추출하여 1인 경우 남자, 2인 경우 여자로 프린트
		String s4 = "2056521";
		if (s4.charAt(0) == '1') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}

}
