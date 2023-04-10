package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기4 {

	public static void main(String[] args) {
		//예제4) 배열에서 22.2의 갯수 구하기
		Scanner sc = new Scanner(System.in);
		
		double[] numbers = new double[5]; //{0,0,0} => {11.1, 22.2, 22.2, 22.2, 55.5}
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble(); 
		}
		sc.close(); 
		
		for (double x : numbers) { //x는 입력된 값을 출력하는것이기 때문에 얘도 더블로 해주어야함!
			System.out.println(x);
		}
		//콘솔입력값
//		11.1
//		22.2
//		22.2
//		22.2
//		55.5
		
		int count = 0; //22.2 몇개인지 프린트!
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				count++;
			}
		}
		System.out.println("22.2의 개수는 " + count);
	}
}
