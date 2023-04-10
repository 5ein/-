package 배열;

public class 이중for문 {
	public static void main(String[] args) {
		//이중for문이용한 구구단 찍기
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t"); 
				//"\t"를 쓰면 그냥공백보다 깔끔함!
			}
			System.out.println();
		}
	}
}
