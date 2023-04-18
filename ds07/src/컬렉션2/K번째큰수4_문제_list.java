package 컬렉션2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class K번째큰수4_문제_list {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); //번쨰 작은 수
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (true) {
			int data = sc.nextInt(); //22 33 66 11 10 15 0
			if(data == 0) {
				break;
			}else {
				list.add(data); //list는 값을 add로 넣음
			}
		}
		System.out.println(list);
		
		Collections.sort(list); //정렬
		System.out.println(list);
		
		//list는 값을 get로 가져옴
		System.out.println("첫 번째 작은 수: " + list.get(0));
		System.out.println("두 번째 작은 수: " + list.get(1));
		System.out.println(k + "번째 큰 수: " + list.get(k - 1));
		
		sc.close();
	}
}
