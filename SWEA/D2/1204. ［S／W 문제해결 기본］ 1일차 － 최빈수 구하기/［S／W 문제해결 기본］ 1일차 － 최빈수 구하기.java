import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int z = 1; z <= T; z++) {
      int[] arr = new int[101];
      int g = sc.nextInt();
      for (int i = 0; i < 1000; i++) {
        int num = sc.nextInt();
        arr[num]++;
      }
      int max = 0;
      int cnt = 0;

      for (int i = 0; i <= 100; i++) {
        if (arr[i] >= cnt) {
          cnt = arr[i];
          max = i;
        }
      }
      System.out.println("#" + z + " " + max);
    }
  }
}
