
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n,m,cnt,ans;
    static int[][] graph;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        cnt = 0;
        ans = 0;

        graph = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m; j ++){
                graph[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j <m ; j ++){
                if(graph[i][j] == 1){
                    BFS(i,j);
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);
        System.out.println(ans);
    }
    static void BFS(int x , int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        graph[x][y] = 0;
        int result = 1;
        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            for(int i = 0 ; i < 4; i ++){
                int nx = arr[0] + dx[i];
                int ny = arr[1] + dy[i];

                if(isRange(nx,ny) && graph[nx][ny] == 1){
                    result ++;
                    graph[nx][ny] = 0;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
        ans = Math.max(ans,result);
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}