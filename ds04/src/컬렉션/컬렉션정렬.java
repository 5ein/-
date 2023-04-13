package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 컬렉션정렬 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(600);
		list.add(100);
		list.add(300);
		list.add(400);
		list.add(200);
		list.add(500);
		
		System.out.println(list);
		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);
		
		Collections.reverse(list); // 앞뒤 위치 바꾸기 (역정렬)
		System.out.println(list);
		
		//list에 있는 값들을 배열을 만들어서 프린트 해보기
		int[] array = new int[list.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = list.get(i);//list에서는 값을 가져올때 get() 사용
		}
		System.out.println(Arrays.toString(array));
		
		array[0] = 1000; //값 수정
		
		//수정된 배열을 arraylist를 새로 만들어서 넣은 후 프린트 해보기
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list2.add(array[i]); //list에 값 추가할때 .add() 사용
		}
		System.out.println(list2);
	}

}
