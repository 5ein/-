package 컬렉션;

import java.util.*;

public class 배열과컬렉션변환3 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		stringPrint(s2);
		
		//배열을 가지고 하면 복잡한 처리가 있으면 list로 하면 편하다.
		
		//(1)검색, 수정, 인덱스 의 작업을 하려면 asList()를 사용하면 됨.
		//	asList()로 하면 실제로는 원본 배열을 가지고 처리하는 것이기 때문에
		//	길이와 관련된 추가, 삭제, 삽입이 불가능하다.
		//(2)추가, 삭제, 삽입 의 작업을 하려면 모든기능을 가진 ArrayList를 새로만들어주면 됨.
		
		//()안에 넣어준 배열의 내용으로 ArrayList를 만들어라 라는 뜻!
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s2));
		
		/* 내용없는 ArrayList를 만들어라 라는 뜻!
		ArrayList<String> list0 = new ArrayList<String>();
		*/
		
		//1. aaa가 포함되어 있나요?
		System.out.println(list.contains("aaa"));
		
		//2. 맨 뒤에 "fff"를 추가해라
		list.add("fff");
		System.out.println(list);
		
		//3. 원하는 index에 "ggg"를 삽입해라
		list.add(1, "ggg");
		System.out.println(list);
		
		//4. "ccc"를 삭제해라.
		list.remove("ccc");
		System.out.println(list);
		
		//배열로 옮겨야 한다면? 새롭게 배열을 만들어 옮겨보세요.
		String[] s3 = new String[list.size()];
		for (int i = 0; i < s3.length; i++) {
			s3[i] = list.get(i);
		}
		stringPrint(s3);
		
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
