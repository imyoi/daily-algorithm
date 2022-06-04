package programmers.level1;

import java.util.*;

public class Solution_KakaoBlind2019 {

    /**
     * #42889
     * 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
     * - 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
     * - 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
     * @param N : 전체 스테이지의 개수
     * @param stages : 현재 멈춰있는 스테이지의 번호가 담겨있는 배열
     * @return : 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열
     * */
    public int[] solution01(int N, int[] stages) {
        int[] answer = new int[N];
        int player = stages.length;
        double fail = 0;

        HashMap<Integer, Double> stageFail = new HashMap<>();
        for(int i = 1; i < N+1; i++) {
            int stage = i;
            //스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
            int failCnt = (int) Arrays.stream(stages).filter(s -> s-stage == 0).count();
            if(failCnt == 0) { //실패자 없음
                fail = 0.0;
            }else if(failCnt > 0){
                fail = (double)failCnt / player;
                player -= failCnt;
            }

            stageFail.put(stage, fail);
        }

        List<Integer> sortList = new ArrayList<>(stageFail.keySet());
        Collections.sort(sortList, (x, y) -> (stageFail.get(y).compareTo(stageFail.get(x)))); //내림차순

        int i = 0;
        for (Integer key : sortList) {
            answer[i] = key;
            i++;
        }

        return answer;
    }
}