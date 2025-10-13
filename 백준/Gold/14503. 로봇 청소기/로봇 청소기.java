
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m, ans;
    static int[][] arr;
    static boolean flag;

    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        int x = sc.nextInt();
        int y = sc.nextInt();
        int move = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        DFS(x, y, move);
        System.out.println(ans);
    }

    static void DFS(int x, int y, int move) {
        if (arr[x][y] == 0) {
            arr[x][y] = 2;
            ans++;
        }
        flag = false;
        for (int i = 0; i < 4; i++) {
            int temp = (move + 3) % 4;
            int nx = x + dx[temp];
            int ny = y + dy[temp];
            if (isRange(nx, ny) && arr[nx][ny] == 0) {
                DFS(nx, ny, temp);
                flag = true;
                break;
            }
            move = (move + 3) % 4;
        }

        if (!flag) {
            int temp = (move + 2) % 4;
            int nx = x + dx[temp];
            int ny = y + dy[temp];
            if (isRange(nx, ny) && arr[nx][ny] != 1) {
                DFS(nx, ny, move);
            }
        }

    }

    static boolean isRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}