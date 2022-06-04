package programmers.level1;

import java.util.Arrays;

public class Solution_WeeklyChallenge {

    /**
     * #82612
     * 놀이기구의 이용료는 price원 인데, 놀이기구를 N 번째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
     * 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
     * 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
     * 단, 금액이 부족하지 않으면 0을 return 하세요.
     * */
    public long solution01(int price, int money, int count) {
        long answer = 0;
        answer = (sum(count) * price) - money;

        if(answer < 0) {
            return 0;
        }

        return answer;
    }

    // 1부터 count 까지 더하기
    public static long sum(int count) {
        if(count <= 1) return count;
        return count + sum(count - 1);  // 재귀함수
    }

    /**
     * #82612 studies
     * 다른 풀이 (1)
     * 1부터 n까지 구하는 공식 : n(1+n)/2
     * Math.max() : 두 인자 값 중 큰 값을 리턴
     * */
    public long studies01(int price, int money, int count) {
        long answer = Math.max(( count * (1 + count) / 2) * price - money, 0);
        return answer;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * #86491
     * 가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
     * 하지만 2번 명함을 가로로 눕힌다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다.
     * 이때의 지갑 크기는 4000(=80 x 50)입니다.
     * 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
     * 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution02(int[][] sizes) {
        int w = 0;
        int h = 0;

        for(int[] s : sizes) {
            w = Math.max(w, Math.max(s[0], s[1]));
            h = Math.max(h, Math.min(s[0], s[1]));
        }

        return w * h;
    }

    /**
     * #86491 studies
     * 다른 풀이 (1)
     * */
    public int studies02(int[][] sizes) {
        int w = 0;
        int h = 0;

        for(int[] s : sizes) {
            w = Math.max(Arrays.stream(s).max().getAsInt(), w);
            h = Math.max(Arrays.stream(s).min().getAsInt(), Math.max(Arrays.stream(s).min().getAsInt(), h));
        }

        return w * h;
    }


}
