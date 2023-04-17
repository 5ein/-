package 문자열;

public class 문자열다루기기본2 {

	public static void main(String[] args) {
		String s = "a234";
		boolean answer = true;
		 
		 if(s.length() == 4 || s.length() == 6) {
			 char[] c = s.toCharArray();
			 for(char x: c) {
				 if(x > '9' || x < '0') {
					 answer = false;
				 }
			 }
		 }else {
			 answer = false;
		 }
		System.out.println(answer);
	}

}
