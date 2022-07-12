package programmers.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution_SummerWinter2018 {
    /**
     * #12978 배달
     * a, b(1 ≤ a, b ≤ N, a != b)는 도로가 연결하는 두 마을의 번호
     * c(1 ≤ c ≤ 10,000, c는 자연수)는 도로를 지나는데 걸리는 시간입니다.
     * 1번 마을에 있는 음식점이 K 이하의 시간에 배달이 가능한 마을의 개수를 return 하면 됩니다.
     * @param N : 마을의 개수
     * @param road : 각 마을을 연결하는 도로의 정보
     * @param K : 음식 배달이 가능한 시간
     * @return 음식 주문을 받을 수 있는 마을의 개수를 return 하도록 solution 함수
     * */
    public int solution01(int N, int[][] road, int K) {
        /* 플로이드 와샬 알고리즘 : start에서 end까지 바로 가는 경로와 (start에서  K(지나가는 어떤 점)까지의 거리
         * + K부터 end 까지의 거리) 경로 중 더 짧은 거리를 구하는 방식
         *
         * start : 출발점인 1번 마을 ~ K : 정점 의 최단 거리
         * row가 1인 행에서 시간 내 배달이 가능한 열의 수
         */
        int answer = 0;

        //마을(정점)의 개수만큼 2차원 배열 생성
        int[][] distance = new int[N][N];
        for (int i=0; i<distance.length; i++) {
            for (int j=0; j<distance[0].length; j++) {
                if(i == j) continue;
                distance[i][j] = 500001;
            }
        }

        //정점과 정점사이의 다리를 입력
        for (int[] r : road) {
            if(distance[r[0]-1][r[1]-1] < r[2]) continue; //기존 길이 더 적은 거리면 무시
            distance[r[0]-1][r[1]-1]=r[2];
            distance[r[1]-1][r[0]-1]=r[2];
        }

        //플로이드 와샬
        for (int i=0; i<distance.length; i++) { //거쳐가는 지점
            for (int j=0; j<distance.length; j++) { //시작점
                for (int k=0; k<distance.length; k++) { //도착점
                    if(distance[j][k] > distance[j][i] + distance[i][k]) {
                        distance[j][k] = distance[j][i] + distance[i][k];
                    }
                }
            }
        }
        //시간이 K이하면 증가
        for (int i=0; i<distance.length; i++) {
            if(distance[0][i] <= K) answer++;
        }
        return answer;
    }

    /**
     * #12981 영어 끝말잇기
     * 1. 1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
     * 2. 마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
     * 3. 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
     * 4. 이전에 등장했던 단어는 사용할 수 없습니다. (=중복금지)
     * 5. 한 글자인 단어는 인정되지 않습니다.
     * @param n : 사람의 수
     * @param words : 사람들이 순서대로 말한 단어
     * @return 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return
     * */
    public int[] solution02(int n, String[] words) {
        Set<String> set = new HashSet<>(); //중복 방지
        set.add(words[0]);

        int i = 1;
        while(i < words.length){
            String pre = words[i-1]; //이전단어
            //이미 나왔거나, 단어가 맞지 않는 경우
            if(set.contains(words[i]) || pre.charAt(pre.length()-1) != words[i].charAt(0)) {
                return new int[]{i%n+1, i/n+1};
            }
            set.add(words[i]);
            i++;
        }
        return new int[]{0,0}; //탈락자가 생기지 않는다면?
    }

    /**
     * #12980 점프와 순간 이동
     * 1칸이동 : 건전지 1개
     * 순간이동 : 현재까지 온 거리 x 2 (건전지 사용량이 줄지 않음)
     * @param n : 이동하려는 거리
     * @return 사용해야 하는 건전지 사용량의 최솟값
     * */
    public int solution03(int n) {
//  출발지점[0] [1] [2] [3] [4] [5] [6]
//  0 -> 1 (건전지 1개 소모) => 현재 위치 1
//  현재위치(1) x2 (순간이동으로 건전지 0개 소모) => 현재 위치 2
//  현재위치(2) x2 (순간이동으로 건전지 0개 소모) => 현재 위치 4
//  현재위치(4) -> [5] (건전지 1개 소모)
//  최소 2개는 써야 5로 갈 수 있음!
//  (num=2(10)일 때 1의 개수는 1, num=11(1011)일 때 1의 개수는 3)
        return Integer.bitCount(n); //num을 binary로 변환한 뒤, 1의 개수를 반환
    }

    /**
     * #49993 스킬트리
     * ✓ 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다.
     * @param skill : 선행 스킬 순서
     * @param skill_trees : 유저들이 만든 스킬트리1를 담은 배열
     * @return 가능한 스킬트리 개수
     * */
    public int solution04(String skill, String[] skill_trees) {
        int answer = 0;
        for(String s : skill_trees) {
            String temp = s;
            for (int i = 0; i < s.length(); i++) {
                if (!skill.contains(String.valueOf(s.charAt(i)))) {
                    temp = temp.replace(String.valueOf(s.charAt(i)), ""); //순서상관없는 스킬
                }
            }
            if (skill.indexOf(temp) == 0) answer++;
        }
        return answer;
    }

    /**
     * #49994 방문 길이
     * @param dirs : 명령어
     * @return 게임 캐릭터가 처음 걸어본 길의 길이
     * */
    public int solution05(String dirs) {
        int x = 0, y = 0; //시작점(0,0) 초기화
        HashSet<String> isVisited = new HashSet<>(); //방문체크(중복방지!)

        Map<Character, int[]> command = new HashMap<>();
        command.put('U', new int[]{0, 1});  //위쪽으로 한 칸 이동
        command.put('D', new int[]{0, -1}); //아래쪽으로 한 칸 이동
        command.put('R', new int[]{1, 0});  //오른쪽으로 한 칸 이동
        command.put('L', new int[]{-1, 0}); //왼쪽으로 한 칸 이동

        for(Character c : dirs.toCharArray()) {
            int nX = x, nY = y;

            //범위를 벗어날 경우
            if(x < -5 || x > 5) {
                x -= command.get(c)[0];
                continue;
            }
            if(y < -5 || y > 5) {
                y -= command.get(c)[1];
                continue;
            }

            x += command.get(c)[0];
            y += command.get(c)[1];

            //이동하지 않는 경우
            if(x == nX && y == nY) continue;

            //양방향으로 다 넣어주기(같은 경로이므로 2로 나눠준다)
            isVisited.add(nX + "" + nY + "" + x  + "" + y); //현재좌표 + 이동좌표
            isVisited.add(x + "" + y + "" + nX  + "" + nY); //이동좌표 + 현재좌표
        }
        return isVisited.size()/2;
    }

    /**
     * #12899 124 나라의 숫자
     * ✓ 124 나라에는 자연수만 존재합니다.
     * ✓ 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
     * @param n : 숫자
     * @return n을 124 나라에서 사용하는 숫자로 바꾼 값
     * */
    public String solution05(int n) {
        //n%3 == 1 -> index = 1 (1)
        //n%3 == 2 -> index = 2 (2)
        //n%3 == 0 -> index = 0 을 124 나라의 맞게 순서대로 초기화 (4)
        //num[0], num[1], num[2]
        //{"4","1","2"}
        String answer = "";
        String[] num = {"4", "1", "2"};
        while(n > 0) {
            answer = num[n%3] + answer;
            if(n%3 == 0) n--;
            n /= 3;
        }
        return answer;
    }
}