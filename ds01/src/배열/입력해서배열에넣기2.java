package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
		//예제2) 배열에서 22.2의 위치 찾기 문제
		Scanner sc = new Scanner(System.in); 
		
		double[] numbers = new double[5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble(); 
		}
		sc.close(); //stream close
		
		for (double x : numbers) { //x는 입력된 값을 출력하는것이기 때문에 얘도 더블로 해주어야함!
			System.out.println(x);
		}
		//콘솔 입력값
//		11.1
//		22.2
//		33.3
//		44.4
//		55.5
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("22.2 위치는 " + i);
			}
			if (numbers[i] == 33.3) {
				System.out.println("33.3 위치는 " + i);
			}
		}
	}
}
