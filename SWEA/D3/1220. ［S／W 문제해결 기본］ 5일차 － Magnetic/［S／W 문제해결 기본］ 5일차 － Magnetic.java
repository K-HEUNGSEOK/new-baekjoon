import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {
    
    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int z = 1; z <= T; z++) {
      int n = sc.nextInt();
      int[][] arr = new int[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      int ans = 0;
      //1이 아래로 // 2가 위로
      
      for (int i = 0; i < n; i++) {
        boolean flag = false;
        for (int j = 0; j < n; j++) {
          if (arr[j][i] == 1) {
            flag = true;
          }
          if (arr[j][i] == 2 && flag) {
            ans++;
            flag = false;
          }
        }
      }
      System.out.println("#" + z + " " + ans);
    }
  }

}
