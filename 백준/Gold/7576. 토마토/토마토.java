import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.List;

public class Main {
    static int width, height, ans;
    static int[][] graph;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        height = sc.nextInt();

        graph = new int[height][width];
        ans = 0;
        boolean flag = false;
        for(int i = 0 ; i < height; i ++){
            for(int j = 0 ; j < width; j ++){
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 1){
                    flag = true;
                    queue.offer(new int[]{i,j});
                }
            }
        }

        BFS();
        for(int i = 0 ; i < height; i ++){
            for(int j = 0 ; j < width; j ++){
                if (graph[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
            }
        }


        System.out.println(ans);
    }
    static void BFS(){
        int cnt = 1;
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0 ; i < len ; i ++){
                int[] poll = queue.poll();

                for(int j = 0 ; j < 4; j ++){
                    int nx = poll[0] + dx[j];
                    int ny = poll[1] + dy[j];
                    if (isRange(nx,ny) && graph[nx][ny] == 0){
                        graph[nx][ny] = 1;
                        ans = Math.max(ans, cnt);
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
            cnt ++;
        }
    }
    static boolean isRange(int x, int y ){
        return 0 <=x && x < height && 0 <= y && y < width;
    }
}