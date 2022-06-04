package programmers.level1;

import org.junit.jupiter.api.Test;
import programmers.level1.Solution_SummerWinter2018;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_SummerWinter2018Test {

    private final Solution_SummerWinter2018 ss = new Solution_SummerWinter2018();

    @Test
    void solution01_소수구하기() {
        //given
        int[] nums = {1,2,7,6,4};

        //when
        int result = ss.solution01(nums);

        //then
        assertEquals(result, 4);
    }

    @Test
    void solution02_예산() {
        //given
        int[] d = {1,3,2,5,4};
        int budget = 9;

        //when
        int result = ss.solution02(d, budget);

        //then
        assertEquals(result, 3);
    }
}
