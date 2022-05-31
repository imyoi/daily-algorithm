package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_PracticeTest {

    private final Solution_Practice sp = new Solution_Practice();

    @Test
    void solution01() {
        //given
        int a = 5;
        int b = 24;

        //when
        String result = sp.solution01(a, b);

        //then
        assertEquals(result, "TUE");
    }
}