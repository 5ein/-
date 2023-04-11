package 문자열;

import java.util.Arrays;

public class 정리문제_심화 {
	
	public static void main(String[] args) {
//		6. String s5 = “ [  10, 20, 30, 40, 50]”에서 모든 데이터를 꺼내어 합한 값을 프린트(힌트)
//			1)[, ] – replace()를 이용하여 제거 
//			2) 10 - trim()을 이용하여 공백 제거
//			3) ,를 기준으로 split()를 이용하여 배열로 분리
//			4) 배열로 분리된 값을 꺼내 정수로 변환후, 합해줌.

		String s5 = "[  10, 20, 30, 40, 50]";
		
		//s5 = 을 해주기 전까지는 비파괴였는데 저걸루 s5를 덮어써줘야 원본이 파괴됨!
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		s5 = s5.trim();
		String[] s55 = s5.split(", "); //{"10", "20", ...}으로 바꿔줌 (아직 string)
		System.out.println(s55[0]);
		System.out.println(s55[1]);
		System.out.println(s55[2]);
		
		int sum = 0; 
		//(1. int로 바꾸기)"10" --> 10, "20" --> 20 
		// ==> (2. sum에 저장)10+20=30
		for (String x : s55) {
			int x2 = Integer.parseInt(x);
			sum = sum + x2;
		}
		
		System.out.println(sum);
		
//---------------------------------------------------------------------		
		
//		7.  위 6번에서 생성된 String[]의 값을 새로운 int[]로 옮겨서 오름차순 정렬후, 프린트!
		
		//string은 length() 함수를 사용함 ex)s5.length()
		//배열은 length 를 사용함 (함수 x) ex)s55.length
		int[] newArray = new int[s55.length];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = Integer.parseInt(s55[i]);
		}
		Arrays.sort(newArray);
		System.out.println(Arrays.toString(newArray));
	}
}
