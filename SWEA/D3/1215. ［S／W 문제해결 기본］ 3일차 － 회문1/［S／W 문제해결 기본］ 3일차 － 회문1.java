import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int z = 1; z <= T; z++) {
      int n = sc.nextInt();
      char[][] arr = new char[8][8];
      for (int i = 0; i < 8; i++) {
        arr[i] = sc.next().toCharArray();
      }
      int ans = 0;

      for (int i = 0; i < 8; i++) {
        for (int j = 0; j <= 8 - n; j++) {
          StringBuilder sb = new StringBuilder();
          for (int k = j; k < j + n; k++) {
            sb.append(arr[i][k]);
          }
          if (check(sb.toString())) {
            ans++;
          }
        }
      }
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j <= 8 - n; j++) {
          StringBuilder sb = new StringBuilder();
          for (int k = j; k < j + n; k++) {
            sb.append(arr[k][i]);
          }
          if (check(sb.toString())) {
            ans++;
          }
        }
      }
      System.out.println("#" + z + " " + ans);
    }
  }

  static boolean check(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
