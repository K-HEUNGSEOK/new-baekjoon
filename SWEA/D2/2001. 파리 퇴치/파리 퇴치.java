import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int z = 1; z <= T ; z ++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int total = 0;
                    for (int k = i; k < i + m; k++) {
                        for (int l = j; l < j + m; l++) {
                            if (!isRange(k, l, n)) continue;
                            total += arr[k][l];
                        }
                    }
                    ans = Math.max(ans, total);
                }
            }
            System.out.println("#" + z + " " + ans);
        }
    }
    static boolean isRange(int x, int y, int n){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}
