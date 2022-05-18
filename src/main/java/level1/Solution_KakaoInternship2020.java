package level1;

import java.util.Stack;

public class Solution_KakaoInternship2020 {

    /**
     * #67256
     * 순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand 가 매개변수로 주어질 때,
     * 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.
     * [제한사항] 왼손(L), 오른손(R)을 순서대로 이어붙여 문자열 형태로 return 해주세요.
     *   - 키패드 이동 한 칸의 거리 = 1
     *   - 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있음 !
     *   - 가운데 열은 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용하고,
     *   - 두 엄지손가락의 거리가 같다면 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
     */
    public String solution01(int[] numbers, String hand) {
        String answer = "";

        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        left.push(10);
        right.push(12);

        for (int n : numbers) {
            if (n == 0) n = 11;
            switch (n % 3) {
                case 0: //3,6,9,12 → "R"
                    answer += "R";
                    right.push(n);
                    break;
                case 1: //1,4,7,10 → "L"
                    answer += "L";
                    left.push(n);
                    break;
                case 2: //거리비교
                    int ld = getDistance(n, left.peek());
                    int rd = getDistance(n, right.peek());

                    if(ld < rd){
                        answer += "L";
                        left.push(n);
                    }else if (ld > rd) {
                        answer += "R";
                        right.push(n);
                    }else if (ld == rd) {
                        answer += hand.substring(0,1).toUpperCase();
                        if("left".equals(hand)) {
                            left.push(n);
                        }else {
                            right.push(n);
                        }
                    }
                    break;
            }
        }
        return answer;
    }

    public static int getDistance(int n, int last) {
        int distance = Math.abs(n - last)%3 + Math.abs(n - last)/3; //상하(3) + 좌우(1)
        return distance;
    }
}
