package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_AlgorithmKit {

    /**
     * #42576
     * - completion의 길이는 participant의 길이보다 1 작습니다.
     * - 참가자 중에는 동명이인이 있을 수 있습니다.
     * @param participant : 마라톤에 참여한 선수들의 이름이 담긴 배열
     * @param completion : 완주한 선수들의 이름이 담긴 배열
     * @return 완주하지 못한 선수의 이름
     * */
    public String solution01(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> checkMap = new HashMap<>();
        for(String p : participant) {
            checkMap.put(p, checkMap.getOrDefault(p, 0) + 1);
        }
        for(String c : completion) { //완주자제외
            checkMap.put(c, checkMap.getOrDefault(c, checkMap.get(c)) -1);
        }

        for(String key : checkMap.keySet()) {
            if(checkMap.get(key) != 0) { //미완주자
                return key;
            }
        }
        return answer;
    }


    /**
     * #42748
     * - commands의 각 원소는 길이가 3
     * @param array
     * @param commands : [i,j,k]를 원소로 가진 2차원 배열
     * @return array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수
     * */
    public int[] solution02(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int i = 0;
        while(i < commands.length){
            int fromIndex = commands[i][0]-1;
            int toIndex = commands[i][1];
            int k = commands[i][2];

            int[] range = Arrays.copyOfRange(array, fromIndex, toIndex);
            Arrays.sort(range);

            answer[i] = range[k-1];
            i++;
        }

        return answer;
    }
}