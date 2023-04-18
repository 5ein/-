package 컬렉션2;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		String like = "apple, banana, apple, banana, melon, apple";
		String[] like2 = like.split(", ");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String key : like2) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		System.out.println(map);
		int maxValue = 0;
		String maxKey = "";
		System.out.println(map.keySet());
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
			if (map.get(key) > maxValue) {
				maxValue = map.get(key);
				System.out.println(key + "의 득표수는 " + maxValue);
				maxKey = key;
			}
		}
		System.out.println("최종 일등: " + maxKey + "(득표수: " + maxValue + ")");
	}
}
