package programmers.level2;

public class Solution_MonthlyChallenge1 {

    /**
     * #68645 삼각달팽이
     * @param n : 밑변의 길이와 높이
     * @return 맨 위 꼭짓점부터 반시계 방향으로 달팽이 채우기를 진행한 후, 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열
     * */
    public int[] solution01(int n) {
        int[] answer = new int[(n*(n+1))/2];
        int[][] temp = new int[n][n];

        int x = -1, y = 0;
        int num = 1;

        //트리모양 삼각형을 왼쪽으로 밀면
        //아래 -> 오른쪽 -> 대각선 -> 아래 ... 이런식으로 반복된다
        //1
        //2 9
        //3 10 8
        //4 5 6 7
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++; //아래
                } else if (i % 3 == 1) {
                    y++; //우측
                } else if (i % 3 == 2) { //대각선까지 3번 반복
                    x--;
                    y--;
                }
                temp[x][y] = num++;
            }
        }

        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(temp[i][j] == 0)
                    break;
                answer[k++] = temp[i][j];
            }
        }
        return answer;
    }

    /**
     * #70129 이진 변환 반복하기
     * @param s
     * @return 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return
     * */
    public int[] solution02(String s) {
        int[] answer =  new int[2];
        StringBuffer sb = new StringBuffer();
        while(s.length() > 1) {
            char[] arr = s.toCharArray();
            for(char c : arr) {
                if(c != '0') sb.append(c);
                else answer[1]++; //제거된 0의 개수
            }
            answer[0]++;
            s = Integer.toBinaryString(sb.toString().length()); //0을 제외한 문자열 길이 -> 2진수 변환
            sb.delete(0, sb.length());
        }
        return answer;
    }
}
