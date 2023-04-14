package 문자열;

public class 문자열포함인덱스테스트 {

	public static void main(String[] args) {
		String s = "aabbccdda";
		
		//그 문자가 들어있는지 .contains()
		System.out.println(s.contains("a"));
		System.out.println(s.contains("aaa"));
		System.out.println(s.contains("bc"));
		
		//문자의 위치를 알고싶어 .indexOf(), .lastIndexOf()
		System.out.println(s.indexOf("a")); //얘가있는 첫번쨰 위치
		System.out.println(s.lastIndexOf("a")); //얘가있는 마지막 위치
		System.out.println(s.lastIndexOf("a", 3)); //0~2사이범위에서
		System.out.println(s.lastIndexOf("a", 8)); //0~7사이범위에서
		//없는 것의 인덱스를 찾을 때는 -1이 리턴!!
		System.out.println(s.indexOf("f")); //f가 없어 -1이 반횐됨
		
	}

}