import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    static int[][] graph;
    static int n, ans, max, cnt;
    static boolean[][] ch;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(java.lang.String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = 1; //만약 다 돌았는데도 0이면 1출력하면 됨
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
                max = Math.max(max, graph[i][j]);
            }
        }
        for(int count = 0 ; count <= max; count ++){
            cnt =0;
            ch = new boolean[n][n];
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    if (graph[i][j] > count && !ch[i][j]){
                        DFS(i,j,count);
                        cnt ++;
                    }
                }
            }
            ans = Math.max(ans,cnt);
        }
        System.out.println(ans);
    }

    static void DFS(int x, int y, int height) {
            ch[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if (isRange(nx, ny) && graph[nx][ny] > height && !ch[nx][ny]) {
                    ch[nx][ny] = true;
                    DFS(nx,ny,height);
                }
            }

    }

    static boolean isRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}