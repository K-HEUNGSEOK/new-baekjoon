
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int[] dx = {-1,-1,-2,-2,1,1,2,2};
    static int[] dy = {-2,2,-1,1,-2,2,-1,1};
    static boolean[][] arr;
    static int n;
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T -- > 0){
            n = sc.nextInt();
            arr = new boolean[n][n];
            //목적지
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            //체스
            int curX = sc.nextInt();
            int curY = sc.nextInt();


            BFS(x1,y1, curX,curY);
        }
    }
    static void BFS(int x1, int y1, int curX, int curY){
        if(x1 == curX && y1 == curY) {
            System.out.println(0);
            return;
        }
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{curX, curY});
        arr[curX][curY] = true;
        int cnt = 0;
        while(!q.isEmpty()){
            int len = q.size();

            for(int i = 0 ; i < len ; i ++){
                int[] p = q.poll();

                for(int j = 0 ; j < 8; j ++){
                    int nx = p[0] + dx[j];
                    int ny = p[1] + dy[j];
                    if(isRange(nx,ny) && nx == x1 && ny == y1) {
                        System.out.println(cnt+1);
                        return;
                    }

                    if(isRange(nx,ny) && !arr[nx][ny]){
                        arr[nx][ny] = true;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
            cnt ++;
        }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}