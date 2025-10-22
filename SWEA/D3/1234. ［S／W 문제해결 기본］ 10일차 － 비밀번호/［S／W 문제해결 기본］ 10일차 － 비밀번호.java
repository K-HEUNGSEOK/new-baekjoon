import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {
  
    Scanner sc = new Scanner(System.in);
    int T = 10;
    for (int z = 1; z <= T; z++) {
      StringTokenizer st = new StringTokenizer(sc.nextLine());
      int n = Integer.parseInt(st.nextToken());
      char[] arr = st.nextToken().toCharArray();

      Stack<Integer> stack = new Stack<>();
      for (int i = 0; i < n; i++) {
        if (stack.isEmpty()) {
          stack.push(arr[i] - '0');
        } else if (stack.peek() == arr[i] - '0') {
          stack.pop();
        } else {
          stack.push(arr[i] - '0');
        }
      }
      StringBuilder sb = new StringBuilder();
      for (Integer i : stack) {
        sb.append(i);
      }
      System.out.print("#" + z + " ");
      System.out.print(sb.toString());
      System.out.println();
    }
  }
}

