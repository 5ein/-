package 문자열;

public class 문자반복출력하기 {

	//프로그래머스 문자 반복 출력하기
	public static void main(String[] args) {
		String answer = "";
		
		String my_string = "hello"; 
		int n = 3;
		
		//방법
//		방법1) charAt사용해서 하나씩 꺼내오기
//		방법2) split 이용하기
//		방법3) toCharArray 이용하기
		
//		String[] s = my_string.split(""); //밑이랑같은건데 string이 메모리를 더차지함
		char[] c = my_string.toCharArray();
		
		for (char x : c) { //{'h', 'e', 'l', 'l', 'o'}
			for (int i = 0; i < n; i++) {
				answer = answer + x;
			}
		}
		System.out.println("결과 " + answer);
		
		
	}

}