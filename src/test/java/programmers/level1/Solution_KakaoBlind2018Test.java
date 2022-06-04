package programmers.level1;

import org.junit.jupiter.api.Test;
import programmers.level1.Solution_KakaoBlind2018;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_KakaoBlind2018Test {

    private final Solution_KakaoBlind2018 sk = new Solution_KakaoBlind2018();

    @Test
    void solution01() {
        //given

        //case1
        //int[] arr1 = {9,20,28,18,11};
        //int[] arr2 = {30,1,21,17,28};

        //case2
        int[] arr1 = {46,33,33,22,31,50};
        int[] arr2 = {27,56,19,14,14,10};

        //when
        //String[] result = sk.solution01(5,arr1,arr2);
        String[] result = sk.solution01(6,arr1,arr2);

        //then
        //assertArrayEquals(result, new String[]{"#####","# # #", "### #", "#  ##", "#####"}); //case1
        assertArrayEquals(result, new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "}); //case2

    }

    @Test
    void solution02() {
        //given
        String dartResult = "ㄱ1S2D*3T";
        String dartResult2 = "1D2S#10S";
        String dartResult3 = "1D2S0T";
        String dartResult4 = "1S*2T*3S";
        String dartResult5 = "1D#2S*3S";
        String dartResult6 = "1T2D3D#";
        String dartResult7 = "1D2S3T*";

        //when
        int result = sk.solution02(dartResult7);

        //then
        assertEquals(result, 59);
    }
}