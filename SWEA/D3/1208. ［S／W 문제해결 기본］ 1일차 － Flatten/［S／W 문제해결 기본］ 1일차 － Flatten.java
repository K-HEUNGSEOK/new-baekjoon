import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int z = 1; z <= T; z++) {
      int cnt = sc.nextInt();
      int[] arr = new int[100];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }

      Arrays.sort(arr);

      for (int i = 0; i < cnt; i++) {
        arr[0]++;
        arr[99]--;
        Arrays.sort(arr);
        if (arr[99] - arr[0] <= 1) {
          break;
        }
      }
      System.out.println("#" + z + " " + (arr[99] - arr[0]));
    }
  }
}
