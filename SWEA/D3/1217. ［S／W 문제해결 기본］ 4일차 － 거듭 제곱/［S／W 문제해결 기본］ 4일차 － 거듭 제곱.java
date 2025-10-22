
import java.util.Scanner;

public class Solution {

  static int n;
  static int ans;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int z = 1; z <= T; z++) {
      int trash = sc.nextInt();
      n = sc.nextInt();
      int m = sc.nextInt();
      ans = 1;
      //9 * 9 를 계속 하는거임
      DFS(m);
      System.out.println("#" + z + " " + ans);
    }
  }

  static void DFS(int v) {
    if (v == 0) {
      return;
    } else {
      ans *= n;
      DFS(v - 1);
    }
  }
}

