package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //System.in은 키보드를 의미
		//자바 프로그램과 콘솔(키보드)를 스트림(강물) open
		int[] numbers = new int[3]; //{0,0,0} ==> {입력값1, 입력값2, 입력값3} 값이 들어감
		//콘솔 입력값 11,22,33
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt(); 
			//입력받아서, int로 바꾼후, 배열에 넣어라!
		}
		sc.close(); //stream close
		for (int x : numbers) {
			System.out.println(x);
		}
		
		//예제1) 배열에서 33의 위치 찾기 문제
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 33) {
				System.out.println("위치는 " + i);
			}
		}
		
	}
}
