package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_MonthlyChallenge2Test {
    private final static Solution_MonthlyChallenge2 sm = new Solution_MonthlyChallenge2();

    @Test
    void 괄호_회전하기() {
        //given
        String s = "[](){}";

        //when
        int result = sm.solution01(s);

        //then
        assertEquals(result,3);
    }
}