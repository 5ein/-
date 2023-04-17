package 문자열;

public class 문장속긴단어출력2 {

	public static void main(String[] args) {
		String s = "안녕하세요 세인이예요 반가워요! 행복한하루보내세요.";
		
		String[] s2 = s.split(" ");
		
		int maxL = s2[0].length();
		String maxW = s2[0];
		
		for(String x: s2) {
			if(x.length() > maxL) {
				maxL = x.length();
				maxW = x;
			}
		}
		System.out.println(maxW);
	}

}
