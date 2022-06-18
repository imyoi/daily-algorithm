package programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    void solution07_문자열_내_p와_y의_개수() {
        //given
        String s = "pPoooyY";
        String s2 = "Pyy";

        //when
        boolean result = sp.solution07(s);
        boolean result2 = sp.studies07(s2);

        //then
        assertEquals(result, true);
        assertEquals(result2, false);
    }

    @Test
    void solution08_문자열_내림차순으로_배치하기() {
        //given
        String s = "Zbcdefg";

        //when
        String result = sp.solution08(s);

        //then
        assertEquals(result, "gfedcbZ");
    }

    @Test
    void solution09_문자열_다루기_기본() {
        //given
        String s = "1234";

        //when
        boolean result = sp.solution09(s);

        //then
        assertEquals(result, true);
    }

    @Test
    void solution10_서울에서_김서방_찾기() {
        //given
        String[] seoul = {"Jane", "Kim"};

        //when
        String result = sp.solution10(seoul);

        //then
        assertEquals(result, "김서방은 1에 있다");
    }

    @Test
    void solution11_소수_찾기() {
        //given
        int n = 5;

        //when
        int result = sp.solution11(n);

        //then
        assertEquals(result, 3);
    }

    @Test
    void solution12_수박수박수박수박수박수() {
        //given
        int n = 4;

        //when
        String result = sp.solution12(n);

        //then
        assertEquals(result, "수박수박");
    }

    @Test
    void solution13_문자열을_정수로_바꾸기() {
        //given
        String s = "-1234";

        //when
        int result = sp.solution13(s);

        //then
        assertEquals(result, -1234);
    }

    @Test
    void solution14_시저_암호() {
        //given
        String s = "a B z";
        int n = 4;

        //when
        String result = sp.solution14(s, n);

        //then
        assertEquals(result, "e F d");
    }

    @Test
    void solution15_약수의_합() {
        //given
        int n = 12;

        //when
        int result = sp.solution15(n);

        //then
        assertEquals(result, 28);
    }

    @Test
    void solution16_이상한_문자_만들기() {
        //given
        String s = "sp ace";

        //when
        String result = sp.solution16(s);

        //then
        assertEquals(result, "Sp AcE");
    }

    @Test
    void solution17_자릿수_더하기() {
        //given
        int n = 123;

        //when
        int result = sp.solution17(n);

        //then
        assertEquals(6, 6);
    }

    @Test
    void solution18_자연수_뒤집어_배열로_만들기() {
        //given
        long n = 12345;

        //when
        int[] result = sp.solution18(n);
        System.out.println(Arrays.toString(result));

        //then
        assertArrayEquals(result, new int[]{5,4,3,2,1});
    }

    @Test
    void solution19_정수_내림차순으로_배치하기() {
        //given
        long n = 118372;

        //when
        long result = sp.solution19(n);

        //then
        assertEquals(result, 873211);
    }

    @Test
    void solution20_정수_제곱근_판별() {
        //given
        long n = 121;
        long n2 = 3;

        //when
        long result = sp.solution20(n);
        long result2 = sp.solution20(n2);

        //then
        assertEquals(result, 144);
        assertEquals(result2, -1);
    }

    @Test
    void solution21_제일_작은_수_제거하기() {
        //given
        int[] arr = {4,3,2,1};
        int[] arr2 = {10};

        //when
        int[] result = sp.solution21(arr);
        int[] result2 = sp.solution21(arr2);
        System.out.println(Arrays.toString(result));

        //then
        assertArrayEquals(result, new int[]{4,3,2});
        assertArrayEquals(result2, new int[]{-1});
    }

    @Test
    void solution22_짝수와_홀수() {
        //given
        int num = 3;

        //when
        String result = sp.solution22(num);

        //then
        assertEquals(result, "Odd");
    }

    @Test
    void solution23_짝수와_홀수() {
        //given
        int n = 2;
        int m = 5;

        //when
        int[] result = sp.solution23(n,m);
        System.out.println(Arrays.toString(result));

        //then
        assertArrayEquals(result, new int[]{1,10});
    }

    /**
     * 예를 들어,
     * 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다.
     * */
    @Test
    void solution24_콜라츠_추측() {
        //given
        long num = 626331;

        //when
        int result = sp.solution24(num);

        //then
        assertEquals(result, -1);
    }

    @Test
    void solution25_평균_구하기() {
        //given
        int[] arr = {1,2,3,4};
        //when
        double result = sp.solution25(arr);

        //then
        assertEquals(result, 2.5);
    }

    @Test
    void solution26_하샤드수() {
        //given
        int x = 13;

        //when
        boolean result = sp.solution26(x);

        //then
        assertEquals(result, false);
    }
}
