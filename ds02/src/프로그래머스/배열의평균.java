package 프로그래머스;

public class 배열의평균 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = sol.solution(numbers); //int[]
		System.out.println(answer);
	}

}

class Solution3 {
    public double solution(int[] numbers) {
    	int size = numbers.length;
    	int sum = 0;
    	for (int x : numbers) {
			sum = sum + x;
		}
        double answer = (double)sum / size; //가능
        //double answer1 = sum / (double)size; //가능
        //double answer2 = (double)(sum / size); //불가능
        //자바에서는 int, int 계산의 결과는 무조건 int
        // 하나라도 실수(double, float)이면 무조건 실수
        return answer;
    }
}