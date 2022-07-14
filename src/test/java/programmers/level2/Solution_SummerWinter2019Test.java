package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_SummerWinter2019Test {
    private final static Solution_SummerWinter2019 ss = new Solution_SummerWinter2019();

    @Test
    void 멀쩡한_사각형() {
        //given
        int w = 8;
        int h = 12;

        //when
        long result = ss.solution(w, h);

        //then
        assertEquals(80, 80);
    }
}