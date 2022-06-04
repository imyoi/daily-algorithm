package programmers.level1;

import org.junit.jupiter.api.Test;
import programmers.level1.Solution_KakaoInternship2019;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_KakaoInternship2019Test {

    private final Solution_KakaoInternship2019 sk = new Solution_KakaoInternship2019();

    @Test
    void solution01() {
        //given
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        //when
        int result = sk.solution01(board, moves);

        //then
        assertEquals(result, 4);
    }

}
