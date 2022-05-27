package level1;

import org.junit.jupiter.api.Test;

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
}