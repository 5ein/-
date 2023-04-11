package 프로그래머스;

public class 배열뒤집기 {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		int[] num_list = {1, 2, 3, 4, 5};
		int answer[] = sol.solution(num_list);
		System.out.println(answer);
	}
}

class Solution7 {
    public int[] solution(int[] num_list) {
    	 int[] answer = new int[num_list.length];
         for (int i = num_list.length - 1; i >= 0; i--) {
         	for (int j = 0; j < answer.length; j++) {
         		answer[j] = num_list[i];
 			}
 		}
         return answer;
    }
}