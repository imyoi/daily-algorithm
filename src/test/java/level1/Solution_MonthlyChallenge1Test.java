package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_MonthlyChallenge1Test {

    private final Solution_MonthlyChallenge1 smc1 = new Solution_MonthlyChallenge1();

    @Test
    void solution01() {
        //given
        int[] numbers = {2,1,3,4,1};

        //when
        int[] result = smc1.solution01(numbers);

        //then
        //assertArrayEquals: 두 배열이 같은지 여부
        assertArrayEquals(result, new int[]{2,3,4,5,6,7});
    }

    @Test
    void solution02() {
        //given
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};

        //when
        int result = smc1.solution02(a, b);

        //then
        assertEquals(result, -2);
    }
}
