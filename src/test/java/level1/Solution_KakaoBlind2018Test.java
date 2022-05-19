package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
}