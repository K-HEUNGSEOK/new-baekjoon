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
      char[][] arr = new char[n][n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.next().toCharArray();
      }
      int ans = 1;
      //1. 슬라이딩 윈도우 + 투포인터로 해야대나
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          StringBuilder sb = new StringBuilder();
          sb.append(arr[i][j]);
          for (int k = j + 1; k < n; k++) {
            sb.append(arr[i][k]);
            if (check(sb.toString()) > ans) {
              ans = check(sb.toString());
            }
          }
        }
      }

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          StringBuilder sb = new StringBuilder();
          sb.append(arr[j][i]);
          for (int k = j + 1; k < n; k++) {
            sb.append(arr[k][i]);
            if (check(sb.toString()) > ans) {
              ans = check(sb.toString());
            }
          }
        }
      }

      System.out.println("#" + trash + " " + ans);
    }
  }

  static int check(String str) {
    int ans = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return -1;
      } else {
        ans++;
      }
    }
    return ans;
  }
}

