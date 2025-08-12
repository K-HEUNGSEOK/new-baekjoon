import java.io.*;
import java.util.*;

public class Main {
    static int max = 50 + 10;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static boolean[][] map;
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true){
            int w = sc.nextInt();
            int h = sc.nextInt();

            int ans = 0;
            if (w == 0 && h == 0){
                break;
            }
            map = new boolean[max][max];
            for(int i = 1; i <= h ; i ++){
                for(int j = 1 ; j <= w; j ++){
                    int num = sc.nextInt();
                    if (num == 1){
                        map[i][j] = true;
                    }
                }
            }

            for(int i = 1; i<= h ; i ++){
                for(int j = 1 ; j <= w ; j ++){
                    if (map[i][j]){
                        ans ++;
                        DFS(i,j);
                    }
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);

    }
    static void DFS(int x, int y) {
        map[x][y] = false;
        for(int i = 0 ; i < 8; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (map[nx][ny]){
                map[nx][ny] = false;
                DFS(nx,ny);
            }
        }
    }
}
