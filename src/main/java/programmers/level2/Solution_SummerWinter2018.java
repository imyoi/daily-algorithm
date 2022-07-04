package programmers.level2;

public class Solution_SummerWinter2018 {
    /**
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
}