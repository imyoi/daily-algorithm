package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_WeeklyChallengeTest {
    private final Solution_WeeklyChallenge sw = new Solution_WeeklyChallenge();

    @Test
    void solution01_부족한금액계산하기() {
        //given
        int price = 3;
        int money = 20;
        int count = 4;

        //when
        long result = sw.solution01(price, money, count);

        //then
        assertEquals(result, 10);

    }

    @Test
    void studies01_부족한금액계산하기() {
        //given
        int price = 3;
        int money = 20;
        int count = 4;

        //when
        long result = sw.studies01(price, money, count);

        //then
        assertEquals(result, 10);

    }

    @Test
    void solution02_최소직사각형() {

    }
}