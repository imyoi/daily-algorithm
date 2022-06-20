package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_MonthlyChallenge3Test {

    private final Solution_MonthlyChallenge3 smc3 = new Solution_MonthlyChallenge3();

    @Test
    void solution01_없는숫자더하기() {
        //given
        int[] numbers = {5,8,4,0,6,7,9};

        //when
         int result = smc3.solution01(numbers);

        //then
         assertEquals(result, 6);
    }

    @Test
    void studies01_없는숫자더하기() {
        //given
        int[] numbers = {1,2,3,4,6,7,8,0};

        //when
        int result = smc3.studies01(numbers);

        //then
        assertEquals(result, 14);
    }

    @Test
    void studies02_없는숫자더하기() {
        //given
        int[] numbers = {5,8,4,0,6,7,9};

        //when
        int result = smc3.studies02(numbers);

        //then
        assertEquals(result, 6);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    void solution02_나머지가1이되는수찾기() {
        //given
        int n = 12;

        //when
        int result = smc3.solution02(n);

        //then
        assertEquals(result, 11);
    }

}
