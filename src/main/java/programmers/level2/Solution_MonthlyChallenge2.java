package programmers.level2;

import java.util.Stack;

public class Solution_MonthlyChallenge2 {

    /**
     * #76502 괄호 회전하기
     * @param s : 대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열
     * @return s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수
     * */
    public int solution01(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++) {
            s = shift(s); //왼쪽으로 밀기
            if(isCheck(s)) {
                answer ++;
            }
        }
        return answer;
    }

    private static String shift(String s) {
        return s.substring(1, s.length()) + s.charAt(0);
    }

    private static boolean isCheck(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i)); //여는 괄호 Push
            }else {
                //스택이 비어있으면 여는 괄호가 없다는 뜻
                if(stack.empty()) return false;

                //닫는 괄호와 스택의 top 값을 비교해서 짝이 맞는지 확인
                if((s.charAt(i) == ']' && stack.peek() == '[')
                        || (s.charAt(i) == '}' && stack.peek() == '{')
                        || (s.charAt(i) == ')' && stack.peek() == '(')) {
                    stack.pop(); //짝이 되면 스택의 가장 위에 있는 값 제거
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        if(!stack.empty()) return false;
        return true;
    }
}