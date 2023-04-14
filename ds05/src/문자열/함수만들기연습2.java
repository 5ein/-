package 문자열;

public class 함수만들기연습2 {

	public static void 세수하기() {
		System.out.println("손씻고");
		System.out.println("세수하기!");
	}

	public static void 밥먹기(String f) {
		System.out.println(f + "밥먹기!");
	}

	public static void 운동하기(String w) {
		System.out.println(w + "으로 가서 운동하기");
	}

	public static void 잠자기(char s) {
		if (s == '낮') {
			System.out.println("암막커텐치고");
			System.out.println(s + "잠자기!");
		} else {
			System.out.println("불끄고 잠자기!");
		}
	}

	public static void main(String[] args) {
		// 메서드(함수) 생성하고, 메서드 호출하기!

		// 내가 일어나서 하는 일.
		System.out.println("내가 일어나서 하는 일");
		// 1. 세수하기
		세수하기();
		// 2. 밥먹기(아침)
		밥먹기("아침");
		// 3. 운동하기(운동장)
		운동하기("운동장");
		// 4. 잠자기(낮)
		잠자기('낮');
		// 5. 밥먹기(점심)
		밥먹기("점심");
		// 6. 세수하기(외출준비)
		세수하기();
		// 7. 화장하기
		System.out.println("화장하기!");
		// 8. 밥먹기(저녁)
		밥먹기("저녁");
		// 9. 운동하기(공원)
		운동하기("공원");
		// 10. 잠자기(밤)
		잠자기('밤');

	}

}
