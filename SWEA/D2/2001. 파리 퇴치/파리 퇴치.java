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
            int[][] arr = new int[n+1][n+1];
            for(int i = 1 ; i <= n ; i ++){
                for(int j = 1 ; j <= n ; j ++) arr[i][j] = sc.nextInt();
            }
            int[][] prefix = new int[n+1][n+1];
            int ans = 0;
            for(int i = 1 ; i <= n ; i ++){
                for(int j = 1; j <= n ; j ++){
                    prefix[i][j] = prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1] + arr[i][j];
                }
            }
            ans = Math.max(ans, prefix[m][m] - prefix[m-1][m] - prefix[m][m-1] + prefix[m-1][m-1]);

            for(int i = 1; i <= n ; i ++){
                for(int j = 1; j <= n ; j ++){
                    int x = i - m;
                    int y = j - m;
                    if (!isRange(x,y,n)) continue;
                    ans = Math.max(ans , prefix[i][j] - prefix[x][j] - prefix[i][y] + prefix[x][y]);
                }
            }
            System.out.println("#" + z + " " +  ans);
        }
    }
    static boolean isRange(int x, int y, int n){
        return 0 <= x && x <= n && 0 <= y && y <= n;
    }
}
