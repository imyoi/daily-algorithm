package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_MonthlyChallenge2Test {

    private final Solution_MonthlyChallenge2 smc2 = new Solution_MonthlyChallenge2();

    @Test
    void solution01_음양더하기() {
        //given
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};

        //when
        int result = smc2.solution01(absolutes, signs);

        //then
        assertEquals(result, 0);
    }
}