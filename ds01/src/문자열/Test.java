package 문자열;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		//시험의 헷갈린 부분 설명
		
		//가로에 뭔가를 넣으면 그 넣은 타입만 사용가능!
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<MemberVO> list2 = new //ArrayList<MemberVO>();
		
		list.add("나는 스트링");
		//list.add(100); 얘는 안됨!!
		
		//ArrayList<String> : String을 순서대로 모든 데이터의 모음
		//ArrayList<Character> list3, ArrayList<String> list4
		//list3.add('a'), list4.add("abc")
		
		//기본데이터 타입은 Object 설정(주차장 문 Car 생각하기)
		ArrayList list5 = new ArrayList();
		list5.add('a');
		list5.add("abc");
		list5.add(111);
	}
}
