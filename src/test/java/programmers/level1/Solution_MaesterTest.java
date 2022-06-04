package programmers.level1;

import org.junit.jupiter.api.Test;
import programmers.level1.Solution_Maester;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_MaesterTest {

    private final Solution_Maester s = new Solution_Maester();

    @Test
    void solution01() {
        //given
        int[] nums = {3,3,3,2,2,2};

        //when
        int result = s.solution01(nums);

        //then
        assertEquals(result, 2);
    }
}
