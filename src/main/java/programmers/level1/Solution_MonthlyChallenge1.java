package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution_MonthlyChallenge1 {

    /**
     * #68644
     * 정수 배열 numbers 에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서
     * 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
     * */
    public int[] solution01(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int x = 0; x < numbers.length-1; x++) {
            for(int y = x+1; y < numbers.length; y++) {
                set.add(numbers[x] + numbers[y]);
            }
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);

        return answer;
    }

    /**
     * #70128
     * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
     * ex. 입출력 예 #1. a [1,2,3,4] / b [-3,-1,0,2]
     * a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
     * */
    public int solution02(int[] a, int[] b) {
        int answer = 0;
        int bIndex = 0;

        for(int i : a){
            answer += (i * b[bIndex]);
            bIndex++;
        }

        return answer;
    }

    /**
     * #68935
     * 자연수 n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
     * 3진수 -> 3으로 나눈 나머지들의 역순을 저장
     * */
    public int solution03(int n) {
        String result = "";
        while(n > 0) {
            result += (n % 3);
            n /= 3;
        }

        int answer = Integer.parseInt(result, 3);
        return answer;
    }
}
