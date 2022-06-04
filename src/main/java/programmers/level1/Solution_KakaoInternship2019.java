package programmers.level1;

import java.util.Stack;

public class Solution_KakaoInternship2019 {

    /**
     * #64601
     * 게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
     * 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요.
     * [제한사항] moves 배열 각 원소들의 값은 1 이상, 0은 빈 칸을 나타냅니다.
     * 같은 모양의 인형일 경우 연속한 두 개가 없어진다
     * ? stack.push() : stack에 값 추가
     * ? stack.pop() : stack에 값 제거
     * ? stack.clear() : stack 값 모두 제거
     * */
    public int solution01(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i]-1] != 0){
                    if(stack.size() > 0 && stack.peek() == board[j][moves[i]-1]) {
                        stack.pop();
                        answer += 2;
                    }else {
                        stack.push(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] = 0; //인형 없음
                    break;
                }
            }
        }
        // 뽑은 인형 확인
        while(!stack.isEmpty()) {
            System.out.println("[" + stack.pop() + "]");
        }

        return answer;
    }

}
