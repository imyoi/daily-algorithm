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

    @Test
    void solution04_나누어_떨어지는_숫자_배열() {
        //given
        int[] arr = {2,36,1,3};
        int[] arr2 = {3,2,6};

        //when
        int[] result = sp.solution04(arr, 1);
        int[] result2 = sp.studies04(arr2, 10);

        //then
        assertArrayEquals(result, new int[]{1,2,3,36});
        assertArrayEquals(result2, new int[]{-1});
    }

    @Test
    void solution05_두_정수_사이의_합() {
        //given
        int a = 5;
        int b = 3;

        //when
        long result = sp.solution05(a, b);

        //then
        assertEquals(result, 12);
    }

    @Test
    void solution06_문자열_내마음대로_정렬하기() {
        //given
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        //when
        String[] answer = sp.solution06(strings, n);

        //then
        assertArrayEquals(answer, new String[]{"abcd", "abce", "cdx"});
    }
}
