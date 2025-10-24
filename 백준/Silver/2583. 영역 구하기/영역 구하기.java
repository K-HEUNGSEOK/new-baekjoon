import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  static int[] dx = {-1, 0, 1, 0};
  static int[] dy = {0, 1, 0, -1};
  static int[][] arr;
  static List<Integer> list = new ArrayList<>();
  static int n, m, sum;

  public static void main(String[] args) throws IOException {
  
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    int k = sc.nextInt();

    arr = new int[n][m];

    for (int z = 0; z < k; z++) {
      int y1 = sc.nextInt(); //가로
      int x1 = Math.abs(sc.nextInt() - n); //세로
      int y2 = sc.nextInt(); //가로
      int x2 = Math.abs(sc.nextInt() - n); //세로

      for (int i = x2; i < x1; i++) {
        for (int j = y1; j < y2; j++) {
          arr[i][j] = 1;
        }
      }
    }

    int ans = 0; //총 갯수

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == 0) {
          sum = 1;
          ans++;
          DFS(i, j);
          list.add(sum);
        }
      }
    }
    Collections.sort(list);
    StringBuilder sb = new StringBuilder();
    sb.append(ans).append("\n");
    for (int num : list) {
      sb.append(num).append(" ");
    }
    System.out.println(sb.toString());
  }

  static void DFS(int x, int y) {
    arr[x][y] = 1; //방문체크
    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];
      if (isRange(nx, ny) && arr[nx][ny] == 0) {
        sum++;
        DFS(nx, ny);
      }
    }
  }

  static boolean isRange(int x, int y) {
    return 0 <= x && x < n && 0 <= y && y < m;
  }

  private static void print() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}