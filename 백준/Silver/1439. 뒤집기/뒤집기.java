import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
  
    Scanner sc = new Scanner(System.in);
    char[] arr = sc.next().toCharArray();
    int ans1 = 0;
    int ans2 = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == '0') {
        ans1++;
        for (int j = i + 1; j < n; j++) {
          if (arr[j] != '0') {
            break;
          }
          i = j;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      if (arr[i] == '1') {
        ans2++;
        for (int j = i + 1; j < n; j++) {
          if (arr[j] != '1') {
            break;
          }
          i = j;
        }
      }
    }
    System.out.println(Math.min(ans1, ans2));

  }
}