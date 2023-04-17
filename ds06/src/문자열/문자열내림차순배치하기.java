package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순배치하기 {

	//프로그래머스 문자열 내림차순으로 배치하기 문제
	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		String answer1 = "";
		
		//(1) String Collection 방법
		//1-1. 내림차순으로 정렬을 한 후,
		//문자들을 하나씩 떨어뜨려야한다. ==> ArrayList, 배열 이용하기
		String[] s2 = s.split("");
		List<String> list = Arrays.asList(s2);
		Collections.sort(list); //오름차순 정렬
		System.out.println(list);
		Collections.reverse(list); //역정렬
		
		//1-2. for문을 이용해서 하나씩 꺼낸 후,
		//2. answer에 붙인다.
		for (String x : list) {
			answer += x;
		}
		System.out.println(answer);
		
		//(2) char StringBuilder 방법
		//1-1. 내림차순으로 정렬을 한 후,
		//문자들을 하나씩 떨어뜨려야한다. ==> ArrayList, 배열 이용하기
		char[] c = s.toCharArray();
		Arrays.sort(c);//오름차순 정렬
		
		String s3 = new String(c);
		System.out.println(s3);//char[]을 이용해서 String으로 바로 만들 수 있음.
		
		//1-2. for문을 이용해서 하나씩 꺼낸 후,
		//2. answer에 붙인다.	
		StringBuilder sb = new StringBuilder(s3);
		answer1 = sb.reverse().toString();
		System.out.println(answer1);
	}

}
