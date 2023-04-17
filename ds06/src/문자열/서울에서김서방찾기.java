package 문자열;

public class 서울에서김서방찾기 {

	//프로그래머스 서울에서김서방찾기 문제
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		 String answer = "";
		
		 for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
			}
		}
		System.out.println(answer);
	}

}
