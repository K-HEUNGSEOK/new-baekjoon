import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    sc.nextLine();
    for (int z = 1; z <= T; z++) {
      StringTokenizer st = new StringTokenizer(sc.nextLine());

      String s = st.nextToken();
      int n = Integer.parseInt(st.nextToken());
      Num[] arr = new Num[n];
      for (int i = 0; i < n; i++) {
        arr[i] = new Num(sc.next());
        arr[i].num = getNumber(arr[i].name);
      }
      sc.nextLine();

      Arrays.sort(arr);
      System.out.println("#" + z);
      for (Num num : arr) {
        System.out.print(num.name + " ");
      }
      System.out.println();

    }
  }

  static class Num implements Comparable<Num> {

    String name;
    int num;

    public Num(String name) {
      this.name = name;
    }

    @Override
    public int compareTo(Num o) {
      return this.num - o.num;
    }
  }

  static int getNumber(String name) {
    switch (name) {
      case "ZRO":
        return 0;
      case "ONE":
        return 1;
      case "TWO":
        return 2;
      case "THR":
        return 3;
      case "FOR":
        return 4;
      case "FIV":
        return 5;
      case "SIX":
        return 6;
      case "SVN":
        return 7;
      case "EGT":
        return 8;
      case "NIN":
        return 9;
    }
    return 1;
  }
}

