package programmers.level2;

import java.util.Stack;

public class Solution_TipsTown2017 {

    /**
     * #12973 짝지어 제거하기
     * @param s
     * @return 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수
     * */
    public int solution01(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); //같다면 제거(stack.peek()와 들어가려는 문자(c)
            }else stack.push(c);
        }
        return stack.isEmpty() ? 1 : 0;
    }

    /**
     * #12985 예상 대진표
     * ✓ A번 참가자와 B번 참가자는 서로 붙게 되기 전까지 항상 이긴다고 가정합니다.
     * @param n : 게임 참가자 수
     * @param a : 참가자 번호
     * @param b : 경쟁자 번호
     * @return 처음 라운드에서 A번을 가진 참가자는 경쟁자로 생각하는 B번 참가자와 몇 번째 라운드에서 만나는지 return
     * */
    public int solution02(int n, int a, int b){
        int answer = -1;
        return answer;
    }
}