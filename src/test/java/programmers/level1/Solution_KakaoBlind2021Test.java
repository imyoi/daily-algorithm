package programmers.level1;

import org.junit.jupiter.api.Test;
import programmers.level1.Solution_KakaoBlind2021;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_KakaoBlind2021Test {

    private final Solution_KakaoBlind2021 sk = new Solution_KakaoBlind2021();

    @Test
    void solution01() {
        //given
        //String new_id = "...!@BaT#*..y.abcdefghijklm";
        String new_id = "=.=";

        //when
        String result = sk.solution01(new_id);

        //then
        //assertEquals(result, "bat.y.abcdefghi");
        assertEquals(result, "aaa");
    }
}