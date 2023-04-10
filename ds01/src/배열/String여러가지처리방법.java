package 배열;

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
		
		System.out.println((s == s2)); //주소비교

		s2 = "안녕";
		// 스트링은 데이터가 변경되는 경우 새로운 곳에 String을 저장할 변수를 생성한다.
		//메모리 관리 부분에서 비효율적!
		
		StringBuilder s3 = new StringBuilder();
		s3.append("배고파");
		System.out.println(s3);
		
		String s4 = "감자,고구마,양파";
		String[] s5 = s4.split(",");
		
	}

}
