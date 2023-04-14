package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String에서Char배열에옮기기3 {

	//함수를 만들어서 쓰기!
	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}
	
	public static void main(String[] args) {
		String sno = "2056521"; // String도 index를 이용해서 추출가능
		// 01234

		// 1. 마지막 위치의 숫자가 1이면 서대문구에서 출생,
		// 1이 아니면 다른 구에서 출생 프린트
		char last = sno.charAt(sno.length() - 1);
		if (last == '1') {
			System.out.println("서대문구에서 출생");
		} else {
			System.out.println("다른 구에서 출생");
		}

		// 2. "52"를 추출하여 두 숫자를 더해보세요.
		// 더해서 10이 넘지않아야 유효한 주민번호
		// 유효한 주민번호인지 아닌지 출력

		// 방법1)
		char[] two = new char[2];
		sno.getChars(4, 6, two, 0);
		// 원본인 String인 sno에서 4~5을 추출해서
		// char[]인 two에 인덱스 0부터 넣어주세요.
		System.out.println(Arrays.toString(two));

		int i1 = Character.getNumericValue(two[0]);
		int i2 = Character.getNumericValue(two[1]);
		int sum = i1 + i2;
		System.out.println(sum);
		if (sum < 10) {
			System.out.println("유효한 주민번호 O");
		} else {
			System.out.println("유효한 주민번호 X");
		}

		// 방법2)
		String s1 = sno.substring(4, 6);
		int i3 = s1.indexOf(0);
		int i4 = s1.indexOf(1);

		if (i3 + i4 > 10)
			System.out.println("유효한 주민번호 X");
		else
			System.out.println("유효한 주민번호 O");

		// 3. 주민번호에 포함된 5의 갯수를 출력
		// String안에 들어있는 데이터를 각각 분리를 해주어야한다.

		// 방법1) String배열로 만들기 - split()
		String[] stringArray = sno.split("");
		int count = 0;
		for (String s : stringArray) {
			if (s.equals("5")) { // equals()대신 contains()도 사용가능
				count++;
			}
		}
		System.out.println(count);

		// 방법2) charAt(i)을 포문돌려서 가져오기
		int count2 = 0;
		for (int i = 0; i < sno.length(); i++) {
			char c = sno.charAt(i);
			if (c == '5') {
				count2++;
			}
		}
		System.out.println(count2);

		// for문은 break를 해주지 않으면 끝까지 간다. 그렇기 떄문에
		// 데이터가 많을수록 처리시간이 오래걸리는 특징을 가지고있다.
		// 그래서! 저런것을 해주는 함수를 사용하는 것이 좋음!
		// (모든것이 함수로 만들어져 있는것은 아니다.)

		// 인덱스를 빨리 찾는 방법(함수)
		System.out.println(Arrays.binarySearch(stringArray, "5"));

		// 배열에 특정한 값을 한꺼번에 변경하는 방법(함수)
		Arrays.fill(stringArray, 0, 3, "hoho");
		//System.out.println(Arrays.toString(stringArray));
		print(stringArray);
		
		// 배열의 순서를 다 뒤집는 방법(함수)
		Arrays.sort(stringArray); // 정렬(오름차순)
		// Arrays로 내림차순을 할 수는 있으나 너무 복잡
		// ==> 컬렉션으로 변환해서 하면 더 간단하다!
		//System.out.println(Arrays.toString(stringArray));
		print(stringArray);

		List<String> list = Arrays.asList(stringArray); // list컬렉션으로 변경
		// 오름차순으로 정렬한뒤 뒤바꾸면 내림차순 정렬됨!
		Collections.sort(list); // 정렬(오름차순)
		Collections.reverse(list); // 정렬(내림차순)
		System.out.println(list);

		// 배열안에 데이터의 빈도수(횟수)구하는 방법(함수)
		int count3 = Collections.frequency(list, "hoho");
		System.out.println(count3);

	}
}
