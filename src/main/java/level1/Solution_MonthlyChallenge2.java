package level1;

public class Solution_MonthlyChallenge2 {

    /**
     * #76501
     * 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
     * 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution01(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            answer += (signs[i]) ? absolutes[i] : -absolutes[i];
        }

        return answer;
    }

}
