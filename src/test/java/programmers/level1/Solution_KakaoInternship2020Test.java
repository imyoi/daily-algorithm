package programmers.level1;

import org.junit.jupiter.api.Test;
import programmers.level1.Solution_KakaoInternship2020;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_KakaoInternship2020Test {

    private final Solution_KakaoInternship2020 sk = new Solution_KakaoInternship2020();

    @Test
    void solution01() {
        //given
        int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
        int[] numbers2 = {7,0,8,2,8,3,1,5,7,6,2};
        int[] numbers3 = {1,2,3,4,5,6,7,8,9,0};
        int[] numbers4 = {9,9,9,8,1,1,2,5,1,0};
        int[] numbers5 = {7,8,7,8,1,4,2,5,1,0,3};

        //when
        String result = sk.solution01(numbers, "right");
        String result2 = sk.solution01(numbers2, "left");
        String result3 = sk.solution01(numbers3, "right");
        String result4 = sk.solution01(numbers4, "right");
        String result5 = sk.solution01(numbers5, "left");

        //then
        assertEquals(result, "LRLLLRLLRRL");  //case1
        assertEquals(result2, "LRLLRRLLLRR"); //case2
        assertEquals(result3, "LLRLLRLLRL");  //case3
        assertEquals(result4, "RRRRLLLRLR");  //case4
        assertEquals(result5, "LLLLLLLLLRR"); //case5

    }
}
