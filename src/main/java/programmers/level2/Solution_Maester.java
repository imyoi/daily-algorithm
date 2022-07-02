package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_Maester {
    static int answer = 0;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {-1,1,0,0};

    /**
     * #1844 게임 맵 최단거리
     * 0: 벽, 1: 길(이동가능)
     * @param maps
     * @return
     * */
    public int solution01(int[][] maps) {
        int[][] visited = new int[maps.length][maps[0].length];
        visited[0][0] = 1;
        bfs(maps, visited);

        return (visited[maps.length-1][maps[0].length-1] != 0) ? visited[maps.length-1][maps[0].length-1] : -1;
    }

    //BFS(너비우선탐색)
    public static void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{0, 0}); //Queue에 루트노드 넣기
        //queue.add(new int[]{0,0})도 가능

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); //가장 앞쪽 Queue 가져오기
            for (int i = 0; i < 4; i++) {
                //현 지점에서 이동했을 때의 위치
                int cx = current[0] + dx[i];
                int cy = current[1] + dy[i];

                //범위를 벗어 남
                if (cx < 0 || cx > maps.length - 1 || cy < 0 || cy > maps[0].length - 1) continue;

                //방문 체크
                if (visited[cx][cy] == 0 && maps[cx][cy] == 1) {
                    visited[cx][cy] = visited[current[0]][current[1]] + 1;
                    queue.offer(new int[]{cx, cy});
                }
            }
        }
    }
}
