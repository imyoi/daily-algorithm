package programmers.level2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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
}