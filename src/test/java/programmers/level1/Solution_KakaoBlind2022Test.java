package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution_KakaoBlind2022Test {

    private final Solution_KakaoBlind2022 sk = new Solution_KakaoBlind2022();

    @Test
    void solution01() {
        //given
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};

        //when
        int[] result = sk.solution01(id_list, report, 2);
        int[] result2 = sk.solution01(id_list2, report2, 3);

        //then
        assertArrayEquals(result, new int[]{2, 1, 1, 0});
        assertArrayEquals(result2, new int[]{0, 0});
    }
}
