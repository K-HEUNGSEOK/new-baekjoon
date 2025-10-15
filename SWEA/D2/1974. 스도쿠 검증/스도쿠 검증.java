import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  static int n = 9;
  static int m = 3;

  public static void main(String[] args) throws FileNotFoundException {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int z = 1; z <= T; z++) {
      int[][] arr = new int[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      //1. 가로를 다 확인한다.
      //2. 세로를 다 확인한다.
      //3. 3*3으로 확인한다.

      System.out.print("#" + z + " ");
      if (execute(arr)) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }

  static boolean execute(int[][] arr) {
    if (!widthCheck(arr)) {
      return false;
    }
    if (!heightCheck(arr)) {
      return false;
    }

    for (int i = 0; i <= n - m; i += 3) {
      for (int j = 0; j <= n - m; j += 3) {
        int[] temp = new int[10];
        for (int k = i; k < i + 3; k++) {
          for (int l = j; l < j + 3; l++) {
            int num = arr[k][l];
            temp[num]++;
          }
        }
        for (int z = 1; z <= 9; z++) {
          if (temp[z] != 1) {
            return false;
          }
        }
      }
    }
    return true;
  }

  static boolean widthCheck(int[][] arr) {
    for (int i = 0; i < n; i++) {
      int[] temp = new int[10];
      for (int j = 0; j < n; j++) {
        int num = arr[i][j];
        temp[num]++;
      }

      for (int k = 1; k <= n; k++) {
        if (temp[k] != 1) {
          return false;
        }
      }
    }
    return true;
  }

  static boolean heightCheck(int[][] arr) {
    for (int i = 0; i < n; i++) {
      int[] temp = new int[10];
      for (int j = 0; j < n; j++) {
        int num = arr[j][i];
        temp[num]++;
      }

      for (int k = 1; k <= n; k++) {
        if (temp[k] != 1) {
          return false;
        }
      }
    }
    return true;
  }
}


