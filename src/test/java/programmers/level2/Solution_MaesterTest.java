package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_MaesterTest {
    private final static Solution_Maester sm = new Solution_Maester();

    @Test
    void 게임_맵_최단거리() {
        //given
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};

        //when
        int result = sm.solution01(maps);
        System.out.println(result);

        //then
        assertEquals(result, 11);
    }
}