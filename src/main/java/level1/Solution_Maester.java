package level1;

import java.util.HashSet;
import java.util.Set;

public class Solution_Maester {

    /**
     * #1845
     * N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중,
     * 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution01(int[] nums) {
        Set<Integer> type = new HashSet<>(); //중복된 값 저장 x
        for(int n : nums) {
            type.add(n);
        }

        int answer = Math.min(type.size(), nums.length / 2);
        return answer;
    }

}
