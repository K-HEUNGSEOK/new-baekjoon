
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static char[][] graph;
    static boolean[][] ch;
    static int n, m,ans;
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ans = Integer.MAX_VALUE;
        graph = new char[n][m];
        ch = new boolean[n][m];
        for(int i = 0 ; i < n ; i ++){
            String str = sc.next();
            for(int j = 0 ; j < m; j ++){
                graph[i][j] = str.charAt(j);
            }
        }
        ch[0][0] = true;
        BFS(0,0);
        System.out.println(ans);
    }
    static void BFS(int x , int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        int cnt= 1;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int j = 0 ; j < len; j++) {
                int[] poll = queue.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = poll[0] + dx[i];
                    int ny = poll[1] + dy[i];
                    if (nx == n - 1 && ny == m - 1) {
                        ans = cnt+1;
                        return;
                    }
                    if (isRange(nx, ny) && !ch[nx][ny] && graph[nx][ny] == '1') {
                        ch[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
            cnt ++;
        }
    }

    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}