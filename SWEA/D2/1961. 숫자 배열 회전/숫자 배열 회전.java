import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    static int[][] arr;
    static int[][] copy;
    static int n;
    static StringBuilder sb;
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int z = 1 ; z <= T ; z ++) {
            sb = new StringBuilder();
            n = sc.nextInt();
            arr = new int[n][n];
            String[][] ans = new String[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //배열을 돌리고 가로의 값을 ans 세로에 각각 넣으면 된다.
            for (int i = 0; i < 3; i++) {
                rotation();
            }
            String[] str = sb.toString().split(" ");
            int cnt = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    ans[j][i] = str[cnt++];
                }
            }
            System.out.println("#" + z);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    static void rotation(){
        copy = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                copy[i][j] = arr[n-j-1][i];
            }
        }

        arr = copy;

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                sb.append(copy[i][j]);
            }
            sb.append(" ");
        }
    }
}
