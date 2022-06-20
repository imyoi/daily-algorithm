package programmers.level2;

public class Solution_WeeklyChallenge {

    private static int answer = 0;

    /**
     * #87946
     * ✓ dungeons의 가로(열) 길이는 2 입니다.
     * ✓ "최소 필요 피로도"는 항상 "소모 피로도"보다 크거나 같습니다.
     * @param k : 유저의 현재 피로도
     * @param dungeons : 각 던전별 ["최소 필요 피로도", "소모 피로도"] 가 담긴 2차원 배열
     * @return 유저가 탐험할수 있는 최대 던전 수
     * */
    public int solution01(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length]; //탐색처리
        dfs(dungeons, visited, k, 0);
        return answer;
    }

    //DFS(깊이우선탐색)
    public static void dfs(int[][] arr, boolean[] visited, int k, int cnt) {
        for(int i=0; i<arr.length; i++) {
            if(!visited[i]) {
                if(k >= arr[i][0]) { //현재 피로도 >= 최소 필요 피로도
                    visited[i] = true; //탐색시작
                    dfs(arr, visited, k-arr[i][1], cnt+1); //던전 통과 시 경우의 수 더하기
                    visited[i] = false; //탐색종료
                }
            }
        }
        answer = Math.max(answer, cnt);
    }

    /**
     * #87377
     * ✓ line의 가로(열) 길이는 3입니다.
     * ✓ ine의 각 원소는 [A, B, C] 형태입니다.
     * ✓ A = 0이면서 B = 0인 경우는 주어지지 않습니다.
     * @param line : 직선 A, B, C에 대한 정보가 담긴 배열
     * @return 모든 별을 포함하는 최소 사각형을 return
     * */
    public String[] solution02(int[][] line) {
        String[] answer = {};
        return answer;
    }
}