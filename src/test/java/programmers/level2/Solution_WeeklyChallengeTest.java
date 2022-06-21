package programmers.level2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_WeeklyChallengeTest {

    private final Solution_WeeklyChallenge sw = new Solution_WeeklyChallenge();

    @Test
    void 피로도() {
        //given
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        //when
        int result = sw.solution01(k, dungeons);

        //then
        assertEquals(result, 3);
    }

    @Test
    void 교점에_별_만들기() {
        //given
        int[][] line = {{2,-1,4},{-2,-1,4},{0,-1,1},{5,-8,-12},{5,8,12}};
        int[][] line2 = {{0,1,-1},{1,0,-1},{1,0,1}};

        //when
        String[] result = sw.solution02(line);
        String[] result2 = sw.solution02(line2);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));

        //then
        assertArrayEquals(result, new String[]{"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"});
        assertArrayEquals(result2, new String[]{"*.*"});
    }
}