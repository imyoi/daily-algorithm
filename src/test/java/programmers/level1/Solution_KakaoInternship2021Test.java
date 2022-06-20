package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_KakaoInternship2021Test {

    private final Solution_KakaoInternship2021 sk = new Solution_KakaoInternship2021();

    @Test
    void solution01() {
        //given
        String s = "2three45sixseven";

        //when
        int result = sk.solution01(s);

        //then
        assertEquals(result, 234567);
    }
}
