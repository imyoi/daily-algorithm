package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution_DevMatching2021Test {

    private final Solution_DevMatching2021 sd = new Solution_DevMatching2021();

    @Test
    void solution() {
        //given
        //int[] lottos = {44,1,0,0,31,25};
        //int[] win_nums = {31,10,45,1,6,19};

        //int[] lottos = {0,0,0,0,0,0};
        //int[] win_nums = {38,19,20,40,15,25};

        //int[] lottos = {45,4,35,20,3,9};
        //int[] win_nums = {20,9,3,45,4,35};

        int[] lottos = {97,96,99,98,95,94};
        int[] win_nums = {31,10,45,1,6,19};

        //when
        int[] result = sd.solution01(lottos, win_nums);

        //then
        //assertArrayEquals(result, new int[]{3,5});
        //assertArrayEquals(result, new int[]{1,6});
        //assertArrayEquals(result, new int[]{1,1});
        assertArrayEquals(result, new int[]{6,6});
    }
}