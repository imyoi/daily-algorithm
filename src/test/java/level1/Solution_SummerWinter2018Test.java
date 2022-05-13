package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_SummerWinter2018Test {

    private final Solution_SummerWinter2018 ss = new Solution_SummerWinter2018();

    @Test
    void solution01_소수구하기() {
        //given
//        int[] nums = {1,2,3,4};
        int[] nums = {1,3,5,7,9,10};

        //when
        int result = ss.solution01(nums);

        //then
        assertEquals(result, 1);
    }

    @Test
    void solution02_예산() {
        //given
        int[] d = {1,3,2,5,4};
        int budget = 9;

        //when
        int result = 3;

        //then
        assertEquals(result, 3);
    }
}
