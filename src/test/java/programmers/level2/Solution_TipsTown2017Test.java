package programmers.level2;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_TipsTown2017Test {
    private final static Solution_TipsTown2017 st = new Solution_TipsTown2017();

    @Test
    void 짝지어_제거하기() {
        //given
        String s = "cdcd";
        Stack<Character> stack = new Stack<>();

        //when
        int result = st.solution01(s);

        //then
        assertEquals(result, 0);
    }

    @Test
    void 예상_대진표() {
        //given
        int N = 8;
        int A = 4;
        int B = 7;

        //when
        int result = st.solution02(N, A, B);

        //then
        assertEquals(result, 3);
    }
}