package level1;

import java.util.ArrayList;

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

    /**
     * #77884
     * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
     * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution02(int left, int right) {
        int answer = 0;
        while(left <= right) {
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 1; i<=left; i++) {
                if(left % i == 0) {
                    arr.add(i);
                }
            }

            answer += (arr.size() % 2 == 0) ? left : -left;
            left++;
        }
        return answer;
    }

    /**
     * #77884 studies
     * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
     * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
     * ! 제곱수의 약수의 갯수는 항상 홀수이다.
     * */
    public int studies02(int left, int right) {
        int answer = 0;
        while(left <= right) {
            if (left % Math.sqrt(left) == 0) {
                answer -= left;
            } else {
                answer += left;
            }
            left++;
        }

        return answer;
    }
}
