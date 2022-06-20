package programmers.level1;

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

    @Test
    void solution03() {
        //given
        int[] answers = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};
        int[] answers3 = {5,5,1,4,1};
        int[] answers4 = {1,2,1,1,2};

        int[] answers5 = {5,4,4,2,1};
        int[] answers6 = {3,3,1,1,1,1,2,3,4,5};

        //when
        int[] result = sa.solution03(answers);
        int[] result2 = sa.solution03(answers2);
        int[] result3 = sa.solution03(answers3);
        int[] result4 = sa.solution03(answers4);
        int[] result5 = sa.solution03(answers5);
        int[] result6 = sa.solution03(answers6);

        //then
        assertArrayEquals(result, new int[]{1});
        assertArrayEquals(result2, new int[]{1,2,3});
        assertArrayEquals(result3, new int[]{1,3});
        assertArrayEquals(result4, new int[]{3});
        assertArrayEquals(result5, new int[]{});
        assertArrayEquals(result6, new int[]{1,3});
    }

    @Test
    void solution04() {
        //given
        int n = 3;
        int[] lost = {1,2};
        int[] reserve = {2,3};

        //when
        int result = sa.solution04(n, lost, reserve);

        //then
        assertEquals(result, 2);
    }
}
