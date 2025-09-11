import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.*;

public class Solution {
    static int n;
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int z = 1; z <= T; z++) {
            n = sc.nextInt();
            int[][] arr = new int[n + 1][n + 1];
            arr[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
            System.out.println("#" + z);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
