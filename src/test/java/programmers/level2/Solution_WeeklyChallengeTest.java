package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_WeeklyChallengeTest {


    private final Solution_WeeklyChallenge sw = new Solution_WeeklyChallenge();

    @Test
    void solution01_피로도() {
        //given
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        //when
        int result = sw.solution01(k, dungeons);

        //then
        assertEquals(result, 3);
    }
}