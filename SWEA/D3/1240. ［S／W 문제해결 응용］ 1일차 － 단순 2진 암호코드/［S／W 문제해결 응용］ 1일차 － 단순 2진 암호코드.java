import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {
   
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int z = 1; z <= T; z++) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      char[][] arr = new char[n][m];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.next().toCharArray();
      }
      int x = 0;
      int y = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (arr[i][j] == '1') {
            x = i;
            y = j;
          }
        }
      }
      StringBuilder sb = new StringBuilder();
      for (int i = y - 55; i <= y; i++) {
        sb.append(arr[x][i]);
      }

      String str = sb.toString();
      StringBuilder ans = new StringBuilder();

      int len = str.length();

      for (int i = 0; i < len; i += 7) {
        String temp = str.substring(i, i + 7);
        ans.append(getNumber(temp));
      }

      String s = ans.toString();
      int total = 0;
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 0) {
          total += s.charAt(i) - '0';
        }
      }
      total *= 3;
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 != 0) {
          total += s.charAt(i) - '0';
        }
      }

      int result = 0;
      for (int i = 0; i < s.length(); i++) {
        result += s.charAt(i) - '0';
      }

      System.out.print("#" + z + " ");
      if (total % 10 == 0) {
        System.out.print(result);
      } else {
        System.out.print(0);
      }
      System.out.println();
    }
  }

  static int getNumber(String str) {
    switch (str) {
      case "0001101":
        return 0;
      case "0011001":
        return 1;
      case "0010011":
        return 2;
      case "0111101":
        return 3;
      case "0100011":
        return 4;
      case "0110001":
        return 5;
      case "0101111":
        return 6;
      case "0111011":
        return 7;
      case "0110111":
        return 8;
      case "0001011":
        return 9;
    }
    return -1;
  }
}

