package 문자열;

import java.util.Arrays;
import java.util.List;

public class String여러가지처리방법 {

	public static void main(String[] args) {
		String s = "너는 프로그래머프야?";
		String s2 = "진짜!!";

		System.out.println(s + s2);// 스트링 결합
		System.out.println(s.concat(s2)); // 스트링 결합
		System.out.println(s.charAt(0)); // 문자 1글자 추출
		System.out.println(s.endsWith("야")); // 특정한 문자로 끝나는지 확인
		System.out.println(s.substring(3));// 인덱스3이후 글자들 모두 추출
		System.out.println(s.substring(3, 8));// 인덱스 3~7까지 추출
		System.out.println(s.contains(s2));// s에 s2가 포함되어있는지?
		System.out.println(s.lastIndexOf("프"));// s중 프 글자 위치
		System.out.println(s.toUpperCase());// 대문자로
		System.out.println(s.toLowerCase());// 소문자로
		System.out.println(s.length());// 글자수
		System.out.println(s.replace("너", "나"));// 너 를 나 로 바꾸기
		System.out.println(s.trim()); // 공백없애기
		
		// String은 s를 프린트할 때, 그 주소가 가르키는 char들 프린트되게 재정의 되어있는 객체이다.(toString()오버라이드)
		System.out.println(s);
		
		System.out.println((s == s2)); // 주소비교
		System.out.println(s.equals(s2));// String이 가르키는 char들이 동일한지 확인

		s2 = "안녕";
		// String은 데이터가 변경되는 경우 새로운 곳에 String을 저장할 변수를 생성한다. <메모리 관리 부분에서 비효율적!>
		// String의 값이 자주 변경되는 경우에는 Builder를 사용!
		StringBuilder s3 = new StringBuilder();
		s3.append("배고파");
		System.out.println(s3);
		
		String s4 = "감자,고구마,양파";
		String[] s5 = s4.split(", "); //("")안의 내용 단위로 잘라 String 배열에 넣기
		System.out.println(Arrays.toString(s5)); //전체를 프린트
		
		// 고구마의 위치찾기
			// 방법1
		for (int i = 0; i < s5.length; i++) {
			if (s5[i].equals("고구마")) {
				System.out.println("고구마의 위치는? " + i);
			}
		}
			// 방법2
		List<String> list = Arrays.asList(s5);
		System.out.println(list.indexOf("고구마")); //위치 알려줌!
	}

}
