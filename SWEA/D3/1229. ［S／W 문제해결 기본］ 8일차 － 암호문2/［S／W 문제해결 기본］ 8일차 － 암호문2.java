import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {
  
    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int z = 1; z <= T; z++) {
      int n = sc.nextInt();
      List<Integer> list = new LinkedList<>();

      for (int i = 0; i < n; i++) {
        list.add(sc.nextInt());
      }
      int m = sc.nextInt();
      for (int i = 0; i < m; i++) {
        char command = sc.next().charAt(0);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (command == 'I') {
          for (int j = 0; j < y; j++) {
            int number = sc.nextInt();
            list.add(x + j, number);
          }
        } else {
          for (int j = 0; j < y; j++) {
            list.remove(x);
          }
        }
      }

      System.out.print("#" + z + " ");
      for (int i = 0; i < 10; i++) {
        System.out.print(list.get(i) + " ");
      }
      System.out.println();
    }
  }

}

