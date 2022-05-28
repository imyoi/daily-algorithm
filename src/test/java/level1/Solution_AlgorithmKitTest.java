package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_AlgorithmKitTest {

    private final Solution_AlgorithmKit sa = new Solution_AlgorithmKit();

    @Test
    void solution01() {
        //given
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        //when
        String result = sa.solution01(participant, completion);

        //then
        assertEquals(result, "mislav");
    }

    @Test
    void Solution02() {
        //given
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        //when
        int[] answer = sa.solution02(array, commands);
        int[] result = {5,6,3};

        //then
        assertArrayEquals(result, new int[]{5,6,3});
    }
}