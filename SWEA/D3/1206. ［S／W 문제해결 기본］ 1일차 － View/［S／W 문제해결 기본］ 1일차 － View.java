import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {
  
    Scanner sc = new Scanner(System.in);

    int T = 10;
    for (int z = 1; z <= T; z++) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int ans = 0;

      for (int i = 2; i < n - 2; i++) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i - 2] && arr[i] > arr[i + 1] && arr[i] > arr[i
            + 2]) {
          int maxA = Math.max(arr[i - 1], arr[i - 2]);
          int maxB = Math.max(arr[i + 1], arr[i + 2]);
          int result = Math.max(maxA, maxB);

          ans += arr[i] - result;
        }
      }

      System.out.println("#" + z + " " + ans);
    }
  }
}
