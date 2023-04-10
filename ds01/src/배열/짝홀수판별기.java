package 배열;

public class 짝홀수판별기 {
	public static void main(String[] args) {
		//순서도 보고 구현 해보기
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum - i;
			}else {
				sum = sum + i;
			}
		}//for
		
		System.out.println(sum);
		
	}
}
