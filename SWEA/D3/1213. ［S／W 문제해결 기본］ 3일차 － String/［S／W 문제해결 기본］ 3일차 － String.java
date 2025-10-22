import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {
    
    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int z = 1; z <= T; z++) {
      int trash = sc.nextInt();
      String findString = sc.next();
      String str = sc.next();
      int ans = 0;

      int len = str.length();
      for (int i = 0; i < len; i++) {
        int index = str.indexOf(findString);
        if (index == -1) {
          break;
        } else {
          ans++;
          str = str.substring(index + 1);
        }
      }
      System.out.println("#" + z + " " + ans);
    }
  }
}

