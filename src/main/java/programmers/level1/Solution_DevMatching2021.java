package programmers.level1;

import java.util.Arrays;

public class Solution_DevMatching2021 {

    /**
     * #77484
     * 1: 6개 일치 -5
     * 2: 5개 일치 -3
     * 3: 4개 일치 -1
     * 4: 3개 일치 +1
     * 5: 2개 일치 +3
     * 6(낙첨): 그 외
     *
     * @param lottos : 구매한 로또 번호를 담은 배열
     * @param win_nums : 당첨 번호를 담은 배열
     * @return 당첨 가능한 최고 순위와 최저 순위를 차례대로 담은 배열
     * */
    public int[] solution01(int[] lottos, int[] win_nums) {
        int min = (int) Arrays.stream(lottos).filter(l -> Arrays.stream(win_nums).anyMatch(w -> w == l)).count(); //완전일치(최저)
        int max = min + (int) Arrays.stream(lottos).filter(l -> l == 0).count(); //완전일치 + 0의 개수
        int[] answer = {getRank(max), getRank(min)};

        return answer;
    }

    public int getRank(int n) {
        if(n == 0) return 6;
        return 7-n;
    }
}
