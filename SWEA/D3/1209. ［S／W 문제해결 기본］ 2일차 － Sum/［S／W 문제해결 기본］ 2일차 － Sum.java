import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  static int n = 100;

  public static void main(String[] args) throws FileNotFoundException {

    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int z = 1; z <= T; z++) {
      int trash = sc.nextInt();
      int[][] arr = new int[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          arr[i][j] = sc.nextInt();
        }
      }

      int a = 0; //가로
      int b = 0; //세로
      int c = 0; //정대각
      int d = 0; //역대각
      for (int i = 0; i < n; i++) {
        int sumA = 0;
        int sumB = 0;
        for (int j = 0; j < n; j++) {
          sumA += arr[i][j];
          sumB += arr[j][i];
        }
        a = Math.max(a, sumA);
        b = Math.max(b, sumB);
      }

      for (int i = 0; i < 100; i++) {
        c += arr[i][i];
      }
      for (int i = 0; i < 100; i++) {
        d += arr[i][99 - i];
      }
      int ans = Math.max(a, b);
      ans = Math.max(ans, c);
      ans = Math.max(ans, d);
      System.out.println("#" + z + " " + ans);
    }
  }

}
