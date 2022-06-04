package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_PracticeTest {

    private final Solution_Practice sp = new Solution_Practice();

    @Test
    void solution01_2016() {
        //given
        int a = 5;
        int b = 24;

        //when
        String result = sp.solution01(a, b);

        //then
        assertEquals(result, "TUE");
    }

    @Test
    void solution02_가운데_글자_가져오기() {
        //given
        String s = "abcde";
        String s2 = "qwer";

        //when
        String result = sp.solution02(s);
        String result2 = sp.solution02(s2);

        //then
        assertEquals(result, "c");
        assertEquals(result2, "we");
    }

    @Test
    void solution03_같은_숫자는_싫어() {
        //given
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};

        //when
        int[] result = sp.solution03(arr);
        int[] result2 = sp.solution03(arr2);

        //then
        assertArrayEquals(result, new int[]{1,3,0,1});
        assertArrayEquals(result2, new int[]{4,3});
    }
}