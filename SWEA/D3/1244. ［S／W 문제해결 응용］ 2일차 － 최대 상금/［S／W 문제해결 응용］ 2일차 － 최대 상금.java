import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  static char[] arr;
  static int c;
  static int ans;
  static boolean[][] visited;

  public static void main(String[] args) throws FileNotFoundException {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int z = 1; z <= T; z++) {
      String str = sc.next();
      ans = 0;
      c = sc.nextInt();
      arr = new char[str.length()];
      for (int i = 0; i < str.length(); i++) {
        arr[i] = str.charAt(i);
      }
      visited = new boolean[c + 1][1000000];

      DFS(0, Integer.parseInt(str));
      System.out.println("#" + z + " " + ans);
    }
  }

  static void DFS(int v, int current) {
    if (visited[v][current]) {
      return;
    }
    visited[v][current] = true;
    if (v == c) {
      if (ans < current) {
        ans = current;
      }
      return;

    } else {
      for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
          swap(i, j);

          DFS(v + 1, Integer.parseInt(new String(arr)));

          swap(i, j);
        }
      }
    }
  }

  static void swap(int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
