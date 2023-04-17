package 문자열;

import java.util.Arrays;

public class SpringBuilderTest2 {

	public static void main(String[] args) {		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("honghong");
		System.out.println(sb1);
		
		StringBuilder sb11 = new StringBuilder("honghong");
		System.out.println(sb11);
		
		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb2);
		
		System.out.println(sb1 == sb2); //주소가 다름!
		sb1.append("hahaha");
		System.out.println(sb1);
		sb1.replace(0, 8, "hㅇhㅇhㅇ."); //값변경
		System.out.println(sb1);
		sb1.delete(0, 8); //값 삭제
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		//SpringBuilder는 split 함수가 없어 사용할수 없음 (String일때만 사용 가능)
		//String으로 바꿔주고 사용해야함
		String sb3 = sb1.toString();
		String[] s4 = sb3.split("");
		System.out.println(Arrays.toString(s4));
		
	}

}
