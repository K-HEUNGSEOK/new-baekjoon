import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][3];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int[][] dp = new int[n][3];
    //1. 초기값 세팅
    dp[0][0] = arr[0][0];
    dp[0][1] = arr[0][1];
    dp[0][2] = arr[0][2];
    //2. 점화식
    for (int i = 1; i < n; i++) {
      dp[i][0] = arr[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
      dp[i][1] = arr[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
      dp[i][2] = arr[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
    }

    //3. 결과 출력
    int ans = Integer.MAX_VALUE;
    ans = Math.min(dp[n - 1][0], dp[n - 1][1]);
    ans = Math.min(ans, dp[n - 1][2]);
    System.out.println(ans);
  }
}