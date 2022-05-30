package level1;

import java.util.ArrayList;
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


    /**
     * #42840
     * - 시험은 최대 10,000 문제로 구성되어있습니다.
     * - 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
     * # 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
     * # 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
     * # 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
     * @param answers: 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열
     * @return 가장 많은 문제를 맞힌 사람의 배열
     * */
    public int[] solution03(int[]answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int[] score = new int[3];//수포자3명
        score[0] = getScore(one, answers);
        score[1] = getScore(two, answers);
        score[2] = getScore(three, answers);

        int max = 0;
        for(int s : score) {
            max = Math.max(s, max); //최대값
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++) {
            if(max == 0) break;
            if(max == score[i]) {list.add(i+1);}
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static int getScore(int[] arr, int[] answers) {
        int count = 0;
        for(int i=0; i<answers.length; i++) {
            if(arr[i % arr.length] == answers[i]) count++;
        }
        return count;
    }
}
