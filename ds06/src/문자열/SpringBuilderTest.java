package 문자열;

public class SpringBuilderTest {

	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpopng";
		System.out.println(s == s2); //주소비교
		System.out.println(s.equals(s2)); //주소가 가르키는 값 비교
		
		s = "hahaha";
		System.out.println(s == s2); //주소비교
		System.out.println(s.equals(s2)); //주소가 가르키는 값 비교
	}

}
