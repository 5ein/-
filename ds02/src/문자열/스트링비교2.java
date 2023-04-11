package 문자열;

import java.util.Arrays;
import java.util.List;

public class 스트링비교2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		// 1. String[] 로 바꾸어 보세요.
		String[] all2 = all.split(",");

		// 전체 프린트
		System.out.println(Arrays.toString(all2));

		// 2. 바꾸었더니 공백이 포함되어있다면, 공백을 모두 제거 후, 다시 배열에 넣으세요.
		// 공백제거 방법1)
		all = all.replaceAll(" ", "");
		// all = all.trim(); 이거 왜 안먹지?
		String[] all3 = all.split(",");
		// 공백제거 방법2)
		// String[] all3 = all.split(", ");

		// 전체 프린트
		System.out.println(Arrays.toString(all3));

		// 3. 과목수는?
		System.out.println("과목수는? " + all3.length);

		// 4. 컴퓨터의 위치는?
		for (int i = 0; i < all3.length; i++) {
			if (all3[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치는? " + i);
			}
		}

		// + 이런 방법도 있대!
		List<String> list = Arrays.asList(all3);
		System.out.println(list.indexOf("컴퓨터"));

		// 5. 과목명이 3글자 미만인 과목수는?
		int count = 0;
		for (int i = 0; i < all3.length; i++) {
			if (all3[i].length() < 3) {
				count++;
			}
		}
		System.out.println("세글자 미만인 과목수는? " + count);
	}
}
