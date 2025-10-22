import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {

  static int n = 8;

  public static void main(String[] args) throws FileNotFoundException {
 
    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int z = 1; z <= T; z++) {
      int index = sc.nextInt();
      Deque<Integer> deque = new ArrayDeque<>();
      for (int i = 0; i < n; i++) {
        deque.offer(sc.nextInt());
      }
      int cnt = 1;
      while (true) {
        Integer pop = deque.pop();
        pop -= cnt;
        cnt++;
        if (cnt > 5) {
          cnt = 1;
        }
        if (pop <= 0) {
          pop = 0;
          deque.offer(pop);
          break;
        }
        deque.offer(pop);
      }
      System.out.print("#" + index + " ");
      for (Integer i : deque) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}

