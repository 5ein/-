package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터2 {

	public static void main(String[] args) {
		//set은 중복되지 않고 순서성을 가지지 않는다
		HashSet<Integer> money = new HashSet<>();
		//일주일간 받았던 용돈
		//1000, 2000, 3000, 2000, 4000, 2000, 3000
		
		//일주일간 받았던 용돈 중에서 얼마씩 받았는지 전체 프린트
		//1000, 2000, 3000, 4000 가 프린트로 나와야함
		
		money.add(1000); //월
		money.add(2000); //화
		money.add(3000); //수
		money.add(2000); //목
		money.add(4000); //금
		money.add(2000); //토
		money.add(3000); //일
		
		System.out.println(money);
		
		//1번방법 <반복자 사용>
		Iterator<Integer> it = money.iterator();
		for(int i = 0; i < money.size(); i++) {
			System.out.println(it.next());
		}

		System.out.println("---------");
		
		//2번방법 <Object배열 사용>
		Object[] list = money.toArray();
		for(Object x: list) {
			System.out.println(x);
		}
		
		
		
		
	}

}
