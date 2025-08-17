import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int n, ans, cnt;
    static char[][] graph;

    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = 0; //단지 총 개수
        cnt = 0; //각 갯수
        graph = new char[n][n];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i ++){
            graph[i] = sc.next().toCharArray();
        }

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if (graph[i][j] == '1'){
                    ans ++;
                    cnt = 1;
                    DFS(i,j);
                    sb.append(cnt).append("\n");
                }
            }
        }
        System.out.println(ans);
        //정렬을 해야해
        List<Integer> list = new LinkedList<>();
        String[] split = sb.toString().split("\n");
        for (String s : split) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        for (Integer n : list) {
            System.out.println(n);
        }
    }
    static void DFS(int x, int y){
        graph[x][y] = '0';
        for(int i = 0 ; i < 4; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isRange(nx,ny) && graph[nx][ny] == '1'){
                cnt ++;
                DFS(nx,ny);
            }
        }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}