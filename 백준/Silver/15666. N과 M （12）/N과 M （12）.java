import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  static int n, m;
  static int[] arr;
  static List<Integer> list = new ArrayList<>();

  public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    DFS(0, 0);
  }

  static void DFS(int v, int start) {
    if (v == m) {
      for (int num : list) {
        System.out.print(num + " ");
      }
      System.out.println();
    } else {
      int lastNum = 0;
      for (int i = start; i < n; i++) {
        if (lastNum == arr[i]) {
          continue;
        }

        list.add(arr[i]);
        DFS(v + 1, i);
        list.remove(list.size() - 1);
        lastNum = arr[i];

      }
    }
  }
}