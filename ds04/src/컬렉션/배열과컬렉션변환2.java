package 컬렉션;

import java.util.*;

public class 배열과컬렉션변환2 {

	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자", "고구마", "우유", "감자", "양파"};
		stringPrint(냉장고음식);
		
		//asList() 이용해서 Arraylist로 바꾸기
		List<String> list = Arrays.asList(냉장고음식);
		
		//1. 감자가 들어있는 마지막 위치를 구해보세요.
		//	 전체출력
		System.out.println(list.lastIndexOf("감자"));
		System.out.println(list);
		
		//2. 양파를 포함하고 있으면 "양파는 안사도 된다.",
		//		  포함하고 있지 않으면 "양파사서 냉장고에 넣어야 한다."
		//	 전체 출력
		if (list.contains("양파")) {
			System.out.println("양파는 안사도 된다.");
		}else {
			System.out.println("양파사서 냉장고에 넣어야 한다.");
		}
		
		//3. 우유를 "춘식이 우유"로 수정해보자.
		//	 전체출력
		list.set(2, "춘식이 우유");
		System.out.println(list);
		
		//4. 양파를 찾아서 위치를 찾은 후, 해당 위치에 "양파즙"이라고 수정하자.
		//	 전체출력
		int index = list.indexOf("양파");
		list.set(index, "양파즙");
		System.out.println(list);
		
		//Q. 배열의 상태는? A. list와 같이 값이 변경되었다!
		stringPrint(냉장고음식); //배열과 리스트가 연결되어 있음(같이 바뀌어있음)
		//asList는 배열과 리스트가 연결되어있어 배열크기를 변경하는 add/remove가 안되는것이다!
		// ==> 배열은 선언할떄 크기를 지정하기때문에 변경할수 없음!
		
		//5. 다시 배열로 변환하여 전체 내용을 출력
		String[] 냉장고음식2 = (String[])list.toArray(); //(String[]):형변환 용도
		stringPrint(냉장고음식2);
		
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
