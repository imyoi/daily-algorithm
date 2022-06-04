package programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution_KakaoBlind2022 {

    /**
     * #92334
     * - k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
     * - 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
     * @param id_list : 이용자의 ID가 담긴 문자열 배열
     * @param report : 신고한 이용자의 ID 정보가 담긴 문자열 배열
     * @param k : 정지 기준이 되는 신고 횟수
     * @return : 각 유저별로 처리 결과 메일을 받은 횟수를 담은 배열
     * */
    public int[] solution01(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> ids = new HashMap<>();
        Map<String, HashSet<String>> reportIds = new HashMap<>();

        for(int i=0; i<id_list.length; i++) {
            ids.put(id_list[i], i); //answer에서 사용할 idx 저장
            reportIds.put(id_list[i], new HashSet<>());
        }

        for (String r : report) {
            reportIds.get(r.split(" ")[1]).add(r.split(" ")[0]); //{신고대상자,신고자}
        }

        for(String id : reportIds.keySet()) {
            if(reportIds.get(id).size() >= k) {
                for(String i : reportIds.get(id)) { //신고자(메일대상자)
                    answer[ids.get(i)]++;
                }
            }
        }

        return answer;
    }
}