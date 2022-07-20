package programmers.level2;

public class Solution_MonthlyChallenge1 {
    public int[] answer = new int[2]; //0의개수, 1의개수

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

    /**
     * #68936 쿼드압축 후 개수 세기
     * ✓ 압축하고자 하는 영역(S) 내부에 있는 모든 수가 같은 값이라면, S를 해당 수 하나로 압축
     * ✓ 그렇지 않다면, S를 4개의 균일한 정사각형영역으로 쪼갠 뒤, 각 영역에 대해 같은 방식으로 압축
     * @param arr : 0과 1로 이루어진 2n x 2n 크기의 2차원 정수 배열
     * @return 배열에 최종적으로 남는 0의 개수와 1의 개수를 배열에 담아서 return
     * */
    public int[] solution03(int[][] arr) {
        quad(arr, 0, 0, arr.length); //분할정복
        return answer;
    }

    /**
     * @param arr
     * @param x : 압축 영역 시작점(x축)
     * @param y : 압축 영역 시작점(y축)
     * @param size
     * */
    public void quad(int[][] arr, int x, int y, int size) {
        boolean isDiff = false;
        for(int i=x; i<x+size; i++) {
            for(int j=y; j<y+size; j++) {
                if(arr[x][y] != arr[i][j]) { //시작점의 값 != 현재 값
                    isDiff = true;
                    break;
                }
            }
        }
        if(!isDiff) { //영역 내 값의 차이가 없다면 압축 가능
            if(arr[x][y] == 0) answer[0]++;
            else answer[1]++;
        }else { //차이가 있다면 다시 4등분
            quad(arr, x, y, size/2); //1사분면
            quad(arr, x, y+(size/2), size/2); //2사분면
            quad(arr, x+(size/2), y, size/2); //3사분면
            quad(arr, x+(size/2), y+(size/2), size/2); //4사분면
        }
    }
}
