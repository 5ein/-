package 문자열;

public class 문장속긴단어출력 {

	// 다른 문제집 같은데에 나오는 문제
	public static void main(String[] args) {
		String s = "i am a boy";

		// 1. 배열에 한단어씩 넣으세요.
		String[] ss = s.split(" ");

		// 2. 최대길이를 넣을 수 있는 max변수 선언
		int max = ss[0].length();

		// 3. 최대길이를 가지는 maxstring을 넣어줄 수 있는
		String maxString = ss[0];

		// 4. for문 돌려서 하나씩 꺼내면서 max보다 클때 
		// 해당 글자길이값 max에 넣어주고, 해당 글자 maxString에 넣어준다.
		for (String x : ss) {
			if (x.length() > max) {
				max = x.length();
				maxString = x;
			}
		}
		System.out.println(maxString);
	}

}
