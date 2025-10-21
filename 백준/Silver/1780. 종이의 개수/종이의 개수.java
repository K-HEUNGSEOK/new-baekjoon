import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  static int ans1, ans2, ans3;
  static int n;

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    ans1 = 0; //-1로만
    ans2 = 0; //0로만
    ans3 = 0; //1로만
    DFS(0, 0, n, arr);
    System.out.println(ans1);
    System.out.println(ans2);
    System.out.println(ans3);
  }

  static void DFS(int x, int y, int size, int[][] arr) {
    if (check(x, y, size, arr)) {
      if (arr[x][y] == -1) {
        ans1++;
      } else if (arr[x][y] == 0) {
        ans2++;
      } else {
        ans3++;
      }
      return;
    } else {
      //처음 맨위 3개
      int newSize = size / 3;
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          DFS(x + i * newSize, y + j * newSize, newSize, arr);
        }
      }
//      DFS(x, y, newSize, arr);
//      DFS(x, y + newSize, newSize, arr);
//      DFS(x, y + newSize * 2, newSize, arr);
//      //중간 3개
//      DFS(x + newSize, y, newSize, arr);
//      DFS(x + newSize, y + newSize, newSize, arr);
//      DFS(x + newSize, y + newSize * 2, newSize, arr);
//      //마지막 3개
//      DFS(x + newSize * 2, y, newSize, arr);
//      DFS(x + newSize * 2, y + newSize, newSize, arr);
//      DFS(x + newSize * 2, y + newSize * 2, newSize, arr);
    }
  }

  static boolean check(int x, int y, int size, int[][] arr) {
    int temp = arr[x][y];
    for (int i = x; i < x + size; i++) {
      for (int j = y; j < y + size; j++) {
        if (temp != arr[i][j]) {
          return false;
        }
      }
    }
    return true;
  }
}