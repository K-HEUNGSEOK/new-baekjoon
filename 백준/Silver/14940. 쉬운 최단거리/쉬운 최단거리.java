import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.List;

public class Main {
    static int n,m;
    static int[][] graph;
    static int[][] ans;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n][m];
        ans = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                ans[i][j] = -1;
            }
        }
        int x = -1;
        int y = -1;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 2){
                    x = i;
                    y = j;
                }
                if (graph[i][j] == 0){
                    ans[i][j] = 0;
                }
            }
        }

        //BFS로 풀어야할거같은데 bfs지점부터 쭉 퍼지는식으로
        BFS(x,y);

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        int cnt = 1;
        ans[x][y] = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0 ; i < len ; i ++){
                int[] poll = queue.poll();
                for(int j = 0 ; j < 4; j ++){
                    int nx = poll[0] + dx[j];
                    int ny = poll[1] + dy[j];
                    if (isRange(nx,ny) && graph[nx][ny] == 1){
                        graph[nx][ny] = 0;
                        queue.offer(new int[]{nx,ny});
                        ans[nx][ny] = cnt;
                    }
                }
            }
            cnt++;
        }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}