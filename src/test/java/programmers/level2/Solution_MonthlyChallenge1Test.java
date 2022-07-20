package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution_MonthlyChallenge1Test {
    private final static Solution_MonthlyChallenge1 sm = new Solution_MonthlyChallenge1();

    @Test
    void 삼각_달팽이() {
        //given
        int n = 4;

        //when
        int[] result = sm.solution01(n);

        //then
        assertArrayEquals(result, new int[]{1,2,9,3,10,8,4,5,6,7});
    }

    @Test
    void 이진_변환_반복하기() {
        //given
        String s = "110010101001";

        //when
        int[] result = sm.solution02(s);

        //then
        assertArrayEquals(result, new int[]{3, 8});
    }

    @Test
    void 쿼드압축_후_개수_세기() {
        //given
        int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};

        //when
        int[] result = sm.solution03(arr);

        //then
        assertArrayEquals(result, new int[]{4, 9});
    }
}