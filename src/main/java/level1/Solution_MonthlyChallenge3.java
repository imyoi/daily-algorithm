package level1;

import java.util.Arrays;

public class Solution_MonthlyChallenge3 {

    /**
     * #86051
     * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
     * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution01(int[] numbers) {
        int answer = -1;
        int num = 0;
        for(int n : numbers) {
            answer = 45 - (num += n);
        }

        return answer;
    }

    /**
     * #86051 studies
     * 다른 풀이 (1)
     * */
    public int studies01(int[] numbers) {
        int sum = 45;
        for(int n : numbers) {
            sum -= n;
        }

        return sum;
    }

    /**
     * #86051 studies
     * 다른 풀이 (2)
     * */
    public int studies02(int[] numbers) {
        int answer = 45 - Arrays.stream(numbers).sum();
        return answer;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * #87389
     * 자연수 n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution02(int n) {
        int x = 1;
        while(x <= n) {
            if (n % x == 1) break;
            x++;
        }
        return x;
    }
}
