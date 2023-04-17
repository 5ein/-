package 컬렉션2;

public class 삼항연산자 {

	public static void main(String[] args) {
		int max = 30;
		int result = (max > 10)? 1 : 0; //값이 3개(max, true, false) 필요, 삼항연산자(?:)
		System.out.println(result);
		
		max++; //값이 1개 필요, 단항연산자
		int result2 = max + 2; //값이 2개 필요, 이항연산자(+, - 이런애들)
		System.out.println(result2);
		
	}

}
