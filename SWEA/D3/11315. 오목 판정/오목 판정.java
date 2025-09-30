import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    static int n;
    static int[] dx = {0,1,1,1};
    static int[] dy = {1,0,1,-1};
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
             n = sc.nextInt();
            boolean flag = false;
            char[][] arr = new char[n][n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.next().toCharArray();
            }

            if (check(arr)){
                flag = true;
            }


            System.out.print("#" + z);
            System.out.println(flag ? " YES" : " NO");

        }
    }
    static boolean check(char[][] arr){
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){

                if (arr[i][j] != 'o') continue;

                for(int k = 0 ; k < 4 ; k ++){
                    int cnt= 1;
                    int curX = i;
                    int curY = j;

                    for(int l = 0; l < 4; l ++){
                        int nx = curX + dx[k];
                        int ny = curY + dy[k];

                        if (!isRange(nx,ny) || arr[nx][ny] != 'o') break;

                        cnt ++;
                        curX = nx;
                        curY = ny;
                    }

                    if (cnt >= 5) return true;
                }
            }
        }
        return false;
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}


