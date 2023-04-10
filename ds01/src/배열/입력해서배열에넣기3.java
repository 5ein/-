package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기3 {

	public static void main(String[] args) {
		//예제3) 배열에서 33의 갯수 구하기
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[3]; //{0,0,0} => {33,33,22}
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt(); 
		}
		sc.close(); 
		
		for (int x : numbers) {
			System.out.println(x);
		}
		//콘솔입력값 33, 33, 22
		
		int count = 0; //33이 몇개인지 프린트!
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 33) {
				count++;
			}
		}
		System.out.println("33의 개수는 " + count);
	}
}
