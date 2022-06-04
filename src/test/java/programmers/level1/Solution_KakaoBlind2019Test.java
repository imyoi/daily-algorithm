package programmers.level1;

import org.junit.jupiter.api.Test;
import programmers.level1.Solution_KakaoBlind2019;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution_KakaoBlind2019Test {

    private final Solution_KakaoBlind2019 sk = new Solution_KakaoBlind2019();

    @Test
    void solution01() {
        //given
        int N = 4;
        //int[] stages = {2,1,2,6,2,4,3,3};
        int[] stages = {4,4,4,4,4};

        //when
        int[] result = sk.solution01(N, stages);

        //then
        //assertArrayEquals(result, new int[]{3,4,2,1,5});
        assertArrayEquals(result, new int[]{4,1,2,3});
    }
}