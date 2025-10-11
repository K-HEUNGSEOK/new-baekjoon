import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int move = 0;
    static int n;

    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            n = sc.nextInt();
            int[][] arr = new int[n][n];
            int cnt = 1;
            int x = 0;
            int y = 0;
            arr[x][y] = cnt++;
            while (cnt <= n * n) {
                int nx = x + dx[move];
                int ny = y + dy[move];
                if (isRange(nx, ny) && arr[nx][ny] == 0) {
                    arr[nx][ny] = cnt++;
                    x = nx;
                    y = ny;
                } else {
                     move = (move + 1) % 4;
                }
            }
            System.out.println("#" + z);
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    static boolean isRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}


